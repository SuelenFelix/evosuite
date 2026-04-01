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

public class AStarSearch_doSquareRoute_42053477212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17474;

    public AStarSearch_doSquareRoute_42053477212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17511 = new ArrayList();
        term17474 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        Object[] term17477 = (Object[]) newArray("[I", 4);
        int[] term17478 = (int[]) newIntArray(7);
        int[] term17486 = (int[]) newIntArray(8);
        int[] term17495 = (int[]) newIntArray(5);
        int[] term17501 = (int[]) newIntArray(9);
        Object term17518 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17474, term17474.getClass(), "maxX", 1483999606);
        setIntField(term17474, term17474.getClass(), "maxY", 1871761182);
        setIntElement(term17478, 0, 233983728);
        setIntElement(term17478, 1, -1650132476);
        setIntElement(term17478, 2, 1719680265);
        setIntElement(term17478, 3, -1890898783);
        setIntElement(term17478, 4, 1357632911);
        setIntElement(term17478, 5, 1768195761);
        setIntElement(term17478, 6, -1382661134);
        setElement(term17477, 0, term17478);
        setIntElement(term17486, 0, -1042022818);
        setIntElement(term17486, 1, 317372051);
        setIntElement(term17486, 2, 892170444);
        setIntElement(term17486, 3, -82417507);
        setIntElement(term17486, 4, -511400358);
        setIntElement(term17486, 5, -742178468);
        setIntElement(term17486, 6, 694989162);
        setIntElement(term17486, 7, -65504209);
        setElement(term17477, 1, term17486);
        setIntElement(term17495, 0, 1745199030);
        setIntElement(term17495, 1, -1440013173);
        setIntElement(term17495, 2, -288126597);
        setIntElement(term17495, 3, -218831961);
        setIntElement(term17495, 4, 826765055);
        setElement(term17477, 2, term17495);
        setIntElement(term17501, 0, 1358117317);
        setIntElement(term17501, 1, 229989439);
        setIntElement(term17501, 2, -1620126913);
        setIntElement(term17501, 3, -1095121979);
        setIntElement(term17501, 4, -1674851914);
        setIntElement(term17501, 5, -1891353352);
        setIntElement(term17501, 6, 113007640);
        setIntElement(term17501, 7, 1782226794);
        setIntElement(term17501, 8, 1115327577);
        setElement(term17477, 3, term17501);
        setField(term17474, term17474.getClass(), "blockMap", term17477);
        setField(term17474, term17474.getClass(), "points", term17511);
        setIntField(term17474, term17474.getClass(), "tx", 840704993);
        setIntField(term17474, term17474.getClass(), "ty", 1297035285);
        setIntField(term17474, term17474.getClass(), "targetDistance", -826239685);
        setIntField(term17518, term17518.getClass(), "x", -845551243);
        setIntField(term17518, term17518.getClass(), "y", 370671198);
        setDoubleField(term17518, term17518.getClass(), "distance", 0.3227335400819148);
        setField(term17474, term17474.getClass(), "targetPoint", term17518);
        setIntField(term17474, term17474.getClass(), "routeIndex", 1426800646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doSquareRoute", argTypes, term17474, args);
    }

};


