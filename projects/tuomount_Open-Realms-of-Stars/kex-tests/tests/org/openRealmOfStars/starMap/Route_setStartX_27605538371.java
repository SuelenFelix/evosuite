package org.openRealmOfStars.starMap;

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
import static org.openRealmOfStars.starMap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class Route_setStartX_27605538371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156845;
     Object term1156851;

    public Route_setStartX_27605538371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1156845 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156845, term1156845.getClass(), "startX", 0.0);
        setDoubleField(term1156845, term1156845.getClass(), "startY", 0.0);
        setDoubleField(term1156845, term1156845.getClass(), "endX", 0.0);
        setDoubleField(term1156845, term1156845.getClass(), "endY", 0.0);
        setField(term1156845, term1156845.getClass(), "nextPoints", null);
        setIntField(term1156845, term1156845.getClass(), "ftlSpeed", 0);
        term1156851 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1156851;
        callMethod(klass, "setStartX", argTypes, term1156845, args);
    }

};


