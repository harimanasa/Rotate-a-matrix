public class RotateArray {
    static int m =5, n=5;
    static int a[][] = new int[m][n];

    public static void build_Array(){
        for(int i=0; i<m; i++)
            for(int j =0; j<n; j++)
                a[i][j] = i+2*j;
    }

    public static void print_Array(){
        for(int i=0; i<m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
        }
    }

    public static void swap(int i, int j){
        int temp = i;
        i = j;
        j = temp;
    }

    public static void print_rotate_Array(){
        for (int j = 0; j < n; j++){
            System.out.println();
            for(int i=0; i<m; i++) {
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static void rotate() {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(a, i, j, j, i);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
                swap(a, i, j, i, n - 1 - j);
            }
        }
    }

    static void swap(int[][] a, int x1, int y1, int x2, int y2) {
        int temp = a[x1][y1];
        a[x1][y1] = a[x2][y2];
        a[x2][y2] = temp;
    }

    static public void main (String... args){
        build_Array();
        System.out.println("Given array is : ");
        print_Array();
        rotate();
        System.out.println("\n \nRotated array is : ");
        print_Array();

    }

}
