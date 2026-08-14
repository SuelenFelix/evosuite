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

public class Pokemon_getSprites_45472978165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16325;

    public Pokemon_getSprites_45472978165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16325 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term16325, term16325.getClass(), "id", null);
        setField(term16325, term16325.getClass(), "name", null);
        setField(term16325, term16325.getClass(), "baseExperience", null);
        setField(term16325, term16325.getClass(), "height", null);
        setField(term16325, term16325.getClass(), "isDefault", null);
        setField(term16325, term16325.getClass(), "order", null);
        setField(term16325, term16325.getClass(), "weight", null);
        setField(term16325, term16325.getClass(), "abilities", null);
        setField(term16325, term16325.getClass(), "forms", null);
        setField(term16325, term16325.getClass(), "gameIndices", null);
        setField(term16325, term16325.getClass(), "heldItems", null);
        setField(term16325, term16325.getClass(), "locationAreaEncounters", null);
        setField(term16325, term16325.getClass(), "moves", null);
        setField(term16325, term16325.getClass(), "sprites", null);
        setField(term16325, term16325.getClass(), "species", null);
        setField(term16325, term16325.getClass(), "stats", null);
        setField(term16325, term16325.getClass(), "types", null);
        setField(term16325, term16325.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSprites", argTypes, term16325, args);
    }

};


