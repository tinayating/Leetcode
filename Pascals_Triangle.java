class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>(); //list is an interface, no 'new List()'
        if(numRows <= 0)
            return result;
        List<Integer> first = new ArrayList<Integer>();
        first.add(1);
        result.add(first);
        for(int i = 2; i <= numRows; i++){ //i is the number of row
            List<Integer> row = new ArrayList<>();
            row.add(1);
            if(i-2 > 0){
                for(int j = 1; j < i-1; j++){
                    row.add(result.get(i-1-1).get(j-1) + result.get(i-1-1).get(j));
                }
            }
            if(i >= 2)
                row.add(1);
            result.add(row);
        }
        return result;
    }
}

//better solutions?
