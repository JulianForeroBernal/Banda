package Banda;
import java.util.Random;
public class Banda {
    public Instrumento[] instrumentos; //no entindo mañana pregunto (creo que como Instrumento es abstrac por eso puede ser de tipo array)
    public  Instrumento generarInstrumento(int opcion){
        switch (opcion) {
            case 1:
                return new Guitarra();
            case 2:
                return new Tiple();
            case 3:
            return new Tambor();
            default:
                throw new AssertionError();
        }
    }
    public void generarBanda (int cantidadInstrumentos){
        Random r = new Random(); // para poder usrar random debo generar un objeto de ripo rador y de hay usar los metodos de la calse importada random
        this.instrumentos = new Instrumento[cantidadInstrumentos]; //(creo que es como en python aca se esta creando la istancia
        //del objeto this es como el self para referirse a si mismo instrumento es pues el "parametro de la clase o nombre no se ( copor que no se puede cambiar)"
        //es un objeto de la clase instrumento que arriba se definio que sera un array y asi se dice que sera del cierto taamaño de una cariable que se ingrasara despues 
        for (int i =0 ; i<cantidadInstrumentos ; i++){
            int numAleatorio= r.nextInt(1,4);
            this.instrumentos[i] = generarInstrumento(numAleatorio);       
        }
    }
    public void afinarBanda(){
        for (Instrumento i : instrumentos) {
            System.out.println(i.afinar());
        }
    }
    public void tocarBanda(){
        for (Instrumento i : instrumentos) {
            System.out.println(i.tocar());
        }
    }


}
