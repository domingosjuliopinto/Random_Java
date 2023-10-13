import java.util.*;
import java.io.*;

public class spccexp9{

    public static void main(String[] args){

        System.out.println("SPCC Exp 9");

        HashMap<String, String[]> equations = new LinkedHashMap<String, String[]>();

        // File path is passed as parameter
        File file = new File("C:\\Users\\domin\\Desktop\\College thing\\spcc\\ques.txt");
 
        // Creating an object of BufferedReader class
        try {

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()){
                String ans = sc.nextLine();
                String[] exp = ans.split("=");
                String[] rhs = exp[1].split(" ");
                equations.put(exp[0], rhs );
            }

            sc.close();

        } catch (Exception e) {
            //TODO: handle exception
        }

        

        HashMap<String, String> left = new LinkedHashMap<String, String>();

        for (String key : equations.keySet()) {

            int ans;
            
            if(equations.get(key).length == 1){
                if(isNumeric(equations.get(key)[0])){

                }else{
                    left.put(key,equations.get(key)[0]);
                }
                
                // equations.remove(key);
            }

            for(int i =0 ; i<equations.get(key).length; i++){
                
                System.out.println(equations.get(key)[i]);
                if(left.containsKey(equations.get(key)[i])){
                    equations.get(key)[i] = left.get(equations.get(key)[i]);
                }
                
            
            }
            
        }

        for (String key : left.keySet()) {

            equations.remove(key);
            
        } 

        System.out.println("\nThe given equations: ");
        printGrammar(equations);

        System.out.println("\nvariable propogation: ");
        printGrammar1(left);

        

    }

    // Function for printing grammar
    public static void printGrammar(HashMap<String, String[]> grammar) {
        for (String key : grammar.keySet()) {
            System.out.print(key + " = ");
            for (int j = 0; j < grammar.get(key).length; j++) {
                System.out.print(grammar.get(key)[j] + " ");

            }
            System.out.println();
        }
    }

    //Same but different, bug but fearture
    public static void printGrammar1(HashMap<String, String> grammar) {
        for (String key : grammar.keySet()) {
            System.out.print(key + " -> ");
            System.out.print(grammar.get(key));
            System.out.println();
        }
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}