package codility;

public class lesson2_rotation {

    public static int[] solution(int[] A, int K) {
        int arrlength = A.length;
        int[] result = new int[arrlength];
        int remd = K%arrlength;
        int tmp = 0;

        if(remd == 0)
            return A;

        for(int i = 0; i < arrlength; i++){
            tmp = i+remd;
            if(tmp >= arrlength)
                tmp = tmp - arrlength;

            result[tmp] = A[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;

        int[] result = solution(A, K);
        for(int i = 0; i<result.length; i++){
            System.out.print(result[i]+"\t");
        }
    }
}
