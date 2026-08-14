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

public class Pokemon_setLocationAreaEncounters_23693877761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109136;

    public Pokemon_setLocationAreaEncounters_23693877761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109136 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term109136, term109136.getClass(), "id", null);
        setField(term109136, term109136.getClass(), "name", null);
        setField(term109136, term109136.getClass(), "baseExperience", null);
        setField(term109136, term109136.getClass(), "height", null);
        setField(term109136, term109136.getClass(), "isDefault", null);
        setField(term109136, term109136.getClass(), "order", null);
        setField(term109136, term109136.getClass(), "weight", null);
        setField(term109136, term109136.getClass(), "abilities", null);
        setField(term109136, term109136.getClass(), "forms", null);
        setField(term109136, term109136.getClass(), "gameIndices", null);
        setField(term109136, term109136.getClass(), "heldItems", null);
        setField(term109136, term109136.getClass(), "locationAreaEncounters", null);
        setField(term109136, term109136.getClass(), "moves", null);
        setField(term109136, term109136.getClass(), "sprites", null);
        setField(term109136, term109136.getClass(), "species", null);
        setField(term109136, term109136.getClass(), "stats", null);
        setField(term109136, term109136.getClass(), "types", null);
        setField(term109136, term109136.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLocationAreaEncounters", argTypes, term109136, args);
    }

};


