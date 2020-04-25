using System;

namespace Labo05_ejer2
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.Write("Introduzca una palabra: ");
            String palabrita = Console.ReadLine();
            palabrita=palabrita.ToLower();
            bool palindrome= true;
            int n = palabrita.Length;

            for (int i=0;i<n;i++){
                if (palabrita[i] == palabrita[n - i -1])
                {
                }
                else{
                    palindrome=false;
                    break;
                }
                Console.WriteLine(palindrome);
            }
            
            if(palindrome)
                Console.WriteLine("Es palíndrome!");
            else
                Console.WriteLine("No es palíndrome!");
            
            
        }
    }
}