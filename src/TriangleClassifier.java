public class TriangleClassifier {

    public String triAngleClassifier(int a, int b, int c) {

        String result = "";

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b || a == c || b == c) {
                if (a == b && a == c && b == c) {
                    result = "Tam giác đều";
                } else {
                    result = "Tam giác cân";
                }
            } else {
                result = "Tam giác thường";
            }
        } else {
            result = "Không phải là tam giác";
        }
        return result;
    }
}
