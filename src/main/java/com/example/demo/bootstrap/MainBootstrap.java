package com.example.demo.bootstrap;

import com.example.demo.Repo.CategoryRepo;
import com.example.demo.Repo.ItemRepo;
import com.example.demo.model.Category;
import com.example.demo.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class MainBootstrap implements ApplicationRunner {
    @Autowired
    ItemRepo itemRepo;
    CategoryRepo categoryRepo;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        try{
            Category firstCourse = new Category("First","URL:3432");
            Category SecondCourse = new Category("Second", "URL:3435");
            Item item1 = new Item("SHAWA","Описание ", "400 gr", 140.0, "URL:5454",SecondCourse.getName(),140.0 );

        }catch (Exception ex){
            System.out.println(ex.getCause()+ex.getMessage());
        }finally {
            System.out.println("Your app is working!");
        }
    }
}
