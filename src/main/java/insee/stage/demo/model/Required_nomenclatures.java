package insee.stage.demo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document("required-nomenclatures")
public class Required_nomenclatures {


    @Field(name = "Liste de nomenclatures requises")
    private List <String> nomenclatures;


    public Required_nomenclatures( List<String> nomenclatures) {
        this.nomenclatures = nomenclatures;
    }



    public List<String> getNomenclatures() {
        return nomenclatures;
    }

    public void setNomenclatures(List<String> nomenclatures) {
        this.nomenclatures = nomenclatures;
    }
}
