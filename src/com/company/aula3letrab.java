package com.company;

import java.util.Scanner;

public class aula3letrab {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pecasProduzidas, pecasDefeituosas;
        System.out.println("INFORME AQUANTIDADE DE PEÇAS PRODUZIDAS: ");
        pecasProduzidas = sc.nextInt();
        System.out.println("INFORME A QUANTIDADE DE PEÇAS DEFEITUOSAS: ");
        pecasDefeituosas = sc.nextInt();
        if (pecasDefeituosas >= (pecasProduzidas * 0.1)) {
            System.out.println("MAQUINA PRECISA DE MANUTEÇÃO");
        }else {
            System.out.println("MAQUINA NAO PRECISA DE MANUTENÇAO");
        }

    }
}