import java.util.Scanner;

class GradeCalculator{
    public static void main(String[] args) {
        System.out.println("Enter no. of subjects");
        Scanner sc= new Scanner (System.in);
        int x= sc.nextInt();
        int total=0;
        for(int i=1;i<=x;i++) {
            System.out.println("Enter marks for subject "+ i);
            int n= sc.nextInt();
            total+=n;
        }
        int av_perc= total/x;
       char Grade;
        if(av_perc>90) {
            Grade='A';
        }
        else if(av_perc>80) {
            Grade ='B';
        }
        else if(av_perc>70) {
            Grade='C';
        }
        else if(av_perc>60) {
            Grade='D';
        }
        else if(av_perc>50) {
            Grade='E';
        }
        else {
            Grade='F';
        }
    
        System.out.println("Displaying results");
        System.out.println("Total marks is "+ total);
        System.out.println("Average Percentage is "+av_perc);
       System.out.println("Grade is: "+Grade);

    }
}
