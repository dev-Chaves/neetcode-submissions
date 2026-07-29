class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for (Integer integer : nums){
            count.merge(integer, 1, Integer::sum);
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));

        for (Map.Entry<Integer, Integer> entry : count.entrySet()){

            heap.add(new int[]{entry.getKey(), entry.getValue()});

            if(heap.size() > k){
                heap.poll();
            }

        }

        int[] result = new int[k];

        for(int i=0; i < k; i++){
            int integer = heap.poll()[0];
            result[i] = integer;
        }

        return result;
    }
}
