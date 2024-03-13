import javax.swing.JOptionPane;

public class Cilindro extends Ponto {

    public Cilindro(float x, float y) {
        super(x, y);
    }
    
    public double areaTotal(){
        double areaTotal = 2 * 3.14 * getX() * (getX() + getY());
        return areaTotal;
    }
    
    public double areaBase(){
        double areaBase = 3.14 * (getX() * getX());
        return areaBase;
    }
    public double volume(){
        double volume = areaBase() * getX();
        return volume; 
    }

    public void imprimeDados(){
        this.setX(Float.parseFloat(JOptionPane.showInputDialog("DIGITE O VALOR DO RAIO: ")));

        this.setY(Float.parseFloat(JOptionPane.showInputDialog("DIGITE O VALOR DA ALTURA: ")));

    }

    @Override
    public String toString() {
        String texto;
        texto = "CILINDRO" + 
        "\n-------------------------" + 
        "\n\nAREA TOTAL: " + areaTotal() + 
        "\n\nVOLUME: " + volume(); 
        return texto;
    }
    

}
