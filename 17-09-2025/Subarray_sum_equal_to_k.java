//Approach
// if we find sum of given array from i and then to j then the middle elements are equal to sum(i+1,j) = sum(0,j) - sum(0,i)
//replace the sum(0,i) to sum(0,i-1) and left hand side sum(i+1,j) change to sum(i,j)
//now we find subarrays which is equal to k so
//sum(j)-sum(i) = k
//sum(j) = sum(i)+k;
//now we deruve from this
//sum(j)-k=sum(i) and sum(i) store in hashmap then we check if sum(j)-k exists in hashmap which is equal to sum(i) then the given sum of subarray found in hash map, increase its frequency if it exists and not exists then add that sum sub array to map 
//by default we add (0,1) in hashmap to calculate when sum becomes 0.

public class Subarray_sum_equal_to_k {
    
}
