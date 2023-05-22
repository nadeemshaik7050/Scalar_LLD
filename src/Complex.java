public class Complex {
    int a;
    int b;

    Complex(){

    }
    Complex(int a,int b){
        this.a=a;
        this.b=b;
    }

    void Addition(Complex c2){
        System.out.println((this.a+c2.a)+"+"+(this.b+c2.b)+"i");
    }
    void Subraction(Complex c2){
        System.out.println((this.a-c2.a)+"+"+(this.b-c2.b)+"i");
    }
    void Multiplication(Complex c2){
        System.out.println((this.a*c2.a-this.b*c2.b)+"+"+(this.a*c2.b+this.b*c2.a)+"i");
    }


}
