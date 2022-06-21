package insee.stage.demo.model;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import insee.stage.demo.util.CustomJSONObjectSerialize;
import insee.stage.demo.util.PropertDocumentToJSONObjectConverter;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.convert.ValueConverter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("questionnaire")
public class Questionnaire {

    @Id
    private String id;
    @Field(name = "modele")
    private String modele;
    @Field(name = "enoCoreVersion")
    private String enoCoreVersion;
    @Field(name = "lunaticModelVersion")
    private String lunaticModelVersion;
    @Field(name = "generatingDate")
    private String generatingDate;
    @Field(name = "missing")
    private String missing;
    @Field(name = "pagination")
    private String pagination;
    @Field(name = "maxPage")
    private String maxPage;
    @Field(name = "label")
    private String label;
    @ValueConverter(PropertDocumentToJSONObjectConverter.class)
    @JsonSerialize(using = CustomJSONObjectSerialize.class)
    @Field(name = "components")
    private JSONObject components;

    public Questionnaire() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getEnoCoreVersion() {
        return enoCoreVersion;
    }

    public void setEnoCoreVersion(String enoCoreVersion) {
        this.enoCoreVersion = enoCoreVersion;
    }

    public String getLunaticModelVersion() {
        return lunaticModelVersion;
    }

    public void setLunaticModelVersion(String lunaticModelVersion) {
        this.lunaticModelVersion = lunaticModelVersion;
    }

    public String getGeneratingDate() {
        return generatingDate;
    }

    public void setGeneratingDate(String generatingDate) {
        this.generatingDate = generatingDate;
    }

    public String getMissing() {
        return missing;
    }

    public void setMissing(String missing) {
        this.missing = missing;
    }

    public String getPagination() {
        return pagination;
    }

    public void setPagination(String pagination) {
        this.pagination = pagination;
    }

    public String getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(String maxPage) {
        this.maxPage = maxPage;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public JSONObject getComponents() {
        return components;
    }

    public void setComponents(JSONObject components) {
        this.components = components;
    }
}
