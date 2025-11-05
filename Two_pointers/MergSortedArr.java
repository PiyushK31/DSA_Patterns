import java.util.Arrays;

public class MergSortedArr {
    public void Merg(int []nums1 , int m , int []nums2 , int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args) {
        MergSortedArr merger = new MergSortedArr();
        int[] nums1 = new int[6]; // m + n size
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        nums1[3] = 5;
        int[] nums2 = {2, 4, 6};
        merger.Merg(nums1, 3, nums2, 3);
    }

}
