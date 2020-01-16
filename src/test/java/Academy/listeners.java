package Academy;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.base;

public class listeners implements ITestListener  {
	base b=new base();
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		//hey i am done
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("This is the ITestContxt Method");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//screenshot
		System.out.println("This is the screenshot of the failed test");

		try {
			b.getScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("This is the screenshot of the failed test");

		}
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("This is the screenshot of the failed test");


	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("This is the screenshot of the failed test");


	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

}
