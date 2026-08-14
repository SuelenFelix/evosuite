package skaro.pokeapi.resource.pokemonhabitat;

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
import static skaro.pokeapi.resource.pokemonhabitat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PokemonHabitat_setPokemonSpecies_203567170917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383;

    public PokemonHabitat_setPokemonSpecies_203567170917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term383 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonhabitat.PokemonHabitat"));
        setField(term383, term383.getClass(), "id", null);
        setField(term383, term383.getClass(), "name", null);
        setField(term383, term383.getClass(), "names", null);
        setField(term383, term383.getClass(), "pokemonSpecies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonhabitat.PokemonHabitat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPokemonSpecies", argTypes, term383, args);
    }

};


