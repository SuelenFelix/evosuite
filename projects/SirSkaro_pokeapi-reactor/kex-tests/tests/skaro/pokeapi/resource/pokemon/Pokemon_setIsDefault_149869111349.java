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

public class Pokemon_setIsDefault_149869111349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16309;

    public Pokemon_setIsDefault_149869111349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16309 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term16309, term16309.getClass(), "id", null);
        setField(term16309, term16309.getClass(), "name", null);
        setField(term16309, term16309.getClass(), "baseExperience", null);
        setField(term16309, term16309.getClass(), "height", null);
        setField(term16309, term16309.getClass(), "isDefault", null);
        setField(term16309, term16309.getClass(), "order", null);
        setField(term16309, term16309.getClass(), "weight", null);
        setField(term16309, term16309.getClass(), "abilities", null);
        setField(term16309, term16309.getClass(), "forms", null);
        setField(term16309, term16309.getClass(), "gameIndices", null);
        setField(term16309, term16309.getClass(), "heldItems", null);
        setField(term16309, term16309.getClass(), "locationAreaEncounters", null);
        setField(term16309, term16309.getClass(), "moves", null);
        setField(term16309, term16309.getClass(), "sprites", null);
        setField(term16309, term16309.getClass(), "species", null);
        setField(term16309, term16309.getClass(), "stats", null);
        setField(term16309, term16309.getClass(), "types", null);
        setField(term16309, term16309.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIsDefault", argTypes, term16309, args);
    }

};


