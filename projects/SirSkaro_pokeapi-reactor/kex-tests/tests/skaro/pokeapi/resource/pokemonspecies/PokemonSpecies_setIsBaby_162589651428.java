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

public class PokemonSpecies_setIsBaby_162589651428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5973;

    public PokemonSpecies_setIsBaby_162589651428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5973 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term5973, term5973.getClass(), "id", null);
        setField(term5973, term5973.getClass(), "name", null);
        setField(term5973, term5973.getClass(), "order", null);
        setField(term5973, term5973.getClass(), "genderRate", null);
        setField(term5973, term5973.getClass(), "captureRate", null);
        setField(term5973, term5973.getClass(), "baseHappiness", null);
        setField(term5973, term5973.getClass(), "isBaby", null);
        setField(term5973, term5973.getClass(), "isLegendary", null);
        setField(term5973, term5973.getClass(), "isMythical", null);
        setField(term5973, term5973.getClass(), "hatchCounter", null);
        setField(term5973, term5973.getClass(), "hasGenderDifferences", null);
        setField(term5973, term5973.getClass(), "formsSwitchable", null);
        setField(term5973, term5973.getClass(), "growthRate", null);
        setField(term5973, term5973.getClass(), "pokedexNumbers", null);
        setField(term5973, term5973.getClass(), "eggGroups", null);
        setField(term5973, term5973.getClass(), "color", null);
        setField(term5973, term5973.getClass(), "shape", null);
        setField(term5973, term5973.getClass(), "evolvesFromSpecies", null);
        setField(term5973, term5973.getClass(), "evolutionChain", null);
        setField(term5973, term5973.getClass(), "habitat", null);
        setField(term5973, term5973.getClass(), "generation", null);
        setField(term5973, term5973.getClass(), "names", null);
        setField(term5973, term5973.getClass(), "flavorTextEntries", null);
        setField(term5973, term5973.getClass(), "formDescriptions", null);
        setField(term5973, term5973.getClass(), "genera", null);
        setField(term5973, term5973.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIsBaby", argTypes, term5973, args);
    }

};


