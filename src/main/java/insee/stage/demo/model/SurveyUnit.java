package insee.stage.demo.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mongodb.util.JSON;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.data.annotation.Id;
/**import org.springframework.data.mongodb.core.index.Indexed;**/
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.awt.*;


@Document("survey-units")
public class SurveyUnit {


    @Id
    private String id;
    @Field(name = "state-data")
    private Statedata statedata;
    @Field(name = "data")
    private JSONArray data;

    public SurveyUnit(String id, Statedata statedata, JSONArray data) {
        this.id = id;
        this.statedata = statedata;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Statedata getStatedata() {
        return statedata;
    }

    public void setStatedata(Statedata statedata) {
        this.statedata = statedata;
    }


    public JSONArray getData() {
        return data;
    }

    public void setData(JSONArray data) {
        this.data = data;
    }

}
