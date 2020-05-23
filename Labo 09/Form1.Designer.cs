namespace Labo_09
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }

            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.btnStudent = new System.Windows.Forms.Button();
            this.btnSignature = new System.Windows.Forms.Button();
            this.btnInscription = new System.Windows.Forms.Button();
            this.btnConsult = new System.Windows.Forms.Button();
            this.tableLayoutPanel1 = new System.Windows.Forms.TableLayoutPanel();
            this.registerStudent1 = new Labo_09.RegisterStudent();
            this.tableLayoutPanel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // btnStudent
            // 
            this.btnStudent.Dock = System.Windows.Forms.DockStyle.Fill;
            this.btnStudent.Font = new System.Drawing.Font("Segoe UI", 18F, System.Drawing.FontStyle.Regular,
                System.Drawing.GraphicsUnit.Point, ((byte) (0)));
            this.btnStudent.Location = new System.Drawing.Point(3, 3);
            this.btnStudent.Name = "btnStudent";
            this.btnStudent.Size = new System.Drawing.Size(230, 50);
            this.btnStudent.TabIndex = 0;
            this.btnStudent.Text = "Estudiante";
            this.btnStudent.UseVisualStyleBackColor = true;
            this.btnStudent.Click += new System.EventHandler(this.btnStudent_Click);
            // 
            // btnSignature
            // 
            this.btnSignature.Dock = System.Windows.Forms.DockStyle.Fill;
            this.btnSignature.Font = new System.Drawing.Font("Segoe UI", 18F, System.Drawing.FontStyle.Regular,
                System.Drawing.GraphicsUnit.Point, ((byte) (0)));
            this.btnSignature.Location = new System.Drawing.Point(239, 3);
            this.btnSignature.Name = "btnSignature";
            this.btnSignature.Size = new System.Drawing.Size(230, 50);
            this.btnSignature.TabIndex = 1;
            this.btnSignature.Text = "Materia";
            this.btnSignature.UseVisualStyleBackColor = true;
            this.btnSignature.Click += new System.EventHandler(this.btnSignature_Click);
            // 
            // btnInscription
            // 
            this.btnInscription.Dock = System.Windows.Forms.DockStyle.Fill;
            this.btnInscription.Font = new System.Drawing.Font("Segoe UI", 18F, System.Drawing.FontStyle.Regular,
                System.Drawing.GraphicsUnit.Point, ((byte) (0)));
            this.btnInscription.Location = new System.Drawing.Point(475, 3);
            this.btnInscription.Name = "btnInscription";
            this.btnInscription.Size = new System.Drawing.Size(230, 50);
            this.btnInscription.TabIndex = 2;
            this.btnInscription.Text = "Inscripción";
            this.btnInscription.UseVisualStyleBackColor = true;
            this.btnInscription.Click += new System.EventHandler(this.btnInscription_Click);
            // 
            // btnConsult
            // 
            this.btnConsult.Dock = System.Windows.Forms.DockStyle.Fill;
            this.btnConsult.Font = new System.Drawing.Font("Segoe UI", 18F, System.Drawing.FontStyle.Regular,
                System.Drawing.GraphicsUnit.Point, ((byte) (0)));
            this.btnConsult.Location = new System.Drawing.Point(711, 3);
            this.btnConsult.Name = "btnConsult";
            this.btnConsult.Size = new System.Drawing.Size(233, 50);
            this.btnConsult.TabIndex = 3;
            this.btnConsult.Text = "Consultar";
            this.btnConsult.UseVisualStyleBackColor = true;
            this.btnConsult.Click += new System.EventHandler(this.btnConsult_Click);
            // 
            // tableLayoutPanel1
            // 
            this.tableLayoutPanel1.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.tableLayoutPanel1.ColumnCount = 4;
            this.tableLayoutPanel1.ColumnStyles.Add(
                new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(
                new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(
                new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(
                new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.Controls.Add(this.btnConsult, 3, 0);
            this.tableLayoutPanel1.Controls.Add(this.btnInscription, 2, 0);
            this.tableLayoutPanel1.Controls.Add(this.btnSignature, 1, 0);
            this.tableLayoutPanel1.Controls.Add(this.btnStudent, 0, 0);
            this.tableLayoutPanel1.Controls.Add(this.registerStudent1, 0, 1);
            this.tableLayoutPanel1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.tableLayoutPanel1.Location = new System.Drawing.Point(0, 0);
            this.tableLayoutPanel1.Name = "tableLayoutPanel1";
            this.tableLayoutPanel1.RowCount = 3;
            this.tableLayoutPanel1.RowStyles.Add(
                new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 10F));
            this.tableLayoutPanel1.RowStyles.Add(
                new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 80F));
            this.tableLayoutPanel1.RowStyles.Add(
                new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 10F));
            this.tableLayoutPanel1.RowStyles.Add(
                new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Absolute, 20F));
            this.tableLayoutPanel1.Size = new System.Drawing.Size(947, 563);
            this.tableLayoutPanel1.TabIndex = 0;
            // 
            // registerStudent1
            // 
            this.registerStudent1.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.tableLayoutPanel1.SetColumnSpan(this.registerStudent1, 4);
            this.registerStudent1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.registerStudent1.Location = new System.Drawing.Point(3, 59);
            this.registerStudent1.Name = "registerStudent1";
            this.tableLayoutPanel1.SetRowSpan(this.registerStudent1, 2);
            this.registerStudent1.Size = new System.Drawing.Size(941, 501);
            this.registerStudent1.TabIndex = 4;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(947, 563);
            this.Controls.Add(this.tableLayoutPanel1);
            this.Name = "Form1";
            this.Text = "Labo09";
            this.tableLayoutPanel1.ResumeLayout(false);
            this.ResumeLayout(false);
        }

        #endregion

        private System.Windows.Forms.TableLayoutPanel tableLayoutPanel1;
        private Labo_09.RegisterStudent registerStudent1;
        private System.Windows.Forms.Button btnConsult;
        private System.Windows.Forms.Button btnInscription;
        private System.Windows.Forms.Button btnSignature;
        private System.Windows.Forms.Button btnStudent;
    }
}