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

public class Pokemon_setSprites_33642651565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109140;

    public Pokemon_setSprites_33642651565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109140 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term109140, term109140.getClass(), "id", null);
        setField(term109140, term109140.getClass(), "name", null);
        setField(term109140, term109140.getClass(), "baseExperience", null);
        setField(term109140, term109140.getClass(), "height", null);
        setField(term109140, term109140.getClass(), "isDefault", null);
        setField(term109140, term109140.getClass(), "order", null);
        setField(term109140, term109140.getClass(), "weight", null);
        setField(term109140, term109140.getClass(), "abilities", null);
        setField(term109140, term109140.getClass(), "forms", null);
        setField(term109140, term109140.getClass(), "gameIndices", null);
        setField(term109140, term109140.getClass(), "heldItems", null);
        setField(term109140, term109140.getClass(), "locationAreaEncounters", null);
        setField(term109140, term109140.getClass(), "moves", null);
        setField(term109140, term109140.getClass(), "sprites", null);
        setField(term109140, term109140.getClass(), "species", null);
        setField(term109140, term109140.getClass(), "stats", null);
        setField(term109140, term109140.getClass(), "types", null);
        setField(term109140, term109140.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSprites", argTypes, term109140, args);
    }

};


