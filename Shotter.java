class Shotter extends RPJ {
    private String mod_juego;
    private int num_accesorios;

    public String getMod_juego() {
        return mod_juego;
    }

    public void setMod_juego(String mod_juego) {
        this.mod_juego = mod_juego;
    }

    public int getNum_accesorios() {
        return num_accesorios;
    }

    public void setNum_accesorios(int num_accesorios) {
        this.num_accesorios = num_accesorios;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("El modo de juego es: " + mod_juego);
        System.out.println("La numero de accesorios es: " + num_accesorios);
    }
}

