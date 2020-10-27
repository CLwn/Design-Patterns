public class Main {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();
        Subscriber pepe = new Subscriber(channel);

        channel.addNewVideo("Observer Pattern!");

        pepe.update();

    }
}
