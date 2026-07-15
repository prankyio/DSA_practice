class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        
        
        int count=0;
        int maxrow=matrix.length -1;
        int maxcol=matrix[0].length -1;
        
        int e=0;

        int row=0;
        int col=0;
        int total=(maxrow+1)*(maxcol+1);

        int[] ans= new int[total];

        while(e< total )
        {
            
            if(e<total){
            while(col<= maxcol - count)
            {
                ans[e]=matrix[row][col];
                e++;
                col++;
            }
            
            col--;
            row++;
            }

            if(e<total){

            while(row <= maxrow - count)
            {
                ans[e]=matrix[row][col];
                e++;
                row++;
            }

            row--;
            col--;

            }

            count++;
            if(e<total){
            while(col>= count-1)
            {
                ans[e]=matrix[row][col];
                e++;
                col--;
            }

            col++;
            row--;
            }

            if(e<total){
        
             while(row>= count)
            {
                ans[e]=matrix[row][col];
                e++;
                row--;
            }

            row++;
            col++;
            }


        }

        ArrayList<Integer> list = Arrays.stream(ans)
                                        .boxed()
                                        .collect(Collectors.toCollection(ArrayList::new));
        
        return list;
    }
}