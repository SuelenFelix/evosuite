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

public class Pokemon_getHeight_73678888910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4154;

    public Pokemon_getHeight_73678888910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4154 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term4154, term4154.getClass(), "id", null);
        setField(term4154, term4154.getClass(), "name", null);
        setField(term4154, term4154.getClass(), "baseExperience", null);
        setField(term4154, term4154.getClass(), "height", null);
        setField(term4154, term4154.getClass(), "isDefault", null);
        setField(term4154, term4154.getClass(), "order", null);
        setField(term4154, term4154.getClass(), "weight", null);
        setField(term4154, term4154.getClass(), "abilities", null);
        setField(term4154, term4154.getClass(), "forms", null);
        setField(term4154, term4154.getClass(), "gameIndices", null);
        setField(term4154, term4154.getClass(), "heldItems", null);
        setField(term4154, term4154.getClass(), "locationAreaEncounters", null);
        setField(term4154, term4154.getClass(), "moves", null);
        setField(term4154, term4154.getClass(), "sprites", null);
        setField(term4154, term4154.getClass(), "species", null);
        setField(term4154, term4154.getClass(), "stats", null);
        setField(term4154, term4154.getClass(), "types", null);
        setField(term4154, term4154.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeight", argTypes, term4154, args);
    }

};


