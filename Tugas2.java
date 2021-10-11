
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhamad Yamin
 */
public class Tugas2 {
    public static void main(String args[]) {
        Scanner in =new Scanner(System.in);
        int scorekoding = 60;
        String nilaiKoding = "";
        String nilaiInterview = "";
        System.out.print("Masukkan score koding : ");
        scorekoding = in.nextInt();
        
        
        if ( scorekoding > 80 ) {
      nilaiKoding = "LOLOS";
      nilaiInterview = "A";
    }  
        
   else if ( scorekoding > 60 & scorekoding < 80 ) {
      nilaiKoding = "DIPERTIMBANGKAN";
      nilaiInterview = "B";
    }

    else if ( scorekoding < 60 ) {
      nilaiInterview = "GAGAL";
    }


    if (
            "LOLOS".equals(nilaiKoding) || "DIPERTIMBANGKAN".equals(nilaiKoding) &&
     (  "A".equals(nilaiInterview) || "B".equals(nilaiInterview))
    ) {
        System.out.println("Selamat Kamu Berhasil Menjadi Calon Programmer");
    } else {
        System.out.println("Maaf Kamu Belum Berhasil Menjadi Calon Programmer");
    }

  }
}
