package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Tools_coalesce_29198941212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185076;

    public Tools_coalesce_29198941212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185076 = (Object[]) newArray("java.lang.Object", 5);
        Object term185077 = newInstance(Class.forName("java.lang.Object"));
        Object term185078 = newInstance(Class.forName("java.lang.Object"));
        Object term185079 = newInstance(Class.forName("java.lang.Object"));
        Object term185080 = newInstance(Class.forName("java.lang.Object"));
        Object term185081 = newInstance(Class.forName("java.lang.Object"));
        setElement(term185076, 0, term185077);
        setElement(term185076, 1, term185078);
        setElement(term185076, 2, term185079);
        setElement(term185076, 3, term185080);
        setElement(term185076, 4, term185081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Tools");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term185076;
        callMethod(klass, "coalesce", argTypes, null, args);
    }

};


