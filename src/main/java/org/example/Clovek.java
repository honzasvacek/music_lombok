package org.example;

import lombok.*;

import java.util.Objects;

/*@AllArgsConstructor
@ToString               @Data nahradí tyto anotace a další
@Getter
@EqualsAndHashCode      */
@Data
public class Clovek {
    final private String jmeno;
    final private String prijmeni;
    final private int rokNarozeni;


}

    //Lombok anotace nahrazují tyto metody:

    /*
    public Clovek(String jmeno, String prijmeni, int rokNarozeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.rokNarozeni = rokNarozeni;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clovek clovek = (Clovek) o;

        if (rokNarozeni != clovek.rokNarozeni) return false;
        if (!Objects.equals(jmeno, clovek.jmeno)) return false;
        return Objects.equals(prijmeni, clovek.prijmeni);
    }

    @Override
    public int hashCode() {
        int result = jmeno != null ? jmeno.hashCode() : 0;
        result = 31 * result + (prijmeni != null ? prijmeni.hashCode() : 0);
        result = 31 * result + rokNarozeni;
        return result;
    }
    @Override
    public String toString() {
        return "Clovek{" +
                "jmeno='" + jmeno + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                ", rokNarozeni=" + rokNarozeni +
                '}';
    }
    */

