/**
 * Created by Leontyev on 11.03.16.
 */
public class AreaTriangle {

        public double calcArea(double height, double base) {
            if(height > 0 || base >0){
                throw new IllegalArgumentException("Variable less 0")
            }
            return AreaTriangle = (height * base) / 2;
        }
}
