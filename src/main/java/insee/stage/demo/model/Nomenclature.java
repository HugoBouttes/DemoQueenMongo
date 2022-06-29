package insee.stage.demo.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import insee.stage.demo.util.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.convert.ValueConverter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "nomenclature")
public class Nomenclature {

    @Field(name = "id")
    private String id;
//  @ValueConverter(PropertDocumentToJSONArrayConverter.class)
    @JsonSerialize(using = CustomJSONArraySerialize.class)
    @ValueConverter(BasicDBListToJSONArrayConverter.class)
    @Field(name = "nomenclature")
    private JSONArray nomenclature;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JSONArray getNomenclature() {
        return nomenclature;
    }

    public void setNomenclature(JSONArray nomenclature) {
        this.nomenclature = nomenclature;
    }
}
