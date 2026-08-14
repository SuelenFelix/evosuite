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

public class Pokemon_setIsDefault_149869111348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109123;

    public Pokemon_setIsDefault_149869111348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109123 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term109123, term109123.getClass(), "id", null);
        setField(term109123, term109123.getClass(), "name", null);
        setField(term109123, term109123.getClass(), "baseExperience", null);
        setField(term109123, term109123.getClass(), "height", null);
        setField(term109123, term109123.getClass(), "isDefault", null);
        setField(term109123, term109123.getClass(), "order", null);
        setField(term109123, term109123.getClass(), "weight", null);
        setField(term109123, term109123.getClass(), "abilities", null);
        setField(term109123, term109123.getClass(), "forms", null);
        setField(term109123, term109123.getClass(), "gameIndices", null);
        setField(term109123, term109123.getClass(), "heldItems", null);
        setField(term109123, term109123.getClass(), "locationAreaEncounters", null);
        setField(term109123, term109123.getClass(), "moves", null);
        setField(term109123, term109123.getClass(), "sprites", null);
        setField(term109123, term109123.getClass(), "species", null);
        setField(term109123, term109123.getClass(), "stats", null);
        setField(term109123, term109123.getClass(), "types", null);
        setField(term109123, term109123.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIsDefault", argTypes, term109123, args);
    }

};


