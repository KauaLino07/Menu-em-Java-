import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(0, 0);
        q1 = new Quadrado(0, 0);
        q1.cadastraDados();
        q1.soma();
        q1.conta();
       
        JOptionPane.showMessageDialog(null, q1.toString());
    }


    
}
