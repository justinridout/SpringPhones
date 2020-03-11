package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Company;
import dmacc.beans.Phones;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PhoneRepository;

@SpringBootApplication
public class SpringPhonesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringPhonesApplication.class, args);
	}

	@Autowired
	PhoneRepository repo;

	@Override
	public void run(String... args) throws Exception {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		Phones p = appContext.getBean("phones", Phones.class);
		repo.save(p);
		
		Phones ph = new Phones("Apple", "Iphone 6", 4.5);
		
		Company c = new Company("Apple", "Cupertino", "CA");
		
		ph.setCompany(c);
		
		repo.save(ph);
		
		List<Phones> allMyPhones = repo.findAll();
		for (Phones pl : allMyPhones) {
			System.out.println(pl.toString());
		}

		((AbstractApplicationContext) appContext).close();

	}

}
