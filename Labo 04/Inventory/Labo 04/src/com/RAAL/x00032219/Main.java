package com.RAAL.x00032219;
import java.awt.*;
import java.util.Scanner;
import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int op1=0, op2=0;
        ArrayList<Item> CommonItems = new ArrayList<>();
        ArrayList<Item> PersonalItems = new ArrayList<>();
        do{
            op1 = Integer.parseInt(JOptionPane.showInputDialog(null,menu()));
            switch (op1){
                case 1:
                    op2 = Integer.parseInt(JOptionPane.showInputDialog(null,tipo()));
                    switch(op2){
                        case 1:
                            String pname1 = JOptionPane.showInputDialog(null,"Introduzca el nombre");
                            int pweight1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el peso:"));
                            String pdescripcion1 = JOptionPane.showInputDialog(null,"Ligera descripción:");
                            int preusetime1 =  Integer.parseInt(JOptionPane.showInputDialog(null, "Tiempo de reutilización:"));
                            String plevel1 = JOptionPane.showInputDialog(null, nivel());
                            String ptype1 = JOptionPane.showInputDialog(null, tipohealth());
                            int pamount1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad:"));

                            PersonalItems.add(new Potion(pname1,pweight1,pdescripcion1,preusetime1,plevel1,ptype1,pamount1));
                            break;
                        case 2:
                            String pname2 = JOptionPane.showInputDialog(null,"Introduzca el nombre");
                            int pweight2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el peso:"));
                            String pdescripcion2 = JOptionPane.showInputDialog(null,"Ligera descripción:");
                            int preusetime2 =  Integer.parseInt(JOptionPane.showInputDialog(null, "Tiempo de reutilización:"));
                            String plevel2 = JOptionPane.showInputDialog(null, nivel());
                            String ptype2 = JOptionPane.showInputDialog(null, tipohealth());
                            int pamount2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad:"));
                            int ptime2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el tiempo de duración:"));

                            PersonalItems.add(new Elixir(pname2,pweight2,pdescripcion2,preusetime2,plevel2,ptype2,pamount2,ptime2));
                            break;
                        case 3:
                            String pname3 = JOptionPane.showInputDialog(null,"Introduzca el nombre");
                            int pweight3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el peso"));
                            String pdescripcion3 = JOptionPane.showInputDialog(null,"Ligera descripción:");
                            int premaininguses3 =  Integer.parseInt(JOptionPane.showInputDialog(null, "Puntos de uso:"));
                            int pequip3 =  Integer.parseInt(JOptionPane.showInputDialog(null, equipado()));
                            boolean pequipado = false;
                            if(pequip3==1)
                                pequipado = true;
                            PersonalItems.add(new Ammo(pname3,pweight3,pdescripcion3,premaininguses3,pequipado));
                            break;
                        case 4:
                            String pname4 = JOptionPane.showInputDialog(null,"Introduzca el nombre");
                            int pweight4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el peso:"));
                            String pdescripcion4 = JOptionPane.showInputDialog(null,"Ligera descripción:");
                            int premaininguses4 =  Integer.parseInt(JOptionPane.showInputDialog(null, "Puntos de uso:"));
                            String ptype4 = JOptionPane.showInputDialog(null,tipoReuse());
                            double pspeed4 =  Integer.parseInt(JOptionPane.showInputDialog(null, "Velocidad:"));
                            double pdamage4 =  Integer.parseInt(JOptionPane.showInputDialog(null, "Daño:"));
                            String pwieldtype4 = JOptionPane.showInputDialog(null,"¿Para derechos o zurdos?:");
                            int plevel4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el nivel:"));


                            PersonalItems.add(new Weapon(pname4,pweight4,pdescripcion4,premaininguses4,ptype4,pspeed4,pdamage4,pwieldtype4,plevel4));
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Opción errónea!");
                            break;
                    }
                    break;
                case 2:
                    int pID = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el ID del arma que quiere copiar:"));
                    PersonalItems.forEach( s ->{if (s.id==pID){
                    CommonItems.add(s);
                    }
                    });
                    break;
                case 3:
                    int op3 = Integer.parseInt(JOptionPane.showInputDialog(null,buscarID1()));
                    switch (op3){
                        case 1:
                            int op4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el ID"));
                            CommonItems.forEach(item -> {if(item.id==op4){
                                JOptionPane.showMessageDialog(null,item.toString());
                            }
                            });
                            break;
                        case 2:
                            int op5 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el ID"));
                            PersonalItems.forEach(s -> {if(s.id==op5){
                                JOptionPane.showMessageDialog(null,s.toString());
                            }
                            });
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Opción inválida");
                            break;
                    }
                    break;
                case 4:
                    int op6 = Integer.parseInt(JOptionPane.showInputDialog(null,buscarID1()));
                    switch (op6){
                        case 1:
                            String tipito = JOptionPane.showInputDialog(null,"Introduzca el tipo de objeto"+
                                    "\n(Poción, Elixir, Munición, Arma)");
                            if(tipito.equalsIgnoreCase("poción")){
                                CommonItems.forEach(item -> {if(item instanceof Potion){
                                    JOptionPane.showMessageDialog(null,item.toString());
                                }
                                });
                            }
                            else if(tipito.equalsIgnoreCase("elixir")){
                                CommonItems.forEach(item -> {if(item instanceof Elixir){
                                    JOptionPane.showMessageDialog(null,item.toString());
                                }
                                });
                            }
                            else if(tipito.equalsIgnoreCase("munición")){
                                CommonItems.forEach(item -> {if(item instanceof Ammo){
                                    JOptionPane.showMessageDialog(null,item.toString());
                                }
                                });
                            }
                            else if(tipito.equalsIgnoreCase("Arma")){
                                CommonItems.forEach(item -> {if(item instanceof Potion){
                                    JOptionPane.showMessageDialog(null,item.toString());
                                }
                                });
                            }
                            break;
                        case 2:
                            String tipoto = JOptionPane.showInputDialog(null,"Introduzca el tipo de objeto"+
                                    "\n(Poción, Elixir, Munición, Arma)");
                            if(tipoto.equalsIgnoreCase("poción")){
                                PersonalItems.forEach(item -> {if(item instanceof Potion){
                                    JOptionPane.showMessageDialog(null,item.toString());
                                }
                                });
                            }
                            else if(tipoto.equalsIgnoreCase("elixir")){
                                PersonalItems.forEach(item -> {if(item instanceof Elixir){
                                    JOptionPane.showMessageDialog(null,item.toString());
                                }
                                });
                            }
                            else if(tipoto.equalsIgnoreCase("munición")){
                                PersonalItems.forEach(item -> {if(item instanceof Ammo){
                                    JOptionPane.showMessageDialog(null,item.toString());
                                }
                                });
                            }
                            else if(tipoto.equalsIgnoreCase("Arma")){
                                PersonalItems.forEach(item -> {if(item instanceof Potion){
                                    JOptionPane.showMessageDialog(null,item.toString());
                                }
                                });
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Opción inválida");
                            break;
                    }

                    break;
                case 5:
                    int op7 = Integer.parseInt(JOptionPane.showInputDialog(null,buscarID2()));
                    switch (op7){
                        case 1:
                            int op8 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el ID"));
                            CommonItems.removeIf(item -> (item.id==op8));
                            break;
                        case 2:
                            int op9 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el ID"));
                            PersonalItems.removeIf(s -> (s.id==op9));
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Opción inválida");
                            break;
                    }
                    break;
                case 6:
                    int op10 = Integer.parseInt(JOptionPane.showInputDialog(null,buscarID1()));
                    switch (op10){
                        case 1:
                            String tipito1 = JOptionPane.showInputDialog(null,"Introduzca el tipo de objeto que quiere eliminar"+
                                    "\n(Poción, Elixir, Munición, Arma)");
                            if(tipito1.equalsIgnoreCase("poción")){
                                CommonItems.removeIf(item -> (item instanceof Potion));
                            }
                            else if(tipito1.equalsIgnoreCase("elixir")){
                                CommonItems.removeIf(item -> (item instanceof Elixir));
                            }
                            else if(tipito1.equalsIgnoreCase("munición")){
                                CommonItems.removeIf(item -> (item instanceof Ammo));
                            }
                            else if(tipito1.equalsIgnoreCase("Arma")){
                                CommonItems.removeIf(item -> (item instanceof Weapon));
                            }
                            break;
                        case 2:
                            String tipoto1 = JOptionPane.showInputDialog(null,"Introduzca el tipo de objeto que quiere eliminar"+
                                    "\n(Poción, Elixir, Munición, Arma)");
                            if(tipoto1.equalsIgnoreCase("poción")){
                                PersonalItems.removeIf(item -> (item instanceof Potion));
                            }
                            else if(tipoto1.equalsIgnoreCase("elixir")){
                                PersonalItems.removeIf(item -> (item instanceof Elixir));
                            }
                            else if(tipoto1.equalsIgnoreCase("munición")){
                                PersonalItems.removeIf(item -> (item instanceof Ammo));
                            }
                            else if(tipoto1.equalsIgnoreCase("Arma")){
                                PersonalItems.removeIf(item -> (item instanceof Weapon));
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Opción inválida");
                            break;
                    }
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción errónea!");
                    break;
                }
        }while(op1!=0);
    }
    static String menu(){
        return "¿Qué desea hacer?\n1. Agregar ítem\n2. Compartir ítem\n3. Buscar ítem por ID\n4. Buscar ítem por tipo" +
                "\n5. Borrar ítem por ID\n6. Borrar ítem por tipo\n0. Salir";
    }

    static String tipo(){
        return "¿Qué desea agregar?\n1. Poción\n2. Elixir\n3. Munición\n4. Arma\n";
    }

    static String equipado(){
        return "¿Está equipada el arma o no?\n1. si\n2.no\n";
    }

    static String nivel(){
        return "Digite el nivel\n(poco, normal, alto)\n";
    }

    static String tipohealth(){
        return "Digite el tipo\n(mana, vida)\n";
    }

    static String tipoReuse(){
        return "Digite el tipo\n(Arco, Espada, Bastón, orbe, daga)\n";
    }

    static String buscarID1(){
        return "¿A qué lista quiere acceder?\n1. Items comúnes\n2. Items personales";
    }

    static String buscarID2(){
        return "¿De qué lista quiere borrar?\n1. Items comúnes\n2. Items personales";
    }
}
