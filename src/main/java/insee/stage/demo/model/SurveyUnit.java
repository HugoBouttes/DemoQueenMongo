package insee.stage.demo.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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
    private  JSONObject data;

    public SurveyUnit(String id, Statedata statedata, Paradata paradata, JSONObject data) {
        this.id = id;
        this.statedata = statedata;
        this.paradata = paradata;
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

    public JSONObject getData() {
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }

}
