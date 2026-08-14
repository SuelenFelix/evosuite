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
import java.lang.Object;
import java.lang.Integer;

public class PokemonHeldItemVersion_getVersion_9668940251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356;

    public PokemonHeldItemVersion_getVersion_9668940251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term382 = new Integer(1585847225);
        term356 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        Object term357 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term357, term357.getClass(), "name", "ZiaGIbnzTs");
        setField(term357, term357.getClass(), "url", "tbcdzjIfER");
        setField(term356, term356.getClass(), "version", term357);
        setField(term356, term356.getClass(), "rarity", term382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term356, args);
    }

};


