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

public class PokemonSpecies_setGrowthRate_156621884852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10325;

    public PokemonSpecies_setGrowthRate_156621884852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10325 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term10325, term10325.getClass(), "id", null);
        setField(term10325, term10325.getClass(), "name", null);
        setField(term10325, term10325.getClass(), "order", null);
        setField(term10325, term10325.getClass(), "genderRate", null);
        setField(term10325, term10325.getClass(), "captureRate", null);
        setField(term10325, term10325.getClass(), "baseHappiness", null);
        setField(term10325, term10325.getClass(), "isBaby", null);
        setField(term10325, term10325.getClass(), "isLegendary", null);
        setField(term10325, term10325.getClass(), "isMythical", null);
        setField(term10325, term10325.getClass(), "hatchCounter", null);
        setField(term10325, term10325.getClass(), "hasGenderDifferences", null);
        setField(term10325, term10325.getClass(), "formsSwitchable", null);
        setField(term10325, term10325.getClass(), "growthRate", null);
        setField(term10325, term10325.getClass(), "pokedexNumbers", null);
        setField(term10325, term10325.getClass(), "eggGroups", null);
        setField(term10325, term10325.getClass(), "color", null);
        setField(term10325, term10325.getClass(), "shape", null);
        setField(term10325, term10325.getClass(), "evolvesFromSpecies", null);
        setField(term10325, term10325.getClass(), "evolutionChain", null);
        setField(term10325, term10325.getClass(), "habitat", null);
        setField(term10325, term10325.getClass(), "generation", null);
        setField(term10325, term10325.getClass(), "names", null);
        setField(term10325, term10325.getClass(), "flavorTextEntries", null);
        setField(term10325, term10325.getClass(), "formDescriptions", null);
        setField(term10325, term10325.getClass(), "genera", null);
        setField(term10325, term10325.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGrowthRate", argTypes, term10325, args);
    }

};


