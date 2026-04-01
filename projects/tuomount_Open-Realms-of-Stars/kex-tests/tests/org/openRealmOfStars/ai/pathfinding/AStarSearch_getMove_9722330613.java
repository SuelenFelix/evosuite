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

public class AStarSearch_getMove_9722330613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17552;

    public AStarSearch_getMove_9722330613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17579 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17579, term17579.getClass(), "x", 1217804703);
        setIntField(term17579, term17579.getClass(), "y", -1981494102);
        setDoubleField(term17579, term17579.getClass(), "distance", 0.43337207054070237);
        Object term17583 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17583, term17583.getClass(), "x", -2064148945);
        setIntField(term17583, term17583.getClass(), "y", 494400151);
        setDoubleField(term17583, term17583.getClass(), "distance", 0.13246999699526574);
        Object term17587 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17587, term17587.getClass(), "x", 1588058685);
        setIntField(term17587, term17587.getClass(), "y", 1677707412);
        setDoubleField(term17587, term17587.getClass(), "distance", 0.9126850255993704);
        Object term17591 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17591, term17591.getClass(), "x", -297367861);
        setIntField(term17591, term17591.getClass(), "y", -1133541490);
        setDoubleField(term17591, term17591.getClass(), "distance", 0.11179067076100713);
        Object term17595 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17595, term17595.getClass(), "x", 942412391);
        setIntField(term17595, term17595.getClass(), "y", 751596480);
        setDoubleField(term17595, term17595.getClass(), "distance", 0.5306473989087822);
        ArrayList term17577 = new ArrayList();
        ((ArrayList) term17577).add(term17579);
        ((ArrayList) term17577).add(term17583);
        ((ArrayList) term17577).add(term17587);
        ((ArrayList) term17577).add(term17591);
        ((ArrayList) term17577).add(term17595);
        term17552 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        Object[] term17555 = (Object[]) newArray("[I", 4);
        int[] term17556 = (int[]) newIntArray(4);
        int[] term17561 = (int[]) newIntArray(9);
        int[] term17571 = (int[]) newIntArray(3);
        int[] term17575 = (int[]) newIntArray(1);
        Object term17604 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17552, term17552.getClass(), "maxX", 954234820);
        setIntField(term17552, term17552.getClass(), "maxY", 1047346538);
        setIntElement(term17556, 0, 728436340);
        setIntElement(term17556, 1, 1841731593);
        setIntElement(term17556, 2, -1854929057);
        setIntElement(term17556, 3, 1703814701);
        setElement(term17555, 0, term17556);
        setIntElement(term17561, 0, 1370246522);
        setIntElement(term17561, 1, -574611924);
        setIntElement(term17561, 2, 512521742);
        setIntElement(term17561, 3, 1291000976);
        setIntElement(term17561, 4, 1143522832);
        setIntElement(term17561, 5, 40965975);
        setIntElement(term17561, 6, -194718582);
        setIntElement(term17561, 7, 42982854);
        setIntElement(term17561, 8, -1129506480);
        setElement(term17555, 1, term17561);
        setIntElement(term17571, 0, 301438568);
        setIntElement(term17571, 1, -1667908453);
        setIntElement(term17571, 2, 315910438);
        setElement(term17555, 2, term17571);
        setIntElement(term17575, 0, -1673157821);
        setElement(term17555, 3, term17575);
        setField(term17552, term17552.getClass(), "blockMap", term17555);
        setField(term17552, term17552.getClass(), "points", term17577);
        setIntField(term17552, term17552.getClass(), "tx", 1971485144);
        setIntField(term17552, term17552.getClass(), "ty", 2059603512);
        setIntField(term17552, term17552.getClass(), "targetDistance", -1308902065);
        setIntField(term17604, term17604.getClass(), "x", 605255795);
        setIntField(term17604, term17604.getClass(), "y", 1743438307);
        setDoubleField(term17604, term17604.getClass(), "distance", 0.022483645678509023);
        setField(term17552, term17552.getClass(), "targetPoint", term17604);
        setIntField(term17552, term17552.getClass(), "routeIndex", -1122596893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMove", argTypes, term17552, args);
    }

};


