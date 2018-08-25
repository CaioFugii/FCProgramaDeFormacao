package retangulo;

/**
 *
 * @author CAIO
 */
public class retangulo {

    private double altura;
    private double base;

    public void setBase(double novoValorBase) {
        this.base = novoValorBase;
    }

    public void setAltura(double novoValorAltura) {
        this.altura = novoValorAltura;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getBase() {
        return this.base;
    }

    public double calcularArea() {
        return this.base * this.altura;
    }

    public double calcularPerimetro() {
        return (this.base + this.altura) * 2;
    }

}
