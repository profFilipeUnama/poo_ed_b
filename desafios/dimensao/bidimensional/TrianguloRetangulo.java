package dimensao.bidimensional;

public class TrianguloRetangulo {
    float cateto1;
    float cateto2;
    float hipotenusa;
    float alturaHipotenusa;

    public TrianguloRetangulo(){

    }

    public TrianguloRetangulo(float cateto1, float cateto2, float hipotenusa, float alturaHipotenusa){

        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.alturaHipotenusa = alturaHipotenusa;
        this.hipotenusa = hipotenusa;

    }

    float area(){
        return (this.cateto1 * this.cateto2) / 2;
    }

    float perimetro(){
        return cateto1 + cateto2 + hipotenusa;
    }
    
}
