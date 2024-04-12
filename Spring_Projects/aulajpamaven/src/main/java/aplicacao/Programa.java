package aplicacao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		/*
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3= new Pessoa(null, "Ana Maria", "ana@gmail.com");
		*/
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//Iniciar trasação e commit ao final do código
		//Salvar os objetos instanciados e passar para o banco de dados
		/*em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();	
		*/

		//em.remove(p) para remover algo do banco de dados, porém precisa começar a transação e fechar
		System.out.println("Pronto!");
		em.close();
		emf.close();
	}

}
