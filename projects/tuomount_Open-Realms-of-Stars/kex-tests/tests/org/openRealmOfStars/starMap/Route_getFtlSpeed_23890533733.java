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
import java.lang.Object;

public class Route_getFtlSpeed_23890533733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156415;

    public Route_getFtlSpeed_23890533733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1156422 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156422, term1156422.getClass(), "x", 1825276127);
        setIntField(term1156422, term1156422.getClass(), "y", 1725442549);
        ArrayList term1156420 = new ArrayList();
        ((ArrayList) term1156420).add(term1156422);
        term1156415 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156415, term1156415.getClass(), "startX", 0.44216771474321837);
        setDoubleField(term1156415, term1156415.getClass(), "startY", 0.9809266777296007);
        setDoubleField(term1156415, term1156415.getClass(), "endX", 0.21145399417290445);
        setDoubleField(term1156415, term1156415.getClass(), "endY", 0.3206424582885071);
        setField(term1156415, term1156415.getClass(), "nextPoints", term1156420);
        setIntField(term1156415, term1156415.getClass(), "ftlSpeed", 2137488719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFtlSpeed", argTypes, term1156415, args);
    }

};


