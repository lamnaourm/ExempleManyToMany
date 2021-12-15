import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.hibernate.utils.HibernateUtils;
import com.models.Employe;

public class Main {

	public static void main(String[] args) {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		
		List<Employe> emps = s.createQuery("from Employe").list();
		
		for(Employe e: emps) {
			System.out.println(e + " - " + e.getProjets().size());
		}
		
		t.commit();
		s.close();

	}

}
