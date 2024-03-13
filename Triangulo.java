import javax.swing.JOptionPane;

public class Triangulo extends Ponto {

   private float c;
    
   public float getC() {
    return c;
}

public void setC(float c) {
    this.c = c;
}
   
    public Triangulo(float x, float y, float c) {
        super(x, y);
        this.c = c;
    }
    
    public void cadastraDados(){
        this.setX(Float.parseFloat(JOptionPane.showInputDialog("DIGITE O VALOR DA BASE: ")));

        this.setY(Float.parseFloat(JOptionPane.showInputDialog("DIGITE O VALOR DA ALTURA: ")));

        c = Float.parseFloat(JOptionPane.showInputDialog("DIGITE O VALOR C:"));
    }

    public double conta(){
        double area = this.getX() * this.getY() / 2;
        return area;
    }

    public double perimetro(){
        double total = this.getC() + this.getX() + this.getY();
        return total;
    }

    @Override
    public String toString() {
      String texto;
      texto = "TRIÂNGULO" +
      "\n----------------------------------" +  
      "\n\nAREA TOTAL: " + conta() + 
      "\n\nPERIMETRO TOTAL: " + perimetro();
        return texto;
    }

    

    

}
