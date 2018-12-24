package restaurant_final;

public class Ingresos {
    private double[] ings;
    private double ARRAY_LONG;
    public Ingresos(double[] ings){
        this.ings = ings;
        this.ARRAY_LONG = ings.length;
    }

    public double IngresosFinales(){
        double fin = 0;
        for (int i = 0; i<ARRAY_LONG; i++){
            fin += ings[i];
        }
        return fin;
    }
    public double[] getIngs() {
        return ings;
    }

    public void setIngs(double[] ings) {
        this.ings = ings;
    }
}
