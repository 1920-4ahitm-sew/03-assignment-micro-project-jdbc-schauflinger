package at.htl.fluaghafense.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Flug implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fluglinie;
    private String pilot;
    private String abreise;
    private String ankunft;

    public Flug(String fluglinie, String pilot, String abreise, String ankunft) {
        this.fluglinie = fluglinie;
        this.pilot = pilot;
        this.abreise = abreise;
        this.ankunft = ankunft;
    }

    public Flug() {
    }

    public Long getId() {
        return id;
    }

    public String getFluglinie() {
        return fluglinie;
    }

    public void setFluglinie(String fluglinie) {
        this.fluglinie = fluglinie;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public String getAbreise() {
        return abreise;
    }

    public void setAbreise(String abreise) {
        this.abreise = abreise;
    }

    public String getAnkunft() {
        return ankunft;
    }

    public void setAnkunft(String ankunft) {
        this.ankunft = ankunft;
    }

    @Override
    public String toString() {
        return String.format("%d: %s %s", fluglinie,pilot,abreise,ankunft);
    }

}
