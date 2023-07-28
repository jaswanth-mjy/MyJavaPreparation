package Arrays;
import java .util.*;
public class ArraysCC {
public static void update(int marks[]){
for(int i=0;i<marks.length;i++){
   marks[i]=marks[i]+1;

}
}
public static void duplicate(int marks[]){
   int[] newArray = new int[marks.length];
   int newIndex =0;
   for(int i=0;i<marks.length;i++){
    if(i==marks.length-1||marks[i]!=marks[i+1]){

        newArray[newIndex]=marks[i];
        newIndex++;
    }
   }
   System.arraycopy(newArray,0,marks,0,newArray.length);
}
public static void  print(int marks[]){
for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+ " ");

        }
        System.out.println();
}

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

    int marks[] = {99,100,102,102,103,103,104,104};
//    marks[0]=sc.nextInt();
//    marks[1]=sc.nextInt();
//    marks[2]=sc.nextInt();

//    System.out.println("phy :"+marks[0]);
//    System.out.println("che :"+marks[1]);
//    System.out.println("mat :"+marks[2]);
//    int percentage = (marks[0]+marks[1]+marks[2])/3;
//    System.out.println("Percentage : "+ percentage +"%");
        update(marks);
        duplicate(marks);
        print(marks);
        
}
}

