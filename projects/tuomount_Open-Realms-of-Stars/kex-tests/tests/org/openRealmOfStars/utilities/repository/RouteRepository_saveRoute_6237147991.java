package org.openRealmOfStars.utilities.repository;

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
import static org.openRealmOfStars.utilities.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class RouteRepository_saveRoute_6237147991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term17;

    public RouteRepository_saveRoute_6237147991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.openRealmOfStars.utilities.repository.RouteRepository"));
        term2 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term4 = (byte[]) newByteArray(5);
        byte[] term10 = (byte[]) newByteArray(4);
        Object term16 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term2, term2.getClass(), "written", 568599855);
        setByteElement(term4, 0, (byte) 47);
        setByteElement(term4, 1, (byte) 48);
        setByteElement(term4, 2, (byte) 89);
        setByteElement(term4, 3, (byte) 75);
        setByteElement(term4, 4, (byte) 18);
        setField(term2, term2.getClass(), "bytearr", term4);
        setByteElement(term10, 0, (byte) -58);
        setByteElement(term10, 1, (byte) -29);
        setByteElement(term10, 2, (byte) -54);
        setByteElement(term10, 3, (byte) -10);
        setField(term2, term2.getClass(), "writeBuffer", term10);
        setField(term2, term2.getClass(), "out", null);
        setBooleanField(term2, term2.getClass(), "closed", false);
        setField(term2, term2.getClass(), "closeLock", term16);
        Object term24 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term24, term24.getClass(), "x", 1162663216);
        setIntField(term24, term24.getClass(), "y", 1484323161);
        Object term27 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term27, term27.getClass(), "x", -1922583790);
        setIntField(term27, term27.getClass(), "y", -616727354);
        Object term30 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term30, term30.getClass(), "x", -2038273078);
        setIntField(term30, term30.getClass(), "y", 1227103734);
        ArrayList term22 = new ArrayList();
        ((ArrayList) term22).add(term24);
        ((ArrayList) term22).add(term27);
        ((ArrayList) term22).add(term30);
        term17 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term17, term17.getClass(), "startX", 0.13238746331190498);
        setDoubleField(term17, term17.getClass(), "startY", 0.3455959125047594);
        setDoubleField(term17, term17.getClass(), "endX", 0.5523635872663106);
        setDoubleField(term17, term17.getClass(), "endY", 0.544608645520025);
        setField(term17, term17.getClass(), "nextPoints", term22);
        setIntField(term17, term17.getClass(), "ftlSpeed", 1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.repository.RouteRepository");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.Route");
        Object[] args = new Object[2];
        args[0] = term2;
        args[1] = term17;
        callMethod(klass, "saveRoute", argTypes, term1, args);
    }

};


