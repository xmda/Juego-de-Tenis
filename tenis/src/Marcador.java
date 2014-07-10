public class Marcador{
    private Jugador jugador1, jugador2;
     
    final int GANA = -1;
    final int LOVE = -2;
    final int VENTAJA = -3;
     
    public Marcador(){
        jugador1 = new Jugador("Jugador 1");
        jugador2 = new Jugador("Jugador 2");
    }
     
    public Marcador(String pl1, String pl2){
        jugador1 = new Jugador(pl1);
        jugador2 = new Jugador(pl2);
    }
     
    /** Actualiza el marcador */
    public void actualiza(boolean anota1){
        if(anota1) jugador1.anota(); else jugador2.anota();
         
        if(jugador1.getPuntuacion()==40 && jugador2.getPuntuacion()==40){
            jugador1.setDeuce();
            jugador2.setDeuce();
        }
    }
     
    /** Comprueba si estÃ¡n en Deuce */
    public boolean isDeuce(){
        return jugador1.isDeuce() && jugador2.isDeuce();
    }
     
    /** Comprueba si el partido ha terminado */
    public boolean isTerminado(){
        return jugador1.getPuntuacion()==GANA || jugador2.getPuntuacion()==GANA;
    }
     
    /** Devuelve quiÃ©n gana */
    public Jugador quienGana(){
        return (jugador1.getPuntuacion()==GANA? jugador1 : jugador2);
    }
     
    /** Sobreescritura de toString() */
    public String toString(){
        return jugador1 + " ( " + jugador1.getStringPuntuacion() + " - " + jugador2.getStringPuntuacion() + " ) " + jugador2;
    }
 
}
