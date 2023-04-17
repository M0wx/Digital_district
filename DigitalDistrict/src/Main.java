import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("C://Users//SITRAKA.M//Music//file//Cerfificat de Residence.doc");
        if(!file.exists()){
            try{
                file.createNewFile();

            }catch (Exception e){
                e.printStackTrace();
            }
        }else {
            FileWriter writer = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("\t\t\t\tREPOBLIKAN'I MADAGASIKARA\n");
            bw.write("\t\t\t\t   FANAMARINAM-PONENANA\n\t\t\t\t CERTIFICAT DE  RESIDENCE\n\n");
            bw.write("\t\tMINISTERAN'NY ATI-TANY SY NY FITSINJARAM-PAHEFANA\n\t\t\tPREFEKTIORAN'NY POLISY ANTANANARIVO\n\t\t\t\tDISTRIKAN'ANTANANARIVO V\n\t\t\t\t FOKOTANY AMPANOTOKANA\n\n\n\n\n");
            bw.write("Lab: 292\t/MID/PREFPOL/DIST.V FKT/\tAMP/21\n");
            bw.write("Ny Sefom-pokontany eto AMPANOTOKANA dia manamarina fa:\n");
            bw.write("Le Chef Fokontany de AMPANOTOKANA certifie que:\n\n\n\n");
            bw.write("Anarana:\tRATOVOMANALINA\t\tFanampin'anarana:\tSitraka Mamy\n");
            bw.write("  Nom   \t              \t\t    Prénom\n\n");
            bw.write("Teraka tamin'ny\t 08 Martsa 2005 \t\t Tao \t\t AVARADOHA\n");
            bw.write("      Né(e)    \t                \t\t  à\n\n");
            bw.write("Kara-panondro: .................... ny .............. Tao ...............\n");
            bw.write("   CIN                         délivrée le             à\n\n");
            bw.write("Ray:\tRATOVOSON Mamy Francklin\t\tReny: RASOAMANALINA Bakoly\n");
            bw.write("Père\t                        \t\tMère\n\n");
            bw.write("Asa aman-draharaha:\tMpianatra\t\tzom-pirenena\tMALAGASY\n");
            bw.write("   Profession      \t         \t\tNationalié\n\n");
            bw.write("Dia monina ao amin'ny lo: II E 46 AB ary voasoratra ho isan'ny fokonolona laharana faha: 1137\n\n\n\n\n\n\n");
            bw.write("\t\t\t\t\t\t\t\tAnananarivo faha: ..........\n\t\t\t\t\t\t\t\tNy Sefom-pokotany");
            bw.close();
            writer.close();
        }
    }
}
