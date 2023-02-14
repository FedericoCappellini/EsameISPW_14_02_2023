package main;

public class Main {

    public static void main(String[] args){
        boolean a = true;
        boolean b = true;
        boolean c = branch(a,b);
        System.out.println(c);
    }

    private static boolean branch(boolean A, boolean B) {
        if(A){
           return A;
        }
        if(B){
            return B;
        }
        return false;
    }
}
