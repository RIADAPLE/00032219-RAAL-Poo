using System;

namespace Labo_10
{
    public class Cliente
    {
        private String nombre;
        private double ingresos;

        public Cliente(string nombre = "unnamed", double ingresos = 0)
        {
            this.nombre = nombre;
            this.ingresos = ingresos;
        }

        public String Nombre
        {
            get => nombre;
            set => nombre = value;
        }

        public double Ingresos
        {
            get => ingresos;
            set => ingresos = value;
        }
    }
}