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

public class PokemonSpecies_setCaptureRate_1067254198101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80182;

    public PokemonSpecies_setCaptureRate_1067254198101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80182 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term80182, term80182.getClass(), "id", null);
        setField(term80182, term80182.getClass(), "name", null);
        setField(term80182, term80182.getClass(), "order", null);
        setField(term80182, term80182.getClass(), "genderRate", null);
        setField(term80182, term80182.getClass(), "captureRate", null);
        setField(term80182, term80182.getClass(), "baseHappiness", null);
        setField(term80182, term80182.getClass(), "isBaby", null);
        setField(term80182, term80182.getClass(), "isLegendary", null);
        setField(term80182, term80182.getClass(), "isMythical", null);
        setField(term80182, term80182.getClass(), "hatchCounter", null);
        setField(term80182, term80182.getClass(), "hasGenderDifferences", null);
        setField(term80182, term80182.getClass(), "formsSwitchable", null);
        setField(term80182, term80182.getClass(), "growthRate", null);
        setField(term80182, term80182.getClass(), "pokedexNumbers", null);
        setField(term80182, term80182.getClass(), "eggGroups", null);
        setField(term80182, term80182.getClass(), "color", null);
        setField(term80182, term80182.getClass(), "shape", null);
        setField(term80182, term80182.getClass(), "evolvesFromSpecies", null);
        setField(term80182, term80182.getClass(), "evolutionChain", null);
        setField(term80182, term80182.getClass(), "habitat", null);
        setField(term80182, term80182.getClass(), "generation", null);
        setField(term80182, term80182.getClass(), "names", null);
        setField(term80182, term80182.getClass(), "flavorTextEntries", null);
        setField(term80182, term80182.getClass(), "formDescriptions", null);
        setField(term80182, term80182.getClass(), "genera", null);
        setField(term80182, term80182.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCaptureRate", argTypes, term80182, args);
    }

};


