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
import java.util.ArrayDeque;
import java.util.ArrayList;

public class ResourcePool_get_16912168391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ResourcePool_get_16912168391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term2 = new ArrayDeque();
        ArrayList term6 = new ArrayList();
        term1 = newInstance(Class.forName("refactoring.app.chapter11.replaceExceptionWithPrecheck.ResourcePool"));
        setField(term1, term1.getClass(), "available", term2);
        setField(term1, term1.getClass(), "allocated", term6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.replaceExceptionWithPrecheck.ResourcePool");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "get", argTypes, term1, args);
    }

};


