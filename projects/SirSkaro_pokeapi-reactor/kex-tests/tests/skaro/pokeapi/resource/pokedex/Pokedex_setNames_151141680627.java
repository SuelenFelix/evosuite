package skaro.pokeapi.resource.pokedex;

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
import static skaro.pokeapi.resource.pokedex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Pokedex_setNames_151141680627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1946;

    public Pokedex_setNames_151141680627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1946 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.Pokedex"));
        setField(term1946, term1946.getClass(), "id", null);
        setField(term1946, term1946.getClass(), "name", null);
        setField(term1946, term1946.getClass(), "isMainSeries", null);
        setField(term1946, term1946.getClass(), "descriptions", null);
        setField(term1946, term1946.getClass(), "names", null);
        setField(term1946, term1946.getClass(), "pokemonEntries", null);
        setField(term1946, term1946.getClass(), "region", null);
        setField(term1946, term1946.getClass(), "versionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokedex.Pokedex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNames", argTypes, term1946, args);
    }

};


