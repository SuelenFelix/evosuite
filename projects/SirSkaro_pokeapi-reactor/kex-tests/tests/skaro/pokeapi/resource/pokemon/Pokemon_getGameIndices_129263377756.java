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

public class Pokemon_getGameIndices_129263377756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110590;

    public Pokemon_getGameIndices_129263377756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110590 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term110590, term110590.getClass(), "id", null);
        setField(term110590, term110590.getClass(), "name", null);
        setField(term110590, term110590.getClass(), "baseExperience", null);
        setField(term110590, term110590.getClass(), "height", null);
        setField(term110590, term110590.getClass(), "isDefault", null);
        setField(term110590, term110590.getClass(), "order", null);
        setField(term110590, term110590.getClass(), "weight", null);
        setField(term110590, term110590.getClass(), "abilities", null);
        setField(term110590, term110590.getClass(), "forms", null);
        setField(term110590, term110590.getClass(), "gameIndices", null);
        setField(term110590, term110590.getClass(), "heldItems", null);
        setField(term110590, term110590.getClass(), "locationAreaEncounters", null);
        setField(term110590, term110590.getClass(), "moves", null);
        setField(term110590, term110590.getClass(), "sprites", null);
        setField(term110590, term110590.getClass(), "species", null);
        setField(term110590, term110590.getClass(), "stats", null);
        setField(term110590, term110590.getClass(), "types", null);
        setField(term110590, term110590.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameIndices", argTypes, term110590, args);
    }

};


