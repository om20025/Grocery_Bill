import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class grocery extends JFrame implements ActionListener
{
    HashMap<String, String> product_and_price;
    
    DefaultListModel<String> product_name_bill, product_quantity_bill,product_price_bill;
    
    JLabel cus_name,product_name, price_per_unit, quantity_label, price_of_product, price_per_unit_label, total, total_amount, bill_product, bill_quantity, bill_price;
    JComboBox product_list, quantity_list;
    JList product_bill, product_quantity, product_price;
    JButton add_product;
    JTextField name;
    
    public grocery()
    {
        product_and_price = new HashMap<String, String>();
        
        //   Vegetable 
        product_and_price.put("Tomato(Per Kg)","40");
        product_and_price.put("Potato (Per Kg)","20");
        product_and_price.put("Brinjal (Per Kg)","45");
        product_and_price.put("Lady Finger (Per Kg)","30");
        product_and_price.put("Cauliflower (Per Kg)","20");
        //Fruits
        product_and_price.put("Apple (Per Kg)","70");
        product_and_price.put("Banana (1 Dozen)","40");
        product_and_price.put("Strawberry (Per Kg)","100");
        product_and_price.put("Watermelon (Per Kg)","30");
        //Flour
        product_and_price.put("Rice Flour (Per Kg)","25");
        product_and_price.put("Maida (Per Kg)","35");
        product_and_price.put("Bajri Flour (Per Kg)","60");
        product_and_price.put("Wheet Flour (Per Kg)","60");
        //Snacks
        product_and_price.put("Biscuit (Per unit)","10");
        product_and_price.put("kurkure (Per unit)","10");
        product_and_price.put("Nachos (Per unit)","20");
        //Cold Drinks
        product_and_price.put("Fanta (1 Litre)","60");
        product_and_price.put("Pepsi (1 Litre)","65");
        product_and_price.put("Coco Cola (1 Litre)","70");
        product_and_price.put("7up (1 Litre)","60");
        //Dairy Products
        product_and_price.put("Milk (1 Litre)","60");
        product_and_price.put("Buttermilk (Per Unit)","10");
        product_and_price.put("Ghee (Per Kg)","500");
        product_and_price.put("Cheese (Per unit)","15");
        product_and_price.put("Paneer (100 gram)","30");
        //Daily Essentials
        product_and_price.put("Shampoo (Per unit)","5");
        product_and_price.put("Soap (Per unit)","15");
        product_and_price.put("Toothpaste (Per unit)","50");
        product_and_price.put("ToothBrush (Per unit)","20");
        product_and_price.put("Perfume (250 ml)","100");
        //Choclates
        product_and_price.put("Dairymilk (Per unit)","40");
        product_and_price.put("Bubbly (Per unit)","80");
        product_and_price.put("KitKat (Per unit)","20");
        product_and_price.put("Bounty (Per unit)","45");
        product_and_price.put("5star (Per unit)","10");
        //Dryfruits
        product_and_price.put("Cashew (Per Kg)","800");
        product_and_price.put("Almond (Per Kg)","900");
        product_and_price.put("Pista (Per Kg)","650");
        product_and_price.put("Wallnuts (Per Kg)","700");
        product_and_price.put("Kismis (Per Kg)","500");
        //Masala
        product_and_price.put("Turmeric (100gm)","35");
        product_and_price.put("Mirchi (100gm)","30");
        product_and_price.put("Garam masala (100gm)","25");
        product_and_price.put("Jeera (100gm)","40");
        product_and_price.put("Dalmirchi (100gm)","70");
        //Stationary
        product_and_price.put("Pen (Per unit)","5");
        product_and_price.put("Pencil (Per unit)","3");
        product_and_price.put("Book (Per unit)","20");
        product_and_price.put("Eraser (Per unit)","5");
        product_and_price.put("Compass (Per unit)","100");

        product_name_bill = new DefaultListModel<>();
        product_price_bill = new DefaultListModel<>();
        product_quantity_bill = new DefaultListModel<>();
        
        product_name = new JLabel("Product Name");
        quantity_label = new JLabel("Quantity");
        price_per_unit = new JLabel("Price");
        price_per_unit_label = new JLabel("3");
        cus_name = new JLabel("Name");
        name = new JTextField();

        product_list = new JComboBox();
        quantity_list = new JComboBox();
                
        product_and_price.forEach((key,value)->
        {
            product_list.addItem(key);
        });
        
        for(int i=1; i<=10; i++)
        {
            quantity_list.addItem(Integer.toString(i));
        }

        bill_product = new JLabel("Item");
        bill_quantity = new JLabel("Quantity");
        bill_price = new JLabel("Cost");
        
        product_bill = new JList(product_name_bill);
        product_price = new JList(product_price_bill);
        product_quantity = new JList(product_quantity_bill);
        
        add_product = new JButton("Add Product");
      
        total = new JLabel("Total Amount : ");
        total_amount = new JLabel();
        
        product_name.setBounds(10, 30, 100, 20);
        price_per_unit.setBounds(170, 30, 100, 20);
        quantity_label.setBounds(310, 30, 100, 20);
        price_per_unit_label.setBounds(170, 50, 100, 20);
        cus_name.setBounds(1,1, 100, 20);
        name.setBounds(40,1, 100, 20);
        

        
        product_list.setBounds(10, 50, 150, 20);
        quantity_list.setBounds(310, 50, 100, 20);
     
        add_product.setBounds(10, 80, 400, 50);
        
        bill_product.setBounds(10, 150, 150, 20);
        bill_quantity.setBounds(170, 150, 90, 20);
        bill_price.setBounds(270, 150, 140, 20);
        
        product_bill.setBounds(10, 175, 150, 400);
        product_quantity.setBounds(170, 175, 90, 400);
        product_price.setBounds(270, 175, 140, 400);
        
        total.setBounds(140, 575, 200, 20);
        total_amount.setBounds(310, 575, 90, 20);
                
        add(product_name);
        add(price_per_unit);
        add(quantity_label);
        add(cus_name);
        add(name);
        
        add(price_per_unit_label);
        add(product_list);
        add(quantity_list);
        
        add(add_product);
     
        add(bill_product);
        add(bill_quantity);
        add(bill_price);
        
        add(product_bill);
        add(product_quantity);
        add(product_price);
        
        add(total);
        add(total_amount);
        
        product_list.addActionListener(this);
        add_product.addActionListener(this);
        
        setSize(435,650);
        setLayout(null);
        setVisible(true);
        setTitle("Grocery");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        
        if(e.getSource()==add_product)
        {
            product_name_bill.addElement((String) product_list.getSelectedItem());
            product_quantity_bill.addElement((String) quantity_list.getSelectedItem());
            int unit_price = Integer.parseInt(product_and_price.get(product_list.getSelectedItem()));
            int product_quantity = Integer.parseInt((String) quantity_list.getSelectedItem());
            int total_for_product = unit_price*product_quantity; 
            int total_cost = 0;
            product_price_bill.addElement(Integer.toString(total_for_product));
            
            for(int i=0;i<product_price_bill.getSize();i++)
            {
                total_cost += Integer.parseInt(product_price_bill.getElementAt(i));
            }
            
            total_amount.setText(Integer.toString(total_cost));
        }
        else if(e.getSource()==product_list)
        {
            price_per_unit_label.setText(product_and_price.get(product_list.getSelectedItem()));
        }
    }
    public static void main(String[] args)
    {
        grocery ms = new grocery();
    }
}