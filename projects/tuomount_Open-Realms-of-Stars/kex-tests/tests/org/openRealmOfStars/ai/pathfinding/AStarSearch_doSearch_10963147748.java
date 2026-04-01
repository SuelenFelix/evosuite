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

public class AStarSearch_doSearch_10963147748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17100;

    public AStarSearch_doSearch_10963147748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17146 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17146, term17146.getClass(), "x", -1201819537);
        setIntField(term17146, term17146.getClass(), "y", 2135922049);
        setDoubleField(term17146, term17146.getClass(), "distance", 0.07802449704920456);
        Object term17150 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17150, term17150.getClass(), "x", -263876378);
        setIntField(term17150, term17150.getClass(), "y", -755209283);
        setDoubleField(term17150, term17150.getClass(), "distance", 0.5279279537140873);
        ArrayList term17144 = new ArrayList();
        ((ArrayList) term17144).add(term17146);
        ((ArrayList) term17144).add(term17150);
        term17100 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        Object[] term17103 = (Object[]) newArray("[I", 5);
        int[] term17104 = (int[]) newIntArray(8);
        int[] term17113 = (int[]) newIntArray(9);
        int[] term17123 = (int[]) newIntArray(7);
        int[] term17131 = (int[]) newIntArray(6);
        int[] term17138 = (int[]) newIntArray(5);
        Object term17159 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17100, term17100.getClass(), "maxX", -2047179134);
        setIntField(term17100, term17100.getClass(), "maxY", 44908093);
        setIntElement(term17104, 0, 887198203);
        setIntElement(term17104, 1, 12581312);
        setIntElement(term17104, 2, 2087383644);
        setIntElement(term17104, 3, 405527523);
        setIntElement(term17104, 4, -1123526433);
        setIntElement(term17104, 5, 910269225);
        setIntElement(term17104, 6, -298852874);
        setIntElement(term17104, 7, 1094297953);
        setElement(term17103, 0, term17104);
        setIntElement(term17113, 0, -329141819);
        setIntElement(term17113, 1, -963204620);
        setIntElement(term17113, 2, 172898580);
        setIntElement(term17113, 3, -777833461);
        setIntElement(term17113, 4, 1583691829);
        setIntElement(term17113, 5, -1468541076);
        setIntElement(term17113, 6, -1796760393);
        setIntElement(term17113, 7, -2099267271);
        setIntElement(term17113, 8, 1134565344);
        setElement(term17103, 1, term17113);
        setIntElement(term17123, 0, -1747434000);
        setIntElement(term17123, 1, 1611620166);
        setIntElement(term17123, 2, 249657454);
        setIntElement(term17123, 3, 1734630901);
        setIntElement(term17123, 4, -703815246);
        setIntElement(term17123, 5, 157300746);
        setIntElement(term17123, 6, -1600748613);
        setElement(term17103, 2, term17123);
        setIntElement(term17131, 0, -1509192782);
        setIntElement(term17131, 1, -867925573);
        setIntElement(term17131, 2, 478422495);
        setIntElement(term17131, 3, 1727771237);
        setIntElement(term17131, 4, 2033663549);
        setIntElement(term17131, 5, 1766479154);
        setElement(term17103, 3, term17131);
        setIntElement(term17138, 0, 533171496);
        setIntElement(term17138, 1, 1369020869);
        setIntElement(term17138, 2, -1428947021);
        setIntElement(term17138, 3, -134324004);
        setIntElement(term17138, 4, -1813266173);
        setElement(term17103, 4, term17138);
        setField(term17100, term17100.getClass(), "blockMap", term17103);
        setField(term17100, term17100.getClass(), "points", term17144);
        setIntField(term17100, term17100.getClass(), "tx", -616562794);
        setIntField(term17100, term17100.getClass(), "ty", 750084083);
        setIntField(term17100, term17100.getClass(), "targetDistance", -1603460382);
        setIntField(term17159, term17159.getClass(), "x", -298939768);
        setIntField(term17159, term17159.getClass(), "y", -767031634);
        setDoubleField(term17159, term17159.getClass(), "distance", 0.3202192021706908);
        setField(term17100, term17100.getClass(), "targetPoint", term17159);
        setIntField(term17100, term17100.getClass(), "routeIndex", -2072469750);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doSearch", argTypes, term17100, args);
    }

};


