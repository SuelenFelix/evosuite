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

public class DigraphImpl_PredecessorIteratorImpl_hasNext_3748213503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182170;

    public DigraphImpl_PredecessorIteratorImpl_hasNext_3748213503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182170 = newInstance(Class.forName("org.graph4j.DigraphImpl$PredecessorIteratorImpl"));
        setIntField(term182170, term182170.getClass(), "v", 2053501227);
        setIntField(term182170, term182170.getClass(), "vi", -986722649);
        setIntField(term182170, term182170.getClass(), "pos", 1205324221);
        setField(term182170, term182170.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl$PredecessorIteratorImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term182170, args);
    }

};


