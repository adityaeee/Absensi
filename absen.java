package Absensi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class absen extends mahasiswa{
    HashSet<String> listAbsen = new HashSet<>(); 
    Scanner input = new Scanner(System.in);
    
    
    public void mengabsen(ArrayList<String> data){
        int i;
        System.out.print("MAsukkan nama anda :   ");
        String nama = input.next();
        for( i=0; i<data.size();i++){
             if(!data.get(i).equals(nama)){
                listAbsen.add(nama);
                System.out.println("Anda Berhasil Absen");
                break;
            }
        }
    }
    
    public void listAbsen(){
        System.out.println(listAbsen);
    }
}
