package org.graph4j.examples;

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
import static org.graph4j.examples.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ShortestPathExample_createUserModel_3330231268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term957;

    public ShortestPathExample_createUserModel_3330231268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term957 = newInstance(Class.forName("org.graph4j.examples.ShortestPathExample"));
        setIntField(term957, term957.getClass(), "numLocations", 0);
        setField(term957, term957.getClass(), "locations", null);
        setField(term957, term957.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.examples.ShortestPathExample");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createUserModel", argTypes, term957, args);
    }

};


