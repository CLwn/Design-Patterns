public class Main {

    public static void main(String[] args) {

        PrincipalFactory factory = new DarkThemeFactory();

        IColorText colorText = factory.getColorText();
        IBackground background = factory.getBackground();

        System.out.println(colorText.ColorText());
        System.out.println(background.Color());

        PrincipalFactory factory2 = new LightThemeFactory();

        IColorText colorText2 = factory2.getColorText();
        IBackground background2 = factory2.getBackground();

        System.out.println(colorText2.ColorText());
        System.out.println(background2.Color());

    }
}
