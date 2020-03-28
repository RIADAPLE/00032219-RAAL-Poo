package com.RAAL.x00032219;
import java.util.Scanner;
import javax.swing.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
    int op1=0;
    ArrayList<Ticket> ticketsito = new ArrayList<>();
    do{
        op1 = Integer.parseInt(JOptionPane.showInputDialog(null,menu()));
    switch (op1){
        case 1:
            String horaE = JOptionPane.showInputDialog(null,"Introduzca la hora de entrada (formato 24 horas 00:00)");
            String placa = JOptionPane.showInputDialog(null,"Introduzca la placa del vehículo");
            ticketsito.add(new Ticket(placa,horaE));
            break;
        case 2:
            String placafinal = JOptionPane.showInputDialog(null,"Introduzca la placa del vehículo");
            ticketsito.forEach(s-> {if((s.getPlaca()).equals(placafinal)){
                String salida = JOptionPane.showInputDialog(null,"Introduzca la hora de salida");
                int minutos = RegistroDeTiempo.Cálculo(s.getHoraE(),salida);

                if(minutos<30){
                    JOptionPane.showMessageDialog(null,"gratis");
                 }
                else if(minutos>=30 && minutos<60){
                    JOptionPane.showMessageDialog(null,"Pague 0.50");
                    double x=0.00;
                    while(x<0.50){
                     int op2 = Integer.parseInt(JOptionPane.showInputDialog(null,monedas()));
                     switch(op2){
                         case 1:
                             x = Moneda.Contador(op2, x);
                             JOptionPane.showMessageDialog(null,"monto pagado: $"+ x);
                             break;
                         case 2:
                             x = Moneda.Contador(op2, x);
                             JOptionPane.showMessageDialog(null,"monto pagado: $"+ x);
                             break;
                         case 3:
                             x = Moneda.Contador(op2, x);
                             JOptionPane.showMessageDialog(null,"monto pagado: $"+ x);
                             break;
                         case 4:
                             x = Moneda.Contador(op2, x);
                             JOptionPane.showMessageDialog(null,"monto pagado: $"+ x);
                             break;
                         default:
                             JOptionPane.showMessageDialog(null,"Opción errónea!");
                             break;
                     }
                        JOptionPane.showMessageDialog(null,"$ "+ (x-0.50));
                    }
                 }
                else if (minutos>=60 && minutos<120){
                    JOptionPane.showMessageDialog(null,"Pague 1.00");
                    double x=0.00;
                    while(x<1.00){
                        int op2 = Integer.parseInt(JOptionPane.showInputDialog(null,monedas()));
                        switch(op2){
                            case 1:
                                x = Moneda.Contador(op2, x);
                                JOptionPane.showMessageDialog(null,"monto pagado: $"+ x);
                                break;
                            case 2:
                                x = Moneda.Contador(op2, x);
                                JOptionPane.showMessageDialog(null,"monto pagado: $"+ x);
                                break;
                            case 3:
                                x = Moneda.Contador(op2, x);
                                JOptionPane.showMessageDialog(null,"monto pagado: $"+ x);
                                break;
                            case 4:
                                x = Moneda.Contador(op2, x);
                                JOptionPane.showMessageDialog(null,"monto pagado: $"+ x);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"Opción errónea!");
                                break;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"$ "+ (x-1.00));
                }
                else if(minutos>=120){
                    JOptionPane.showMessageDialog(null,"Pague 5.00");
                    double x=0.00;
                    while(x<5.00){
                        int op2 = Integer.parseInt(JOptionPane.showInputDialog(null,monedas()));
                        switch(op2){
                            case 1:
                                x = Moneda.Contador(op2, x);
                                JOptionPane.showMessageDialog(null,"monto pagado: $"+ x);
                                break;
                            case 2:
                                x = Moneda.Contador(op2, x);
                                JOptionPane.showMessageDialog(null,"monto pagado: $"+ x);
                                break;
                            case 3:
                                x = Moneda.Contador(op2, x);
                                JOptionPane.showMessageDialog(null,"monto pagado: $"+ x);
                                break;
                            case 4:
                                x = Moneda.Contador(op2, x);
                                JOptionPane.showMessageDialog(null,"monto pagado: $"+ x);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"Opción errónea!");
                                break;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"Su vuelto es$ "+ (x-5.00));
                }
                }

             });
            ticketsito.removeIf(s -> s.getPlaca().equals(placafinal));
            break;
        case 3:
            String placaticket = JOptionPane.showInputDialog(null,"Introduzca la placa del vehículo");
            ticketsito.forEach(s -> {if(s.getPlaca().equals(placaticket))
                JOptionPane.showMessageDialog(null,s.toString());
            });
            break;
        case 0:
            break;
        default:
            JOptionPane.showMessageDialog(null,"Opción errónea!");
    }
    }while(op1!=0);
    }

    static String menu(){
        return "¿Qué desea hacer?\n1. Ingresar un automóvil\n2. Salir del parqueo\n3. Consultar un ticket\n0. Salir\n";

    }

    static String monedas(){
        return "¿Cuánto desea introducir?\n1. $0.05\n2. $0.10\n3. $0.25\n4. $1.00\n";
    }
}
