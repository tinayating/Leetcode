class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>(); //list is an interface, no 'new List()'
        if(numRows <= 0)
            return result;
        List<Integer> first = new ArrayList<Integer>();
        first.add(1);
        result.add(first); //add the first row to the result
        for(int i = 1; i < numRows; i++){ 
            List<Integer> row = new ArrayList<>();
            row.add(1);
            if(i-1 > 0){
                for(int j = 1; j < i; j++){
                    row.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
            if(i >= 1)
                row.add(1);
            result.add(row);
        }
        return result;
    }
}

//better solutions?
