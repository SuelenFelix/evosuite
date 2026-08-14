package skaro.pokeapi.resource.growthrate;

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
import static skaro.pokeapi.resource.growthrate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GrowthRate_getPokemonSpecies_128492357524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1266;

    public GrowthRate_getPokemonSpecies_128492357524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1266 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate"));
        setField(term1266, term1266.getClass(), "id", null);
        setField(term1266, term1266.getClass(), "name", null);
        setField(term1266, term1266.getClass(), "formula", null);
        setField(term1266, term1266.getClass(), "descriptions", null);
        setField(term1266, term1266.getClass(), "levels", null);
        setField(term1266, term1266.getClass(), "pokemonSpecies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPokemonSpecies", argTypes, term1266, args);
    }

};


