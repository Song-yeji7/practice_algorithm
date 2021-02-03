package codility;

public class lesson3_PermMissingElem {

    public static int solution(int[] A) {
        int result = 0;
        int tmp = 0;
        int tmpA = 0;

        for(int j = 1; j <= A.length+1; j++)
            tmp += j;

        for(int i = 0; i < A.length; i++)
            tmpA += A[i];

        result = tmp-tmpA;

        return result;
    }

    public static void main(String[] args) {
        int[] N = {2,3,1,5};

        int result = solution(N);
        System.out.println(result);
    }
}
