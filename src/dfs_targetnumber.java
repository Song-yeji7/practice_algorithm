public class dfs_targetnumber {

    static int answer = 0;

    public static int solution(int[] numbers, int target) {
        dfs(numbers, 0, 0, target);

        return answer;
    }

    public static void dfs(int[] numbers, int idx, int sum, int target){
        if(idx==numbers.length){
            if(sum==target){
                answer++;
            }
            return;
        }

        dfs(numbers, idx+1, sum+numbers[idx], target);
        dfs(numbers, idx+1, sum-numbers[idx], target);

    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int target = 3;

        int result = solution(numbers, target);
        System.out.println(result);
    }
}
