
package equacao;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int d,x1,x2 ;
        String string_a,string_b,string_c;

        string_a = JOptionPane.showInputDialog("Declare o a:");
        string_b = JOptionPane.showInputDialog("Declare o b:");
        string_c = JOptionPane.showInputDialog("Declare o c:");

        int a=Integer.parseInt(string_a);
        int b=Integer.parseInt(string_b);
        int c=Integer.parseInt(string_c);

        if (a!=0){
            d=b*b-4* a*c;
            if(d>=0){
                x1=(int) ((-b + Math.sqrt(d))/(2*a));
                x2=(int) ((-b - Math.sqrt(d))/(2*a));
                JOptionPane.showMessageDialog(null,"o x1 eh: " + x1);
                JOptionPane.showMessageDialog(null,"o x2 eh: " + x2);
            } else JOptionPane.showMessageDialog(null,"o delta n pode ser negativo");
        }else JOptionPane.showMessageDialog(null,"o a n pode ser 0");













    }



}
