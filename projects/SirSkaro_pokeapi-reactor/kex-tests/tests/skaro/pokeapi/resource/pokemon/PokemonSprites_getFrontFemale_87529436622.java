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

public class PokemonSprites_getFrontFemale_87529436622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20373;

    public PokemonSprites_getFrontFemale_87529436622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20373 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites"));
        setField(term20373, term20373.getClass(), "frontDefault", null);
        setField(term20373, term20373.getClass(), "frontShiny", null);
        setField(term20373, term20373.getClass(), "frontFemale", null);
        setField(term20373, term20373.getClass(), "frontShinyFemale", null);
        setField(term20373, term20373.getClass(), "backDefault", null);
        setField(term20373, term20373.getClass(), "backShiny", null);
        setField(term20373, term20373.getClass(), "backFemale", null);
        setField(term20373, term20373.getClass(), "backShinyFemale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrontFemale", argTypes, term20373, args);
    }

};


