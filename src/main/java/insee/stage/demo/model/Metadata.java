package insee.stage.demo.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import insee.stage.demo.util.CustomJSONArraySerialize;
import insee.stage.demo.util.CustomJSONObjectSerialize;
import insee.stage.demo.util.PropertDocumentToJSONObjectConverter;
import insee.stage.demo.util.PropertyArrayListToDocument;
import lombok.NoArgsConstructor;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.convert.ValueConverter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import insee.stage.demo.model.InseeContext;

@Document("metadata")
public class Metadata {

    @Field(name = "id")
    private String id;
    @Field(name = "inseeContext")
    private InseeContext inseeContext;
    @ValueConverter(PropertyArrayListToDocument.class)
    @JsonSerialize(using = CustomJSONArraySerialize.class)
    @Field(name = "variables")
    private JSONArray variables;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Metadata() {
    }

    public JSONArray getVariables() {
        return variables;
    }

    public void setVariables(JSONArray variables) {
        this.variables = variables;
    }


    public InseeContext getInseeContext() {
        return inseeContext;
    }

    public void setInseeContext(InseeContext inseeContext) {
        this.inseeContext = inseeContext;
    }





}
