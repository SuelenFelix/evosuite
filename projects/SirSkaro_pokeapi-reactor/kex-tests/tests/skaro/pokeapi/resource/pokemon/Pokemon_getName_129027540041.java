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

public class Pokemon_getName_129027540041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109116;

    public Pokemon_getName_129027540041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109116 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term109116, term109116.getClass(), "id", null);
        setField(term109116, term109116.getClass(), "name", null);
        setField(term109116, term109116.getClass(), "baseExperience", null);
        setField(term109116, term109116.getClass(), "height", null);
        setField(term109116, term109116.getClass(), "isDefault", null);
        setField(term109116, term109116.getClass(), "order", null);
        setField(term109116, term109116.getClass(), "weight", null);
        setField(term109116, term109116.getClass(), "abilities", null);
        setField(term109116, term109116.getClass(), "forms", null);
        setField(term109116, term109116.getClass(), "gameIndices", null);
        setField(term109116, term109116.getClass(), "heldItems", null);
        setField(term109116, term109116.getClass(), "locationAreaEncounters", null);
        setField(term109116, term109116.getClass(), "moves", null);
        setField(term109116, term109116.getClass(), "sprites", null);
        setField(term109116, term109116.getClass(), "species", null);
        setField(term109116, term109116.getClass(), "stats", null);
        setField(term109116, term109116.getClass(), "types", null);
        setField(term109116, term109116.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term109116, args);
    }

};


