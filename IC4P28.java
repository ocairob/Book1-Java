public class IC4P28 {   
public static void main(String[] args){
        int p=1, r=1;
        while (Math.pow(p, 4) + Math.pow(r, 3) < 510){
            while (Math.pow(p, 4) + Math.pow(r, 3) < 510){                  
                    System.out.print("\np: " + p + " r: " + r);
                    r++;
            }
            r=1;
            p++;
        }
    }
}

