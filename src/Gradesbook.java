/**
 * @author Mehreen Malik
 * mehreenmalik08@gmail.com
 * 13 Jun 2018 16:41:50
 */

public class Gradesbook 
{
	public double getGrade(String grade, String college)
	{
		double gpv = 0;
		if(college.equals("IT"))
		{
			switch (grade)
			{
		        case "A":
		        	gpv = 4;
		            break;
		        case "B+":
		        	gpv = 3.5;
		            break;
		        case "B":
		        	gpv = 3;
		            break;
		        case "B-":
		        	gpv = 2.75;
		        	break;
		        case "C+":
		        	gpv = 2.50;
		        	break;
		        case "C":
		        	gpv = 2.00;
		        	break;
		        case "D":
		        	gpv = 1.50;
		        	break;
		        case "F":
		        	gpv = 0;
		        	break;
		        case "G":
		        	gpv = 0;
		        	break;
			}
		}
		else if(college.equals("BBIT"))
		{
			switch (grade)
			{
		        case "A+":
		        	gpv = 4.2;
		            break;
		        case "A":
		        	gpv = 4.0;
		            break;
		        case "A-":
		        	gpv = 3.8;
		            break;
		        case "B+":
		        	gpv = 3.6;
		        	break;
		        case "B":
		        	gpv = 3.4;
		        	break;
		        case "B-":
		        	gpv = 3.2;
		        	break;
		        case "C+":
		        	gpv = 3.0;
		        	break;
		        case "C":
		        	gpv = 2.8;
		        	break;
		        case "C-":
		        	gpv = 2.6;
		        	break;
		        case "D+":
		        	gpv = 2.4;
		        	break;
		        case "D":
		        	gpv = 2.2;
		        	break;
		        case "D-":
		        	gpv = 2.0;
		        	break;
		        case "E":
		        	gpv = 1.8;
		        	break;
		        case "PCM":
		        	gpv = 2.0;
		        	break;
		        case "F":
		        	gpv = 0;
		        	break;
			}
		}
		else if(college.equals("Computer Science"))
		{
			switch (grade)
			{
		        case "A":
		        	gpv = 4.0;
		            break;
		        case "B+":
		        	gpv = 3.5;
		        	break;
		        case "B":
		        	gpv = 3.0;
		        	break;
		        case "B-":
		        	gpv = 2.75;
		        	break;
		        case "C+":
		        	gpv = 2.5;
		        	break;
		        case "C":
		        	gpv = 2.0;
		        	break;
		        case "D":
		        	gpv = 1.5;
		        	break;
		        case "F":
		        	gpv = 0;
		        	break;
		        case "None":
		        	gpv = 0;
		        	break;
			}
		}
		return gpv;
	}
}