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

public class PokemonHabitat_getPokemonSpecies_112110013716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382;

    public PokemonHabitat_getPokemonSpecies_112110013716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term382 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonhabitat.PokemonHabitat"));
        setField(term382, term382.getClass(), "id", null);
        setField(term382, term382.getClass(), "name", null);
        setField(term382, term382.getClass(), "names", null);
        setField(term382, term382.getClass(), "pokemonSpecies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonhabitat.PokemonHabitat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPokemonSpecies", argTypes, term382, args);
    }

};


