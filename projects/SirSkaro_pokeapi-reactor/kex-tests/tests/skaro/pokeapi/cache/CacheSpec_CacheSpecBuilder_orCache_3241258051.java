package skaro.pokeapi.cache;

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
import static skaro.pokeapi.cache.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CacheSpec_CacheSpecBuilder_orCache_3241258051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96;

    public CacheSpec_CacheSpecBuilder_orCache_3241258051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96 = newInstance(Class.forName("skaro.pokeapi.cache.CacheSpec$CacheSpecBuilder"));
        setField(term96, term96.getClass(), "spec", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.cache.CacheSpec$CacheSpecBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Supplier");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "orCache", argTypes, term96, args);
    }

};


