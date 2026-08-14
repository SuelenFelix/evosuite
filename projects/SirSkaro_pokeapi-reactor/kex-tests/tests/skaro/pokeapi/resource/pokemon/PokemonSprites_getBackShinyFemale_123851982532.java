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

public class PokemonSprites_getBackShinyFemale_123851982532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20383;

    public PokemonSprites_getBackShinyFemale_123851982532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20383 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites"));
        setField(term20383, term20383.getClass(), "frontDefault", null);
        setField(term20383, term20383.getClass(), "frontShiny", null);
        setField(term20383, term20383.getClass(), "frontFemale", null);
        setField(term20383, term20383.getClass(), "frontShinyFemale", null);
        setField(term20383, term20383.getClass(), "backDefault", null);
        setField(term20383, term20383.getClass(), "backShiny", null);
        setField(term20383, term20383.getClass(), "backFemale", null);
        setField(term20383, term20383.getClass(), "backShinyFemale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBackShinyFemale", argTypes, term20383, args);
    }

};


