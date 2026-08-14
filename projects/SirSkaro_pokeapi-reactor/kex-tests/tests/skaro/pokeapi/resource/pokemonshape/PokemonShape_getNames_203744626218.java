package skaro.pokeapi.resource.pokemonshape;

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
import static skaro.pokeapi.resource.pokemonshape.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PokemonShape_getNames_203744626218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term631;

    public PokemonShape_getNames_203744626218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term631 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.PokemonShape"));
        setField(term631, term631.getClass(), "id", null);
        setField(term631, term631.getClass(), "name", null);
        setField(term631, term631.getClass(), "awesomeNames", null);
        setField(term631, term631.getClass(), "names", null);
        setField(term631, term631.getClass(), "pokemonSpecies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonshape.PokemonShape");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term631, args);
    }

};


