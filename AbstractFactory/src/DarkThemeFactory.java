public class DarkThemeFactory implements PrincipalFactory {
    @Override
    public IBackground getBackground() {
        DarkBackground bg = new DarkBackground();
        return bg;
    }

    @Override
    public IColorText getColorText() {
        DarkText dt = new DarkText();
        return dt;
    }
}
