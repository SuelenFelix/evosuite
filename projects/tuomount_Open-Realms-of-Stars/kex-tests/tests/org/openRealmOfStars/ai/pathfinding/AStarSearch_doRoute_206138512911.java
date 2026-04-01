package org.openRealmOfStars.ai.pathfinding;

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
import static org.openRealmOfStars.ai.pathfinding.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class AStarSearch_doRoute_206138512911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17351;

    public AStarSearch_doRoute_206138512911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17404 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17404, term17404.getClass(), "x", -1016478729);
        setIntField(term17404, term17404.getClass(), "y", -206889003);
        setDoubleField(term17404, term17404.getClass(), "distance", 0.8566567697571895);
        Object term17408 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17408, term17408.getClass(), "x", 638046409);
        setIntField(term17408, term17408.getClass(), "y", 427274898);
        setDoubleField(term17408, term17408.getClass(), "distance", 0.9203805380592256);
        Object term17412 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17412, term17412.getClass(), "x", -1654552020);
        setIntField(term17412, term17412.getClass(), "y", -1049546692);
        setDoubleField(term17412, term17412.getClass(), "distance", 0.5804948995371725);
        Object term17416 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17416, term17416.getClass(), "x", 1397781598);
        setIntField(term17416, term17416.getClass(), "y", -44720365);
        setDoubleField(term17416, term17416.getClass(), "distance", 0.20737514139742264);
        Object term17420 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17420, term17420.getClass(), "x", 1963632911);
        setIntField(term17420, term17420.getClass(), "y", -1100497683);
        setDoubleField(term17420, term17420.getClass(), "distance", 0.7919370314903882);
        ArrayList term17402 = new ArrayList();
        ((ArrayList) term17402).add(term17404);
        ((ArrayList) term17402).add(term17408);
        ((ArrayList) term17402).add(term17412);
        ((ArrayList) term17402).add(term17416);
        ((ArrayList) term17402).add(term17420);
        term17351 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        Object[] term17354 = (Object[]) newArray("[I", 7);
        int[] term17355 = (int[]) newIntArray(7);
        int[] term17363 = (int[]) newIntArray(9);
        int[] term17373 = (int[]) newIntArray(2);
        int[] term17376 = (int[]) newIntArray(3);
        int[] term17380 = (int[]) newIntArray(9);
        int[] term17390 = (int[]) newIntArray(5);
        int[] term17396 = (int[]) newIntArray(5);
        Object term17429 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17351, term17351.getClass(), "maxX", 698633875);
        setIntField(term17351, term17351.getClass(), "maxY", 548468113);
        setIntElement(term17355, 0, 1701819905);
        setIntElement(term17355, 1, 1721418943);
        setIntElement(term17355, 2, -111082612);
        setIntElement(term17355, 3, 1253334988);
        setIntElement(term17355, 4, 1086709736);
        setIntElement(term17355, 5, -1606698075);
        setIntElement(term17355, 6, 90996421);
        setElement(term17354, 0, term17355);
        setIntElement(term17363, 0, -1805802783);
        setIntElement(term17363, 1, -529831900);
        setIntElement(term17363, 2, 1574493440);
        setIntElement(term17363, 3, 1854694585);
        setIntElement(term17363, 4, -1260562836);
        setIntElement(term17363, 5, 694100722);
        setIntElement(term17363, 6, -680529431);
        setIntElement(term17363, 7, 212698793);
        setIntElement(term17363, 8, 1169519385);
        setElement(term17354, 1, term17363);
        setIntElement(term17373, 0, 1846078344);
        setIntElement(term17373, 1, 1692543802);
        setElement(term17354, 2, term17373);
        setIntElement(term17376, 0, 376341151);
        setIntElement(term17376, 1, -1607267243);
        setIntElement(term17376, 2, 1641377218);
        setElement(term17354, 3, term17376);
        setIntElement(term17380, 0, 1235375204);
        setIntElement(term17380, 1, 258334639);
        setIntElement(term17380, 2, 1432187207);
        setIntElement(term17380, 3, -91068927);
        setIntElement(term17380, 4, 680714112);
        setIntElement(term17380, 5, 385297023);
        setIntElement(term17380, 6, -134092543);
        setIntElement(term17380, 7, -1703642288);
        setIntElement(term17380, 8, 2075139747);
        setElement(term17354, 4, term17380);
        setIntElement(term17390, 0, 2092881418);
        setIntElement(term17390, 1, 1732410866);
        setIntElement(term17390, 2, 1084102599);
        setIntElement(term17390, 3, -1743503755);
        setIntElement(term17390, 4, 1641342112);
        setElement(term17354, 5, term17390);
        setIntElement(term17396, 0, -1551790945);
        setIntElement(term17396, 1, 2039538484);
        setIntElement(term17396, 2, 1235736068);
        setIntElement(term17396, 3, 329424176);
        setIntElement(term17396, 4, -1897199214);
        setElement(term17354, 6, term17396);
        setField(term17351, term17351.getClass(), "blockMap", term17354);
        setField(term17351, term17351.getClass(), "points", term17402);
        setIntField(term17351, term17351.getClass(), "tx", 155423433);
        setIntField(term17351, term17351.getClass(), "ty", -815471632);
        setIntField(term17351, term17351.getClass(), "targetDistance", -1469668708);
        setIntField(term17429, term17429.getClass(), "x", 1796950482);
        setIntField(term17429, term17429.getClass(), "y", -945759470);
        setDoubleField(term17429, term17429.getClass(), "distance", 0.2109867221632754);
        setField(term17351, term17351.getClass(), "targetPoint", term17429);
        setIntField(term17351, term17351.getClass(), "routeIndex", 657342039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doRoute", argTypes, term17351, args);
    }

};


