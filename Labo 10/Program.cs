using System;
using System.Collections.Generic;
using System.ComponentModel.Design;
using System.Security.Principal;

namespace Labo_10
{
    internal class Program
    {
        private delegate void MiDelegate(List<Cliente> p);

        private static MiDelegate CuentaPersona;
        
        
        public static void Main(string[] args)
        {
            var persona = new List<Cliente>();
            int op = 0;
            bool continuar = true;
            do
            {
                Menu();
                op = Convert.ToInt32(Console.ReadLine());
                switch (op)
                {
                    case 1:

                        #region Agregar cliente

                        String nombre;
                        Console.WriteLine("Introduzca el nombre del usuario");
                        nombre = Console.ReadLine();
                        
                        double saldo;
                        Console.WriteLine("Introduzca el saldo de la cuenta");
                        saldo = Convert.ToDouble(Console.ReadLine());
                        
                        
                        persona.Add(new Cliente(nombre , saldo));
                        
                        #endregion
                        break;
                    case 2:

                        #region Mostrar clientes tradicionalmente
                        persona.ForEach(element =>
                        {
                            Console.WriteLine($"Nombre: {element.Nombre}, Monto: {element.Ingresos}");
                        });
                        #endregion
                        break;
                    case 3:
                        
                        #region Delegate
                        CuentaPersona = VerDatos;
                        CuentaPersona += VerSalarios;
                        
                        CuentaPersona.Invoke(persona);
                        #endregion
                        break;
                    case 4:

                        #region Action
                        Action<List<Cliente>> ClienteAcción = pp =>
                        {
                            pp.ForEach(element =>
                            {
                                Console.WriteLine($"Nombre: {element.Nombre}, Monto: {element.Ingresos}");
                            });
                        };
                        ClienteAcción += kk =>
                        {
                            double monto = 0;

                            kk.ForEach(element => { monto += element.Ingresos; });

                            Console.WriteLine($"Suma de saldos: {monto}");
                        };
                        
                        
                        ClienteAcción += ppp =>
                        {
                            Console.WriteLine("\nCuentas de las personas cuyo nombre inicia con vocal:");
                            ppp.ForEach(element =>
                            {
                                if (element.Nombre.ToLower()[0].Equals('a') || element.Nombre.ToLower()[0].Equals('e')
                                                                            || element.Nombre.ToLower()[0].Equals('i') || element.Nombre.ToLower()[0].Equals('o')
                                                                            || element.Nombre.ToLower()[0].Equals('u'))
                                {
                                    Console.WriteLine($"Nombre: {element.Nombre}, Monto: {element.Ingresos}");
                                }
                            });
                        };
                        
                        ClienteAcción.Invoke(persona);
                        #endregion
                        break;
                    case 5:
                        continuar = false;
                        break;
                    default:
                        Console.WriteLine("Opción errónea!");
                        break;
                }
            } while (continuar);
        }

    

        public static void Menu()
        {
            Console.WriteLine("\nBienvenido:\n" +
                              "1) Agregar una cuenta.\n" +
                              "2) Ver cuentas almacenadas.\n" +
                              "3) Ver cuentas almacenadas y el total de las cuentas.\n" +
                              "4) Ver cuentas almacenadas, el total de las cuentas, y las cuentas de las personas que su nombre inicie con una vocal\n" +
                              "5) Salir.\n" +
                              "Opción elegida: ");
        }

        #region Funciones del delegate
        public static void VerDatos(List<Cliente> pp)
        {
            pp.ForEach(element =>
            {
                Console.WriteLine($"Nombre: {element.Nombre}, Monto: {element.Ingresos}");
            });
        }

        public static void VerSalarios(List<Cliente> kk)
        {
            double monto = 0;
            
            kk.ForEach(element => { monto += element.Ingresos; });

            Console.WriteLine($"Suma de saldos: {monto}");
        }
        #endregion
    }
}