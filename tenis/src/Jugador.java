public class Jugador{
    String nombreJugador;
    int puntuacion;
     
    private final int GANA = 4;
    private final int  LOVE = 5;
    private final int VENTAJA = 6;
    private final int[] marcador = {0,15,30,40,-1,-2,-3,-1};
     

    public Jugador(){
        this("Jugador 1");
    }
     

    public Jugador(String n){
        nombreJugador = n;
        puntuacion = 0;
    }
     

    public void anota(){
        puntuacion++; 
    }
     

    public boolean isDeuce(){ 
        return puntuacion==LOVE; 
    }
     
    /** Pon la puntuación en Deuce */
    public void setDeuce(){ 
        puntuacion = LOVE; 
    }
     
    /** Resetea la puntuación */
    public void reset(){ 
        puntuacion = 0; 
    }
     
    /** Obtener puntuación del jugador */
    public int getPuntuacion(){ 
        return marcador[puntuacion]; 
    }
     
    /** Obtener la puntuación en forma de String */
    public String getStringPuntuacion(){
        String str;
         
        switch(getPuntuacion()){
            case -1: str = "GANADOR"; break;
            case -2: str = "LOVE"; break;
            case -3: str = "VENTAJA"; break;
            default: str = "";
        }
         
        return "" + (str.equals("")? getPuntuacion(): str);
    }
     
    /** Sobreescritura de toString() */
    public String toString(){    
        return nombreJugador;
    }
     
}
