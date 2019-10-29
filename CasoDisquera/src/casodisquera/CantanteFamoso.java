/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casodisquera;

/**
 *
 * @author Alumno
 */
public class CantanteFamoso {
    String Nombre;
    String DiscoConMasVentas;

    public CantanteFamoso(String Nombre, String DiscoConMasVentas) {
        this.Nombre = Nombre;
        this.DiscoConMasVentas = DiscoConMasVentas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDiscoConMasVentas() {
        return DiscoConMasVentas;
    }

    public void setDiscoConMasVentas(String DiscoConMasVentas) {
        this.DiscoConMasVentas = DiscoConMasVentas;
    }
    
}
