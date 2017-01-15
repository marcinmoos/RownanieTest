package rownanie;


public class Rownanie {

    private double a, b, c;

    public Rownanie() {
    }
    

    public Rownanie(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void  setRownanie(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    
    

     String rownanie(){
         if(a == 0)return null;
        double delta = Math.pow(b,2) - 4*a*c;
        String result = "";
        switch((int)Math.signum(delta)){
            case 1:result = ((-b-Math.sqrt(delta))/(2*a))+","+((-b+Math.sqrt(delta))/(2*a));
            break;
            case 0:result = ""+(-b/2*a);
        }
        return result;
    }
}
