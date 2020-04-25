using System;

namespace Labo05_ejer1
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            int x = 1;
            int y = 0;
            int total = 0;
            Console.Write("Introduzca cuantos términos de fibonacci quiere que salgan: ");
            int n = Convert.ToInt32(Console.ReadLine());
            for (int i = 0; i < n; i++)
            {
                if (i == 2)
                {
                    Console.WriteLine("1");
                }
                else
                {
                    Console.WriteLine(total);
                    total = x + y;
                    y = x;
                    x = total;
                }
            }
        }
    }
}