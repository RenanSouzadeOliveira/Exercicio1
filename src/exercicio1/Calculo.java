package exercicio1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;



public class Calculo extends JFrame{
	double num1, num2, soma, diferenca, produto;
	JLabel lblnum1 = new JLabel("Número 1");
	JLabel lblnum2 = new JLabel("Número 2");
	JLabel lblresults = new JLabel("Soma");
	JLabel lblresultd = new JLabel("Diferença");
	JLabel lblresultp = new JLabel("Produto");
	JTextField txtnum1 = new JTextField();
	JTextField txtnum2 = new JTextField();
	JTextField txtSoma = new JTextField();
	
	JTextField txtDiferenca = new JTextField();
	JTextField txtProduto = new JTextField();
	JButton btnCalculo = new JButton("Calcular");
	
	MaskFormatter formatnum1 = null;
	MaskFormatter formatnum2 = null;
	
	
	Resultados result = new Resultados();
	
	public Calculo(){
		super("Calculo");
		Container paine = this.getContentPane();
		String caracteres="0987654321";
		
		paine.add(lblnum1); // label
		
		lblnum1.setBounds(20,20,245,40);
		
		paine.add(txtnum1);// caixa
		txtnum1.setBounds(80,30,140,20);
		
		paine.add(lblnum2);// label
		lblnum2.setBounds(20,100,245,40);
		
		paine.add(txtnum2);// caixa
		txtnum2.setBounds(80,110,140,20);
		
		paine.add(lblresults);// label
		lblresults.setBounds(20,140,245,40);
		
		paine.add(txtSoma);// caixa
		txtSoma.setBounds(80,150,140,20);
		
		paine.add(lblresultd);// label
		lblresultd.setBounds(20,180,245,40);
		
		paine.add(txtDiferenca);// caixa
		txtDiferenca.setBounds(80,190,140,20);
		
		paine.add(lblresultp);// label
		lblresultp.setBounds(20,220,245,40);
		
		paine.add(txtProduto);// caixa
		txtProduto.setBounds(80,230,140,20);
		
		paine.add(btnCalculo);
		btnCalculo.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 num1 = Double.parseDouble(txtnum1.getText());
				 num2 = Double.parseDouble(txtnum2.getText());
				 txtSoma.setText("" + result.soma(num1, num2));
				 txtDiferenca.setText("" + result.sub(num1, num2));
				 txtProduto.setText("" + result.mult(num1, num2));
			 }
		 });
		btnCalculo.setBounds(90,400,100,40);
		
		txtSoma.setEditable(false);
		txtDiferenca.setEditable(false);
		txtProduto.setEditable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(350, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		Calculo cad = new Calculo();
		
	}
}
