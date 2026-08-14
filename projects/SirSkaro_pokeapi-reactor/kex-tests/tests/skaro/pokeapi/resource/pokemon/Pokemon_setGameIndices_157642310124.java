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

public class Pokemon_setGameIndices_157642310124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9564;

    public Pokemon_setGameIndices_157642310124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9564 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term9564, term9564.getClass(), "id", null);
        setField(term9564, term9564.getClass(), "name", null);
        setField(term9564, term9564.getClass(), "baseExperience", null);
        setField(term9564, term9564.getClass(), "height", null);
        setField(term9564, term9564.getClass(), "isDefault", null);
        setField(term9564, term9564.getClass(), "order", null);
        setField(term9564, term9564.getClass(), "weight", null);
        setField(term9564, term9564.getClass(), "abilities", null);
        setField(term9564, term9564.getClass(), "forms", null);
        setField(term9564, term9564.getClass(), "gameIndices", null);
        setField(term9564, term9564.getClass(), "heldItems", null);
        setField(term9564, term9564.getClass(), "locationAreaEncounters", null);
        setField(term9564, term9564.getClass(), "moves", null);
        setField(term9564, term9564.getClass(), "sprites", null);
        setField(term9564, term9564.getClass(), "species", null);
        setField(term9564, term9564.getClass(), "stats", null);
        setField(term9564, term9564.getClass(), "types", null);
        setField(term9564, term9564.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGameIndices", argTypes, term9564, args);
    }

};


