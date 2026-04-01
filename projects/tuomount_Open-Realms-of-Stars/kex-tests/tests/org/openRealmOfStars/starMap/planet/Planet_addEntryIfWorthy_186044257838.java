package org.openRealmOfStars.starMap.planet;

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
import static org.openRealmOfStars.starMap.planet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Planet_addEntryIfWorthy_186044257838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177558;
     Object term177590;

    public Planet_addEntryIfWorthy_186044257838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177558 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term177559 = (byte[]) newByteArray(16);
        setField(term177558, term177558.getClass(), "value", term177559);
        setByteField(term177558, term177558.getClass(), "coder", (byte) 106);
        setIntField(term177558, term177558.getClass(), "count", -1830340335);
        term177590 = new Integer(439648027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term177558;
        args[1] = "eohWMLzQjb";
        args[2] = term177590;
        callMethod(klass, "addEntryIfWorthy", argTypes, null, args);
    }

};


