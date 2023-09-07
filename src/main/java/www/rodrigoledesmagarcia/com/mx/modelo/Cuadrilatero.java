package www.rodrigoledesmagarcia.com.mx.modelo;

public class Cuadrilatero {

        float lado1 = 0;
        float lado2 = 0;

        public Cuadrilatero() {
                this.lado1 = lado1;
                this.lado2 = lado2;
        }

        public float getLado1() {
                return lado1;
        }

        public void setLado1(float lado1) {
                this.lado1 = lado1;
        }

        public float getLado2() {
                return lado2;
        }

        public void setLado2(float lado2) {
                this.lado2 = lado2;
        }


        public float verPerimetro() {
                float perimetro = ( 2 * (lado1 * lado2));
                return perimetro;
        }

        public float verArea() {
                float area = (lado1 * lado2);
                return area;
        }
}
