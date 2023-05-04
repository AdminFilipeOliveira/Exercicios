class RodarAplicacao {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Azul", "BMW ", 50); // OBJETOS
        System.out.println();
        System.out.println("A Cor do Carro é: " + carro1.getCor());
        System.out.println("A Marca do Carro é: " + carro1.getModelo());
        System.out.println("A Capacidede do Tanque é: " + carro1.getcapacidedeTanque()+"L");
        System.out.println(); System.out.println("O Valor do Combostivel é: € " + carro1.totalValorTanque(1.409));
        


        Carro carro2 = new Carro("Cinza", "Mercedes", 55);

        System.out.println();
        System.out.println("A Cor do Carro é: " + carro2.getCor());
        System.out.println("A Marca do Carro é: " + carro2.getModelo());
        System.out.println("A Capacidede do Tanque é: " + carro2.getcapacidedeTanque()+"L");
        System.out.println("O Valor Total do Combostivel é: € " + carro2.totalValorTanque(1.40));
        
    }
    
}
