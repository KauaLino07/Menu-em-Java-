import javax.swing.JOptionPane;



public class Quadrado extends Ponto{

    public Quadrado(float x, float y) {
        super(x, y);
    }
    
    public void cadastraDados(){
        this.setX( Float.parseFloat(JOptionPane.showInputDialog("DIGITE O VALOR X: ")));

       this.setY(Float.parseFloat(JOptionPane.showInputDialog("DIGITE O VALOR Y: ")));
    }
    public double soma(){
        double area = this.getX() * getY();
        return area;
    }
    public double conta(){
        double perimetro = this.getX() +getY() + this.getX() + this.getY();
        return perimetro;
    }

    @Override
    public String toString() {
        String texto;
        texto = "QUADRADO" +
        "\n----------------------------------" +   
        "\n\nAREA DO QUADRADO: " + soma() +
        "\n\nPERIMETRO DO QUADRADO: " + conta();
        return texto;
    }
    
}
