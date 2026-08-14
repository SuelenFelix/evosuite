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

public class Pokemon_getName_12902754005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2415;

    public Pokemon_getName_12902754005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2415 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term2415, term2415.getClass(), "id", null);
        setField(term2415, term2415.getClass(), "name", null);
        setField(term2415, term2415.getClass(), "baseExperience", null);
        setField(term2415, term2415.getClass(), "height", null);
        setField(term2415, term2415.getClass(), "isDefault", null);
        setField(term2415, term2415.getClass(), "order", null);
        setField(term2415, term2415.getClass(), "weight", null);
        setField(term2415, term2415.getClass(), "abilities", null);
        setField(term2415, term2415.getClass(), "forms", null);
        setField(term2415, term2415.getClass(), "gameIndices", null);
        setField(term2415, term2415.getClass(), "heldItems", null);
        setField(term2415, term2415.getClass(), "locationAreaEncounters", null);
        setField(term2415, term2415.getClass(), "moves", null);
        setField(term2415, term2415.getClass(), "sprites", null);
        setField(term2415, term2415.getClass(), "species", null);
        setField(term2415, term2415.getClass(), "stats", null);
        setField(term2415, term2415.getClass(), "types", null);
        setField(term2415, term2415.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term2415, args);
    }

};


