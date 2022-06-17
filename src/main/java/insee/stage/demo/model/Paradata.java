package insee.stage.demo.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.util.JSONPObject;
import io.swagger.v3.core.util.Json;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.lang.reflect.Array;


@JsonAutoDetect(getterVisibility= JsonAutoDetect.Visibility.NONE)
@Document("paradata")
public class Paradata {

    @Id
    private String idSU;
    @Field(name = "events")
    private JSONArray events;


    public Paradata() {
    }

    public String getIdSU() {
        return idSU;
    }

    public void setIdSU(String idSU) {
        this.idSU = idSU;
    }

    public JSONArray getEvents() {
        return events;
    }

    public void setEvents(JSONArray events) {
        this.events = events;
    }
}
