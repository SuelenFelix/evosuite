package top.gcszhn.movie.service;

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
import static top.gcszhn.movie.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AutoCacheInputStream_read_20046940736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175;

    public AutoCacheInputStream_read_20046940736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175 = newInstance(Class.forName("top.gcszhn.movie.service.AutoCacheInputStream"));
        setField(term175, term175.getClass(), "fos", null);
        setField(term175, term175.getClass(), "in", null);
        setBooleanField(term175, term175.getClass(), "closed", false);
        setField(term175, term175.getClass(), "runWhenClosed", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("top.gcszhn.movie.service.AutoCacheInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "read", argTypes, term175, args);
    }

};


