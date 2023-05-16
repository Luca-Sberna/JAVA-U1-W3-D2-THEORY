package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("D12");

	public static EntityManagerFactory getEntityManagerFactory() {
		return emf;
	}

}
