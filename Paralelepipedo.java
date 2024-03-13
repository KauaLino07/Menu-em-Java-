
import javax.swing.JOptionPane;

public class Paralelepipedo extends Ponto {
    
    private double c;

    public Paralelepipedo(float x, float y, double c) {
        super(x, y);
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double volume(){
        double volume;
        volume = this.getX() * this.getY() * c;
        return volume;
    }

    public double areaTotal(){
        double area;
        area = 2 * (this.getX() * this.getY() + this.getX() * c + this.getY() * c);
        return area;
    }

    public void imprimeDados(){
        this.setX(Float.parseFloat(JOptionPane.showInputDialog("DIGITE O VALOR DA BASE: ")));

        this.setY(Float.parseFloat(JOptionPane.showInputDialog("DIGITE O VALOR DA ALTURA: ")));

        c = Float.parseFloat(JOptionPane.showInputDialog("DIGITE O VALOR C: "));
    }

    @Override
    public String toString() {
        String texto;
        texto = "PARALELEPIPEDO" + 
        "\n----------------------" + 
        "\n\nAREA TOTAL: " + areaTotal() + 
        "\nVOLUME: " + volume();
        return texto;
    }


}
