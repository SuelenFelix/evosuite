package skaro.pokeapi;

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
import static skaro.pokeapi.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PokeApiConfigurationProperties_setMaxBytesToBuffer_13211815109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138124;
     Object term138126;

    public PokeApiConfigurationProperties_setMaxBytesToBuffer_13211815109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138124 = newInstance(Class.forName("skaro.pokeapi.PokeApiConfigurationProperties"));
        setField(term138124, term138124.getClass(), "baseUri", null);
        setIntField(term138124, term138124.getClass(), "maxBytesToBuffer", 0);
        term138126 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.PokeApiConfigurationProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term138126;
        callMethod(klass, "setMaxBytesToBuffer", argTypes, term138124, args);
    }

};


