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

public class PokeApiConfigurationProperties_getMaxBytesToBuffer_4339475768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138122;

    public PokeApiConfigurationProperties_getMaxBytesToBuffer_4339475768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138122 = newInstance(Class.forName("skaro.pokeapi.PokeApiConfigurationProperties"));
        setField(term138122, term138122.getClass(), "baseUri", null);
        setIntField(term138122, term138122.getClass(), "maxBytesToBuffer", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.PokeApiConfigurationProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxBytesToBuffer", argTypes, term138122, args);
    }

};


