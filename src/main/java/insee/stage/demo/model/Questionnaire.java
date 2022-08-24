package insee.stage.demo.model;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import insee.stage.demo.util.CustomJSONArraySerialize;
import insee.stage.demo.util.CustomJSONObjectSerialize;
import insee.stage.demo.util.PropertDocumentToJSONArrayConverter;
import insee.stage.demo.util.PropertDocumentToJSONObjectConverter;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.convert.ValueConverter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("questionnaire")
public class Questionnaire {

        @ValueConverter(PropertDocumentToJSONObjectConverter.class)
        @JsonSerialize(using = CustomJSONObjectSerialize.class)
        @Field(name = "test")
        private JSONObject test;

    public Questionnaire() {
    }

    public JSONObject getTest() {
        return test;
    }

    public void setTest(JSONObject test) {
        this.test = test;
    }
}
