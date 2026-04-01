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

public class Route_getEndX_151239501029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156326;

    public Route_getEndX_151239501029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1156333 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156333, term1156333.getClass(), "x", 764475115);
        setIntField(term1156333, term1156333.getClass(), "y", 808660581);
        Object term1156336 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156336, term1156336.getClass(), "x", 1259850442);
        setIntField(term1156336, term1156336.getClass(), "y", -832766987);
        Object term1156339 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156339, term1156339.getClass(), "x", -1557206001);
        setIntField(term1156339, term1156339.getClass(), "y", -237557020);
        Object term1156342 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156342, term1156342.getClass(), "x", 269002654);
        setIntField(term1156342, term1156342.getClass(), "y", 1400779323);
        Object term1156345 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156345, term1156345.getClass(), "x", 1910222607);
        setIntField(term1156345, term1156345.getClass(), "y", 615956456);
        Object term1156348 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156348, term1156348.getClass(), "x", 314553054);
        setIntField(term1156348, term1156348.getClass(), "y", 1095463644);
        Object term1156351 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156351, term1156351.getClass(), "x", 192694445);
        setIntField(term1156351, term1156351.getClass(), "y", 2122153679);
        ArrayList term1156331 = new ArrayList();
        ((ArrayList) term1156331).add(term1156333);
        ((ArrayList) term1156331).add(term1156336);
        ((ArrayList) term1156331).add(term1156339);
        ((ArrayList) term1156331).add(term1156342);
        ((ArrayList) term1156331).add(term1156345);
        ((ArrayList) term1156331).add(term1156348);
        ((ArrayList) term1156331).add(term1156351);
        term1156326 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156326, term1156326.getClass(), "startX", 0.2030931676384783);
        setDoubleField(term1156326, term1156326.getClass(), "startY", 0.5220991694127869);
        setDoubleField(term1156326, term1156326.getClass(), "endX", 0.7431278279525401);
        setDoubleField(term1156326, term1156326.getClass(), "endY", 0.6468277621896449);
        setField(term1156326, term1156326.getClass(), "nextPoints", term1156331);
        setIntField(term1156326, term1156326.getClass(), "ftlSpeed", 1610442302);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndX", argTypes, term1156326, args);
    }

};


