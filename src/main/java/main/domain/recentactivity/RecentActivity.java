package main.domain.recentactivity;

/**
 * Created by tayfer01 on 10/5/2017.
 */
public class RecentActivity {

    private String information;
    private String url;


    public RecentActivity(String information, String url) {
        this.information = information;
        this.url = url;
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
