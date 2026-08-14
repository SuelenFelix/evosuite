package org.example.toylanguage.context.definition;

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
import static org.example.toylanguage.context.definition.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class ClassDetails_getName_3458398801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2499;

    public ClassDetails_getName_3458398801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2512 = new ArrayList();
        ((ArrayList) term2512).add("WENnGcBSTd");
        ((ArrayList) term2512).add("juEYcOCxLW");
        ((ArrayList) term2512).add("YsWgGEhEmC");
        ((ArrayList) term2512).add("PBcepqkBBV");
        ((ArrayList) term2512).add("mukHRKZmND");
        term2499 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDetails"));
        setField(term2499, term2499.getClass(), "name", "riyKkxMvWm");
        setField(term2499, term2499.getClass(), "properties", term2512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.ClassDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term2499, args);
    }

};


