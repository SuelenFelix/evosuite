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

public class Pokemon_setName_42960116841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110575;

    public Pokemon_setName_42960116841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110575 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term110575, term110575.getClass(), "id", null);
        setField(term110575, term110575.getClass(), "name", null);
        setField(term110575, term110575.getClass(), "baseExperience", null);
        setField(term110575, term110575.getClass(), "height", null);
        setField(term110575, term110575.getClass(), "isDefault", null);
        setField(term110575, term110575.getClass(), "order", null);
        setField(term110575, term110575.getClass(), "weight", null);
        setField(term110575, term110575.getClass(), "abilities", null);
        setField(term110575, term110575.getClass(), "forms", null);
        setField(term110575, term110575.getClass(), "gameIndices", null);
        setField(term110575, term110575.getClass(), "heldItems", null);
        setField(term110575, term110575.getClass(), "locationAreaEncounters", null);
        setField(term110575, term110575.getClass(), "moves", null);
        setField(term110575, term110575.getClass(), "sprites", null);
        setField(term110575, term110575.getClass(), "species", null);
        setField(term110575, term110575.getClass(), "stats", null);
        setField(term110575, term110575.getClass(), "types", null);
        setField(term110575, term110575.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term110575, args);
    }

};


