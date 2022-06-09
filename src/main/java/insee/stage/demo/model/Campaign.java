package insee.stage.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;


@Document("campaign")
public class Campaign {

    @Id
    private String id;
    @Field(name = "questionnairesId")
    private List <String> questionnairesId ;

    public Campaign(String id, List<String> questionnairesId) {
        this.id = id;
        this.questionnairesId = questionnairesId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getQuestionnairesId() {
        return questionnairesId;
    }

    public void setQuestionnairesId(List<String> questionnairesId) {
        this.questionnairesId = questionnairesId;
    }
}
