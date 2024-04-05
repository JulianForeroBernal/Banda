package Banda;

public class Guitarra extends Instrumento {
    public String afinar(){ //el metodo afinar (abstracto) que viene de la calse padre instrumento es definido aca
        return "afinado la guitarra";    //como un metodo de tipo string (que devuelve un string)
    }
    public String tocar(){ //de igual manera con el metodo tocar 
        return "tocando la guitarra";
    }
}
