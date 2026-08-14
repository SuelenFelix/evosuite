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

public class BoundedCliqueIterator_hasNext_11931276727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340;

    public BoundedCliqueIterator_hasNext_11931276727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term340 = newInstance(Class.forName("org.graph4j.clique.BoundedCliqueIterator"));
        setIntField(term340, term340.getClass(), "minSize", 0);
        setIntField(term340, term340.getClass(), "maxSize", 0);
        setLongField(term340, term340.getClass(), "timeout", 0L);
        setField(term340, term340.getClass(), "currentClique", null);
        setField(term340, term340.getClass(), "bkIterator", null);
        setField(term340, term340.getClass(), "subsetIterator", null);
        setBooleanField(term340, term340.getClass(), "timeExpired", false);
        setField(term340, term340.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.BoundedCliqueIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term340, args);
    }

};


