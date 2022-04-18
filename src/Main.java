import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student s = new Student();
        int select;

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        Course mat = new Course("Matematik", "101", "MAT");
        Course fizik = new Course("Fizik", "101", "FZK");
        Course kimya = new Course("Kimya", "101", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();

        System.out.println("****************************************");
        System.out.println("*********ÖĞRENCİ BİLGİ SİSTEMİ-*********");
        System.out.println("****************************************");
        System.out.println("*************-HOŞGELDİNİZ-**************");
        System.out.println("****************************************");

        do {
            Menu();
            System.out.print("Seçiminiz: ");
            select = input.nextInt();
            switch (select){
                case 1:
                    s.printNote();


            }
        } while (select != 0);
    }


    static void Menu() {
        System.out.println("(1)-Öğrenci Listele\n(2)-Öğretmen Listele\n(3)-Öğrenci Ekle\n(4)-Öğretmen Ekle");
        System.out.println("(5)-Not Ekle\n(6)-Ortalama Gör\n(7)-Durum Gör\n(0)-Çıkış");
    }




}
