public class Triangle implements Shape {
    int A;
    int R; // 2 катет треуг
    public void area(int R, int A) {
        int result = (A * R) / 2;
        System.out.println(result);
    }
}