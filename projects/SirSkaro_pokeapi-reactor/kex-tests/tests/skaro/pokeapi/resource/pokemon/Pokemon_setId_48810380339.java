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

public class Pokemon_setId_48810380339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110573;

    public Pokemon_setId_48810380339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110573 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term110573, term110573.getClass(), "id", null);
        setField(term110573, term110573.getClass(), "name", null);
        setField(term110573, term110573.getClass(), "baseExperience", null);
        setField(term110573, term110573.getClass(), "height", null);
        setField(term110573, term110573.getClass(), "isDefault", null);
        setField(term110573, term110573.getClass(), "order", null);
        setField(term110573, term110573.getClass(), "weight", null);
        setField(term110573, term110573.getClass(), "abilities", null);
        setField(term110573, term110573.getClass(), "forms", null);
        setField(term110573, term110573.getClass(), "gameIndices", null);
        setField(term110573, term110573.getClass(), "heldItems", null);
        setField(term110573, term110573.getClass(), "locationAreaEncounters", null);
        setField(term110573, term110573.getClass(), "moves", null);
        setField(term110573, term110573.getClass(), "sprites", null);
        setField(term110573, term110573.getClass(), "species", null);
        setField(term110573, term110573.getClass(), "stats", null);
        setField(term110573, term110573.getClass(), "types", null);
        setField(term110573, term110573.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term110573, args);
    }

};


