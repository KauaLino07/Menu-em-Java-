import javax.swing.JOptionPane;

public class Equacao {
   
    private double a;
    private double b;
    private double c;

    public Equacao(){}

    public Equacao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void imprimeDados(){
        a = Double.parseDouble(JOptionPane.showInputDialog("INFORME O VALOR DE A: "));
        
        b = Double.parseDouble(JOptionPane.showInputDialog("INFORME O VALOR DE B: "));

        c = Double.parseDouble(JOptionPane.showInputDialog("INFORME O VALOR DE C: "));
    }

    public double delta(){
        double delta = (b * b) + (-4 * (a * c));
        return delta; 
    }

    public double x1(){
        
        if (delta() >= 0) {
            Double x1 = (( -b )  + Math.sqrt(delta())) / 2 * a;
            return x1;            
        }else{
            return 0 ;
        }         
    }

    public double x2(){
        if (delta() >= 0) {
            Double x2 = ((+b) + Math.sqrt(delta())) / 2 * a;
            return x2;            
        }else{
            return 0;
        }        
    }

    public void verifica(){
        if (delta() >= 0) {
            System.out.println("A: " + a + 
            "\nB: " + b + 
            "\nC: " + c);

            System.out.println("Valor de Delta: " + delta());
            System.out.println("Valor de X1: " + x1() + 
            "\n\nValor de X2: " + x2());            
        }else{
            System.out.println("A: " + a + 
            "\nB: " + b + 
            "\nC: " + c);
            System.out.println("Valor de Delta: " + delta());
            System.out.println("Delta menor que 0, delta invalido");

        }     
    }


    public String toString() {
        String texto ;
        if (delta()>= 0) {
            texto = "DELTA" + 
            "--------------------" +  
            "\n\nValor de Delta: " + delta() + 
            "\n\nValor de X1: " + x1() + "\nValor de X2: " + x2();
            return texto;           
        }else{
            texto = "DELTA" + 
            "\nValor de Delta: " + delta() + 
            "\nDelta menor que 0, delta invalido"; 
            return texto;
        }       

    }    
 }
