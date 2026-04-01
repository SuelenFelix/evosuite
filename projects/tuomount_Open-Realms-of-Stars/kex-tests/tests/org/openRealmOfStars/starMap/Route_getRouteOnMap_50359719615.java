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
import java.lang.Integer;

public class Route_getRouteOnMap_50359719615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156177;
     Object term1156199;
     Object term1156201;

    public Route_getRouteOnMap_50359719615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1156184 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156184, term1156184.getClass(), "x", -1176979427);
        setIntField(term1156184, term1156184.getClass(), "y", -1423146817);
        Object term1156187 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156187, term1156187.getClass(), "x", 38630039);
        setIntField(term1156187, term1156187.getClass(), "y", 1612138873);
        Object term1156190 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156190, term1156190.getClass(), "x", 100565046);
        setIntField(term1156190, term1156190.getClass(), "y", 1469903722);
        Object term1156193 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156193, term1156193.getClass(), "x", 1626187777);
        setIntField(term1156193, term1156193.getClass(), "y", 276333788);
        ArrayList term1156182 = new ArrayList();
        ((ArrayList) term1156182).add(term1156184);
        ((ArrayList) term1156182).add(term1156187);
        ((ArrayList) term1156182).add(term1156190);
        ((ArrayList) term1156182).add(term1156193);
        term1156177 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156177, term1156177.getClass(), "startX", 0.060834383944714965);
        setDoubleField(term1156177, term1156177.getClass(), "startY", 0.05455375073513069);
        setDoubleField(term1156177, term1156177.getClass(), "endX", 0.38868894902156725);
        setDoubleField(term1156177, term1156177.getClass(), "endY", 0.4689439946635412);
        setField(term1156177, term1156177.getClass(), "nextPoints", term1156182);
        setIntField(term1156177, term1156177.getClass(), "ftlSpeed", -1417976218);
        term1156199 = new Integer(2109511621);
        term1156201 = new Integer(2142096220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1156199;
        args[1] = term1156201;
        callMethod(klass, "getRouteOnMap", argTypes, term1156177, args);
    }

};


