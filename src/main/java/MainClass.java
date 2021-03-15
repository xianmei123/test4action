import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width = 0.0;
        double length = 0.0;
        double height = 0.0;
        int listnum = 0;
        int opnum = 0;
        listnum = scan.nextInt();
        opnum = scan.nextInt();
        ArrayList<CuboidBox> boxs = new ArrayList<CuboidBox>();
        CuboidBox mybox;
        for (int i = 0; i < listnum; i++) {
            boxs.add(new CuboidBox(0, 0,0));
        }
        int op = 0;
        int boxnum = 0;
        for (int i = 0; i < opnum; i++) {
            op = scan.nextInt();
            if (op == 3) {
                boxnum = scan.nextInt();
                length = scan.nextDouble();
                width = scan.nextDouble();
                height = scan.nextDouble();
                mybox = new CuboidBox(length, width, height);
                boxs.get(boxnum - 1).set_ttVolume(mybox.getVolume() +
                        boxs.get(boxnum - 1).get_ttVolume());
                if (mybox.getVolume() >= boxs.get(boxnum - 1).getVolume()) {
                    boxs.get(boxnum - 1).setHeight(mybox.getHeight());
                    boxs.get(boxnum - 1).setLength(mybox.getLength());
                    boxs.get(boxnum - 1).setWidth(mybox.getWidth());
                }
            }
            else if (op == 2) {
                boxnum = scan.nextInt();
                System.out.println(boxs.get(boxnum - 1).get_ttVolume());
            }
            else if (op == 1) {
                boxnum = scan.nextInt();
                System.out.println(boxs.get(boxnum - 1).getVolume());
            }
        }



    }
}
