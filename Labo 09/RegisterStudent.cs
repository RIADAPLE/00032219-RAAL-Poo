﻿using System;
using System.Windows.Forms;

namespace Labo_09
{
    public partial class RegisterStudent : UserControl
    {
        public RegisterStudent()
        {
            InitializeComponent();
        }

        private void btnAgreEst_Click(object sender, EventArgs e)
        {
            if (textBox1.Text.Equals("") ||
                textBox2.Text.Equals("") ||
                textBox3.Text.Equals("") ||
                textBox4.Text.Equals(""))
            {
                MessageBox.Show("No se pueden dejar campos vacios");
            }
            else
            {
                try
                {
                    Conexion.ExecuteNonQuery($"INSERT INTO ESTUDIANTE VALUES (" +
                                                 $"'{textBox3.Text}'," +
                                                 $"'{textBox1.Text}'," +
                                                 $"'{textBox2.Text}'," +
                                                 $"{textBox4.Text})");
                    MessageBox.Show("Se ha agregado el estudiante exitosamente");
                }
                catch(Exception ex)
                {
                    MessageBox.Show("Ha ocurrido un error");
                }
            }
        }
    }
}