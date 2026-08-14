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

public class Pokemon_setStats_150196531937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14728;

    public Pokemon_setStats_150196531937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14728 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term14728, term14728.getClass(), "id", null);
        setField(term14728, term14728.getClass(), "name", null);
        setField(term14728, term14728.getClass(), "baseExperience", null);
        setField(term14728, term14728.getClass(), "height", null);
        setField(term14728, term14728.getClass(), "isDefault", null);
        setField(term14728, term14728.getClass(), "order", null);
        setField(term14728, term14728.getClass(), "weight", null);
        setField(term14728, term14728.getClass(), "abilities", null);
        setField(term14728, term14728.getClass(), "forms", null);
        setField(term14728, term14728.getClass(), "gameIndices", null);
        setField(term14728, term14728.getClass(), "heldItems", null);
        setField(term14728, term14728.getClass(), "locationAreaEncounters", null);
        setField(term14728, term14728.getClass(), "moves", null);
        setField(term14728, term14728.getClass(), "sprites", null);
        setField(term14728, term14728.getClass(), "species", null);
        setField(term14728, term14728.getClass(), "stats", null);
        setField(term14728, term14728.getClass(), "types", null);
        setField(term14728, term14728.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setStats", argTypes, term14728, args);
    }

};


