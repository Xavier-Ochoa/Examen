class RPJ extends Accion {
    private String consola;
    private Boolean online;

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("El tipo de consola es: " + consola);
        System.out.println("El tipo  de juego es: " + online);
    }
}

