package insee.stage.demo.model;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mongodb.BasicDBList;
import insee.stage.demo.util.CustomJSONArraySerialize;
import insee.stage.demo.util.CustomJSONObjectSerialize;
import insee.stage.demo.util.PropertyArrayListToDocument;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.data.convert.ValueConverter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@Document("required-nomenclatures")
public class RequiredNomenclatures {
    @Field(name = "nomenclatures")
    private ArrayList <String> nomenclatures;

    public RequiredNomenclatures() {
    }

    @Override
    public String toString() {
        return "Required_nomenclatures{" +
                "nomenclatures=" + nomenclatures +
                '}';
    }


    public ArrayList<String> getNomenclatures() {
        return nomenclatures;
    }

    public void setNomenclatures(ArrayList<String> nomenclatures) {
        this.nomenclatures = nomenclatures;
    }
}
