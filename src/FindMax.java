import java.util.LinkedList;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String string = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        //Tìm chuỗi có độ dài lớn nhất
        for (int i = 0; i < string.length(); i++) {
            //Khai báo một linked list trung gian các kí tự của chuỗi tăng dần
            LinkedList<Character> list = new LinkedList<>();
            //thêm kí tự thứ i vào trong danh sách
            list.add(string.charAt(i));
            for (int j = 0; j < string.length(); i++) {
                //kiểm tra kí tự tiếp theo có lớn hơn kí tự cuối cùng trong danh sách hay ko
                if (string.charAt(j) > list.getLast()) {
                    //nếu có thì thêm vào danh sách
                    list.add(string.charAt(j));
                }
            }
            //so sánh kích thước của danh sách trung gian và list chứa chuỗi tăng dần có kích thước lớn nhất
//            if (list.size() > max.size()) {
//                //Nếu kích cỡ của list trung gian lớn hơn kích cỡ của list có độ dài lớn nhất thì gán lại max
//                max.clear();
//                max.addAll(list);
//            }
//            list.clear();
        }
        // Hiển thị chuỗi tăng dần dài nhất
        for (Character character : max) {
            System.out.print(character);
        }
    }
}

