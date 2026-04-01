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

public class Route_setFtlSpeed_101666380334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156428;
     Object term1156453;

    public Route_setFtlSpeed_101666380334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1156435 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156435, term1156435.getClass(), "x", 1443897352);
        setIntField(term1156435, term1156435.getClass(), "y", -1256804331);
        Object term1156438 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156438, term1156438.getClass(), "x", -550701710);
        setIntField(term1156438, term1156438.getClass(), "y", -1889576845);
        Object term1156441 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156441, term1156441.getClass(), "x", 423504219);
        setIntField(term1156441, term1156441.getClass(), "y", 824288996);
        Object term1156444 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156444, term1156444.getClass(), "x", 1116137165);
        setIntField(term1156444, term1156444.getClass(), "y", -1273780594);
        Object term1156447 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156447, term1156447.getClass(), "x", -1667695858);
        setIntField(term1156447, term1156447.getClass(), "y", 143691692);
        ArrayList term1156433 = new ArrayList();
        ((ArrayList) term1156433).add(term1156435);
        ((ArrayList) term1156433).add(term1156438);
        ((ArrayList) term1156433).add(term1156441);
        ((ArrayList) term1156433).add(term1156444);
        ((ArrayList) term1156433).add(term1156447);
        term1156428 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156428, term1156428.getClass(), "startX", 0.515007129011865);
        setDoubleField(term1156428, term1156428.getClass(), "startY", 0.6791279697510296);
        setDoubleField(term1156428, term1156428.getClass(), "endX", 0.44610818581404355);
        setDoubleField(term1156428, term1156428.getClass(), "endY", 0.08953548266482225);
        setField(term1156428, term1156428.getClass(), "nextPoints", term1156433);
        setIntField(term1156428, term1156428.getClass(), "ftlSpeed", 1045938844);
        term1156453 = new Integer(873938451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1156453;
        callMethod(klass, "setFtlSpeed", argTypes, term1156428, args);
    }

};


