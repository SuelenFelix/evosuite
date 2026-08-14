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

public class PokemonSpecies_setHasGenderDifferences_154777298544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8888;

    public PokemonSpecies_setHasGenderDifferences_154777298544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8888 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term8888, term8888.getClass(), "id", null);
        setField(term8888, term8888.getClass(), "name", null);
        setField(term8888, term8888.getClass(), "order", null);
        setField(term8888, term8888.getClass(), "genderRate", null);
        setField(term8888, term8888.getClass(), "captureRate", null);
        setField(term8888, term8888.getClass(), "baseHappiness", null);
        setField(term8888, term8888.getClass(), "isBaby", null);
        setField(term8888, term8888.getClass(), "isLegendary", null);
        setField(term8888, term8888.getClass(), "isMythical", null);
        setField(term8888, term8888.getClass(), "hatchCounter", null);
        setField(term8888, term8888.getClass(), "hasGenderDifferences", null);
        setField(term8888, term8888.getClass(), "formsSwitchable", null);
        setField(term8888, term8888.getClass(), "growthRate", null);
        setField(term8888, term8888.getClass(), "pokedexNumbers", null);
        setField(term8888, term8888.getClass(), "eggGroups", null);
        setField(term8888, term8888.getClass(), "color", null);
        setField(term8888, term8888.getClass(), "shape", null);
        setField(term8888, term8888.getClass(), "evolvesFromSpecies", null);
        setField(term8888, term8888.getClass(), "evolutionChain", null);
        setField(term8888, term8888.getClass(), "habitat", null);
        setField(term8888, term8888.getClass(), "generation", null);
        setField(term8888, term8888.getClass(), "names", null);
        setField(term8888, term8888.getClass(), "flavorTextEntries", null);
        setField(term8888, term8888.getClass(), "formDescriptions", null);
        setField(term8888, term8888.getClass(), "genera", null);
        setField(term8888, term8888.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHasGenderDifferences", argTypes, term8888, args);
    }

};


