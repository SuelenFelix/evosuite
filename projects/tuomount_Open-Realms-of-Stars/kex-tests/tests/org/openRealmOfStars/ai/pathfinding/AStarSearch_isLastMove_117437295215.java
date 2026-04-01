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

public class AStarSearch_isLastMove_117437295215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17707;

    public AStarSearch_isLastMove_117437295215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17714 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17714, term17714.getClass(), "x", 1286440081);
        setIntField(term17714, term17714.getClass(), "y", -928538452);
        setDoubleField(term17714, term17714.getClass(), "distance", 0.5308350402051779);
        Object term17718 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17718, term17718.getClass(), "x", -1313207353);
        setIntField(term17718, term17718.getClass(), "y", 402612318);
        setDoubleField(term17718, term17718.getClass(), "distance", 0.7154795600170818);
        Object term17722 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17722, term17722.getClass(), "x", -1628481565);
        setIntField(term17722, term17722.getClass(), "y", -217226756);
        setDoubleField(term17722, term17722.getClass(), "distance", 0.6355029654528058);
        Object term17726 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17726, term17726.getClass(), "x", 1608000247);
        setIntField(term17726, term17726.getClass(), "y", 1354560887);
        setDoubleField(term17726, term17726.getClass(), "distance", 0.0022646783892913414);
        Object term17730 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17730, term17730.getClass(), "x", -749474542);
        setIntField(term17730, term17730.getClass(), "y", -47907780);
        setDoubleField(term17730, term17730.getClass(), "distance", 0.36226058076369927);
        ArrayList term17712 = new ArrayList();
        ((ArrayList) term17712).add(term17714);
        ((ArrayList) term17712).add(term17718);
        ((ArrayList) term17712).add(term17722);
        ((ArrayList) term17712).add(term17726);
        ((ArrayList) term17712).add(term17730);
        term17707 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        Object[] term17710 = (Object[]) newArray("[I", 1);
        int[] term17711 = (int[]) newIntArray(0);
        Object term17739 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17707, term17707.getClass(), "maxX", 1422430512);
        setIntField(term17707, term17707.getClass(), "maxY", 1796581482);
        setElement(term17710, 0, term17711);
        setField(term17707, term17707.getClass(), "blockMap", term17710);
        setField(term17707, term17707.getClass(), "points", term17712);
        setIntField(term17707, term17707.getClass(), "tx", 1131462369);
        setIntField(term17707, term17707.getClass(), "ty", -1161206731);
        setIntField(term17707, term17707.getClass(), "targetDistance", -992847709);
        setIntField(term17739, term17739.getClass(), "x", 1125156671);
        setIntField(term17739, term17739.getClass(), "y", 1203107925);
        setDoubleField(term17739, term17739.getClass(), "distance", 0.03699061125289671);
        setField(term17707, term17707.getClass(), "targetPoint", term17739);
        setIntField(term17707, term17707.getClass(), "routeIndex", 1825448944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLastMove", argTypes, term17707, args);
    }

};


