/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peakindex=peak(mountainArr);

        int answer=binsearch(target,mountainArr,0,peakindex,true);

        int result=-1;

        if(answer!=-1)//if found in ascending then returned right here
        {
            result=answer;    
        }

        else//if not found in ascending then search in descending part 
        {
            answer=binsearch(target,mountainArr,peakindex,mountainArr.length()-1,false);

            result=answer;

        }



        return result;
        
        
    }

    //firstly finding the index of peak element of the array 

    public int peak(MountainArray marr)
    {
        int start=0;
        int end=marr.length()-1;
        int mid;
        
        while(start<end)
        {
            mid=start+(end-start)/2;
            


            if(marr.get(mid)>marr.get(mid+1))
            {
                end=mid;
            }

            else if(marr.get(mid)<marr.get(mid+1))
            {
                start=mid+1;
            }


        }

        return start;
    
    }


    public int binsearch(int element, MountainArray mont, int start, int end, boolean order)
    {
        //if order=true means ascending , else descending
        int ans=-1;
        int mid;
        int midval;

        if(order)
        {
         while(start<=end)
            {
            mid=end-(end-start)/2;
            midval=mont.get(mid);


            if(midval>element)
            {
                end=mid-1;
            }

            else if(midval<element)
            {
                start=mid+1;
            }

            else
            {
                ans=mid;
                break;
            }


            }

            return ans;
        }

        else
        {

            while(start<=end)
            {
            mid=end-(end-start)/2;
            midval=mont.get(mid);


            if(midval<element)
            {
                end=mid-1;
            }

            else if(midval>element)
            {
                start=mid+1;
            }

            else
            {
                ans=mid;
                break;
            }


            }

            return ans;

        }
    

    }

    

}