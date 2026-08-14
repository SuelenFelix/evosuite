package skaro.pokeapi.resource.generation;

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
import static skaro.pokeapi.resource.generation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Generation_setNames_60277533625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1313;

    public Generation_setNames_60277533625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1313 = newInstance(Class.forName("skaro.pokeapi.resource.generation.Generation"));
        setField(term1313, term1313.getClass(), "id", null);
        setField(term1313, term1313.getClass(), "name", null);
        setField(term1313, term1313.getClass(), "abilities", null);
        setField(term1313, term1313.getClass(), "names", null);
        setField(term1313, term1313.getClass(), "moves", null);
        setField(term1313, term1313.getClass(), "pokemonSpecies", null);
        setField(term1313, term1313.getClass(), "types", null);
        setField(term1313, term1313.getClass(), "versionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.generation.Generation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNames", argTypes, term1313, args);
    }

};


