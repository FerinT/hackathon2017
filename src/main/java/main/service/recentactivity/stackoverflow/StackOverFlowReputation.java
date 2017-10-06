package main.service.recentactivity.stackoverflow;

import java.math.BigDecimal;

/**
 * Created by tayfer01 on 10/5/2017.
 */
public class StackOverFlowReputation {

    String reputation_history_type;
    BigDecimal reputation_change;
    BigDecimal post_id;
    BigDecimal creation_date;
    BigDecimal user_id;

    public String getReputation_history_type() {
        return reputation_history_type;
    }

    public void setReputation_history_type(String reputation_history_type) {
        this.reputation_history_type = reputation_history_type;
    }

    public BigDecimal getReputation_change() {
        return reputation_change;
    }

    public void setReputation_change(BigDecimal reputation_change) {
        this.reputation_change = reputation_change;
    }

    public BigDecimal getPost_id() {
        return post_id;
    }

    public void setPost_id(BigDecimal post_id) {
        this.post_id = post_id;
    }

    public BigDecimal getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(BigDecimal creation_date) {
        this.creation_date = creation_date;
    }

    public BigDecimal getUser_id() {
        return user_id;
    }

    public void setUser_id(BigDecimal user_id) {
        this.user_id = user_id;
    }
}
