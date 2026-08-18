class Solution {
    public int minCostToMoveChips(int[] position) {

        Arrays.sort(position);

        int len = position.length;
        int posmax = position[0];
        int posmaxcoins=0;

        if (posmax % 2 == 0) //if posmax is even then count coins at odd places
        {
            for (int j = 0; j < len; j++) {

                if (position[j] % 2 == 1) {

                    posmaxcoins++;

                }
            }
        }

        else //if posmax is odd then count coins at even places
        {
            for (int j = 0; j < len; j++) {

                if (position[j] % 2 == 0) {

                    posmaxcoins++;

                }
            }

        }

        int newposmaxcoins = 0;

        int newposmax;

        for (int i = 1; i < len; i++) 
        {
            if (position[i] != position[i - 1]) 
            {

                //Whenever a new unique element is found , we checl its relativecoins(cost)
                newposmax=position[i];

                if (newposmax % 2 == 0) //if newposmax is even then count coins at odd places
                {
                    for (int j = 0; j < len; j++) {

                        if (position[j] % 2 == 1) {

                            newposmaxcoins++;

                        }
                    }
                }

                else //if newposmax is odd then count coins at even places
                {
                    for (int j = 0; j < len; j++) {

                        if (position[j] % 2 == 0) {

                            newposmaxcoins++;

                        }
                    }

                }

                if (newposmaxcoins < posmaxcoins) 
                {
                    posmax = newposmax;
                    posmaxcoins = newposmaxcoins;
                   
                }
                newposmaxcoins=0;

            }

           

        

    }

    return posmaxcoins;
}

}