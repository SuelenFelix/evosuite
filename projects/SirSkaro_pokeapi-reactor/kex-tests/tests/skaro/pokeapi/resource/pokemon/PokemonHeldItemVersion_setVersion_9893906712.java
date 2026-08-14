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

public class PokemonHeldItemVersion_setVersion_9893906712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404;
     Object term432;

    public PokemonHeldItemVersion_setVersion_9893906712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term430 = new Integer(597278769);
        term404 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion"));
        Object term405 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term405, term405.getClass(), "name", "HyxfbSQYBe");
        setField(term405, term405.getClass(), "url", "pCTimMblYc");
        setField(term404, term404.getClass(), "version", term405);
        setField(term404, term404.getClass(), "rarity", term430);
        term432 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term432, term432.getClass(), "name", "xOEqzGAmDU");
        setField(term432, term432.getClass(), "url", "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonHeldItemVersion");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term432;
        callMethod(klass, "setVersion", argTypes, term404, args);
    }

};


