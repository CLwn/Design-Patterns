public class LightThemeFactory implements PrincipalFactory {
    @Override
    public IBackground getBackground() {
        LightBackground bg = new LightBackground();
        return bg;
    }

    @Override
    public IColorText getColorText() {
        LightText lt = new LightText();
        return lt;
    }
}
