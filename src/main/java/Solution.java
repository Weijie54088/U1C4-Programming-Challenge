public class Solution 
{
    /*DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
    PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS*/

    public Solution() {}

    public boolean endsLy(String x) 
    {
        //implement code here
        if (x.length() > 2)
        {
            if (x.substring(x.length() - 2, x.length()).equals("ly"))
            {
                return true;
            }       
        }
    return false;
    }

    public String conCat(String s1, String s2) 
    {
        //implement code here
        if (s2.equals(""))
        {
            return s1;
        }
        else if (s1.substring(s1.length() - 1).equals(s2.substring(0,1)))
        {
            return s1 + s2.substring(1);
        }
        else
        {
            return s1 + s2;
        }
    }
    

    public String withoutX(String s1) 
    {
        //implement code here
        if (s1.substring(0,1).equals("x") && s1.substring(s1.length() - 1).equals("x"))
        {
            return s1.substring(1,s1.length() - 1);
        }
        else
        {
            if (s1.substring(0,1).equals("x"))
        {
            return s1.substring(1);
        }
        else
        {
            return s1.substring(0,s1.length() - 1);
        }
        }
    }

    public String fizzString(String s1) 
    {
        //implement code here
        if (s1.substring(0,1).equals("f") && s1.substring(s1.length() - 1).equals("b"))
        {
            return "FizzBuzz";
        }
        else if (s1.substring(0,1).equals("f"))
        {
            return "Fizz";
        }
        else if (s1.substring(s1.length() - 1).equals("b"))
        {
            return "Buzz";
        }
        else
        { 
            return s1;
        }
    }

    public String fizzString2(int x) 
    {
        //implement code here
        if ((x % 5.0 == 0) && (x % 3.0 == 0))
        {
            return "FizzBuzz!";
        }
        else if (x % 3.0  == 0)
        {
            return "Fizz!";
        }
        else if (x % 5.0 == 0)
        {
            return "Buzz!";
        }
        else
        {
            return x + "!";
        }
    }

}
