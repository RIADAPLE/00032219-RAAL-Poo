using System;

namespace Labo05_ejer4
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.Write("Introduzca una palabra: ");
            String palabra = Console.ReadLine();

            for (int i = 0; i < palabra.Length; i++)
            {
                if (palabra[i].Equals('a'))
                {
                    Console.Write("b");
                }
                else
                {
                    Console.Write(palabra[i]);
                }
            }
        }
    }
}