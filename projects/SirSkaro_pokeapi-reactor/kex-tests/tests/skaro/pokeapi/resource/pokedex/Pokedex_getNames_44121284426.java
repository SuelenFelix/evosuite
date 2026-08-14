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

public class Pokedex_getNames_44121284426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1945;

    public Pokedex_getNames_44121284426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1945 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.Pokedex"));
        setField(term1945, term1945.getClass(), "id", null);
        setField(term1945, term1945.getClass(), "name", null);
        setField(term1945, term1945.getClass(), "isMainSeries", null);
        setField(term1945, term1945.getClass(), "descriptions", null);
        setField(term1945, term1945.getClass(), "names", null);
        setField(term1945, term1945.getClass(), "pokemonEntries", null);
        setField(term1945, term1945.getClass(), "region", null);
        setField(term1945, term1945.getClass(), "versionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokedex.Pokedex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term1945, args);
    }

};


