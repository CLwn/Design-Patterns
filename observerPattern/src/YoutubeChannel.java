import java.util.LinkedList;
import java.util.List;

public class YoutubeChannel implements Observable {
    private List<Observer> channelSubscribers = new LinkedList<>();
    private String lastVideoPosted;
    @Override
    public void attach(Observer o) {
        channelSubscribers.add(o);
    }

    @Override
    public void detach(Observer o) {
        channelSubscribers.remove(o);
    }

    @Override
    public void advise() {
        for (Observer observer: channelSubscribers) observer.update();
    }

    public void addNewVideo(String title){
        lastVideoPosted = title;
        advise();
        System.out.println("New youtube video added to channel");
    }

    public List<Observer> getChannelSubscribers() {
        return channelSubscribers;
    }

    public void setChannelSubscribers(List<Observer> channelSubscribers) {
        this.channelSubscribers = channelSubscribers;
    }

    public String getLastVideoPosted() {
        return lastVideoPosted;
    }

    public void setLastVideoPosted(String lastVideoPosted) {
        this.lastVideoPosted = lastVideoPosted;
    }
}
