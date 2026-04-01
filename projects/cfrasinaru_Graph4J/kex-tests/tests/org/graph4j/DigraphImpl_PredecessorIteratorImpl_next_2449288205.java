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

public class DigraphImpl_PredecessorIteratorImpl_next_2449288205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182178;

    public DigraphImpl_PredecessorIteratorImpl_next_2449288205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182178 = newInstance(Class.forName("org.graph4j.DigraphImpl$PredecessorIteratorImpl"));
        setIntField(term182178, term182178.getClass(), "v", 1190885093);
        setIntField(term182178, term182178.getClass(), "vi", 835436856);
        setIntField(term182178, term182178.getClass(), "pos", -533649130);
        setField(term182178, term182178.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl$PredecessorIteratorImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term182178, args);
    }

};


