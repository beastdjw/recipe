package it.veldt.recipe.controllers;

import it.veldt.recipe.domain.Category;
import it.veldt.recipe.domain.UnitOfMeasure;
import it.veldt.recipe.repositories.CategoryRepository;
import it.veldt.recipe.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage() {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("Mexican");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Cup");

        System.out.println(categoryOptional.get().getDescription() + " " + categoryOptional.get().getId());
        System.out.println(unitOfMeasureOptional.get().getDescription() + " " + categoryOptional.get().getId());
        return "index";
    }
}
