class Solution {
     List<List<Integer>> l=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       dhanush(0,target,new ArrayList<>(),candidates);
       return l;
    
    }
    void dhanush(int i,int t,List<Integer> ll,int[] a){
        if(t==0){
            l.add(new ArrayList<>(ll));
            return;
        }
        if(i>=a.length){
           return;
        }
        
        
    if(t>=a[i]){
    ll.add(a[i]);
    dhanush(i,t-a[i],ll,a);
    ll.remove(ll.size()-1);
    }
    dhanush(i+1,t,ll,a);
    }
}