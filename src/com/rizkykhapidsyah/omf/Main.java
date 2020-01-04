package com.rizkykhapidsyah.omf;

public class Main {
    public static void main(String[] args) {
        int HasilInt;
        float HasilFloat;

        cetakAngka(16);
        cetakAngka(10.5f);
        cetakAngka(18.4d);

        System.out.println();

        HasilInt = Tambah(9, 3);
        cetakAngka(HasilInt);

        HasilFloat = Tambah(4.2f, 18.4f);
        cetakAngka(HasilFloat);

        HasilFloat = Tambah(4.2f, 14, 12);
        cetakAngka(HasilFloat);
    }

    private static void cetakAngka(double angkaDouble) {
        System.out.println("Ini Angka Tipe Data Double Dengan Nilai    : " + angkaDouble);
    }

    private static void cetakAngka(float angkaFloat) {
        System.out.println("Ini Angka Tipe Data Float Dengan Nilai     : " + angkaFloat);
    }

    private static void cetakAngka(int angkaInteger) {
        System.out.println("Ini Angka Tipe Data Integer Dengan Nilai   : " + angkaInteger);
    }

    private static int Tambah(int AngkaInt1, int AngkaInt2) {
        return AngkaInt1 + AngkaInt2;
    }

    private static float Tambah(float AngkaFloat1, float AngkaFloat2) {
        return AngkaFloat1 + AngkaFloat2;
    }

    private static float Tambah(float AngkaFloat1, int AngkaInt2, int AngkaInt3) {
        return AngkaFloat1 + AngkaInt2 + AngkaInt3;
    }
}
