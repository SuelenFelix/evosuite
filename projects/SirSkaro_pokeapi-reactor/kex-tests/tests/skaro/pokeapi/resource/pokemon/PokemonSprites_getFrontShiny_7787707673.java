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

public class PokemonSprites_getFrontShiny_7787707673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17737;

    public PokemonSprites_getFrontShiny_7787707673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17737 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites"));
        setField(term17737, term17737.getClass(), "frontDefault", "NZwUsJxDLI");
        setField(term17737, term17737.getClass(), "frontShiny", "wlusYBOfXW");
        setField(term17737, term17737.getClass(), "frontFemale", "HEWWLhfKIa");
        setField(term17737, term17737.getClass(), "frontShinyFemale", "mJJkYzNPob");
        setField(term17737, term17737.getClass(), "backDefault", "mRDwekkZQg");
        setField(term17737, term17737.getClass(), "backShiny", "RIGChgqpTI");
        setField(term17737, term17737.getClass(), "backFemale", "YCrgXnhgoK");
        setField(term17737, term17737.getClass(), "backShinyFemale", "nQodIeQekM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonSprites");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrontShiny", argTypes, term17737, args);
    }

};


