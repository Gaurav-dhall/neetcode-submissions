class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] mix= new int[n+m];

        int i=0;
        int j=0;
        int k=0;

        while(i<n&&j<m){
            if(nums1[i]<nums2[j]){
                mix[k]=nums1[i];
                i++;
            }
            else{
                mix[k]=nums2[j];
                j++;
            }
            k++;
        }

        while(j<m){
            mix[k]=nums2[j];
            j++;
            k++;
        }

        while(i<n){
            mix[k]=nums1[i];
            i++;
            k++;
        }

        int size=mix.length;
        System.out.println(size);
        System.out.println(Arrays.toString(mix));

        if(size%2!=0){
            int mid=(size+1)/2-1;
            return mix[mid];
        }

        int mid1=size/2-1;
        int mid2=mid1+1;

        return (double)(mix[mid1]+mix[mid2])/2;
    }
}
