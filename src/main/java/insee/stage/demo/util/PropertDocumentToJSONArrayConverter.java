package insee.stage.demo.util;

import org.bson.Document;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.data.convert.PropertyValueConverter;
import org.springframework.data.convert.ValueConversionContext;

public class PropertDocumentToJSONArrayConverter implements PropertyValueConverter<JSONArray, Document, ValueConversionContext<?> > {


    @Override
    public JSONArray read(Document value, ValueConversionContext<?> context) {
        JSONArray json = new JSONArray(value.toJson());
        return json;
    }

    @Override
    public Document write(JSONArray value, ValueConversionContext<?> context) {
        Document bson = new Document(value.toJSONObject(value).toMap());
        return bson;
    }
}
