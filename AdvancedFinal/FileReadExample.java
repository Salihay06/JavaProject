import java.io.*;
import java.util.Scanner;
/*

Kullanıcıdan bir dosya adı isteyen ve bu dosyayı açıp okumaya çalışan bir Java programı yazınız.
Aşağıdaki durumları düzgün şekilde ele almak için exception handling kullanınız:

FileNotFoundException: Dosya mevcut değilse

IOException: Dosya okunurken hata oluşursa

Her durumda kullanıcıya uygun hata mesajları gösteriniz.

 */

public class FileReadExample{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen okunacak dosyanın adını giriniz:");
        String fileName = scanner.nextLine();

        try(BufferReader br = new BufferReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Dosya okunurken hata oluştu: " + e.getMessage());
        }
    }
}