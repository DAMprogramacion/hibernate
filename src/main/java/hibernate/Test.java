package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate1.modelo.Products;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Products products = new Products();
		products.setName("nuevo productos desde hibernate");
		products.setPrices(100);
		session.beginTransaction();
		session.save(products);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

}
