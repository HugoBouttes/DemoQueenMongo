package insee.stage.demo.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.json.JSONObject;

import java.io.IOException;

public class CustomJSONObjectSerialize extends JsonSerializer <JSONObject>{


    @Override
    public void serialize(JSONObject value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        //gen.writeRaw(value.toString());
        gen.writeRawValue(value.toString());
    }
}
