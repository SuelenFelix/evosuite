package org.openRealmOfStars.player.fleet;

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
import static org.openRealmOfStars.player.fleet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Fleet_getShipForFalseFlag_64004826318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78725;

    public Fleet_getShipForFalseFlag_64004826318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term78726 = new ArrayList();
        Object term78753 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term78753, term78753.getClass(), "x", 1963830726);
        setIntField(term78753, term78753.getClass(), "y", -1467028089);
        Object term78756 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term78756, term78756.getClass(), "x", 492120544);
        setIntField(term78756, term78756.getClass(), "y", -832143098);
        Object term78759 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term78759, term78759.getClass(), "x", 363743117);
        setIntField(term78759, term78759.getClass(), "y", -1659784438);
        Object term78762 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term78762, term78762.getClass(), "x", 593205725);
        setIntField(term78762, term78762.getClass(), "y", -482661954);
        Object term78765 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term78765, term78765.getClass(), "x", -649826731);
        setIntField(term78765, term78765.getClass(), "y", 506165302);
        Object term78768 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term78768, term78768.getClass(), "x", 1792344129);
        setIntField(term78768, term78768.getClass(), "y", -1718734463);
        Object term78771 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term78771, term78771.getClass(), "x", -156627014);
        setIntField(term78771, term78771.getClass(), "y", -933160129);
        Object term78774 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term78774, term78774.getClass(), "x", 0);
        setIntField(term78774, term78774.getClass(), "y", 0);
        ArrayList term78751 = new ArrayList();
        ((ArrayList) term78751).add(term78753);
        ((ArrayList) term78751).add(term78756);
        ((ArrayList) term78751).add(term78759);
        ((ArrayList) term78751).add(term78762);
        ((ArrayList) term78751).add(term78765);
        ((ArrayList) term78751).add(term78768);
        ((ArrayList) term78751).add(term78771);
        ((ArrayList) term78751).add(term78774);
        term78725 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term78730 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term78746 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term78780 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term78786 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term78725, term78725.getClass(), "ships", term78726);
        setIntField(term78730, term78730.getClass(), "x", 700442161);
        setIntField(term78730, term78730.getClass(), "y", 1901393171);
        setField(term78725, term78725.getClass(), "coordinate", term78730);
        setField(term78725, term78725.getClass(), "name", "GkTxuqMoMw");
        setIntField(term78725, term78725.getClass(), "movesLeft", -704298059);
        setDoubleField(term78746, term78746.getClass(), "startX", 0.9341364461850963);
        setDoubleField(term78746, term78746.getClass(), "startY", 0.9022041121474429);
        setDoubleField(term78746, term78746.getClass(), "endX", 0.6512870939318848);
        setDoubleField(term78746, term78746.getClass(), "endY", 0.8777038609128434);
        setField(term78746, term78746.getClass(), "nextPoints", term78751);
        setIntField(term78746, term78746.getClass(), "ftlSpeed", -1553822493);
        setField(term78725, term78725.getClass(), "route", term78746);
        setField(term78780, term78780.getClass(), "name", null);
        setField(term78780, term78780.getClass(), "homeworld", null);
        setIntField(term78780, term78780.getClass(), "age", 0);
        setIntField(term78780, term78780.getClass(), "timeInJob", 0);
        setIntField(term78780, term78780.getClass(), "level", 0);
        setIntField(term78780, term78780.getClass(), "experience", 0);
        setField(term78780, term78780.getClass(), "militaryRank", null);
        setField(term78780, term78780.getClass(), "gender", null);
        setField(term78780, term78780.getClass(), "race", null);
        setField(term78780, term78780.getClass(), "title", null);
        setField(term78780, term78780.getClass(), "job", null);
        setField(term78780, term78780.getClass(), "parent", null);
        setIntField(term78780, term78780.getClass(), "parentIndex", 0);
        setField(term78780, term78780.getClass(), "perkList", null);
        setField(term78780, term78780.getClass(), "stats", null);
        setField(term78725, term78725.getClass(), "commander", term78780);
        setIntField(term78786, term78786.getClass(), "maxX", 0);
        setIntField(term78786, term78786.getClass(), "maxY", 0);
        setField(term78786, term78786.getClass(), "blockMap", null);
        setField(term78786, term78786.getClass(), "points", null);
        setIntField(term78786, term78786.getClass(), "tx", 0);
        setIntField(term78786, term78786.getClass(), "ty", 0);
        setIntField(term78786, term78786.getClass(), "targetDistance", 0);
        setField(term78786, term78786.getClass(), "targetPoint", null);
        setIntField(term78786, term78786.getClass(), "routeIndex", 0);
        setField(term78725, term78725.getClass(), "aStarSearch", term78786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShipForFalseFlag", argTypes, term78725, args);
    }

};


