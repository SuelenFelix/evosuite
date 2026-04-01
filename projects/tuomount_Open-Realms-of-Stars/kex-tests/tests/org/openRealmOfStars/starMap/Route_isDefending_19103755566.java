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

public class Route_isDefending_19103755566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152487;

    public Route_isDefending_19103755566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1152494 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152494, term1152494.getClass(), "x", -1073758626);
        setIntField(term1152494, term1152494.getClass(), "y", 1838320872);
        Object term1152497 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152497, term1152497.getClass(), "x", 1908869168);
        setIntField(term1152497, term1152497.getClass(), "y", 1931627296);
        Object term1152500 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152500, term1152500.getClass(), "x", -1493715409);
        setIntField(term1152500, term1152500.getClass(), "y", 561880718);
        Object term1152503 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152503, term1152503.getClass(), "x", 1102469777);
        setIntField(term1152503, term1152503.getClass(), "y", 1933887490);
        Object term1152506 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152506, term1152506.getClass(), "x", -1609729805);
        setIntField(term1152506, term1152506.getClass(), "y", 1706377210);
        Object term1152509 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152509, term1152509.getClass(), "x", 515856304);
        setIntField(term1152509, term1152509.getClass(), "y", 1372055353);
        Object term1152512 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152512, term1152512.getClass(), "x", 1445031619);
        setIntField(term1152512, term1152512.getClass(), "y", -224071434);
        ArrayList term1152492 = new ArrayList();
        ((ArrayList) term1152492).add(term1152494);
        ((ArrayList) term1152492).add(term1152497);
        ((ArrayList) term1152492).add(term1152500);
        ((ArrayList) term1152492).add(term1152503);
        ((ArrayList) term1152492).add(term1152506);
        ((ArrayList) term1152492).add(term1152509);
        ((ArrayList) term1152492).add(term1152512);
        term1152487 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1152487, term1152487.getClass(), "startX", 0.35525650405457);
        setDoubleField(term1152487, term1152487.getClass(), "startY", 0.8474877838604428);
        setDoubleField(term1152487, term1152487.getClass(), "endX", 0.8936973138508374);
        setDoubleField(term1152487, term1152487.getClass(), "endY", 0.7373458011239485);
        setField(term1152487, term1152487.getClass(), "nextPoints", term1152492);
        setIntField(term1152487, term1152487.getClass(), "ftlSpeed", 2038422737);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDefending", argTypes, term1152487, args);
    }

};


