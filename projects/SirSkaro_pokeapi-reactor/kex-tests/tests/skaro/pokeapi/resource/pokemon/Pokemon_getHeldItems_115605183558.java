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

public class Pokemon_getHeldItems_115605183558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109133;

    public Pokemon_getHeldItems_115605183558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109133 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term109133, term109133.getClass(), "id", null);
        setField(term109133, term109133.getClass(), "name", null);
        setField(term109133, term109133.getClass(), "baseExperience", null);
        setField(term109133, term109133.getClass(), "height", null);
        setField(term109133, term109133.getClass(), "isDefault", null);
        setField(term109133, term109133.getClass(), "order", null);
        setField(term109133, term109133.getClass(), "weight", null);
        setField(term109133, term109133.getClass(), "abilities", null);
        setField(term109133, term109133.getClass(), "forms", null);
        setField(term109133, term109133.getClass(), "gameIndices", null);
        setField(term109133, term109133.getClass(), "heldItems", null);
        setField(term109133, term109133.getClass(), "locationAreaEncounters", null);
        setField(term109133, term109133.getClass(), "moves", null);
        setField(term109133, term109133.getClass(), "sprites", null);
        setField(term109133, term109133.getClass(), "species", null);
        setField(term109133, term109133.getClass(), "stats", null);
        setField(term109133, term109133.getClass(), "types", null);
        setField(term109133, term109133.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeldItems", argTypes, term109133, args);
    }

};


