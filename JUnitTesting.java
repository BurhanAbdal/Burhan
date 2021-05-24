public class JUnitTesting {

	public int Max(int[] inputArray) {
		int maxvalue = inputArray[0];
		for (int i=1; i <inputArray.length;i++)
		{
		if(inputArray[i]> maxvalue)
		{
		   maxvalue =inputArray[i];
		}
		}
		return maxvalue;
		}
	
    public int Min(int[] inputArray) {
	int minvalue = inputArray[0];
	for (int i=1; i <inputArray.length;i++)
	{
	if(inputArray[i]< minvalue)
	{
	   minvalue =inputArray[i];
	}
	}
	return minvalue;
	}
	}