package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public String getEnsenanza() {
        return this.ensenanza;
    }
    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String interpretacion() {
        return this.interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String toString(){
        return this.getOrigen()+"\n"+this.getTitulo()+"\n"+getAutor()+"\n"+this.getPaginas()+"\n"+this.ensenanza;
    }

    public int palabrasTotales(int num){
        return this.getPaginas()*1*num;
    }

}
