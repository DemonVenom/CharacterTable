
public class CharacterTable {

    public static void main(String[] args) {

        System.out.printf("Escape Sequences & Special Chars\n%6s%6s%6s%6s%6s\n", "Dec", "Hex", "Oct", "Chr", "Seq");
        System.out.printf("%6d%6s%6s%6s%6s\n", 0,
                Integer.toHexString(0), Integer.toOctalString(0), "NUL", "\\0");
        System.out.printf("%6d%6s%6s%6s\n", 8,
                Integer.toHexString(8), Integer.toOctalString(8), "BS");
        System.out.printf("%6d%6s%6s%6s%6s\n", 9,
                Integer.toHexString(9), Integer.toOctalString(9), "TAB", "\\t");
        System.out.printf("%6d%6s%6s%6s%6s\n", 10,
                Integer.toHexString(10), Integer.toOctalString(10), "LF", "\\n");
        System.out.printf("%6d%6s%6s%6s%6s\n", 12,
                Integer.toHexString(12), Integer.toOctalString(12), "FF", "\\f");
        System.out.printf("%6d%6s%6s%6s%6s\n", 13,
                Integer.toHexString(13), Integer.toOctalString(13), "CR", "\\r");
        System.out.printf("%6d%6s%6s%6s\n", 27,
                Integer.toHexString(27), Integer.toOctalString(27), "ESC");



        System.out.println("");


        System.out.println(" ASCII Table");

        for (int i = 0; i < 3; i++) {

            System.out.printf("|%6s%6s%6s%6s%6s", "Dec", "Hex", "Oct", "Chr", "|");
        }
        System.out.println();

        for(char character = ' '; character < 63; character++) {

            System.out.printf("|%6d%6s%6s%6c%6s", (int)character,
                    Integer.toHexString((int)character), Integer.toOctalString((int)character), character, "|");

            System.out.printf("|%6d%6s%6s%6c%6s", (int)(character+32),
                    Integer.toHexString((int)(character+32)), Integer.toOctalString((int)(character+32)), (character+32), "|");

            System.out.printf("|%6d%6s%6s%6c%6s\n", (int)(character+64),
                    Integer.toHexString((int)(character+64)), Integer.toOctalString((int)(character+64)), (character+64), "|");
        }

        char character = '?';

        System.out.printf("|%6d%6s%6s%6c%6s", (int)character,
                Integer.toHexString((int)character), Integer.toOctalString((int)character), character, "|");

        System.out.printf("|%6d%6s%6s%6c%6s", (int)(character+32),
                Integer.toHexString((int)(character+32)), Integer.toOctalString((int)(character+32)), (character+32), "|");

        System.out.printf("|%6d%6s%6s%6s%6s\n", (int)(character+64),
                Integer.toHexString((int)(character+64)), Integer.toOctalString((int)(character+64)), "DEL", "|");


    }



}
