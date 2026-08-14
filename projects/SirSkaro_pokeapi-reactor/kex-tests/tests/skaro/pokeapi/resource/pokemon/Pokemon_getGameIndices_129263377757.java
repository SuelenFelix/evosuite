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

public class Pokemon_getGameIndices_129263377757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109132;

    public Pokemon_getGameIndices_129263377757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109132 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term109132, term109132.getClass(), "id", null);
        setField(term109132, term109132.getClass(), "name", null);
        setField(term109132, term109132.getClass(), "baseExperience", null);
        setField(term109132, term109132.getClass(), "height", null);
        setField(term109132, term109132.getClass(), "isDefault", null);
        setField(term109132, term109132.getClass(), "order", null);
        setField(term109132, term109132.getClass(), "weight", null);
        setField(term109132, term109132.getClass(), "abilities", null);
        setField(term109132, term109132.getClass(), "forms", null);
        setField(term109132, term109132.getClass(), "gameIndices", null);
        setField(term109132, term109132.getClass(), "heldItems", null);
        setField(term109132, term109132.getClass(), "locationAreaEncounters", null);
        setField(term109132, term109132.getClass(), "moves", null);
        setField(term109132, term109132.getClass(), "sprites", null);
        setField(term109132, term109132.getClass(), "species", null);
        setField(term109132, term109132.getClass(), "stats", null);
        setField(term109132, term109132.getClass(), "types", null);
        setField(term109132, term109132.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameIndices", argTypes, term109132, args);
    }

};


