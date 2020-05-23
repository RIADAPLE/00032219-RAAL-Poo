using System;
using System.Data;
using Npgsql;

namespace Labo_09
{
    public static class Conexion
    {
        private static string host = "ec2-54-197-48-79.compute-1.amazonaws.com",
            dataBase = "derba0celo0cn1",
            userID = "jgorehjqolkexn",
            Password = "400d5ebc86f6bc28861f700cd565906cdca0a89e016fa824f766156453bfe980";


        private static string sConnection =
            $"Server={host};Port=5432;User Id={userID};Password={Password};Database={dataBase};"+
            "sslmode=Require;Trust Server Certificate=true "; 


        public static DataTable ExecuteQuery(string query)
        {
            NpgsqlConnection connection = new NpgsqlConnection(sConnection);
            DataSet ds = new DataSet();

            connection.Open();

            NpgsqlDataAdapter da = new NpgsqlDataAdapter(query, connection);
            da.Fill(ds);

            connection.Close();

            return ds.Tables[0];

        }

        public static void ExecuteNonQuery(string act)
        {
            Console.WriteLine(sConnection);
            NpgsqlConnection connection = new NpgsqlConnection(sConnection);

            connection.Open();

            NpgsqlCommand command = new NpgsqlCommand(act, connection);
            command.ExecuteNonQuery();

            connection.Close();
        } 
    }
}