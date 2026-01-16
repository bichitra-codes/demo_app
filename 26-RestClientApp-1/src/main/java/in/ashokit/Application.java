package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.ProductService;

@SpringBootApplication
public class Application {

    private final ProductService productService;

    Application(ProductService productService) {
        this.productService = productService;
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		
		ProductService bean =  ctxt.getBean(ProductService.class);
		
		bean.getProductByid(1);
		System.out.println("==============================");
		bean.getProductById(1);
		
	}

}
