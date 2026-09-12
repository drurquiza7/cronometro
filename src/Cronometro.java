public class Cronometro{
    private long tiempoInicio;
    private long tiempoFinal;
    private boolean enEjecucion;
    
    public void empezar(){
        this.tiempoInicio = System.currentTimeMillis();
        this.enEjecucion = true; 
    }

    public void finalizar(){
        if(enEjecucion){
            this.tiempoFinal = System.currentTimeMillis();
            this.enEjecucion = false;
        } else {
            System.out.println("Aviso: el cronometro ya está detenido ");
        }
    }
    public void reset(){
        this.tiempoInicio = 0;
        this.tiempoFinal = 0;
        this.enEjecucion = false;
    }
    public long obtenerTiempoTranscurrido(){
        if(enEjecucion) {
            return System.currentTimeMillis() - tiempoInicio;
        }
        return tiempoFinal - tiempoInicio;
    }
}