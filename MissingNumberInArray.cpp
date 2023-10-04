class Solution {
public:
    int missingNumber(vector<int>& nums) {
       int n=nums.size();
       int *temp=(int*)calloc(n+1,sizeof(int));
       for(int i=0;i<n;i++){
           temp[nums[i]]++;

       } 
       int ans;
       for(int j=0;j<=n;j++){
           if(temp[j]==0){
               ans=j;
               break;
           }
       }
        return ans;
    }
};

//using xor
class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n=nums.size();
       int xor1=0,xor2=0;

        for(int i=0;i<n;i++){
             xor1=xor1^i;
             xor2=xor2^nums[i];
        }
        xor1=xor1^n;

      
        return (xor1^xor2);
    }
};
