package insee.stage.demo.model;

import org.json.JSONObject;
import java.util.Date;
import insee.stage.demo.model.State;

public class Statedata {
    private State state;
    private Date date;
    private int currentPage;


    public Statedata() {
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

}
