package insee.stage.demo.model;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import insee.stage.demo.util.CustomJSONArraySerialize;
import insee.stage.demo.util.CustomJSONObjectSerialize;
import insee.stage.demo.util.PropertDocumentToJSONArrayConverter;
import insee.stage.demo.util.PropertDocumentToJSONObjectConverter;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.convert.ValueConverter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("questionnaire")
public class Questionnaire {

        @ValueConverter(PropertDocumentToJSONObjectConverter.class)
        @JsonSerialize(using = CustomJSONObjectSerialize.class)
        @Field(name = "test")
        private JSONObject test;

    public Questionnaire() {
    }

    public JSONObject getTest() {
        return test;
    }

    public void setTest(JSONObject test) {
        this.test = test;
    }




    //    @Field(name = "id")
//    private String id;
//    @Field(name = "modele")
//    private String modele;
//    @Field(name = "enoCoreVersion")
//    private String enoCoreVersion;
//    @Field(name = "lunaticModelVersion")
//    private String lunaticModelVersion;
//    @Field(name = "generatingDate")
//    private String generatingDate;
//    @Field(name = "missing")
//    private boolean missing;
//    @Field(name = "pagination")
//    private String pagination;
//    @Field(name = "maxPage")
//    private String maxPage;
//    @Field(name = "label")
//    private String label;
//    @ValueConverter(PropertDocumentToJSONArrayConverter.class)
//    @JsonSerialize(using = CustomJSONArraySerialize.class)
//    @Field(name = "components")
//    private JSONArray components;
//    @ValueConverter(PropertDocumentToJSONArrayConverter.class)
//    @JsonSerialize(using = CustomJSONArraySerialize.class)
//    @Field(name = "suggesters")
//    private JSONArray suggesters;
//    @ValueConverter(PropertDocumentToJSONArrayConverter.class)
//    @JsonSerialize(using = CustomJSONArraySerialize.class)
//    @Field(name = "variables")
//    private JSONArray variables;
//
//    public Questionnaire() {
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getModele() {
//        return modele;
//    }
//
//    public void setModele(String modele) {
//        this.modele = modele;
//    }
//
//    public String getEnoCoreVersion() {
//        return enoCoreVersion;
//    }
//
//    public void setEnoCoreVersion(String enoCoreVersion) {
//        this.enoCoreVersion = enoCoreVersion;
//    }
//
//    public String getLunaticModelVersion() {
//        return lunaticModelVersion;
//    }
//
//    public void setLunaticModelVersion(String lunaticModelVersion) {
//        this.lunaticModelVersion = lunaticModelVersion;
//    }
//
//    public String getGeneratingDate() {
//        return generatingDate;
//    }
//
//    public void setGeneratingDate(String generatingDate) {
//        this.generatingDate = generatingDate;
//    }
//
//    public boolean isMissing() {
//        return missing;
//    }
//
//    public void setMissing(boolean missing) {
//        this.missing = missing;
//    }
//
//    public String getPagination() {
//        return pagination;
//    }
//
//    public void setPagination(String pagination) {
//        this.pagination = pagination;
//    }
//
//    public String getMaxPage() {
//        return maxPage;
//    }
//
//    public void setMaxPage(String maxPage) {
//        this.maxPage = maxPage;
//    }
//
//    public String getLabel() {
//        return label;
//    }
//
//    public void setLabel(String label) {
//        this.label = label;
//    }
//
//    public JSONArray getComponents() {
//        return components;
//    }
//
//    public void setComponents(JSONArray components) {
//        this.components = components;
//    }
//
//    public JSONArray getSuggesters() {
//        return suggesters;
//    }
//
//    public void setSuggesters(JSONArray suggesters) {
//        this.suggesters = suggesters;
//    }
//
//    public JSONArray getVariables() {
//        return variables;
//    }
//
//    public void setVariables(JSONArray variables) {
//        this.variables = variables;
//    }
}
