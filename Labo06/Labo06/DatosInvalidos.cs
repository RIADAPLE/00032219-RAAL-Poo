using System;

namespace Labo06
{
    public class DatosInvalidos : Exception
    {
        public DatosInvalidos(string message) : base(message)
        {
        }
    }
}