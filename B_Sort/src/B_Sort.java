public class B_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,3,5,7,12,5,867,234,3476,4564,24};
		
		Sort(arr);
		
		for(int i=0;i<arr.length;++i)
			System.out.print(arr[i] + " ");
		
		
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


}