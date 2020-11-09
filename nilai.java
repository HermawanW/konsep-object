package TugasObject;

public class nilai {
    private int pengetahuan;
    private int keterampilan;
    
    public nilai(int nilaiPengetahuan, int nilaiKeterampilan){
        this.pengetahuan = nilaiPengetahuan;
        this.keterampilan = nilaiKeterampilan;
    }
    
    //Nilai Rapot
    void getnilai(){
        System.out.println("-----Info Nilai Rapot-----");
        System.out.println("Nilai Pengetahuan = " + this.pengetahuan);
        System.out.println("Nilai Keterampilan = " + this.keterampilan);
    }

    //Konversi Nilai Rapot
    void getkonversi(){
        System.out.println("-----Hasil Konversi-----");

        //Konversi Pengetahuan
        if (this.pengetahuan <60){
            System.out.println("Konversi Pengetahuan = D");
        }
        else if(this.pengetahuan <=71){
            System.out.println("Konversi Pengetahuan = C");
        }
        else if(this.pengetahuan <=81){
            System.out.println("Konversi Pengetahuan = B");
        }
        else if(this.pengetahuan <=91){
            System.out.println("Konversi Pengetahuan = B+");
        }
        else if(this.pengetahuan <=100){
            System.out.println("Konversi Pengetahuan = A");
        }

        //Konversi Keterampilan
        if (this.keterampilan <60){
            System.out.println("Konversi Keterampilan = D");
        }
        else if(this.keterampilan <=71){
            System.out.println("Konversi Keterampilan = C");
        }
        else if(this.keterampilan <=81){
            System.out.println("Konversi Keterampilan = B");
        }
        else if(this.keterampilan <=91){
            System.out.println("Konversi Keterampilan = B+");
        }
        else if(this.keterampilan <=100){
            System.out.println("Konversi Keterampilan = A");
        }
    }
}