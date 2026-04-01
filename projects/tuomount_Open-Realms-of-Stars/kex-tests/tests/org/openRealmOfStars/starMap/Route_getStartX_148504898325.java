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

public class Route_getStartX_148504898325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156261;

    public Route_getStartX_148504898325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1156266 = new ArrayList();
        term1156261 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156261, term1156261.getClass(), "startX", 0.22718531728979197);
        setDoubleField(term1156261, term1156261.getClass(), "startY", 0.945082869732553);
        setDoubleField(term1156261, term1156261.getClass(), "endX", 0.03123965072102497);
        setDoubleField(term1156261, term1156261.getClass(), "endY", 0.026533684659376444);
        setField(term1156261, term1156261.getClass(), "nextPoints", term1156266);
        setIntField(term1156261, term1156261.getClass(), "ftlSpeed", 2038625306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartX", argTypes, term1156261, args);
    }

};


