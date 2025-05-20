package hackerRank;

import java.util.Scanner;


public class Solution{
    public static boolean isMatched(String character) {
        final String opening = "({["; // opening delimiters
        final String closing = ")}]"; // respective closing delimiters
        
        
    Stack<Character> buffer = new ArrayStack<>( );            
        for (char c : character.toCharArray( )) {
            if (opening.indexOf(c) != -1) // this is a left delimiter
                buffer.push(c);
            else if (closing.indexOf(c) != -1) { // this is a right delimiter
                if (buffer.isEmpty( )){ // nothing to match with
                    System.out.println(":(");
                    return false;
                    }if (closing.indexOf(c) != opening.indexOf(buffer.pop( ))){
                        System.out.println(":(");
                        return false;
                }
            }
        }
        if(buffer.isEmpty()){
                System.out.println(":)");
            }else{
                System.out.println(":(");
            }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int limit = input.nextInt();
        
        for(int i = 0; i < limit; i++){
            String character = input.next();
            isMatched(character);
        }  
    }
}
