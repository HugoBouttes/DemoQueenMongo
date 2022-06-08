package insee.stage.demo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document("required_nomenclature")
public class Required_nomenclatures {

    @Id
    private String id;
    @Field(name = "Liste de nomenclatures requises")
    private List <String> nomenclatures;


    public Required_nomenclatures(String id, List<String> nomenclatures) {
        this.id = id;
        this.nomenclatures = nomenclatures;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getNomenclatures() {
        return nomenclatures;
    }

    public void setNomenclatures(List<String> nomenclatures) {
        this.nomenclatures = nomenclatures;
    }
}
