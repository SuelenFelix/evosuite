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

public class Tools_shuffle_57949640713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185082;

    public Tools_shuffle_57949640713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185082 = (Object[]) newArray("java.lang.Object", 5);
        Object term185083 = newInstance(Class.forName("java.lang.Object"));
        Object term185084 = newInstance(Class.forName("java.lang.Object"));
        Object term185085 = newInstance(Class.forName("java.lang.Object"));
        Object term185086 = newInstance(Class.forName("java.lang.Object"));
        Object term185087 = newInstance(Class.forName("java.lang.Object"));
        setElement(term185082, 0, term185083);
        setElement(term185082, 1, term185084);
        setElement(term185082, 2, term185085);
        setElement(term185082, 3, term185086);
        setElement(term185082, 4, term185087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Tools");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term185082;
        callMethod(klass, "shuffle", argTypes, null, args);
    }

};


