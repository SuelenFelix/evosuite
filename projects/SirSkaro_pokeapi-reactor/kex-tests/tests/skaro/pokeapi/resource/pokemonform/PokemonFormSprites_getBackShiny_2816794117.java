package skaro.pokeapi.resource.pokemonform;

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
import static skaro.pokeapi.resource.pokemonform.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PokemonFormSprites_getBackShiny_2816794117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term601;

    public PokemonFormSprites_getBackShiny_2816794117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term601 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites"));
        setField(term601, term601.getClass(), "frontDefault", "OclPbYPkcH");
        setField(term601, term601.getClass(), "frontShiny", "IoAlmYsBwc");
        setField(term601, term601.getClass(), "backDefault", "TEParAifyi");
        setField(term601, term601.getClass(), "backShiny", "OWDIEULEFu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBackShiny", argTypes, term601, args);
    }

};


