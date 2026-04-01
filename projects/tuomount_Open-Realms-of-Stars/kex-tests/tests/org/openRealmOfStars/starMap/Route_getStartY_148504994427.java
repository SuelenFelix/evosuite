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
import java.util.ArrayList;

public class Route_getStartY_148504994427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156286;

    public Route_getStartY_148504994427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1156291 = new ArrayList();
        term1156286 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156286, term1156286.getClass(), "startX", 0.2885995559163721);
        setDoubleField(term1156286, term1156286.getClass(), "startY", 0.24376380251538943);
        setDoubleField(term1156286, term1156286.getClass(), "endX", 0.1960225801238138);
        setDoubleField(term1156286, term1156286.getClass(), "endY", 0.5148137742678777);
        setField(term1156286, term1156286.getClass(), "nextPoints", term1156291);
        setIntField(term1156286, term1156286.getClass(), "ftlSpeed", 539897981);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartY", argTypes, term1156286, args);
    }

};


