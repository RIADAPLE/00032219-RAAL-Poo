using System;
using System.Collections.Generic;
using System.Linq;

namespace Labo05_ejer5
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            List<char> lista = new List<char>();
            int n = 0;
            char c;
            Console.WriteLine("Digite cuantas letras va a introducir");
            n = Convert.ToInt32(Console.ReadLine());
            for (int i = 0; i < n; i++)
            {Console.WriteLine("Letra "+(i+1)+": ");
                c = Convert.ToChar(Console.ReadLine());
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                    lista.Add(c);
                }
            }
            Console.WriteLine();
            Console.WriteLine("Las vocales que se ingresaron fueron las siguientes:");
            foreach (char caracter in lista)
            {
                Console.WriteLine(caracter);
            }
        }
    }
}