import java.util.*;

public class heap_spicy {

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        int temp = 0;

        PriorityQueue<Integer> a = new PriorityQueue<>();
        //PriorityQueue<Integer> b = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i=0; i<scoville.length; i++){
            a.add(scoville[i]);
        }

        while(a.size()>1 && a.peek() < K) {
            temp = a.poll() + (a.poll() * 2);
            //if(temp == 0) return -1;

            a.add(temp);
            answer++;
        }

        if(a.size()==1&&a.peek() < K) return -1;
        //answer = a.peek() < K ? -1 : answer;

        return answer;
    }

    public static void main(String[] args) {
        int[] scoville = {1,2,3,9,10,12};
        int k = 7;

        int result = solution(scoville, k);
        System.out.println(result);
    }
}
/*
public class heap_spicy {

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        int temp = 0;

        MinHeap a = new MinHeap();

        for (int i=0; i<scoville.length; i++){
            a.insert(scoville[i]);
        }

        while(a.find() < K) {
            temp = a.delete() + (a.delete() * 2);
            if(temp == 0) return -1;

            a.insert(temp);
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] scoville = {1,2,3,9,10,12};
        int k = 7;

        int result = solution(scoville, k);
        System.out.println(result);
    }
}

class MinHeap {
    private ArrayList<Integer> heap;

    public MinHeap(){
        heap = new ArrayList<>();
        heap.add(0); //heap의 인덱스는 0부터 시작한다
    }

    void insert(int data) {
        heap.add(data);
        int pos = heap.size()-1;

        while(pos > 1 && heap.get(pos/2)>heap.get(pos)) {//부모가 작으면 멈춤

            //반복문에 들어왔다는 것 = 부모노드가 자식보다 크다는 것!
            int temp = heap.get(pos/2);
            heap.set(pos/2, heap.get(pos));
            heap.set(pos, temp);

            pos /= 2;
        }

    }

    int delete() {
        if(heap.size()-1 < 1) //heap에 값이 없는 경우
            return 0;

        int node = heap.get(1); // 루드 노드 삭제

        heap.set(1, heap.get(heap.size()-1)); //루트 노드의 자리에 말단 노드를 가져옴
        heap.remove(heap.size()-1); // 말단 노드 삭제

        int pos = 1;
        int minPos = 2;

        while(minPos < heap.size()) {
            int min = heap.get(minPos); //현재 노드의 왼쪽 자식 노드의 값

            if( minPos+1 < heap.size() && min > heap.get(minPos+1)){
                min = heap.get(++minPos); // 오른쪽 자식 노드로 변경
            }

            if(heap.get(pos) < min) break; // 현재 노드보다 자식 노드의 값이 더 크면, 힙의 성질을 만족하면 반복 종료

            int temp = heap.get(pos);
            heap.set(pos, heap.get(minPos));
            heap.set(minPos, temp);

            pos = minPos;
            minPos *= 2; // 현재 노드의 왼쪽 자식 노드의 인덱스
        }

        return node;
    }

    int size() {
        return heap.size();
    }

    int find() {
        return heap.get(1);
    }
}*/