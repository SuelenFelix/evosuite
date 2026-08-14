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

public class PokemonSpecies_setCaptureRate_106725419820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4424;

    public PokemonSpecies_setCaptureRate_106725419820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4424 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term4424, term4424.getClass(), "id", null);
        setField(term4424, term4424.getClass(), "name", null);
        setField(term4424, term4424.getClass(), "order", null);
        setField(term4424, term4424.getClass(), "genderRate", null);
        setField(term4424, term4424.getClass(), "captureRate", null);
        setField(term4424, term4424.getClass(), "baseHappiness", null);
        setField(term4424, term4424.getClass(), "isBaby", null);
        setField(term4424, term4424.getClass(), "isLegendary", null);
        setField(term4424, term4424.getClass(), "isMythical", null);
        setField(term4424, term4424.getClass(), "hatchCounter", null);
        setField(term4424, term4424.getClass(), "hasGenderDifferences", null);
        setField(term4424, term4424.getClass(), "formsSwitchable", null);
        setField(term4424, term4424.getClass(), "growthRate", null);
        setField(term4424, term4424.getClass(), "pokedexNumbers", null);
        setField(term4424, term4424.getClass(), "eggGroups", null);
        setField(term4424, term4424.getClass(), "color", null);
        setField(term4424, term4424.getClass(), "shape", null);
        setField(term4424, term4424.getClass(), "evolvesFromSpecies", null);
        setField(term4424, term4424.getClass(), "evolutionChain", null);
        setField(term4424, term4424.getClass(), "habitat", null);
        setField(term4424, term4424.getClass(), "generation", null);
        setField(term4424, term4424.getClass(), "names", null);
        setField(term4424, term4424.getClass(), "flavorTextEntries", null);
        setField(term4424, term4424.getClass(), "formDescriptions", null);
        setField(term4424, term4424.getClass(), "genera", null);
        setField(term4424, term4424.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCaptureRate", argTypes, term4424, args);
    }

};


