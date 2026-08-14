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

public class Pokemon_getSpecies_68212753567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16327;

    public Pokemon_getSpecies_68212753567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16327 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term16327, term16327.getClass(), "id", null);
        setField(term16327, term16327.getClass(), "name", null);
        setField(term16327, term16327.getClass(), "baseExperience", null);
        setField(term16327, term16327.getClass(), "height", null);
        setField(term16327, term16327.getClass(), "isDefault", null);
        setField(term16327, term16327.getClass(), "order", null);
        setField(term16327, term16327.getClass(), "weight", null);
        setField(term16327, term16327.getClass(), "abilities", null);
        setField(term16327, term16327.getClass(), "forms", null);
        setField(term16327, term16327.getClass(), "gameIndices", null);
        setField(term16327, term16327.getClass(), "heldItems", null);
        setField(term16327, term16327.getClass(), "locationAreaEncounters", null);
        setField(term16327, term16327.getClass(), "moves", null);
        setField(term16327, term16327.getClass(), "sprites", null);
        setField(term16327, term16327.getClass(), "species", null);
        setField(term16327, term16327.getClass(), "stats", null);
        setField(term16327, term16327.getClass(), "types", null);
        setField(term16327, term16327.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpecies", argTypes, term16327, args);
    }

};


