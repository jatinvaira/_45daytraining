public class arrays {
    public static void main(String[] args){
        // datatype[] name=new datatype[len];
        // datatype name[]=new datatype[len];
        // datatype arr[];ost 
        // arr=new[len];

        int[] students;
        students=new int[7];
        System.out.println("Array length= "+ students.length);

        for(int i=0; i<students.length; i++){
            students[i]=2*i;
            
            
        }
        System.out.print("Values stored in array: ");
        for(int i=0; i<students.length; i++){
                System.out.println(students[i]);
            }   
    }
    }
