package refactoring.app.chapter11.replaceExceptionWithPrecheck;

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
import static refactoring.app.chapter11.replaceExceptionWithPrecheck.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ResourcePool_get_16912168393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10;

    public ResourcePool_get_16912168393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10 = newInstance(Class.forName("refactoring.app.chapter11.replaceExceptionWithPrecheck.ResourcePool"));
        setField(term10, term10.getClass(), "available", null);
        setField(term10, term10.getClass(), "allocated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.replaceExceptionWithPrecheck.ResourcePool");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "get", argTypes, term10, args);
    }

};


