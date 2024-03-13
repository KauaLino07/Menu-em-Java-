import javax.swing.JOptionPane;

public class Cone extends Ponto {

    public Cone(float x, float y) {
        super(x, y);
    }

    public double volume(){
        double volume = (Math.PI * getX() * getX() * getY());
        return volume;
    }

    public double calculo(){
        double hipotenusa = Math.sqrt(getX() * getX() * getY() * getY());
        return hipotenusa;
    }

    public double superficie(){
        double superficie = (Math.PI * getX() * getX()) + (Math.PI * getX() * getX() * calculo());
        return superficie;
    }
    
    public void imprimeDados(){
        this.setX(Float.parseFloat(JOptionPane.showInputDialog("DIGITE O VALOR DO RAIO: ")));

        this.setY(Float.parseFloat(JOptionPane.showInputDialog("DIGITE O VALOR DO ALTURA: ")));

    }

    @Override
    public String toString() {
        String texto; 
        texto = "CONE" + 
        "\n--------------------------" + 
        "\n\nVOLUME DO CONE: " + volume() + 
        "\n\nAREA TOTAL: " + superficie();
        return texto;
    }
    
    
}
