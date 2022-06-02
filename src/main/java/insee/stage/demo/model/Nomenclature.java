package insee.stage.demo.model;

import org.json.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Nomenclature {
    @Id
    private String id;
    @Field(name = "reg")
    private String reg;
    @Field(name = "cheflieu")
    private String cheflieu;
    @Field(name = "libelle")
    private String libelle;
    @Field(name = "tncc")
    private String tncc;
    @Field(name = "nccenr")
    private String nccenr;
    @Field(name = "ncc")
    private String ncc;

    private JSONObject nomenclature;

    public Nomenclature(String id, String reg, String cheflieu, String libelle, String tncc, String nccenr, String ncc) {
        this.id = id;
        this.reg = reg;
        this.cheflieu = cheflieu;
        this.libelle = libelle;
        this.tncc = tncc;
        this.nccenr = nccenr;
        this.ncc = ncc;

        this.nomenclature.put("id",id);
        this.nomenclature.put("reg",reg);
        this.nomenclature.put("cheflieu",cheflieu);
        this.nomenclature.put("libelle",libelle);
        this.nomenclature.put("tncc",tncc);
        this.nomenclature.put("nccenr",nccenr);
        this.nomenclature.put("ncc",ncc);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getCheflieu() {
        return cheflieu;
    }

    public void setCheflieu(String cheflieu) {
        this.cheflieu = cheflieu;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getTncc() {
        return tncc;
    }

    public void setTncc(String tncc) {
        this.tncc = tncc;
    }

    public String getNccenr() {
        return nccenr;
    }

    public void setNccenr(String nccenr) {
        this.nccenr = nccenr;
    }

    public String getNcc() {
        return ncc;
    }

    public void setNcc(String ncc) {
        this.ncc = ncc;
    }
}
