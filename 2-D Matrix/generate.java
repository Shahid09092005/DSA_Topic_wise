// 118. Pascal's Triangle
class Solution {
    public static List<Integer> generateRow(int row){
        List<Integer> ls = new ArrayList<>();
        if(row<1){
            return ls;
        }else if(row==1){
            ls.add(row);
            return ls;
        }else{
            ls.add(1); // for index 0;
            int res=1;
            for(int i=1;i<row;i++){
                res = res*(row-i);
                res=res/(i);
                ls.add(res);
            }
        }
        return ls;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            result.add(generateRow(i));
        }
        return result;
        
    }
}
