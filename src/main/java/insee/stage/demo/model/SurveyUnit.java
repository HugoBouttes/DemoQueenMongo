package insee.stage.demo.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.util.JSONPObject;
import insee.stage.demo.util.CustomJSONObjectSerialize;
import insee.stage.demo.util.PropertDocumentToJSONObjectConverter;
import org.bson.json.JsonObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.data.annotation.Id;
/**import org.springframework.data.mongodb.core.index.Indexed;**/
import org.springframework.data.convert.PropertyValueConverter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.convert.ValueConverter;


@Document(collection = "survey-units")
public class SurveyUnit {


    @Id
    private String _id;
    @Field(name = "state-data")
    private Statedata statedata;
    @Field(name = "data")
    @ValueConverter(PropertDocumentToJSONObjectConverter.class)
    @JsonSerialize(using = CustomJSONObjectSerialize.class)
    private JSONObject data ;



    public SurveyUnit() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
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
