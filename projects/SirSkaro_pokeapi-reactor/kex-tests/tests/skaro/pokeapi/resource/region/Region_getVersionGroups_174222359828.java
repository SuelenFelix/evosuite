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

public class Region_getVersionGroups_174222359828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1546;

    public Region_getVersionGroups_174222359828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1546 = newInstance(Class.forName("skaro.pokeapi.resource.region.Region"));
        setField(term1546, term1546.getClass(), "id", null);
        setField(term1546, term1546.getClass(), "locations", null);
        setField(term1546, term1546.getClass(), "name", null);
        setField(term1546, term1546.getClass(), "names", null);
        setField(term1546, term1546.getClass(), "mainGeneration", null);
        setField(term1546, term1546.getClass(), "pokedexes", null);
        setField(term1546, term1546.getClass(), "versionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.region.Region");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionGroups", argTypes, term1546, args);
    }

};


