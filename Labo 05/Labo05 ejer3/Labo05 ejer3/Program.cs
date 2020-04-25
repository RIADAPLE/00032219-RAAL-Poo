using System;

namespace Labo05_ejer3
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Digite hasta que número se repetirá: ");
            int n = Convert.ToInt32(Console.ReadLine());
            bool f=true;
            recursión(1,n,f);
        }

        static public void recursión(int x, int n, bool f)
        {
            if (f == true && x == n)
            {
                Console.WriteLine(n);
                f = false;
                recursión(x,n,f);
            }
            else if (f == true)
            {
                Console.WriteLine(x);
                x++;
                recursión(x,n,f);
            }
            else if (f == false)
            {
                if (x == 1)
                {
                    return;
                }
                else
                {
                    x--;
                    Console.WriteLine(x);
                    recursión(x, n, f);
                }
            }
            else
                return;
            }
        }
    }
