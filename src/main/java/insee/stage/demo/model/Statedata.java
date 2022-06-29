package insee.stage.demo.model;

import org.json.JSONObject;
import java.util.Date;
import insee.stage.demo.model.State;

public class Statedata {
    private State state;
    private String date;
    private int currentPage;


    public Statedata() {
    }

    @Override
    public String toString() {
        return "Statedata{" +
                "state=" + state +
                ", date=" + date +
                ", currentPage=" + currentPage +
                '}';
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

}
