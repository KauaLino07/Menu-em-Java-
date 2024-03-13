import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Menu {
    
    private static Menu opcao = new Menu();

	
    

	public static Menu getOpcao() {
		return opcao;
	}
	public static void setOpcao(Menu opcao) {
		Menu.opcao = opcao;
	}
	private static final int Cilindro = 1;
	private static final int Cone = 2;
	private static final int Equacao = 3;
	private static final int Paralelepipedo = 4;
	private static final int Quadrado = 5;
	private static final int Triangulo = 6;
	private static final int SAIR_DO_PROGRAMA = 7;
	
	public static void main(String[] args) {
		ArrayList<String> menu = new ArrayList<String>();
		Integer opcao = lerOpcaoDoMenu(); 

		while(opcao != SAIR_DO_PROGRAMA){
			switch(opcao){
			case Cilindro:
				Cilindro c1 = new Cilindro(0,0);
                c1 = new Cilindro(0, 0);
    			c1.imprimeDados();
    			c1.areaBase();
    			c1.areaTotal(); 

    			JOptionPane.showMessageDialog(null, c1.toString());
				menu.add(c1.toString());
				break;
			case Cone:
				Cone co1 = new Cone(0,0);
				co1 = new Cone(0, 0);
        		co1.volume();
        		co1.calculo();
        		co1.imprimeDados();
      
        JOptionPane.showMessageDialog(null, co1.toString());
		
				break;
			case Equacao:
				Equacao e1 = new Equacao(0, 0, 0);
				e1 = new Equacao(0, 0, 0);
        		e1.imprimeDados();
				e1.delta();
        		e1.x1();
        		e1.x2();
        		e1.verifica();

        JOptionPane.showMessageDialog(null, e1.toString());
				break;
			case Paralelepipedo:
				Paralelepipedo p1 = new Paralelepipedo(0,0,0);
                p1 = new Paralelepipedo(0, 0, 0);
    			p1.imprimeDados();
    			p1.volume();
    			p1.areaTotal();
    
    			JOptionPane.showMessageDialog(null, p1.toString());
                
				break;
			case Quadrado:
				Quadrado q1 = new Quadrado(0,0);
				q1 = new Quadrado(0, 0);
				q1.cadastraDados();
				q1.soma();
				q1.conta();
				   
				JOptionPane.showMessageDialog(null, q1.toString());
				
				break;
			case Triangulo:
				Triangulo t1 = new Triangulo(0,0,0);
                t1 = new Triangulo(0, 0, 0);
   				t1.cadastraDados();
    			t1.conta();
    			t1.perimetro();

				JOptionPane.showMessageDialog(null, t1.toString());

				break;
			case SAIR_DO_PROGRAMA:
				JOptionPane.showMessageDialog(null,"[Programa será encerado!]");
				break;
			 default:
				 JOptionPane.showMessageDialog(null,"Opcao Invalida!");
				 break;
			}
			
			opcao = lerOpcaoDoMenu();
		}
		
	}
        private static Integer lerOpcaoDoMenu(){
		String menu = "[-------- Menu ---------]";
		menu += "\n[1] - Cilindro";
		menu += "\n[2] - Cone";
		menu += "\n[3] - Equação do 2°grau";
		menu += "\n[4] - Paralelepipedo";
		menu += "\n[5] - Quadrado";
		menu += "\n[6] - Triangulo";
		menu += "\n[7] - Sair";
		menu += "\n[ ------------------------- ]";
		menu += "\nInforme sua opcao: ";
		
		String strOpcao = JOptionPane.showInputDialog(null,menu);
		
		return Integer.parseInt(strOpcao);
	}
}


