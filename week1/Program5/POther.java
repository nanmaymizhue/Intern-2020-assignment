
public class POther {
	
public static void main(String[] args){
	int[] numArray={34,54,64,42,34,56,44,65,87,23,57,74};
	int biggestNumber=biggestNumber(numArray);
	int smallestNumber=smallestNumber(numArray);
	
	System.out.println("The biggest number is "+biggestNumber);
	System.out.println("The smallest number is "+smallestNumber);
}

public static int biggestNumber(int[] nArr){
	int max=nArr[0];
	for(int i=0;i<nArr.length;i++){
		if(nArr[i]>max){
			max=nArr[i];
		}
	}
	return max;
}

public static int smallestNumber(int[] nArr){
	int min=nArr[0];
	for(int i=0;i<nArr.length;i++){
		if(nArr[i]<min){
			min=nArr[i];
		}
	}
	return min;
}


}

