package mainFrame;

public class Contacto {

    private String nombre;
    private String apellido;
    private String tel;
    private String email;
    private String direccion;
    private String web;
    private boolean fav;

    public Contacto(String nombre, String tel, String email) {
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
        this.fav = false;
    }

    public Contacto(String nombre, String apellido, String tel, String email, String direccion, String web) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tel = tel;
        this.email = email;
        this.direccion = direccion;
        this.web = web;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public boolean isFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }

    @Override
    public String toString() {
        return getNombre();
    }
    
    

}
