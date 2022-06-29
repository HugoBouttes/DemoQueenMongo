package insee.stage.demo.util;


import org.bson.Document;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.data.convert.PropertyValueConverter;
import org.springframework.data.convert.ValueConversionContext;

import java.util.ArrayList;
import java.util.Arrays;

public class PropertyArrayListToDocument implements PropertyValueConverter<JSONArray, ArrayList<Document>, ValueConversionContext<?>> {


    @Override
    public JSONArray read(ArrayList<Document> value, ValueConversionContext<?> context) {
        String[] rep = new String[value.size()-1];

        for (int i = 0; i<(value.size() - 1); i++){
            rep[i] = value.get(i).toJson();
        }
        //System.out.println("{"+Arrays.toString(rep)+"}");

        JSONArray jsonArray = new JSONArray(Arrays.toString(rep));
        return jsonArray;
    }

    @Override
    public ArrayList<Document> write(JSONArray value, ValueConversionContext<?> context) {
//        ArrayList <?> arrayList = new ArrayList<?>(value.to);
        return null;
    }
}
