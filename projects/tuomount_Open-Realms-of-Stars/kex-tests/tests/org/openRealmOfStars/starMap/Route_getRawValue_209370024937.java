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

public class Route_getRawValue_209370024937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156510;

    public Route_getRawValue_209370024937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1156515 = new ArrayList();
        term1156510 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156510, term1156510.getClass(), "startX", 0.6080820676996378);
        setDoubleField(term1156510, term1156510.getClass(), "startY", 0.40695922365872805);
        setDoubleField(term1156510, term1156510.getClass(), "endX", 0.475896687259849);
        setDoubleField(term1156510, term1156510.getClass(), "endY", 0.3999358841601842);
        setField(term1156510, term1156510.getClass(), "nextPoints", term1156515);
        setIntField(term1156510, term1156510.getClass(), "ftlSpeed", 1690570276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRawValue", argTypes, term1156510, args);
    }

};


