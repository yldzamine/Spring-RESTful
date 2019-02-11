using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp2
{
    public partial class Form1 : Form
    {
        int islem = 0;
        double sayi1 = 0, sayi2 = 0;
        public Form1()
        {
            InitializeComponent();
        }

        

        
        private void Form1_Load(object sender, EventArgs e)
        {
            textBox1.Text = "0";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "0")
            {
                textBox1.Text = "";
                textBox1.Text += "1";
            }
            else
            {
                textBox1.Text += "1";

            }
            

        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "0")
                textBox1.Text = "";
            textBox1.Text += "2";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "0")
                textBox1.Text = "";
            textBox1.Text += "3";
        }

        private void button4_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "0")
                textBox1.Text = "";
            textBox1.Text += "4";
        }

        private void button5_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "0")
                textBox1.Text = "";
            textBox1.Text += "5";
        }

        private void button6_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "0")
                textBox1.Text = "";
            textBox1.Text += "6";
        }

        private void button7_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "0")
                textBox1.Text = "";
            textBox1.Text += "7";
        }

        private void button8_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "0")
                textBox1.Text = "";
            textBox1.Text += "8";
        }

        private void button9_Click(object sender, EventArgs e)
        {

            if (textBox1.Text == "0")
                textBox1.Text = "";
            textBox1.Text += "9";
        }

        private void button10_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "0")
                textBox1.Text = "";
            textBox1.Text += "0";
        }

        private void button13_Click(object sender, EventArgs e)
        {
            islem = 1;
            sayi1 = double.Parse(textBox1.Text);
            sifirla();
        
            
        }
        public void sifirla()
        {
            textBox1.Text = "0";
        }
        private void button14_Click(object sender, EventArgs e)
        {
            islem = 2;
            sayi1 = double.Parse(textBox1.Text);
            sifirla();
            
        }

        private void button16_Click(object sender, EventArgs e)
        {
            islem = 3;
            sayi1 = double.Parse(textBox1.Text);
            sifirla();
        }

        private void button15_Click(object sender, EventArgs e)
        {
            islem = 4;
            sayi1 = double.Parse(textBox1.Text);
            sifirla();
           
        }

        private void button12_Click(object sender, EventArgs e)
        {
            sayi2 = double.Parse(textBox1.Text);
            textBox1.Text = hesapla().ToString("#,#.00");

        }
        public double hesapla()
        {
            double sonuc = 0;

            if (islem == 1)
                sonuc = sayi1 + sayi2;

            else if (islem == 2)
                sonuc = sayi1 - sayi2;
            else if (islem == 3)
                sonuc = sayi1 * sayi2;
            else if (islem == 4)
                sonuc = sayi1 / sayi2;
            else
                sonuc = 0;
            listBox1.Items.Add(sayi1.ToString()+" "+islem.ToString()+" "+sayi2.ToString()+ " = "+ sonuc);
            return sonuc;
            

        }
       
        private void button17_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "0")
                textBox1.Text = "";
            textBox1.Text += ",";
        }

        private void button18_Click(object sender, EventArgs e)
        {
            try
            {
                if (textBox1.Text.Length != 0)
                {
                    double k;
                    k = Math.Sin(Convert.ToDouble(textBox1.Text));
                    textBox1.Text = Convert.ToString(k);

                }
               
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message, "error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void button19_Click(object sender, EventArgs e)
        {
            try
            {
                if (textBox1.Text.Length != 0)
                {
                    double k;
                    k = Math.Cos(Convert.ToDouble(textBox1.Text));
                    textBox1.Text = Convert.ToString(k);

                }
               
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message, "error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void button20_Click(object sender, EventArgs e)
        {
            try
            {
                if (textBox1.Text.Length != 0)
                {
                    double k;
                    k = Math.Tan(Convert.ToDouble(textBox1.Text));
                    textBox1.Text = Convert.ToString(k);

                }
                
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message, "error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void button21_Click(object sender, EventArgs e)
        {
            try
            {
                if (textBox1.Text.Length != 0)
                {
                    double k;
                    k = Math.Log(Convert.ToDouble(textBox1.Text));
                    textBox1.Text = Convert.ToString(k);

                }
               
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message, "error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void button22_Click(object sender, EventArgs e)
        {
            textBox1.Text = Math.PI.ToString();
            
        }

        private void button23_Click(object sender, EventArgs e)
        {
            try
            {
                int fact = 1;
                for (int i = 1; i < (Convert.ToUInt32(textBox1.Text)); i++)
                {
                    fact = fact*(i+1);
                }
                textBox1.Text = Convert.ToString(fact);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message, "error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void button24_Click(object sender, EventArgs e)
        {
            try
            {
                if (textBox1.Text.Length != 0)
                {
                    double k;
                    k = Math.Sinh(Convert.ToDouble(textBox1.Text));
                    textBox1.Text = Convert.ToString(k);

                }
               
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message, "error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void button25_Click(object sender, EventArgs e)
        {
            try
            {
                if (textBox1.Text.Length != 0)
                {
                    double k;
                    k = Math.Cosh(Convert.ToDouble(textBox1.Text));
                    textBox1.Text = Convert.ToString(k);

                }
               
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message, "error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void button26_Click(object sender, EventArgs e)
        {
            try
            {
                if (textBox1.Text.Length != 0)
                {
                    double k;
                    k = Math.Tanh(Convert.ToDouble(textBox1.Text));
                    textBox1.Text = Convert.ToString(k);

                }
               
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message, "error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void button27_Click(object sender, EventArgs e)
        {

            double k, s;
            k = Convert.ToDouble(textBox1.Text);
            textBox1.Text = Convert.ToString(k);
            s = Math.Sqrt(k);
            textBox1.Text = Convert.ToString(s);
        }

        private void button28_Click(object sender, EventArgs e)
        {
            textBox1.Text = (1 / Convert.ToDouble(textBox1.Text)).ToString();
        }

        private void button29_Click(object sender, EventArgs e)
        {
         try
            {
                if (textBox1.Text.Length != 0)
                {
                    double k;
                    k = Math.Exp(Convert.ToDouble(textBox1.Text));
                    textBox1.Text = Convert.ToString(k);

                }
               
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message, "error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void button30_Click(object sender, EventArgs e)
        {

            try
            {

                if (textBox1.Text.Length != 0)
                {
                    double k;
                    k = Math.Truncate(Convert.ToDouble(textBox1.Text));
                    textBox1.Text = Convert.ToString(k);

                }
                
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message, "error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void button31_Click(object sender, EventArgs e)
        {

            textBox1.Clear();
        }

        private void button11_Click(object sender, EventArgs e)
        {
            string veri = textBox1.Text;
            textBox1.Text = "";
            int i;
            for (i = 0; i < veri.Length - 1; i++)
            {
                textBox1.Text += veri[i].ToString();
            }


        }

        private void button32_Click(object sender, EventArgs e)
        {
            if (button32.Text == "Geçmişi Göster")
            {
                groupBox1.Visible = true;
                this.Size =new Size(605,395);
                button32.Text = "Geçmişi Gizle";
            }
            else
            {
                groupBox1.Visible =false;
                this.Size = new Size(388,395);
                button32.Text = "Geçmişi Göster";
            }
          
           
        }

        private void textBox1_KeyPress(object sender, KeyPressEventArgs e)
        {
            e.Handled = !char.IsDigit(e.KeyChar) && !char.IsControl(e.KeyChar);
        }

        
     

    }
}
