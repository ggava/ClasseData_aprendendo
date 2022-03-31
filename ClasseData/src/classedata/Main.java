package classedata;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Data d = new Data();
        
        //PEGANDO VALORES 
        System.out.print("dia: ");
        d.setDia(Integer.parseInt(input.nextLine()));
        
        System.out.print("mes: ");
        d.setMes(Integer.parseInt(input.nextLine()));
        
        System.out.print("ano: ");
        d.setAno(Integer.parseInt(input.nextLine()));
        
        //chamando a funcao para mostra a data na tela
        d.exibeData(d.getDia(), d.getMes(), d.getAno());
    }
    
}
