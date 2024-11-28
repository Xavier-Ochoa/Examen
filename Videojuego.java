class Videojuego{
    private String empresa;
    private int anio_creacion;
    private String pais_origen;


    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getAnio_creacion() {
        return anio_creacion;
    }

    public void setAnio_creacion(int anio_creacion) {
        this.anio_creacion= anio_creacion;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }

    public void info() {
        System.out.println("La empresa creadora es: " + empresa + " el año creacion es: " + anio_creacion + " el pais_origen es: " + pais_origen);
    }

    public int edad(int anio_actual) {
        return anio_actual - anio_creacion;
    }

}
