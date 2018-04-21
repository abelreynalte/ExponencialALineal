package pe.edu.unmsm.fisi.upg.ads.big_o_notation_java;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

//Complexity: O(2^N)
public class Exponential {

	public static void main(String[] args) {
		long N = 80;
		Exponential exponential = new Exponential();
		Stopwatch stopwatch = Stopwatch.createStarted();
		for (int i = 1; i <= N; i++) {
			try {
				long fibonacci = exponential.fibonacci(i);
				System.out.println(i + " => " + fibonacci);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(String.format("Time elapsed: %d seconds", stopwatch.elapsed(TimeUnit.SECONDS)) + "\n");
	}
	
//	public long fibonacci(int n) throws Exception {
//        if (n < 0) {
//            throw new Exception("N can not be less than zero");
//        }
//        if (n <= 2) {
//            return 1;
//        }
//        return fibonacci(n - 1) + fibonacci(n - 2);
//    }
	public long fibonacci(int n) throws Exception{
	    if( n == 0 ) {
            return 0;
	    }

	    if( n == 1 ) {
		return 1 ; 
	    }
                
	    long f1 = 1 ;
	    long f2 = 0 ;

	    long f = 0 ;

	    for( int i = 1 ; i < n ; i++ ) {

		f = f1 + f2 ;        

		f2 = f1 ;

		f1 = f ;

	    }

	    return f;
	}
}
