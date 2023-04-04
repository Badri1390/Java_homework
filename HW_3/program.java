package Java_hw.Java_homework.HW_3;


import java.util.Arrays;

public class program {

	public static void main(String[] args) {
        int[] sourceArray = {10, 44, 19, 6, 54, 49, 34, 33, 75, 12, 1, 3, 21};
        int[] result = mergesort(sourceArray);
        System.out.println(Arrays.toString(result));        
    }

    public static int[] mergesort(int[] sourceArray) {
        int[] buffer1 = Arrays.copyOf(sourceArray, sourceArray.length); 
        int[] buffer2 = new int[sourceArray.length]; 
        int[] result = mergesortInner(buffer1, buffer2, 0, sourceArray.length);
        return result;
    }

    
    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
            int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
	}
}