using System;
using System.Collections.Generic;

namespace Labo06
{
    public static class CalcularNota
    {
        public static double Calcular(List<Evaluacion> x)
        {
            double acum=0, reem=0, kk, porcen=0, nporcen;
            Console.WriteLine("Ingrese las notas sacadas siguientes actividades");
            foreach (var element in x)
            {
                if (element is Tarea)
                {
                    Console.WriteLine("Tarea: ");
                    Console.WriteLine(((Tarea)element).ToString());
                    porcen=((Tarea) element).Porcentaje;
                }
                else if (element is Laboratorio)
                {
                    Console.WriteLine("Laboratorio: ");
                    Console.WriteLine(((Laboratorio)element).ToString());
                    porcen=((Laboratorio) element).Porcentaje;
                }
                else if (element is Parcial)
                {
                    Console.WriteLine("Parcial: ");
                    Console.WriteLine(((Parcial)element).ToString());
                    porcen=((Parcial) element).Porcentaje;
                }

                Console.WriteLine("Ingrese las nota");
                
                kk = Convert.ToDouble(Console.ReadLine());
                nporcen = (porcen * 0.01);
                acum += kk * nporcen;
            }

            double y = acum;
            return y;
        }
    }
}