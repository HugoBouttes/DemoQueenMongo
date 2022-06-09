package insee.stage.demo.model;


import org.json.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("questionnaire")
public class Questionnaire {

    @Id
    private String id;
    @Field(name = "model")
    private JSONObject variables;


    public Questionnaire(String id, JSONObject variables) {
        this.id = id;
        this.variables = variables;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JSONObject getVariables() {
        return variables;
    }

    public void setVariables(JSONObject variables) {
        this.variables = variables;
    }
}
