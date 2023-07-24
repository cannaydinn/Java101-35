public class Student {
    

    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course vivaMath;
    Course vivaPhy;
    Course vivaChm;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya, Course vivaMath, Course vivaPhy, Course vivaChm) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.vivaMath = vivaMath;
        this.vivaPhy = vivaPhy;
        this.vivaChm = vivaChm;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int vivaMath, int vivaPhy, int vivaChm) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

        if (vivaMath >= 0 && vivaMath <=100){
            this.vivaMath.note = vivaMath;
        }

        if (vivaPhy >= 0 && vivaPhy <=100){
            this.vivaPhy.note = vivaPhy;
        }

        if (vivaChm >= 0 && vivaChm <=100){
            this.vivaChm.note = vivaChm;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.fizik.note * 0.8) + (this.vivaPhy.note * 0.2)) +
                        ((this.mat.note * 0.8) + (this.vivaMath.note * 0.2)) +
                        ((this.kimya.note * 0.8) + (this.vivaChm.note * 0.2))) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Matematik Sözlü Notu : " + this.vivaMath.note);
        System.out.println("Fizik Sözlü Notu : " + this.vivaPhy.note);
        System.out.println("Kimya Sözlü Notu : " + this.vivaChm.note);
    }
}
