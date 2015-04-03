package com.tesco.retail.dao.implementation;

import java.util.List;

import javax.persistence.*;

import com.tesco.retail.domain.entites.Inventory;
import com.tesco.retail.domain.entites.Product;

public class ProductDAO {
	private EntityManagerFactory emf=Persistence.createEntityManagerFactory("myPersistenceUnit");
	private EntityManager em=emf.createEntityManager();
	private EntityTransaction tx=em.getTransaction();
	public void insertProduct(Product product){
		try
		{
			tx.begin();
			em.merge(product);
			tx.commit();
		}
		catch (Exception e) {
			tx.rollback();
		}
	}
	public List<Product> getProduct()
    {
		tx.begin();
        TypedQuery<Product> query=em.createNamedQuery("Product.findAll", Product.class);
        List<Product> products=query.getResultList();
        for(Product p:products)
        {
            System.out.println(p);
        }
        return products;
    }
	public Product getProductById(int name)
    {
		tx.begin();
		
        TypedQuery<Product> query=em.createNamedQuery("Product.findByName", Product.class);
        Product product=query.setParameter("productName", name).getSingleResult();
        return product;
    }
	public Product getProductByName(String name)
    {
		tx.begin();
		
        TypedQuery<Product> query=em.createNamedQuery("Product.findByName", Product.class);
        Product product=query.setParameter("productName", name).getSingleResult();
        return product;
    }
}
