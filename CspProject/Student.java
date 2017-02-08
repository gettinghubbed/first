import java.util.Arrays;
public class Student 
{
	String name; //All necessary public variables
    int tScore, whatScore, t0, a, average, hs, ls;
    int[] test= new int[10];
    
    void setName(String x) // method used in task for setting the student name
    {
        name=x;
    }
    
    String getName() //returns the name of the student
    {
        System.out.println(name);
        return name;
    }
    
    void setScore(int whichTest, int tScore) // method used in task for setting test[] values
    {
    	
        if(whichTest==1)
            test[0]=tScore;
        if(whichTest==2)
            test[1]=tScore;
        if(whichTest==3)
            test[2]=tScore;
        if(whichTest==4)
        	
            test[3]=tScore;
        if(whichTest==5)
            test[4]=tScore;
        if(whichTest==6)
            test[5]=tScore;
        if(whichTest==7)
            test[6]=tScore;
        if(whichTest==8)
            test[7]=tScore;
        if(whichTest==9)
            test[8]=tScore;
        if(whichTest==10)
            test[9]=tScore;
      
    }
    
    int getScore(int i) //returns all values of array test[]
    {
        if(i==1)
        {
        //     System.out.println("Test 1: "+test[0]);
            return test[0];
        } 
        else if(i==2)
        {
        //       System.out.println("Test 2: "+test[1]);
            return test[1];
        }
        else if(i==3)
        {
        //       System.out.println("Test 3: "+test[2]);
            return test[2];
        }
        else if(i==4)
        {
        //         System.out.println("Test 3: "+test[2]);
            return test[3];
        }
        else if(i==5)
        {
        //        System.out.println("Test 3: "+test[2]);
            return test[4];
        }
        else if(i==6)
        {
        //        System.out.println("Test 3: "+test[2]);
            return test[5];
        }
        else if(i==7)
        {
        //           System.out.println("Test 3: "+test[2]);
            return test[6];
        }
        else if(i==8)
        {
        //           System.out.println("Test 3: "+test[2]);
            return test[7];
        }
        else if(i==9)
        {
        //         System.out.println("Test 3: "+test[2]);
            return test[8];
        }
        else if(i==10)
        {
        //        System.out.println("Test 3: "+test[2]);
            return test[9];
        }
        else
        {
        //        System.out.println("Invalid test");
        	return -1;
        }
    }
    
    int getAverage() //returns average of values in array test[]
    {
        System.out.println("Test Average: "+(test[0]+test[1]+test[2]+test[3]+test[4]+test[5]+test[6]+test[7]+test[8]+test[9])/(10));
        average = (test[0]+test[1]+test[2]+test[3]+test[4]+test[5]+test[6]+test[7]+test[8]+test[9])/(10);
        return average;
    }
    
    int getHighScore() //returns highest value in array test[]
    {
    	hs = test[0];
        for(int i=1; i< test.length; i++)
        {
                if(test[i] > hs)
                        hs = test[i];
        }
        return hs;
    }
    
    public int getLowScore() //returns lowest value in array test[]
    {
    	int ls = test[0];
        for(int i=1; i< test.length; i++)
        {
                if(test[i] < ls)
                        ls = test[i];
        }
        return ls;
    }
   
    public String passFail() //Returns Pass or Fail string based on average
    {
    	if(average>69)
    		return "Passing";
    	if(average<70)
    		return "Failing";
    	return "class";
    }
    
    public String validateData() //Returns Error Data
    {
    	if(name == null)
    		return "SORRY: Name Required";
    	else if(name =="")
    		return "SORRY: Name Required";
    	else if(ls<0)
    		return "SORRY: Valid Test Score Required";
    	else if(hs>100)
    		return "SORRY: Valid Test Score Required";
    	else
    		return "GOOD";
    }
    
    	@Override
	public String toString()  //Returns standard class toString()
    { 
		return "Student [ name=" + name + ", tScore=" + tScore + ", whatScore=" + whatScore + ", t0=" + t0 + ", a=" + a
				+ ", average=" + average + ", test=" + Arrays.toString(test) + ", hs=" + hs + ", ls=" + ls
				+ ", getName()=" + getName() + ", getAverage()=" + getAverage() + ", getHighScore()=" + getHighScore()
				+ ", getLowScore()=" + getLowScore() + ", passFail()=" + passFail() + ", validateData()="
				+ validateData() + " ]";
	}
    
}
