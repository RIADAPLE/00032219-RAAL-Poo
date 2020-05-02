using System;

namespace Labo06
{
    public class Evaluacion
    {
        protected int porcentaje;
        protected String nombre;

        public Evaluacion(int porcentaje, string nombre)
        {
            if (porcentaje == 0)
            {
                throw new DatosInvalidos("No se puede introducir 0 en porcentaje");
            }

            this.porcentaje = porcentaje;
            this.nombre = nombre;
        }

        public int Porcentaje => porcentaje;

        public string Nombre => nombre;

        public override string ToString()
        {
            return $"{nameof(porcentaje)}: {porcentaje}, {nameof(nombre)}: {nombre}";
        }
    }
    
    
}