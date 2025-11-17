package Com_Sem.CodeWithAnshu;

import java.util.Scanner;

public class CWA_PROGRAM_ARRAY_SUM_MUL_TRANS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size in term of row and column of 2d  array   : ");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int [][]arr=new int[row][column];
        int [][]arr1=new int[row][column];
        int [][]sum=new int[row][column];
        int [][]ml=new int[row][column];
        // HERE INPUT THE ELEMENT OF FIRST MATRIX
        System.out.println("Enter the element of matrix A  : ");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                arr[i][j]=sc.nextInt();
                sum[i][j]=0;
                ml[i][j]=0;
            }
        }
        // HERE INPUT THE ELEMENT OF MATRIX
        System.out.println("Enter the element of matrix B : ");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }

        // PRINT THE BOTH MATRIX
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.println("Matrix : A  ");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.println("Matrix : A  ");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // HERE CALCULATING THE SUM OF ELEMENT IN ARRAY
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
             sum[i][j]+=arr[i][j]+arr1[i][j];
            }
        }

        // HERE CALCULATING  MULTIPLICATION OF ELEMENT IN ARRAY
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < column; j++) {
                for (int k = 0; k < column; k++) {
                    ml[i][j] += arr[i][k] + arr1[k][j];
                }
            }
        }
        // HERE PRINT THE SUM OF ELEMENT IN ARRAY
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.println("SUM OF MATRIX :  ");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        // HERE PRINT THE SUM OF ELEMENT IN ARRAY
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.println("MULTIPLICATION OF MATRIX :  ");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                System.out.print(ml[i][j]+" ");
            }
            System.out.println();
        }
        // HERE PRINT THE TRANSPOSE OF MATRIX : A
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.println("TRANSPOSE OF MATRIX : A ");
        for (int j = 0; j <row ; j++) {
            for (int i = 0; i <column ; i++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // HERE PRINT THE TRANSPOSE OF MATRIX : A
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.println("TRANSPOSE OF MATRIX : B ");
        for (int j = 0; j <row ; j++) {
            for (int i = 0; i <column ; i++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
