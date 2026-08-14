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

public class VerboseEffect_getLanguage_12409602535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134712;

    public VerboseEffect_getLanguage_12409602535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134712 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term134737 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term134712, term134712.getClass(), "effect", "AiZmxTqxrN");
        setField(term134712, term134712.getClass(), "shortEffect", "fXyBxFqYQh");
        setField(term134737, term134737.getClass(), "name", "aqpzWpbqQp");
        setField(term134737, term134737.getClass(), "url", "VcwRPcENvG");
        setField(term134712, term134712.getClass(), "language", term134737);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.VerboseEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLanguage", argTypes, term134712, args);
    }

};


