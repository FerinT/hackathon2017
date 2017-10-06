package main.domain.recentactivity;

/**
 * Created by tayfer01 on 10/5/2017.
 */
public class RecentActivity {

    private String information;
    private String url;
    private String displayText;

    public RecentActivity(String information, String url, String displayText) {
        this.information = information;
        this.url = url;
        this.displayText = displayText;
    }

    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
