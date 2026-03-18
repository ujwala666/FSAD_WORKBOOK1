package com.fsad;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

private static SessionFactory factory;

static {

factory = new Configuration()
.configure("hibernate.cfg.xml")
<<<<<<< HEAD
.addAnnotatedClass(Product.class)
=======
.addAnnotatedClass(product.class)
>>>>>>> cba558a3062925086c01f7e0cab46cf12978f33b
.buildSessionFactory();

}

public static SessionFactory getSessionFactory(){

return factory;

}

}