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

public class PokemonSpecies_setIsBaby_162589651426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65803;

    public PokemonSpecies_setIsBaby_162589651426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65803 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies"));
        setField(term65803, term65803.getClass(), "id", null);
        setField(term65803, term65803.getClass(), "name", null);
        setField(term65803, term65803.getClass(), "order", null);
        setField(term65803, term65803.getClass(), "genderRate", null);
        setField(term65803, term65803.getClass(), "captureRate", null);
        setField(term65803, term65803.getClass(), "baseHappiness", null);
        setField(term65803, term65803.getClass(), "isBaby", null);
        setField(term65803, term65803.getClass(), "isLegendary", null);
        setField(term65803, term65803.getClass(), "isMythical", null);
        setField(term65803, term65803.getClass(), "hatchCounter", null);
        setField(term65803, term65803.getClass(), "hasGenderDifferences", null);
        setField(term65803, term65803.getClass(), "formsSwitchable", null);
        setField(term65803, term65803.getClass(), "growthRate", null);
        setField(term65803, term65803.getClass(), "pokedexNumbers", null);
        setField(term65803, term65803.getClass(), "eggGroups", null);
        setField(term65803, term65803.getClass(), "color", null);
        setField(term65803, term65803.getClass(), "shape", null);
        setField(term65803, term65803.getClass(), "evolvesFromSpecies", null);
        setField(term65803, term65803.getClass(), "evolutionChain", null);
        setField(term65803, term65803.getClass(), "habitat", null);
        setField(term65803, term65803.getClass(), "generation", null);
        setField(term65803, term65803.getClass(), "names", null);
        setField(term65803, term65803.getClass(), "flavorTextEntries", null);
        setField(term65803, term65803.getClass(), "formDescriptions", null);
        setField(term65803, term65803.getClass(), "genera", null);
        setField(term65803, term65803.getClass(), "varieties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonspecies.PokemonSpecies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIsBaby", argTypes, term65803, args);
    }

};


