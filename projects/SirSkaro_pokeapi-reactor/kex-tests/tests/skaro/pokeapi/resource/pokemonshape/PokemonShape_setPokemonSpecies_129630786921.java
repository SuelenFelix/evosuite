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

public class PokemonShape_setPokemonSpecies_129630786921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term634;

    public PokemonShape_setPokemonSpecies_129630786921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term634 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonshape.PokemonShape"));
        setField(term634, term634.getClass(), "id", null);
        setField(term634, term634.getClass(), "name", null);
        setField(term634, term634.getClass(), "awesomeNames", null);
        setField(term634, term634.getClass(), "names", null);
        setField(term634, term634.getClass(), "pokemonSpecies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonshape.PokemonShape");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPokemonSpecies", argTypes, term634, args);
    }

};


