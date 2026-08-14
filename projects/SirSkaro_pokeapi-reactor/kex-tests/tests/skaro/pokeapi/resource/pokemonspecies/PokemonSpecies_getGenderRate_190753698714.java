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

public class PokemonSpecies_getGenderRate_190753698714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3490;

    public PokemonSpecies_getGenderRate_190753698714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3490 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term3490, term3490.getClass(), "id", null);
        setField(term3490, term3490.getClass(), "name", null);
        setField(term3490, term3490.getClass(), "order", null);
        setField(term3490, term3490.getClass(), "genderRate", null);
        setField(term3490, term3490.getClass(), "captureRate", null);
        setField(term3490, term3490.getClass(), "baseHappiness", null);
        setField(term3490, term3490.getClass(), "isBaby", null);
        setField(term3490, term3490.getClass(), "isLegendary", null);
        setField(term3490, term3490.getClass(), "isMythical", null);
        setField(term3490, term3490.getClass(), "hatchCounter", null);
        setField(term3490, term3490.getClass(), "hasGenderDifferences", null);
        setField(term3490, term3490.getClass(), "formsSwitchable", null);
        setField(term3490, term3490.getClass(), "growthRate", null);
        setField(term3490, term3490.getClass(), "pokedexNumbers", null);
        setField(term3490, term3490.getClass(), "eggGroups", null);
        setField(term3490, term3490.getClass(), "color", null);
        setField(term3490, term3490.getClass(), "shape", null);
        setField(term3490, term3490.getClass(), "evolvesFromSpecies", null);
        setField(term3490, term3490.getClass(), "evolutionChain", null);
        setField(term3490, term3490.getClass(), "habitat", null);
        setField(term3490, term3490.getClass(), "generation", null);
        setField(term3490, term3490.getClass(), "names", null);
        setField(term3490, term3490.getClass(), "flavorTextEntries", null);
        setField(term3490, term3490.getClass(), "formDescriptions", null);
        setField(term3490, term3490.getClass(), "genera", null);
        setField(term3490, term3490.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenderRate", argTypes, term3490, args);
    }

};


