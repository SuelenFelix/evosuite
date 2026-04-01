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

public class FleetList_isFleetOnList_26972837622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220760;
     Object term220766;

    public FleetList_isFleetOnList_26972837622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term220761 = new ArrayList();
        term220760 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.FleetList"));
        setField(term220760, term220760.getClass(), "fleetList", term220761);
        setIntField(term220760, term220760.getClass(), "index", -1);
        ArrayList term220778 = new ArrayList();
        ((ArrayList) term220778).add((Object)null);
        ((ArrayList) term220778).add((Object)null);
        ((ArrayList) term220778).add((Object)null);
        ((ArrayList) term220778).add((Object)null);
        ((ArrayList) term220778).add((Object)null);
        Object term220769 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term220770 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term220781 = (int[]) newIntArray(1);
        Object term220785 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term220793 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term220770, term220770.getClass(), "index", -1473491051);
        setField(term220770, term220770.getClass(), "name", null);
        setIntField(term220770, term220770.getClass(), "maxSlot", 804411219);
        setIntField(term220770, term220770.getClass(), "slotHull", -1184708689);
        setField(term220770, term220770.getClass(), "hullType", null);
        setField(term220770, term220770.getClass(), "size", null);
        setIntField(term220770, term220770.getClass(), "cost", 1859413989);
        setIntField(term220770, term220770.getClass(), "metalCost", 399424745);
        setIntField(term220770, term220770.getClass(), "imageIndex", 1445242555);
        setDoubleField(term220770, term220770.getClass(), "fleetCapacity", 0.7912735654922212);
        setField(term220770, term220770.getClass(), "originalBuilder", null);
        setField(term220769, term220769.getClass(), "hull", term220770);
        setField(term220769, term220769.getClass(), "components", term220778);
        setIntElement(term220781, 0, 1630084052);
        setField(term220769, term220769.getClass(), "hullPoints", term220781);
        setIntField(term220769, term220769.getClass(), "shield", -1229483233);
        setIntField(term220769, term220769.getClass(), "armor", -766646734);
        setIntField(term220785, term220785.getClass(), "imageType", -1692871251);
        setField(term220785, term220785.getClass(), "colorModel", null);
        setField(term220785, term220785.getClass(), "raster", null);
        setField(term220785, term220785.getClass(), "osis", null);
        setField(term220785, term220785.getClass(), "properties", null);
        setFloatField(term220785, term220785.getClass(), "accelerationPriority", 0.8823181F);
        setField(term220785, term220785.getClass(), "surfaceManager", null);
        setField(term220769, term220769.getClass(), "image", term220785);
        setIntField(term220769, term220769.getClass(), "colonist", 1310320674);
        setIntField(term220769, term220769.getClass(), "metal", -45101595);
        setIntField(term220769, term220769.getClass(), "experience", -1249978853);
        setIntField(term220769, term220769.getClass(), "culture", 773182873);
        setIntField(term220769, term220769.getClass(), "specialFlags", 1412041317);
        setIntField(term220793, term220793.getClass(), "x", 651388483);
        setIntField(term220793, term220793.getClass(), "y", 223631307);
        setField(term220769, term220769.getClass(), "tradeCoordinates", term220793);
        setField(term220769, term220769.getClass(), "name", null);
        setField(term220769, term220769.getClass(), "iconId", null);
        setField(term220769, term220769.getClass(), "description", null);
        setIntField(term220769, term220769.getClass(), "prodCost", 0);
        setIntField(term220769, term220769.getClass(), "metalCost", 0);
        Object term220798 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term220798, term220798.getClass(), "hull", null);
        setField(term220798, term220798.getClass(), "components", null);
        setField(term220798, term220798.getClass(), "hullPoints", null);
        setIntField(term220798, term220798.getClass(), "shield", 0);
        setIntField(term220798, term220798.getClass(), "armor", 0);
        setField(term220798, term220798.getClass(), "image", null);
        setIntField(term220798, term220798.getClass(), "colonist", 0);
        setIntField(term220798, term220798.getClass(), "metal", 0);
        setIntField(term220798, term220798.getClass(), "experience", 0);
        setIntField(term220798, term220798.getClass(), "culture", 0);
        setIntField(term220798, term220798.getClass(), "specialFlags", 0);
        setField(term220798, term220798.getClass(), "tradeCoordinates", null);
        setField(term220798, term220798.getClass(), "name", null);
        setField(term220798, term220798.getClass(), "iconId", null);
        setField(term220798, term220798.getClass(), "description", null);
        setIntField(term220798, term220798.getClass(), "prodCost", 0);
        setIntField(term220798, term220798.getClass(), "metalCost", 0);
        Object term220808 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term220808, term220808.getClass(), "hull", null);
        setField(term220808, term220808.getClass(), "components", null);
        setField(term220808, term220808.getClass(), "hullPoints", null);
        setIntField(term220808, term220808.getClass(), "shield", 0);
        setIntField(term220808, term220808.getClass(), "armor", 0);
        setField(term220808, term220808.getClass(), "image", null);
        setIntField(term220808, term220808.getClass(), "colonist", 0);
        setIntField(term220808, term220808.getClass(), "metal", 0);
        setIntField(term220808, term220808.getClass(), "experience", 0);
        setIntField(term220808, term220808.getClass(), "culture", 0);
        setIntField(term220808, term220808.getClass(), "specialFlags", 0);
        setField(term220808, term220808.getClass(), "tradeCoordinates", null);
        setField(term220808, term220808.getClass(), "name", null);
        setField(term220808, term220808.getClass(), "iconId", null);
        setField(term220808, term220808.getClass(), "description", null);
        setIntField(term220808, term220808.getClass(), "prodCost", 0);
        setIntField(term220808, term220808.getClass(), "metalCost", 0);
        ArrayList term220767 = new ArrayList();
        ((ArrayList) term220767).add(term220769);
        ((ArrayList) term220767).add(term220798);
        ((ArrayList) term220767).add(term220808);
        term220766 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term220820 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term220836 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term220842 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term220848 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term220766, term220766.getClass(), "ships", term220767);
        setIntField(term220820, term220820.getClass(), "x", 0);
        setIntField(term220820, term220820.getClass(), "y", 0);
        setField(term220766, term220766.getClass(), "coordinate", term220820);
        setField(term220766, term220766.getClass(), "name", "njAcVNaDsK");
        setIntField(term220766, term220766.getClass(), "movesLeft", 909630692);
        setDoubleField(term220836, term220836.getClass(), "startX", 0.0);
        setDoubleField(term220836, term220836.getClass(), "startY", 0.0);
        setDoubleField(term220836, term220836.getClass(), "endX", 0.0);
        setDoubleField(term220836, term220836.getClass(), "endY", 0.0);
        setField(term220836, term220836.getClass(), "nextPoints", null);
        setIntField(term220836, term220836.getClass(), "ftlSpeed", 0);
        setField(term220766, term220766.getClass(), "route", term220836);
        setField(term220842, term220842.getClass(), "name", null);
        setField(term220842, term220842.getClass(), "homeworld", null);
        setIntField(term220842, term220842.getClass(), "age", 0);
        setIntField(term220842, term220842.getClass(), "timeInJob", 0);
        setIntField(term220842, term220842.getClass(), "level", 0);
        setIntField(term220842, term220842.getClass(), "experience", 0);
        setField(term220842, term220842.getClass(), "militaryRank", null);
        setField(term220842, term220842.getClass(), "gender", null);
        setField(term220842, term220842.getClass(), "race", null);
        setField(term220842, term220842.getClass(), "title", null);
        setField(term220842, term220842.getClass(), "job", null);
        setField(term220842, term220842.getClass(), "parent", null);
        setIntField(term220842, term220842.getClass(), "parentIndex", 0);
        setField(term220842, term220842.getClass(), "perkList", null);
        setField(term220842, term220842.getClass(), "stats", null);
        setField(term220766, term220766.getClass(), "commander", term220842);
        setIntField(term220848, term220848.getClass(), "maxX", 0);
        setIntField(term220848, term220848.getClass(), "maxY", 0);
        setField(term220848, term220848.getClass(), "blockMap", null);
        setField(term220848, term220848.getClass(), "points", null);
        setIntField(term220848, term220848.getClass(), "tx", 0);
        setIntField(term220848, term220848.getClass(), "ty", 0);
        setIntField(term220848, term220848.getClass(), "targetDistance", 0);
        setField(term220848, term220848.getClass(), "targetPoint", null);
        setIntField(term220848, term220848.getClass(), "routeIndex", 0);
        setField(term220766, term220766.getClass(), "aStarSearch", term220848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.FleetList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[1];
        args[0] = term220766;
        callMethod(klass, "isFleetOnList", argTypes, term220760, args);
    }

};


