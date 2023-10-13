import java.util.*;
 
public class spccexp8 {
    public static void main(String args[]) {
        //take input from user - count of expression and expressions
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of expressions");
        int n = sc.nextInt();
        System.out.println("Enter the expressions: ");
        sc.nextLine();
        String exp[] = new String[n];
        for (int i = 0; i < n; i++) {
            exp[i] = sc.nextLine();
        }
        System.out.println("\n\nQuadruple: ");
        System.out.println();
        qQuadruple(exp);
        System.out.println("\n\nTriple: ");
        System.out.println();
        tTriples(exp);
 
    }
 
    public static void qQuadruple(String expression[]) {
        System.out.println("op\targ1\targ2\tresult");
        for (int i = 0; i <expression.length;i++) {
            String[] expR = expression[i].split("");
            System.out.println(expR[3]+"\t"+expR[2]+"\t"+expR[4]+"\t"+expR[0]);
 
        }
    }
 
    public static void tTriples(String expression[]){
        System.out.println("#\top\targ1\targ2");
		int c=0;
        for(int i=0;i<expression.length;i++){
        String[] expR = expression[i].split("");
        System.out.println((i+c)+"\t"+expR[3]+"\t"+expR[2]+"\t"+expR[4]);
		if(expR[0]!= null){
			++c;
			System.out.println((i+c)+"\t"+expR[1]+"\t"+expR[0]+"\t"+(i+c-1));
		}
        }
        }
 
}