class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int cargoDeck = n * n;
        int load = cargoDeck * w;
        if(load <= maxWeight) return cargoDeck;
        for(int i = 1; i <= cargoDeck; i++){
            if(i * w > maxWeight) return i-1;
        }
        return 0;
    }
}