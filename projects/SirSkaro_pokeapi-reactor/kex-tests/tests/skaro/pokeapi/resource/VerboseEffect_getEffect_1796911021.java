package skaro.pokeapi.resource;

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
import static skaro.pokeapi.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class VerboseEffect_getEffect_1796911021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134308;

    public VerboseEffect_getEffect_1796911021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134308 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term134333 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term134308, term134308.getClass(), "effect", "nnmrfMdtKQ");
        setField(term134308, term134308.getClass(), "shortEffect", "AEujqLNvQX");
        setField(term134333, term134333.getClass(), "name", "anJKyAssFt");
        setField(term134333, term134333.getClass(), "url", "cwQZOMWtXG");
        setField(term134308, term134308.getClass(), "language", term134333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.VerboseEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffect", argTypes, term134308, args);
    }

};


