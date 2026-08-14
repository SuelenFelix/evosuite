package skaro.pokeapi.resource.pokemonspecies;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static skaro.pokeapi.resource.pokemonspecies.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PokemonSpecies_getHasGenderDifferences_158604393742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8539;

    public PokemonSpecies_getHasGenderDifferences_158604393742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8539 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term8539, term8539.getClass(), "id", null);
        setField(term8539, term8539.getClass(), "name", null);
        setField(term8539, term8539.getClass(), "order", null);
        setField(term8539, term8539.getClass(), "genderRate", null);
        setField(term8539, term8539.getClass(), "captureRate", null);
        setField(term8539, term8539.getClass(), "baseHappiness", null);
        setField(term8539, term8539.getClass(), "isBaby", null);
        setField(term8539, term8539.getClass(), "isLegendary", null);
        setField(term8539, term8539.getClass(), "isMythical", null);
        setField(term8539, term8539.getClass(), "hatchCounter", null);
        setField(term8539, term8539.getClass(), "hasGenderDifferences", null);
        setField(term8539, term8539.getClass(), "formsSwitchable", null);
        setField(term8539, term8539.getClass(), "growthRate", null);
        setField(term8539, term8539.getClass(), "pokedexNumbers", null);
        setField(term8539, term8539.getClass(), "eggGroups", null);
        setField(term8539, term8539.getClass(), "color", null);
        setField(term8539, term8539.getClass(), "shape", null);
        setField(term8539, term8539.getClass(), "evolvesFromSpecies", null);
        setField(term8539, term8539.getClass(), "evolutionChain", null);
        setField(term8539, term8539.getClass(), "habitat", null);
        setField(term8539, term8539.getClass(), "generation", null);
        setField(term8539, term8539.getClass(), "names", null);
        setField(term8539, term8539.getClass(), "flavorTextEntries", null);
        setField(term8539, term8539.getClass(), "formDescriptions", null);
        setField(term8539, term8539.getClass(), "genera", null);
        setField(term8539, term8539.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHasGenderDifferences", argTypes, term8539, args);
    }

};


