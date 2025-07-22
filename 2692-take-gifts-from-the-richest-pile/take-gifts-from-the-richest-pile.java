class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:gifts){
            pq.add((long)i);
        }
        while(k>0){
            long ans = (long)Math.floor(Math.sqrt(pq.poll()));
            pq.add(ans);
            k--;
        }
        long sum = 0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }
        return sum;
    }
}