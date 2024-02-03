package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        /* Part E Change */
        /* FIX ME: Commenting out to create only once in mem. Remove before submitting*/
        /*
        Part pot = new Part("Pot", 12.99, 25);
        Part soil = new Part("Soil", 5.99, 50);
        Part plantLight = new Part("Plant Light", 25.99, 15);
        Part waterCan = new Part("Watering Can", 6.99, 25);
        Part miscPlant = new Part("Plant - Miscellaneous", 10.99, 5);
        Part pothosPlant = new Part("Plant - Pothos", 10.99, 5);
        Part snakePlant = new Part("Plant - Snake", 12.99, 8);

        partRepository.save(pot);
        partRepository.save(soil);
        partRepository.save(plantLight);
        partRepository.save(waterCan);
        partRepository.save(pothosPlant);
        partRepository.save(snakePlant);
        partRepository.save(miscPlant);

        Product begKit = new Product("Beginner Kit", 37.00, 6);
        Product advKit = new Product("Advanced Kit", 47.00, 2);
        Product careKit = new Product("Care Kit", 33.00, 2);
        Product pothosPot = new Product("Potted Pothos Plant", 29.97, 2);
        Product snakePot = new Product("Potted Snake Plant", 31.97, 2);

        productRepository.save(begKit);
        productRepository.save(advKit);
        productRepository.save(careKit);
        productRepository.save(pothosPot);
        productRepository.save(snakePot);
        }
        */


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products "+ productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts "+ partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
