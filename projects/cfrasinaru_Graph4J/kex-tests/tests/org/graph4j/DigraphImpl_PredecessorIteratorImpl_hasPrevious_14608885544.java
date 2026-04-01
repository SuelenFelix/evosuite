package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DigraphImpl_PredecessorIteratorImpl_hasPrevious_14608885544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182174;

    public DigraphImpl_PredecessorIteratorImpl_hasPrevious_14608885544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182174 = newInstance(Class.forName("org.graph4j.DigraphImpl$PredecessorIteratorImpl"));
        setIntField(term182174, term182174.getClass(), "v", 605869696);
        setIntField(term182174, term182174.getClass(), "vi", 268522065);
        setIntField(term182174, term182174.getClass(), "pos", 1891880451);
        setField(term182174, term182174.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl$PredecessorIteratorImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasPrevious", argTypes, term182174, args);
    }

};


