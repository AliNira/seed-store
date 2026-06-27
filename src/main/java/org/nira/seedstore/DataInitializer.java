package org.nira.seedstore;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final ProductRepo productRepo;
    private final CategoryRepo categoryRepo;

    @Override
    public void run(String... args) throws Exception {
        productRepo.deleteAll();
        categoryRepo.deleteAll();

        Category vegetable = new Category();
        vegetable.setName("Vegetable Seeds");
        Category fruit = new Category();
        fruit.setName("Fruit Seeds");
        Category flower = new Category();
        flower.setName("Flower Seeds");
        Category herb = new Category();
        herb.setName("Herb Seeds");
        Category tree = new Category();
        tree.setName("Tree Seeds");

        categoryRepo.saveAll(Arrays.asList(vegetable, fruit, flower, herb, tree));

        Product tomato = new Product();
        tomato.setName("Tomato Seeds");
        tomato.setDescription("Tomato Seeds");
        tomato.setImageUrl("https://placehold.co/600x400");
        tomato.setPrice(5.0);
        tomato.setCategory(vegetable);

        Product cucumber = new Product();
        cucumber.setName("Cucumber Seeds");
        cucumber.setDescription("Cucumber Seeds");
        cucumber.setImageUrl("https://placehold.co/600x400");
        cucumber.setPrice(4.5);
        cucumber.setCategory(vegetable);

        Product carrot = new Product();
        carrot.setName("Carrot Seeds");
        carrot.setDescription("Carrot Seeds");
        carrot.setImageUrl("https://placehold.co/600x400");
        carrot.setPrice(3.5);
        carrot.setCategory(vegetable);


        Product watermelon = new Product();
        watermelon.setName("Watermelon Seeds");
        watermelon.setDescription("Watermelon Seeds");
        watermelon.setImageUrl("https://placehold.co/600x400");
        watermelon.setPrice(6.0);
        watermelon.setCategory(fruit);

        Product melon = new Product();
        melon.setName("Melon Seeds");
        melon.setDescription("Melon Seeds");
        melon.setImageUrl("https://placehold.co/600x400");
        melon.setPrice(5.5);
        melon.setCategory(fruit);

        Product strawberry = new Product();
        strawberry.setName("Strawberry Seeds");
        strawberry.setDescription("Strawberry Seeds");
        strawberry.setImageUrl("https://placehold.co/600x400");
        strawberry.setPrice(7.0);
        strawberry.setCategory(fruit);


        Product sunflower = new Product();
        sunflower.setName("Sunflower Seeds");
        sunflower.setDescription("Sunflower Seeds");
        sunflower.setImageUrl("https://placehold.co/600x400");
        sunflower.setPrice(4.0);
        sunflower.setCategory(flower);

        Product rose = new Product();
        rose.setName("Rose Seeds");
        rose.setDescription("Rose Seeds");
        rose.setImageUrl("https://placehold.co/600x400");
        rose.setPrice(8.0);
        rose.setCategory(flower);

        Product lavender = new Product();
        lavender.setName("Lavender Seeds");
        lavender.setDescription("Lavender Seeds");
        lavender.setImageUrl("https://placehold.co/600x400");
        lavender.setPrice(6.5);
        lavender.setCategory(flower);


        Product basil = new Product();
        basil.setName("Basil Seeds");
        basil.setDescription("Basil Seeds");
        basil.setImageUrl("https://placehold.co/600x400");
        basil.setPrice(3.0);
        basil.setCategory(herb);

        Product mint = new Product();
        mint.setName("Mint Seeds");
        mint.setDescription("Mint Seeds");
        mint.setImageUrl("https://placehold.co/600x400");
        mint.setPrice(3.5);
        mint.setCategory(herb);

        Product parsley = new Product();
        parsley.setName("Parsley Seeds");
        parsley.setDescription("Parsley Seeds");
        parsley.setImageUrl("https://placehold.co/600x400");
        parsley.setPrice(3.0);
        parsley.setCategory(herb);


        Product oak = new Product();
        oak.setName("Oak Seeds");
        oak.setDescription("Oak Seeds");
        oak.setImageUrl("https://placehold.co/600x400");
        oak.setPrice(9.0);
        oak.setCategory(tree);

        Product pine = new Product();
        pine.setName("Pine Seeds");
        pine.setDescription("Pine Seeds");
        pine.setImageUrl("https://placehold.co/600x400");
        pine.setPrice(8.5);
        pine.setCategory(tree);

        Product maple = new Product();
        maple.setName("Maple Seeds");
        maple.setDescription("Maple Seeds");
        maple.setImageUrl("https://placehold.co/600x400");
        maple.setPrice(9.5);
        maple.setCategory(tree);

        productRepo.saveAll(Arrays.asList(
                tomato, cucumber, carrot,
                watermelon, melon, strawberry,
                sunflower, rose, lavender,
                basil, mint, parsley,
                oak, pine, maple
        ));
    }
}
