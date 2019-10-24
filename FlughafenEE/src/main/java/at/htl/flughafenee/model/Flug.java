package at.htl.flughafenee.model;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "FLUG")

public class Flug {
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
