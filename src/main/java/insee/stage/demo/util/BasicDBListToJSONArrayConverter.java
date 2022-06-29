package insee.stage.demo.util;

import com.mongodb.BasicDBList;
import org.json.JSONArray;
import org.springframework.data.convert.PropertyValueConverter;
import org.springframework.data.convert.ValueConversionContext;

import java.util.ArrayList;


public class BasicDBListToJSONArrayConverter implements PropertyValueConverter<JSONArray, ArrayList <?> , ValueConversionContext<?> > {

    @Override
    public JSONArray read(ArrayList <?> value, ValueConversionContext<?> context) {
        JSONArray jsonArray = new JSONArray();
        jsonArray.put(value);
        return jsonArray;
    }

    @Override
    public ArrayList<?> write(JSONArray value, ValueConversionContext<?> context) {
        BasicDBList basicDBList = new BasicDBList();
        basicDBList.add(value);
        return basicDBList;
    }
}
