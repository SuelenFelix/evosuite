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

public class PokemonSprites_setBackDefault_150146485727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20378;

    public PokemonSprites_setBackDefault_150146485727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20378 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites"));
        setField(term20378, term20378.getClass(), "frontDefault", null);
        setField(term20378, term20378.getClass(), "frontShiny", null);
        setField(term20378, term20378.getClass(), "frontFemale", null);
        setField(term20378, term20378.getClass(), "frontShinyFemale", null);
        setField(term20378, term20378.getClass(), "backDefault", null);
        setField(term20378, term20378.getClass(), "backShiny", null);
        setField(term20378, term20378.getClass(), "backFemale", null);
        setField(term20378, term20378.getClass(), "backShinyFemale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBackDefault", argTypes, term20378, args);
    }

};


