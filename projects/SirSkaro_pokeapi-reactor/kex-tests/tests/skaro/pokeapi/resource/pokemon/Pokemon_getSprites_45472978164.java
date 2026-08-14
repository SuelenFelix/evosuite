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

public class Pokemon_getSprites_45472978164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109139;

    public Pokemon_getSprites_45472978164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109139 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term109139, term109139.getClass(), "id", null);
        setField(term109139, term109139.getClass(), "name", null);
        setField(term109139, term109139.getClass(), "baseExperience", null);
        setField(term109139, term109139.getClass(), "height", null);
        setField(term109139, term109139.getClass(), "isDefault", null);
        setField(term109139, term109139.getClass(), "order", null);
        setField(term109139, term109139.getClass(), "weight", null);
        setField(term109139, term109139.getClass(), "abilities", null);
        setField(term109139, term109139.getClass(), "forms", null);
        setField(term109139, term109139.getClass(), "gameIndices", null);
        setField(term109139, term109139.getClass(), "heldItems", null);
        setField(term109139, term109139.getClass(), "locationAreaEncounters", null);
        setField(term109139, term109139.getClass(), "moves", null);
        setField(term109139, term109139.getClass(), "sprites", null);
        setField(term109139, term109139.getClass(), "species", null);
        setField(term109139, term109139.getClass(), "stats", null);
        setField(term109139, term109139.getClass(), "types", null);
        setField(term109139, term109139.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSprites", argTypes, term109139, args);
    }

};


