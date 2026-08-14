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

public class PokemonSpecies_getOrder_83497228410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2716;

    public PokemonSpecies_getOrder_83497228410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2716 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term2716, term2716.getClass(), "id", null);
        setField(term2716, term2716.getClass(), "name", null);
        setField(term2716, term2716.getClass(), "order", null);
        setField(term2716, term2716.getClass(), "genderRate", null);
        setField(term2716, term2716.getClass(), "captureRate", null);
        setField(term2716, term2716.getClass(), "baseHappiness", null);
        setField(term2716, term2716.getClass(), "isBaby", null);
        setField(term2716, term2716.getClass(), "isLegendary", null);
        setField(term2716, term2716.getClass(), "isMythical", null);
        setField(term2716, term2716.getClass(), "hatchCounter", null);
        setField(term2716, term2716.getClass(), "hasGenderDifferences", null);
        setField(term2716, term2716.getClass(), "formsSwitchable", null);
        setField(term2716, term2716.getClass(), "growthRate", null);
        setField(term2716, term2716.getClass(), "pokedexNumbers", null);
        setField(term2716, term2716.getClass(), "eggGroups", null);
        setField(term2716, term2716.getClass(), "color", null);
        setField(term2716, term2716.getClass(), "shape", null);
        setField(term2716, term2716.getClass(), "evolvesFromSpecies", null);
        setField(term2716, term2716.getClass(), "evolutionChain", null);
        setField(term2716, term2716.getClass(), "habitat", null);
        setField(term2716, term2716.getClass(), "generation", null);
        setField(term2716, term2716.getClass(), "names", null);
        setField(term2716, term2716.getClass(), "flavorTextEntries", null);
        setField(term2716, term2716.getClass(), "formDescriptions", null);
        setField(term2716, term2716.getClass(), "genera", null);
        setField(term2716, term2716.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrder", argTypes, term2716, args);
    }

};


