using System;
using System.Collections.Generic;

namespace Labo06
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            bool continuar = true,repetido = true;
            int ponderito = 0;
            List<Evaluacion> Lista = new List<Evaluacion>();

            try
            {
                while (continuar)
                {
                    Console.WriteLine(
                        "¿Qué desea hacer?\n1. Agregar evaluación\n2. Mostrar evaluaciones almacenadas\n" +
                        "3. Eliminar evaluación\n4. Terminar programa\n0. Salir");
                    int x = Convert.ToInt32(Console.ReadLine());
                    switch (x)
                    {
                        case 1:
                            Console.WriteLine("¿Qué evaluación desea agregar?\n1. Tarea\n2. Laboratorio\n" +
                                              "3. Parcial\n0. Salir");
                            int y = Convert.ToInt32(Console.ReadLine());
                            switch (y)
                            {
                                case 1:
                                    Console.WriteLine("Ingrese el nombre de la tarea");

                                    String nom = Console.ReadLine();
                                    repetido = true;
                                    foreach (var element in Lista)
                                    {
                                        if (nom.Equals(element.Nombre,StringComparison.InvariantCultureIgnoreCase))
                                        {
                                            repetido = false;
                                        }
                                    }

                                    if (repetido == false)
                                    {
                                        Console.WriteLine("Ese nombre ya existe, intente con otro!");
                                        break;
                                    }

                                    Console.WriteLine("Ingrese la ponderación");
                                    ponderito = 0;
                                    int pon = Convert.ToInt32(Console.ReadLine());
                                    foreach (var element in Lista)
                                    {
                                        ponderito += element.Porcentaje;
                                    }

                                    if (pon + ponderito > 100)
                                    {
                                        Console.WriteLine("\nSus evaluaciones exceden el 100%!\n");
                                        break;
                                    }

                                    Console.WriteLine("Ingrese la fecha de entrega, en el formato YYYY-MM-DD");

                                    DateTime fec = Convert.ToDateTime(Console.ReadLine());

                                    Lista.Add(new Tarea(pon, nom, fec));
                                    break;
                                case 2:
                                    Console.WriteLine("Ingrese el nombre del laboratorio");

                                    String nom1 = Console.ReadLine();
                                    repetido = true;
                                    foreach (var element in Lista)
                                    {
                                        if (nom1.Equals(element.Nombre,StringComparison.InvariantCultureIgnoreCase))
                                        {
                                            repetido = false;
                                        }
                                    }

                                    if (repetido == false)
                                    {
                                        Console.WriteLine("Ese nombre ya existe, intente con otro!");
                                        break;
                                    }
                                    Console.WriteLine("Ingrese la ponderación");

                                    int pon1 = Convert.ToInt32(Console.ReadLine());
                                    ponderito = 0;
                                    foreach (var element in Lista)
                                    {
                                        ponderito += element.Porcentaje;
                                    }

                                    if (pon1 + ponderito > 100)
                                    {
                                        Console.WriteLine("\nSus evaluaciones exceden el 100%!\n");
                                        break;
                                    }

                                    Console.WriteLine("Ingrese el tipo de laboratorio");

                                    String tipo = Console.ReadLine();

                                    Lista.Add(new Laboratorio(pon1, nom1, tipo));
                                    break;
                                case 3:
                                    Console.WriteLine("Ingrese el nombre del parcial");

                                    String nom3 = Console.ReadLine();
                                    repetido = true;
                                    foreach (var element in Lista)
                                    {
                                        if (nom3.Equals(element.Nombre, StringComparison.InvariantCultureIgnoreCase))
                                        {
                                            repetido = false;
                                        }
                                    }

                                    if (repetido == false)
                                    {
                                        Console.WriteLine("Ese nombre ya existe, intente con otro!");
                                        break;
                                    }
                                    Console.WriteLine("Ingrese la ponderación");

                                    int pon3 = Convert.ToInt32(Console.ReadLine());

                                    ponderito = 0;
                                    foreach (var element in Lista)
                                    {
                                        ponderito += element.Porcentaje;
                                    }

                                    if (pon3 + ponderito > 100)
                                    {
                                        Console.WriteLine("\nSus evaluaciones exceden el 100%!\n");
                                        break;
                                    }

                                    Console.WriteLine("Ingrese la cantidad de preguntas");

                                    int cant = Convert.ToInt32(Console.ReadLine());

                                    Lista.Add(new Parcial(pon3, nom3, cant));
                                    break;
                                case 0:
                                    break;
                                default:
                                    Console.WriteLine("Opción errónea!");
                                    break;
                            }

                            break;
                        case 2:
                            foreach (var element in Lista)
                            {
                                Console.WriteLine();
                                if (element is Tarea)
                                {
                                    Console.WriteLine("Tarea: ");
                                    Console.WriteLine(((Tarea) element).ToString());
                                }
                                else if (element is Laboratorio)
                                {
                                    Console.WriteLine("Laboratorio: ");
                                    Console.WriteLine(((Laboratorio) element).ToString());
                                }
                                else if (element is Parcial)
                                {
                                    Console.WriteLine("Parcial: ");
                                    Console.WriteLine(((Parcial) element).ToString());
                                }
                            }

                            break;
                        case 3:
                            Console.WriteLine("¿Qué tipo de evaluación quiere eliminar?\n1. Tarea\n2. Laboratorio\n" +
                                              "3. Parcial\n0. Salir");
                            Console.WriteLine("Digite el nombre de la actividad a eliminar");
                            String nome = Console.ReadLine();
                            Lista.RemoveAt(Lista.FindIndex(s =>
                                s.Nombre.Equals(nome, StringComparison.InvariantCultureIgnoreCase)));
                            break;
                        case 4:
                            Console.WriteLine("su nota es: " + CalcularNota.Calcular(Lista));
                            continuar = false;
                            break;
                        case 0:
                            continuar = false;
                            break;
                        default:
                            Console.WriteLine("Opción errónea!");
                            break;
                    }
                }
            }
            catch (DatosInvalidos e)
            {
                Console.WriteLine(e.Message);
            }
            catch (SystemException)
            {
                Console.WriteLine("Debe introducir números en esa sección o formato incorrecto");
            }
            
        }
    }
}
    
