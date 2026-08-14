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
import java.lang.Integer;
import java.lang.Object;

public class PokemonType_getType_6137645773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1030;

    public PokemonType_getType_6137645773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1031 = new Integer(-602026508);
        term1030 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonType"));
        Object term1033 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1030, term1030.getClass(), "slot", term1031);
        setField(term1033, term1033.getClass(), "name", "cAPeiZHKGJ");
        setField(term1033, term1033.getClass(), "url", "LvJFtLBaxj");
        setField(term1030, term1030.getClass(), "type", term1033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term1030, args);
    }

};


