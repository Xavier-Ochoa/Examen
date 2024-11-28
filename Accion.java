class Accion extends Videojuego {
    private double duracion;
    private int num_jugadores;

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getNum_jugadores() {
        return num_jugadores;
    }

    public void setNum_jugadores(int num_jugadores) {
        this.num_jugadores = num_jugadores;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("La  duracion es: " +  duracion);
        System.out.println("El numero de jugadores es: " +  num_jugadores );
    }



}