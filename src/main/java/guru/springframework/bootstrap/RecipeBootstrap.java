package guru.springframework.bootstrap;

import guru.springframework.domain.Ingredient;
import guru.springframework.domain.Recipe;
import org.springframework.boot.CommandLineRunner;

import java.util.Set;

public class DataLoader implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    private void loadData() {
        Recipe perfectGuacamole = new Recipe();
        perfectGuacamole.setIngredients();

    }

}
