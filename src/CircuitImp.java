public class CircuitImp implements  ICircuit{

    public static final int VERSION =1;
    public boolean negation(boolean x1){
        return !x1;
    }

    public boolean and(boolean x1, boolean x2){
        return x1 && x2;
    }

    public boolean or(boolean x1, boolean x2){
        return x1 || x2;
    }



}
