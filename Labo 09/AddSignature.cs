using System;
using System.Windows.Forms;

namespace Labo_09
{
    public partial class AddSignature : UserControl
    {
        public AddSignature()
        {
            InitializeComponent();
        }

        private void btnAñaMat_Click(object sender, EventArgs e)
        {
            if (textBox1.Text.Equals(""))
            {
                MessageBox.Show("No se pueden dejar campos vacios");
            }
            else
            {
                try
                {
                    Conexion.ExecuteNonQuery($"INSERT INTO MATERIA(nombre) VALUES('{textBox1.Text}')");
                    MessageBox.Show("Se ha registrado la materia");
                }
                catch(Exception ex)
                {
                    MessageBox.Show("Ha ocurrido un error");
                }
            }
        }
    }
}