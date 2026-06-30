package com.oreilly.quest.json;

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
import static com.oreilly.quest.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Geometry_toString_12416062873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352;

    public Geometry_toString_12416062873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term352 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        Object term353 = newInstance(Class.forName("com.oreilly.quest.json.Location"));
        setDoubleField(term353, term353.getClass(), "lat", 0.0022646783892913414);
        setDoubleField(term353, term353.getClass(), "lng", 0.36226058076369927);
        setField(term352, term352.getClass(), "location", term353);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.json.Geometry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term352, args);
    }

};


