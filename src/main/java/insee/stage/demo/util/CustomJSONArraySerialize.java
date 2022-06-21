package insee.stage.demo.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.json.JSONArray;

import java.io.IOException;

public class CustomJSONArraySerialize extends JsonSerializer <JSONArray> {


    @Override
    public void serialize(JSONArray value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeRawValue(value.toString());
    }
}
