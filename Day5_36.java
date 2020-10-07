class MathOperation{
    private double ans1;

    void mul(int a, int b){
        ans1 = (a*b);
    }

    void mul(int a, Float b){
        ans1 = (a*b);
    }
    void mul(float a, float b, float c){
        ans1 = a*b*c;
    }
    void mul(double a, int b){
        ans1 = a*b;
    }
    void show(){
        System.out.println(ans1);
    }

}
public class MulOverload {
    public static void main(String args[]){
        MathOperation m = new MathOperation();
        m.mul(2,4);     
        m.show();
        m.mul(2, 3,4);   
        m.show();
        m.mul(2, 2.4f);      
        m.show();
        m.mul(2.4,5);       
        m.show();
    }
}
