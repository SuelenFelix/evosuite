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

public class Fleet_getName_1969680719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78803;

    public Fleet_getName_1969680719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term78804 = new ArrayList();
        Object term78831 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term78831, term78831.getClass(), "x", 1175202910);
        setIntField(term78831, term78831.getClass(), "y", 1984427818);
        Object term78834 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term78834, term78834.getClass(), "x", 699884037);
        setIntField(term78834, term78834.getClass(), "y", -151920832);
        Object term78837 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term78837, term78837.getClass(), "x", 1475225110);
        setIntField(term78837, term78837.getClass(), "y", -746882829);
        Object term78840 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term78840, term78840.getClass(), "x", 931490251);
        setIntField(term78840, term78840.getClass(), "y", -1812785070);
        Object term78843 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term78843, term78843.getClass(), "x", -2077054717);
        setIntField(term78843, term78843.getClass(), "y", 93713831);
        Object term78846 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term78846, term78846.getClass(), "x", 556786794);
        setIntField(term78846, term78846.getClass(), "y", 2062913883);
        Object term78849 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term78849, term78849.getClass(), "x", 1451809092);
        setIntField(term78849, term78849.getClass(), "y", -274316319);
        ArrayList term78829 = new ArrayList();
        ((ArrayList) term78829).add(term78831);
        ((ArrayList) term78829).add(term78834);
        ((ArrayList) term78829).add(term78837);
        ((ArrayList) term78829).add(term78840);
        ((ArrayList) term78829).add(term78843);
        ((ArrayList) term78829).add(term78846);
        ((ArrayList) term78829).add(term78849);
        term78803 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term78808 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term78824 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term78855 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term78861 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term78803, term78803.getClass(), "ships", term78804);
        setIntField(term78808, term78808.getClass(), "x", -598781625);
        setIntField(term78808, term78808.getClass(), "y", -1717992579);
        setField(term78803, term78803.getClass(), "coordinate", term78808);
        setField(term78803, term78803.getClass(), "name", "MdlLUfrIYx");
        setIntField(term78803, term78803.getClass(), "movesLeft", -715995272);
        setDoubleField(term78824, term78824.getClass(), "startX", 0.008025683154629148);
        setDoubleField(term78824, term78824.getClass(), "startY", 0.40598298281353484);
        setDoubleField(term78824, term78824.getClass(), "endX", 0.3710067290060264);
        setDoubleField(term78824, term78824.getClass(), "endY", 0.7818620200430967);
        setField(term78824, term78824.getClass(), "nextPoints", term78829);
        setIntField(term78824, term78824.getClass(), "ftlSpeed", 269235773);
        setField(term78803, term78803.getClass(), "route", term78824);
        setField(term78855, term78855.getClass(), "name", null);
        setField(term78855, term78855.getClass(), "homeworld", null);
        setIntField(term78855, term78855.getClass(), "age", 0);
        setIntField(term78855, term78855.getClass(), "timeInJob", 0);
        setIntField(term78855, term78855.getClass(), "level", 0);
        setIntField(term78855, term78855.getClass(), "experience", 0);
        setField(term78855, term78855.getClass(), "militaryRank", null);
        setField(term78855, term78855.getClass(), "gender", null);
        setField(term78855, term78855.getClass(), "race", null);
        setField(term78855, term78855.getClass(), "title", null);
        setField(term78855, term78855.getClass(), "job", null);
        setField(term78855, term78855.getClass(), "parent", null);
        setIntField(term78855, term78855.getClass(), "parentIndex", 0);
        setField(term78855, term78855.getClass(), "perkList", null);
        setField(term78855, term78855.getClass(), "stats", null);
        setField(term78803, term78803.getClass(), "commander", term78855);
        setIntField(term78861, term78861.getClass(), "maxX", 0);
        setIntField(term78861, term78861.getClass(), "maxY", 0);
        setField(term78861, term78861.getClass(), "blockMap", null);
        setField(term78861, term78861.getClass(), "points", null);
        setIntField(term78861, term78861.getClass(), "tx", 0);
        setIntField(term78861, term78861.getClass(), "ty", 0);
        setIntField(term78861, term78861.getClass(), "targetDistance", 0);
        setField(term78861, term78861.getClass(), "targetPoint", null);
        setIntField(term78861, term78861.getClass(), "routeIndex", 0);
        setField(term78803, term78803.getClass(), "aStarSearch", term78861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term78803, args);
    }

};


