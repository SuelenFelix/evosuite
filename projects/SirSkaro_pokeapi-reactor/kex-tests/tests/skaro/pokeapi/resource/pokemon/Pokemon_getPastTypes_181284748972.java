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

public class Pokemon_getPastTypes_181284748972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16332;

    public Pokemon_getPastTypes_181284748972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16332 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term16332, term16332.getClass(), "id", null);
        setField(term16332, term16332.getClass(), "name", null);
        setField(term16332, term16332.getClass(), "baseExperience", null);
        setField(term16332, term16332.getClass(), "height", null);
        setField(term16332, term16332.getClass(), "isDefault", null);
        setField(term16332, term16332.getClass(), "order", null);
        setField(term16332, term16332.getClass(), "weight", null);
        setField(term16332, term16332.getClass(), "abilities", null);
        setField(term16332, term16332.getClass(), "forms", null);
        setField(term16332, term16332.getClass(), "gameIndices", null);
        setField(term16332, term16332.getClass(), "heldItems", null);
        setField(term16332, term16332.getClass(), "locationAreaEncounters", null);
        setField(term16332, term16332.getClass(), "moves", null);
        setField(term16332, term16332.getClass(), "sprites", null);
        setField(term16332, term16332.getClass(), "species", null);
        setField(term16332, term16332.getClass(), "stats", null);
        setField(term16332, term16332.getClass(), "types", null);
        setField(term16332, term16332.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPastTypes", argTypes, term16332, args);
    }

};


