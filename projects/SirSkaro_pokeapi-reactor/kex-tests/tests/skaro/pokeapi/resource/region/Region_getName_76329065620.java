package skaro.pokeapi.resource.region;

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
import static skaro.pokeapi.resource.region.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Region_getName_76329065620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1538;

    public Region_getName_76329065620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1538 = newInstance(Class.forName("skaro.pokeapi.resource.region.Region"));
        setField(term1538, term1538.getClass(), "id", null);
        setField(term1538, term1538.getClass(), "locations", null);
        setField(term1538, term1538.getClass(), "name", null);
        setField(term1538, term1538.getClass(), "names", null);
        setField(term1538, term1538.getClass(), "mainGeneration", null);
        setField(term1538, term1538.getClass(), "pokedexes", null);
        setField(term1538, term1538.getClass(), "versionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.region.Region");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1538, args);
    }

};


