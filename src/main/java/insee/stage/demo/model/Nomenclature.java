package insee.stage.demo.model;

import org.json.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Nomenclature {
    @Id
    private String id;
    @Field(name = "nomenclature")
    private JSONObject nomenclature;

    public Nomenclature(String id, JSONObject nomenclature) {
        this.id = id;
        this.nomenclature = nomenclature;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JSONObject getNomenclature() {
        return nomenclature;
    }

    public void setNomenclature(JSONObject nomenclature) {
        this.nomenclature = nomenclature;
    }
}
