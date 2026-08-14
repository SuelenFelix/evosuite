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

public class Pokemon_setBaseExperience_84831168544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109119;

    public Pokemon_setBaseExperience_84831168544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109119 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term109119, term109119.getClass(), "id", null);
        setField(term109119, term109119.getClass(), "name", null);
        setField(term109119, term109119.getClass(), "baseExperience", null);
        setField(term109119, term109119.getClass(), "height", null);
        setField(term109119, term109119.getClass(), "isDefault", null);
        setField(term109119, term109119.getClass(), "order", null);
        setField(term109119, term109119.getClass(), "weight", null);
        setField(term109119, term109119.getClass(), "abilities", null);
        setField(term109119, term109119.getClass(), "forms", null);
        setField(term109119, term109119.getClass(), "gameIndices", null);
        setField(term109119, term109119.getClass(), "heldItems", null);
        setField(term109119, term109119.getClass(), "locationAreaEncounters", null);
        setField(term109119, term109119.getClass(), "moves", null);
        setField(term109119, term109119.getClass(), "sprites", null);
        setField(term109119, term109119.getClass(), "species", null);
        setField(term109119, term109119.getClass(), "stats", null);
        setField(term109119, term109119.getClass(), "types", null);
        setField(term109119, term109119.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBaseExperience", argTypes, term109119, args);
    }

};


