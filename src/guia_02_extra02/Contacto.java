package guia_02_extra02;

import java.util.Objects;

public class Contacto {

    private String nombre;
    private String tel;
    private String email;

    public Contacto(String nombre, String tel, String email) {
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
