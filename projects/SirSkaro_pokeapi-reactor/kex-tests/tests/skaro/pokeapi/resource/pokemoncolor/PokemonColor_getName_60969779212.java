package skaro.pokeapi.resource.pokemoncolor;

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
import static skaro.pokeapi.resource.pokemoncolor.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PokemonColor_getName_60969779212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378;

    public PokemonColor_getName_60969779212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term378 = newInstance(Class.forName("skaro.pokeapi.resource.pokemoncolor.PokemonColor"));
        setField(term378, term378.getClass(), "id", null);
        setField(term378, term378.getClass(), "name", null);
        setField(term378, term378.getClass(), "names", null);
        setField(term378, term378.getClass(), "pokemonSpecies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemoncolor.PokemonColor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term378, args);
    }

};


