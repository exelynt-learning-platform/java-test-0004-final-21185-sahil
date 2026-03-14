public class ConcentricSquare {
    public static void main(String[] args) {
        int n = 4;
        int size = 2 * n - 1; 

       
        for (int i = 1; i <= size; i++) {
          
            for (int j = 1; j <= size; j++) {
                
                
                int top = i - 1;
                int left = j - 1;
                int bottom = size - i;
                int right = size - j;

                
                int minDistance = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print((n - minDistance) + " ");
            }

            System.out.println();
        }
    }
}