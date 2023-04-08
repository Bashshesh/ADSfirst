public class Problem11 {
    public static final char WHITE = ' ';

    public static final char COLORED = '♥';

    public static void PrintHeartForBestTeacher(int userInput){
        StringBuffer row = new StringBuffer();

        int width = 2 * (userInput - 1) + 3 * userInput;
        //it is just for fun
        int outerHearts = userInput - 1;
        int heartsSection1 = userInput;
        int heartsSection2 = userInput;
        int innerHearts = userInput;

        boolean upperPart = true;
        while (heartsSection1 > 0) {
            for (int i = 0; i < outerHearts; i++) {
                row.append(WHITE);
            }
            for (int i = 0; i < heartsSection1; i++) {
                row.append(COLORED);
            }
            for (int i = 0; i < innerHearts; i++) {
                row.append(WHITE);
            }
            for (int i = 0; i < heartsSection2; i++) {
                row.append(COLORED);
            }
            for (int i = 0; i < outerHearts; i++) {
                row.append(WHITE);
            }
            row.append("\n");
            if (upperPart) {
                if (outerHearts > 0) {
                    outerHearts--;
                    innerHearts = Math.max(0, innerHearts - 2);
                    if (outerHearts == 0) {
                        heartsSection1 = width;
                        heartsSection2 = 0;
                    } else {
                        heartsSection1 += 2;
                        heartsSection2 += 2;
                    }
                } else {
                    // line with only colored hearts,
                    // from now on the hearts reduce
                    upperPart = false;
                }
            }
            if (!upperPart) {
                outerHearts++;
                heartsSection1 -= 2;
            }
            if (heartsSection1 <= 0)
                break;
        }
        System.out.println(row.toString());
    }
    }
