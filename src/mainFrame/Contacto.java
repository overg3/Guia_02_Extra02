package mainFrame;

public class Contacto {

    private String nombre;
    private String tel;
    private String email;
    private boolean fav;

    public Contacto(String nombre, String tel, String email) {
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
        this.fav = false;
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

    public boolean isFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }

}
