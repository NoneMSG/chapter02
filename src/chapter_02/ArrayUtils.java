package chapter_02;

public class ArrayUtils {
	
	static public double[] intToDouble1(int[] source){
		if (source==null){
			return null;
		}
		double[] dArray = new double[source.length];
		for(int i = 0 ; i < source.length; ++i){
			dArray[i] = (double)source[i];
		}
		return dArray;
	}
	static public int[] doubleToInt(double[] source){
		if (source==null){
			return null;
		}
		int[] iArray = new int[source.length];
		for(int i = 0 ; i< source.length ; ++i){
			iArray[i] = (int)source[i];
		}
		return iArray;
	}

	static public int[] concat(int[] source1, int[] source2){
		if (source1==null||source2==null){
			return null;
		}
		int[] result1 = new int[source1.length];
		for(int i = 0 ; i < source1.length; ++i){
			int result = source1[i]+source2[i];
			result1[i]=result;
		}
	return result1;
	}
}
