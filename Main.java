//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Videojuego videojuego1 = new Videojuego();
        videojuego1.setEmpresa("Nintendo");
        videojuego1.setAnio_creacion(1980);
        videojuego1.setPais_origen("Japon");
        videojuego1.info();

        Accion juego1 = new Accion();
        juego1.setNum_jugadores(5);
        juego1.setDuracion(25);
        juego1.info();

        RPJ juego2 = new RPJ();
        juego2.setConsola("Mobile");
        juego2.setOnline(true);
        juego2.info();

        Shotter juego3 = new Shotter();
        juego3.setMod_juego("Dificil");
        juego3.setNum_accesorios(4);
        juego3.info();

        }
    }
