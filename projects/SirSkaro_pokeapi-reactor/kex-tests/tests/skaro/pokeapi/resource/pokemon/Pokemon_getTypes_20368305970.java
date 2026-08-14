package skaro.pokeapi.resource.pokemon;

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
import static skaro.pokeapi.resource.pokemon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Pokemon_getTypes_20368305970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16330;

    public Pokemon_getTypes_20368305970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16330 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term16330, term16330.getClass(), "id", null);
        setField(term16330, term16330.getClass(), "name", null);
        setField(term16330, term16330.getClass(), "baseExperience", null);
        setField(term16330, term16330.getClass(), "height", null);
        setField(term16330, term16330.getClass(), "isDefault", null);
        setField(term16330, term16330.getClass(), "order", null);
        setField(term16330, term16330.getClass(), "weight", null);
        setField(term16330, term16330.getClass(), "abilities", null);
        setField(term16330, term16330.getClass(), "forms", null);
        setField(term16330, term16330.getClass(), "gameIndices", null);
        setField(term16330, term16330.getClass(), "heldItems", null);
        setField(term16330, term16330.getClass(), "locationAreaEncounters", null);
        setField(term16330, term16330.getClass(), "moves", null);
        setField(term16330, term16330.getClass(), "sprites", null);
        setField(term16330, term16330.getClass(), "species", null);
        setField(term16330, term16330.getClass(), "stats", null);
        setField(term16330, term16330.getClass(), "types", null);
        setField(term16330, term16330.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTypes", argTypes, term16330, args);
    }

};


