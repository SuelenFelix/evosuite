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

public class Route_timeEstimate_816615835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152471;

    public Route_timeEstimate_816615835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1152478 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152478, term1152478.getClass(), "x", -38568636);
        setIntField(term1152478, term1152478.getClass(), "y", -642513098);
        Object term1152481 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1152481, term1152481.getClass(), "x", 527325557);
        setIntField(term1152481, term1152481.getClass(), "y", -639661662);
        ArrayList term1152476 = new ArrayList();
        ((ArrayList) term1152476).add(term1152478);
        ((ArrayList) term1152476).add(term1152481);
        term1152471 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1152471, term1152471.getClass(), "startX", 0.9881417714262862);
        setDoubleField(term1152471, term1152471.getClass(), "startY", 0.7337000438080983);
        setDoubleField(term1152471, term1152471.getClass(), "endX", 0.2877342152446104);
        setDoubleField(term1152471, term1152471.getClass(), "endY", 0.4579502284885265);
        setField(term1152471, term1152471.getClass(), "nextPoints", term1152476);
        setIntField(term1152471, term1152471.getClass(), "ftlSpeed", -1987329603);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "timeEstimate", argTypes, term1152471, args);
    }

};


