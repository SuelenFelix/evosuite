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

public class Pokemon_getOrder_62799658848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110582;

    public Pokemon_getOrder_62799658848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110582 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term110582, term110582.getClass(), "id", null);
        setField(term110582, term110582.getClass(), "name", null);
        setField(term110582, term110582.getClass(), "baseExperience", null);
        setField(term110582, term110582.getClass(), "height", null);
        setField(term110582, term110582.getClass(), "isDefault", null);
        setField(term110582, term110582.getClass(), "order", null);
        setField(term110582, term110582.getClass(), "weight", null);
        setField(term110582, term110582.getClass(), "abilities", null);
        setField(term110582, term110582.getClass(), "forms", null);
        setField(term110582, term110582.getClass(), "gameIndices", null);
        setField(term110582, term110582.getClass(), "heldItems", null);
        setField(term110582, term110582.getClass(), "locationAreaEncounters", null);
        setField(term110582, term110582.getClass(), "moves", null);
        setField(term110582, term110582.getClass(), "sprites", null);
        setField(term110582, term110582.getClass(), "species", null);
        setField(term110582, term110582.getClass(), "stats", null);
        setField(term110582, term110582.getClass(), "types", null);
        setField(term110582, term110582.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrder", argTypes, term110582, args);
    }

};


