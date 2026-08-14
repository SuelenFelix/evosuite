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
import java.lang.Integer;
import java.util.ArrayList;

public class Generation_getNames_13498543147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458;

    public Generation_getNames_13498543147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term459 = new Integer(-2038273078);
        ArrayList term473 = new ArrayList();
        ArrayList term477 = new ArrayList();
        ArrayList term481 = new ArrayList();
        ArrayList term485 = new ArrayList();
        ArrayList term489 = new ArrayList();
        ArrayList term493 = new ArrayList();
        term458 = newInstance(Class.forName("skaro.pokeapi.resource.generation.Generation"));
        setField(term458, term458.getClass(), "id", term459);
        setField(term458, term458.getClass(), "name", "sEccwbJKYE");
        setField(term458, term458.getClass(), "abilities", term473);
        setField(term458, term458.getClass(), "names", term477);
        setField(term458, term458.getClass(), "moves", term481);
        setField(term458, term458.getClass(), "pokemonSpecies", term485);
        setField(term458, term458.getClass(), "types", term489);
        setField(term458, term458.getClass(), "versionGroups", term493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.generation.Generation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term458, args);
    }

};


