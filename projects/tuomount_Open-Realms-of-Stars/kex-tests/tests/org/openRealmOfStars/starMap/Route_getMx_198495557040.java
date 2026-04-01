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
import java.lang.Integer;

public class Route_getMx_198495557040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156569;
     Object term1156579;

    public Route_getMx_198495557040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1156574 = new ArrayList();
        term1156569 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156569, term1156569.getClass(), "startX", 0.8079395143254551);
        setDoubleField(term1156569, term1156569.getClass(), "startY", 0.8432220434692428);
        setDoubleField(term1156569, term1156569.getClass(), "endX", 0.10735086460638021);
        setDoubleField(term1156569, term1156569.getClass(), "endY", 0.17377837668919804);
        setField(term1156569, term1156569.getClass(), "nextPoints", term1156574);
        setIntField(term1156569, term1156569.getClass(), "ftlSpeed", -920944597);
        term1156579 = new Integer(472004209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1156579;
        callMethod(klass, "getMx", argTypes, term1156569, args);
    }

};


