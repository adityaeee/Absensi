    package Absensi;

    import static java.time.Clock.system;
    import java.util.Scanner;
    import java.util.ArrayList;

    public class mahasiswa {
        ArrayList<String> dataMhs = new ArrayList();



        public void AddMhs(){
            this.dataMhs.add("aditya");
            this.dataMhs.add("rifky");
            this.dataMhs.add("muhammad");
            this.dataMhs.add("kayu");
            this.dataMhs.add("batu");
            this.dataMhs.add("tanah");
            this.dataMhs.add("angin");

        }

        public void tampil(){
            for(int i = 0; i<this.dataMhs.size();i++){
                System.out.println(dataMhs.get(i));
            }
        }

    } 