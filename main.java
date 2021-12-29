package Absensi;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        mahasiswa mhs = new mahasiswa();
        absen absen = new absen();
        
        mhs.AddMhs();  
        
        int i,j;
        boolean loop = true;
        
        while(loop){
            
        System.out.println("\n~~~~ABSENSI~~~~\n");
        System.out.println("Menu pilihan\n"+ "1.ABsen\n"+"2.Cek daftar mahasisiwa\n"+"3.List Absensi");
        System.out.print(" Pilihan : ");
        i = input.nextInt();
        System.out.println("\n");
        
        switch (i){
            
            case 1:
                absen.mengabsen(mhs.dataMhs);
                break;
               
            case 2:
               mhs.tampil();
               break;
                 
            case 3:             
                absen.listAbsen();
                break;
               
            default:
                System.out.println("MENU SALAH");
        }

        System.out.print("\nINGIN MENCOBA LAGI ? (y/n)   :  ");
        String ans = input.next();
        char k = 'n';
        if(k == ans.charAt(0)){
            loop  = false;
            System.out.println("\n\nTERIMA KASIH\n");
        }
            
      } //while
        
    }
}  