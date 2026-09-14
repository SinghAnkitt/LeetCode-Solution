class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int employee = 0;
        for(int check : hours){
            if(check >= target) employee++;
        }
        return employee;
    }
}