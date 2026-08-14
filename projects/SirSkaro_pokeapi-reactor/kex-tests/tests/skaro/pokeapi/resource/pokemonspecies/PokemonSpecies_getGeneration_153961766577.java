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

public class PokemonSpecies_getGeneration_153961766577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76232;

    public PokemonSpecies_getGeneration_153961766577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76232 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term76232, term76232.getClass(), "id", null);
        setField(term76232, term76232.getClass(), "name", null);
        setField(term76232, term76232.getClass(), "order", null);
        setField(term76232, term76232.getClass(), "genderRate", null);
        setField(term76232, term76232.getClass(), "captureRate", null);
        setField(term76232, term76232.getClass(), "baseHappiness", null);
        setField(term76232, term76232.getClass(), "isBaby", null);
        setField(term76232, term76232.getClass(), "isLegendary", null);
        setField(term76232, term76232.getClass(), "isMythical", null);
        setField(term76232, term76232.getClass(), "hatchCounter", null);
        setField(term76232, term76232.getClass(), "hasGenderDifferences", null);
        setField(term76232, term76232.getClass(), "formsSwitchable", null);
        setField(term76232, term76232.getClass(), "growthRate", null);
        setField(term76232, term76232.getClass(), "pokedexNumbers", null);
        setField(term76232, term76232.getClass(), "eggGroups", null);
        setField(term76232, term76232.getClass(), "color", null);
        setField(term76232, term76232.getClass(), "shape", null);
        setField(term76232, term76232.getClass(), "evolvesFromSpecies", null);
        setField(term76232, term76232.getClass(), "evolutionChain", null);
        setField(term76232, term76232.getClass(), "habitat", null);
        setField(term76232, term76232.getClass(), "generation", null);
        setField(term76232, term76232.getClass(), "names", null);
        setField(term76232, term76232.getClass(), "flavorTextEntries", null);
        setField(term76232, term76232.getClass(), "formDescriptions", null);
        setField(term76232, term76232.getClass(), "genera", null);
        setField(term76232, term76232.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeneration", argTypes, term76232, args);
    }

};


