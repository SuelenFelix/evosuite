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

public class Pokedex_setDescriptions_159816007725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1944;

    public Pokedex_setDescriptions_159816007725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1944 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.Pokedex"));
        setField(term1944, term1944.getClass(), "id", null);
        setField(term1944, term1944.getClass(), "name", null);
        setField(term1944, term1944.getClass(), "isMainSeries", null);
        setField(term1944, term1944.getClass(), "descriptions", null);
        setField(term1944, term1944.getClass(), "names", null);
        setField(term1944, term1944.getClass(), "pokemonEntries", null);
        setField(term1944, term1944.getClass(), "region", null);
        setField(term1944, term1944.getClass(), "versionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokedex.Pokedex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDescriptions", argTypes, term1944, args);
    }

};


