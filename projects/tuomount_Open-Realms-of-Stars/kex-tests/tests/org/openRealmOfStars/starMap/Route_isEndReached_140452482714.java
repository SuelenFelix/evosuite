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

public class Route_isEndReached_140452482714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156146;

    public Route_isEndReached_140452482714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1156153 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156153, term1156153.getClass(), "x", -253360744);
        setIntField(term1156153, term1156153.getClass(), "y", -1445241703);
        Object term1156156 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156156, term1156156.getClass(), "x", -1745773890);
        setIntField(term1156156, term1156156.getClass(), "y", 191979822);
        Object term1156159 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156159, term1156159.getClass(), "x", 2100706040);
        setIntField(term1156159, term1156159.getClass(), "y", -1722888447);
        Object term1156162 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156162, term1156162.getClass(), "x", -270582504);
        setIntField(term1156162, term1156162.getClass(), "y", -1309830636);
        Object term1156165 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156165, term1156165.getClass(), "x", -401167341);
        setIntField(term1156165, term1156165.getClass(), "y", 1745923113);
        Object term1156168 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156168, term1156168.getClass(), "x", 1722223669);
        setIntField(term1156168, term1156168.getClass(), "y", 1030946239);
        Object term1156171 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156171, term1156171.getClass(), "x", -585462082);
        setIntField(term1156171, term1156171.getClass(), "y", 1851390341);
        ArrayList term1156151 = new ArrayList();
        ((ArrayList) term1156151).add(term1156153);
        ((ArrayList) term1156151).add(term1156156);
        ((ArrayList) term1156151).add(term1156159);
        ((ArrayList) term1156151).add(term1156162);
        ((ArrayList) term1156151).add(term1156165);
        ((ArrayList) term1156151).add(term1156168);
        ((ArrayList) term1156151).add(term1156171);
        term1156146 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156146, term1156146.getClass(), "startX", 0.027331340622965494);
        setDoubleField(term1156146, term1156146.getClass(), "startY", 0.6384507561235777);
        setDoubleField(term1156146, term1156146.getClass(), "endX", 0.032930209231383456);
        setDoubleField(term1156146, term1156146.getClass(), "endY", 0.8822726192631658);
        setField(term1156146, term1156146.getClass(), "nextPoints", term1156151);
        setIntField(term1156146, term1156146.getClass(), "ftlSpeed", 1990958326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEndReached", argTypes, term1156146, args);
    }

};


