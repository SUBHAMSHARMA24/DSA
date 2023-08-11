// Java program to find if
// there is a zero sum subarray
import java.util.Arrays;

public class subarraysum {

public static boolean subArrayExists(int arr[], int n)
{
	for (int i = 0; i < n; i++) {
		int sum = arr[i];
		if (sum == 0)
			return true;
		for (int j = i + 1; j < n; j++) {
			sum += arr[j];
			if (sum == 0)
				return true;
		}
	}
	return false;
}

// Driver's code
public static void main(String[] args)
{
	int arr[] = {4 ,2, -3, 1, 6 };
	int N = arr.length;

	// Function call
	if (subArrayExists(arr, N))
		System.out.println("Yes");
	else
		System.out.println("No");

}
}

// This code is contributed by Utkarsh Kumar
