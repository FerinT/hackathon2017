package main.domain.tipofday;

/**
 * Created by maybra01 on 10/5/2017.
 */
public class TipOfTheDay {

    String tipText;
    String theme;

    public TipOfTheDay() {
    }

    public TipOfTheDay(String tipText, String theme) {
        this.tipText = tipText;
        this.theme = theme;
    }

    public String getTipText() {
        return tipText;
    }

    public void setTipText(String tipText) {
        this.tipText = tipText;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
