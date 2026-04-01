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

public class Route_addNewPoint_635475154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152434;
     Object term1152468;

    public Route_addNewPoint_635475154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1152441 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152441, term1152441.getClass(), "x", 328988458);
        setIntField(term1152441, term1152441.getClass(), "y", -1966708755);
        Object term1152444 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152444, term1152444.getClass(), "x", -1716195545);
        setIntField(term1152444, term1152444.getClass(), "y", -545228660);
        Object term1152447 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152447, term1152447.getClass(), "x", -444271672);
        setIntField(term1152447, term1152447.getClass(), "y", -1760182480);
        Object term1152450 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152450, term1152450.getClass(), "x", 1429522836);
        setIntField(term1152450, term1152450.getClass(), "y", 264308286);
        Object term1152453 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152453, term1152453.getClass(), "x", 260024011);
        setIntField(term1152453, term1152453.getClass(), "y", -5655168);
        Object term1152456 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152456, term1152456.getClass(), "x", -1930501030);
        setIntField(term1152456, term1152456.getClass(), "y", -1493455489);
        Object term1152459 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152459, term1152459.getClass(), "x", -1409600532);
        setIntField(term1152459, term1152459.getClass(), "y", 180100290);
        Object term1152462 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152462, term1152462.getClass(), "x", -540467652);
        setIntField(term1152462, term1152462.getClass(), "y", 1924051581);
        ArrayList term1152439 = new ArrayList();
        ((ArrayList) term1152439).add(term1152441);
        ((ArrayList) term1152439).add(term1152444);
        ((ArrayList) term1152439).add(term1152447);
        ((ArrayList) term1152439).add(term1152450);
        ((ArrayList) term1152439).add(term1152453);
        ((ArrayList) term1152439).add(term1152456);
        ((ArrayList) term1152439).add(term1152459);
        ((ArrayList) term1152439).add(term1152462);
        term1152434 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1152434, term1152434.getClass(), "startX", 0.3956991755475209);
        setDoubleField(term1152434, term1152434.getClass(), "startY", 0.6843477900857968);
        setDoubleField(term1152434, term1152434.getClass(), "endX", 0.1676561056681828);
        setDoubleField(term1152434, term1152434.getClass(), "endY", 0.6749140448521683);
        setField(term1152434, term1152434.getClass(), "nextPoints", term1152439);
        setIntField(term1152434, term1152434.getClass(), "ftlSpeed", -172663298);
        term1152468 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152468, term1152468.getClass(), "x", -735493622);
        setIntField(term1152468, term1152468.getClass(), "y", 182671219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[1];
        args[0] = term1152468;
        callMethod(klass, "addNewPoint", argTypes, term1152434, args);
    }

};


