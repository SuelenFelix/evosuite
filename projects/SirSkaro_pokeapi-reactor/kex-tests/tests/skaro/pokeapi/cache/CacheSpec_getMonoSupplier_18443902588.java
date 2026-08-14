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

public class CacheSpec_getMonoSupplier_18443902588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94;

    public CacheSpec_getMonoSupplier_18443902588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94 = newInstance(Class.forName("skaro.pokeapi.cache.CacheSpec"));
        setField(term94, term94.getClass(), "key", null);
        setField(term94, term94.getClass(), "type", null);
        setField(term94, term94.getClass(), "monoSupplier", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.cache.CacheSpec");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMonoSupplier", argTypes, term94, args);
    }

};


