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

public class Pokemon_getId_5332020352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1567;

    public Pokemon_getId_5332020352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1567 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.Pokemon"));
        setField(term1567, term1567.getClass(), "id", null);
        setField(term1567, term1567.getClass(), "name", null);
        setField(term1567, term1567.getClass(), "baseExperience", null);
        setField(term1567, term1567.getClass(), "height", null);
        setField(term1567, term1567.getClass(), "isDefault", null);
        setField(term1567, term1567.getClass(), "order", null);
        setField(term1567, term1567.getClass(), "weight", null);
        setField(term1567, term1567.getClass(), "abilities", null);
        setField(term1567, term1567.getClass(), "forms", null);
        setField(term1567, term1567.getClass(), "gameIndices", null);
        setField(term1567, term1567.getClass(), "heldItems", null);
        setField(term1567, term1567.getClass(), "locationAreaEncounters", null);
        setField(term1567, term1567.getClass(), "moves", null);
        setField(term1567, term1567.getClass(), "sprites", null);
        setField(term1567, term1567.getClass(), "species", null);
        setField(term1567, term1567.getClass(), "stats", null);
        setField(term1567, term1567.getClass(), "types", null);
        setField(term1567, term1567.getClass(), "pastTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.Pokemon");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1567, args);
    }

};


