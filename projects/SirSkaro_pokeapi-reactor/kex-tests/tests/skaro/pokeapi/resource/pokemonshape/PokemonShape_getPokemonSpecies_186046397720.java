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

public class PokemonShape_getPokemonSpecies_186046397720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term633;

    public PokemonShape_getPokemonSpecies_186046397720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term633 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.PokemonShape"));
        setField(term633, term633.getClass(), "id", null);
        setField(term633, term633.getClass(), "name", null);
        setField(term633, term633.getClass(), "awesomeNames", null);
        setField(term633, term633.getClass(), "names", null);
        setField(term633, term633.getClass(), "pokemonSpecies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonshape.PokemonShape");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPokemonSpecies", argTypes, term633, args);
    }

};


