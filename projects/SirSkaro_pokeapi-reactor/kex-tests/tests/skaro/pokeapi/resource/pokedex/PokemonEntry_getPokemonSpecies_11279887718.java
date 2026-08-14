package skaro.pokeapi.resource.pokedex;

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
import static skaro.pokeapi.resource.pokedex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PokemonEntry_getPokemonSpecies_11279887718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242;

    public PokemonEntry_getPokemonSpecies_11279887718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term242, term242.getClass(), "entryNumber", null);
        setField(term242, term242.getClass(), "pokemonSpecies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPokemonSpecies", argTypes, term242, args);
    }

};


