class Carro {                                          //Classe

    String cor;                                        // Atributos
    String modelo;                                     // Atributos
    int capacidedeTanque;                              // Atributos
    

    Carro(){                                           // Construtores

    }  

    Carro(String cor, String modelo, int capacidedeTanque) { // Parametros no Construtor
        this.cor = cor;                                      //      (SOBRECARGA)
        this.modelo = modelo;
        this.capacidedeTanque = capacidedeTanque;
        
    }
    
    void setCor(String cor) {                         //  Get&Set_Metodos
        this.cor = cor;
    }
    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {                    // Get&Set_Metodos
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }
    void setCapacidadeTanque(int capacidedeTanque) {   // Get&Set_Metodos
        this.capacidedeTanque = capacidedeTanque;
    }

    int getcapacidedeTanque() {
        return capacidedeTanque;
    }

    double totalValorTanque(double valorCombostivel) {  // Metodos
        return capacidedeTanque * valorCombostivel;
    }
   

}
    
