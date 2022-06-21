package insee.stage.demo.util;

import org.bson.Document;
import org.json.JSONObject;
import org.springframework.data.convert.PropertyValueConverter;
import org.springframework.data.convert.ValueConversionContext;

public class PropertDocumentToJSONObjectConverter implements PropertyValueConverter<JSONObject, Document, ValueConversionContext <?> > {


    @Override
    public JSONObject read(Document value, ValueConversionContext context) {
        JSONObject json = new JSONObject(value.toJson());
        return json;
    }

    @Override
    public Document write(JSONObject value, ValueConversionContext context) {
        Document bson = new Document(value.toMap());
        return bson;
    }
}
