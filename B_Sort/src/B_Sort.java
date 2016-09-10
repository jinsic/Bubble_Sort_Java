public class B_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int arr[] = {1,3,5,7,12,5,867,234,3476,4564,24};
		Sort(arr);
		
		
		if(B_Search(arr,234)==1)
			System.out.println(234 + "exist");
		else
			System.out.println(234 + "not exist");
		
			
/*
		for(int i=0;i<arr.length;++i)
			System.out.print(arr[i] + " ");
			
			
		
		
*/
		}
	
	
	public static void Sort(int[] arr)
	{
		int i,j,temp;
		
		for (i = 0; i < arr.length - 1; i++)
		{
		      for (j = 0; j < arr.length - 1 - i; j++)
		      {
		        if (arr[j] > arr[j + 1]) 
		        {
		          temp = arr[j];
		          arr[j] = arr[j + 1];
		          arr[j + 1] = temp;
		        }
		      }
		    }
		
	}
	public static int B_Search(int arr[], int findX)
	{		
		int bottom = 0;
		int top = arr.length;
		
		while(top >= bottom)
		{
			int mid = (top+bottom)/2;
			if(arr[mid] == findX)
				return 1;
			else if(arr[mid] < findX)
				bottom = mid + 1;
			else
				top = mid - 1;
		}
		
		return 0;
	}


}
