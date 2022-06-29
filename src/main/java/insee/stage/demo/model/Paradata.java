package insee.stage.demo.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.util.JSONPObject;
import insee.stage.demo.util.CustomJSONArraySerialize;
import insee.stage.demo.util.CustomJSONObjectSerialize;
import insee.stage.demo.util.PropertDocumentToJSONArrayConverter;
import insee.stage.demo.util.PropertDocumentToJSONObjectConverter;
import io.swagger.v3.core.util.Json;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONString;
import org.springframework.data.annotation.Id;
import org.springframework.data.convert.ValueConverter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.lang.reflect.Array;


@Document(collection = "paradata")
public class Paradata {

    @ValueConverter(PropertDocumentToJSONObjectConverter.class)
    @JsonSerialize(using = CustomJSONObjectSerialize.class)
    @Field(name = "events")
    private JSONObject events;



    public Paradata() {
    }

    @Override
    public String toString() {
        return "Paradata{" +
                "events=" + events +
                '}';
    }

    public JSONObject getEvents() {
        return events;
    }

    public void setEvents(JSONObject events) {
        this.events = events;
    }
}
