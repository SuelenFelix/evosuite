package org.graph4j.clique;

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
import static org.graph4j.clique.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BoundedCliqueIterator_next_19435006626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335;

    public BoundedCliqueIterator_next_19435006626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term335 = newInstance(Class.forName("org.graph4j.clique.BoundedCliqueIterator"));
        setIntField(term335, term335.getClass(), "minSize", 0);
        setIntField(term335, term335.getClass(), "maxSize", 0);
        setLongField(term335, term335.getClass(), "timeout", 0L);
        setField(term335, term335.getClass(), "currentClique", null);
        setField(term335, term335.getClass(), "bkIterator", null);
        setField(term335, term335.getClass(), "subsetIterator", null);
        setBooleanField(term335, term335.getClass(), "timeExpired", false);
        setField(term335, term335.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.BoundedCliqueIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term335, args);
    }

};


