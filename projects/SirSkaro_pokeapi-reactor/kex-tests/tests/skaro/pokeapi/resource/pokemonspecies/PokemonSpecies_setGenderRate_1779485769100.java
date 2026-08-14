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

public class PokemonSpecies_setGenderRate_1779485769100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81334;

    public PokemonSpecies_setGenderRate_1779485769100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81334 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term81334, term81334.getClass(), "id", null);
        setField(term81334, term81334.getClass(), "name", null);
        setField(term81334, term81334.getClass(), "order", null);
        setField(term81334, term81334.getClass(), "genderRate", null);
        setField(term81334, term81334.getClass(), "captureRate", null);
        setField(term81334, term81334.getClass(), "baseHappiness", null);
        setField(term81334, term81334.getClass(), "isBaby", null);
        setField(term81334, term81334.getClass(), "isLegendary", null);
        setField(term81334, term81334.getClass(), "isMythical", null);
        setField(term81334, term81334.getClass(), "hatchCounter", null);
        setField(term81334, term81334.getClass(), "hasGenderDifferences", null);
        setField(term81334, term81334.getClass(), "formsSwitchable", null);
        setField(term81334, term81334.getClass(), "growthRate", null);
        setField(term81334, term81334.getClass(), "pokedexNumbers", null);
        setField(term81334, term81334.getClass(), "eggGroups", null);
        setField(term81334, term81334.getClass(), "color", null);
        setField(term81334, term81334.getClass(), "shape", null);
        setField(term81334, term81334.getClass(), "evolvesFromSpecies", null);
        setField(term81334, term81334.getClass(), "evolutionChain", null);
        setField(term81334, term81334.getClass(), "habitat", null);
        setField(term81334, term81334.getClass(), "generation", null);
        setField(term81334, term81334.getClass(), "names", null);
        setField(term81334, term81334.getClass(), "flavorTextEntries", null);
        setField(term81334, term81334.getClass(), "formDescriptions", null);
        setField(term81334, term81334.getClass(), "genera", null);
        setField(term81334, term81334.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGenderRate", argTypes, term81334, args);
    }

};


