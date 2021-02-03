package codility;

public class lesson3_frogjmp {

    public static int solution(int X, int Y, int D) {
        int result = 0;
        int gap = Y-X;

        if(gap%D != 0)
            result = gap/D + 1;
        else
            result = gap/D;

        return result;
    }

    public static void main(String[] args) {
        int X = 10;
        int Y = 85;
        int D = 30;

        int result = solution(X, Y, D);
        System.out.println(result);
    }
}
