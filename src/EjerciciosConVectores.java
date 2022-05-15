public class EjerciciosConVectores {
    int[] vector;
    private double[] matriz;
    private int indiceVector;

    EjerciciosConVectores(){
        this.vector = new int[100];
        this.indiceVector=0;

    }

    public void almacenarNumero(int numero){
        this.vector[indiceVector]=numero;
        this.indiceVector=this.indiceVector+1;
    }

    public void  mostrarNumeros(){
        for(int i=0; i<this.vector.length; i++){
            if(this.vector[i]!=0){
                System.out.println(vector[i]);
            }
        }
    }
}
