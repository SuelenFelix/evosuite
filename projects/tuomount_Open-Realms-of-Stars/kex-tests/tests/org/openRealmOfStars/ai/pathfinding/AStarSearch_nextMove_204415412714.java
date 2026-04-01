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

public class AStarSearch_nextMove_204415412714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17626;

    public AStarSearch_nextMove_204415412714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17665 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17665, term17665.getClass(), "x", 346282818);
        setIntField(term17665, term17665.getClass(), "y", -857876056);
        setDoubleField(term17665, term17665.getClass(), "distance", 0.025133051616627267);
        ArrayList term17663 = new ArrayList();
        ((ArrayList) term17663).add(term17665);
        term17626 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        Object[] term17629 = (Object[]) newArray("[I", 5);
        int[] term17630 = (int[]) newIntArray(8);
        int[] term17639 = (int[]) newIntArray(3);
        int[] term17643 = (int[]) newIntArray(6);
        int[] term17650 = (int[]) newIntArray(8);
        int[] term17659 = (int[]) newIntArray(3);
        Object term17674 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17626, term17626.getClass(), "maxX", -2147297900);
        setIntField(term17626, term17626.getClass(), "maxY", 539095138);
        setIntElement(term17630, 0, 1462297654);
        setIntElement(term17630, 1, 1009915858);
        setIntElement(term17630, 2, 500127209);
        setIntElement(term17630, 3, -1482530168);
        setIntElement(term17630, 4, -432987116);
        setIntElement(term17630, 5, 1483499310);
        setIntElement(term17630, 6, -1516568587);
        setIntElement(term17630, 7, 1537690170);
        setElement(term17629, 0, term17630);
        setIntElement(term17639, 0, 1133116994);
        setIntElement(term17639, 1, -1195191239);
        setIntElement(term17639, 2, -470798982);
        setElement(term17629, 1, term17639);
        setIntElement(term17643, 0, 1844345719);
        setIntElement(term17643, 1, 1704024265);
        setIntElement(term17643, 2, 501801161);
        setIntElement(term17643, 3, 2103971768);
        setIntElement(term17643, 4, -939132796);
        setIntElement(term17643, 5, 159279866);
        setElement(term17629, 2, term17643);
        setIntElement(term17650, 0, 138122227);
        setIntElement(term17650, 1, 1795358995);
        setIntElement(term17650, 2, -781185864);
        setIntElement(term17650, 3, 340500914);
        setIntElement(term17650, 4, -2061712635);
        setIntElement(term17650, 5, 1182911731);
        setIntElement(term17650, 6, 644726932);
        setIntElement(term17650, 7, -1515977761);
        setElement(term17629, 3, term17650);
        setIntElement(term17659, 0, -1476037190);
        setIntElement(term17659, 1, -718204437);
        setIntElement(term17659, 2, 468974358);
        setElement(term17629, 4, term17659);
        setField(term17626, term17626.getClass(), "blockMap", term17629);
        setField(term17626, term17626.getClass(), "points", term17663);
        setIntField(term17626, term17626.getClass(), "tx", 1392910876);
        setIntField(term17626, term17626.getClass(), "ty", 1086383182);
        setIntField(term17626, term17626.getClass(), "targetDistance", 1425319286);
        setIntField(term17674, term17674.getClass(), "x", 1729919228);
        setIntField(term17674, term17674.getClass(), "y", 872351195);
        setDoubleField(term17674, term17674.getClass(), "distance", 0.016575281023182953);
        setField(term17626, term17626.getClass(), "targetPoint", term17674);
        setIntField(term17626, term17626.getClass(), "routeIndex", -1664328399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextMove", argTypes, term17626, args);
    }

};


