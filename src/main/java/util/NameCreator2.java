package util;
import java.util.Random;
import Model.Name;
import util.NamePool;
public class NameCreator2 {
Name newName;
static int First_Number=NamePool.length_FirstName-1;
static int Second_Number=NamePool.length_SecondName-1;
static int Third_Number=NamePool.length_ThirdName-1;

public static String createName() {
	String FirstName=NamePool.FirstName[new Random().nextInt(First_Number)];
	String SecondName=NamePool.SecondName[new Random().nextInt(Second_Number)];
	String ThirdName=NamePool.ThirdName[new Random().nextInt(Third_Number)];
	
	return FirstName+SecondName+ThirdName;	
} 
}
