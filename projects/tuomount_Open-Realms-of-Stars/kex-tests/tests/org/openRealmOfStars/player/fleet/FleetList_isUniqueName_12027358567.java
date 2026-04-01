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

public class FleetList_isUniqueName_12027358567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2232572;
     Object term2232590;

    public FleetList_isUniqueName_12027358567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2232573 = new ArrayList();
        term2232572 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.FleetList"));
        setField(term2232572, term2232572.getClass(), "fleetList", term2232573);
        setIntField(term2232572, term2232572.getClass(), "index", -1);
        ArrayList term2232602 = new ArrayList();
        ((ArrayList) term2232602).add((Object)null);
        ((ArrayList) term2232602).add((Object)null);
        ((ArrayList) term2232602).add((Object)null);
        ((ArrayList) term2232602).add((Object)null);
        ((ArrayList) term2232602).add((Object)null);
        ((ArrayList) term2232602).add((Object)null);
        ((ArrayList) term2232602).add((Object)null);
        ((ArrayList) term2232602).add((Object)null);
        Object term2232593 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term2232594 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term2232605 = (int[]) newIntArray(2);
        Object term2232610 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term2232618 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term2232594, term2232594.getClass(), "index", -1712100032);
        setField(term2232594, term2232594.getClass(), "name", null);
        setIntField(term2232594, term2232594.getClass(), "maxSlot", 400043328);
        setIntField(term2232594, term2232594.getClass(), "slotHull", 57733415);
        setField(term2232594, term2232594.getClass(), "hullType", null);
        setField(term2232594, term2232594.getClass(), "size", null);
        setIntField(term2232594, term2232594.getClass(), "cost", 1761314284);
        setIntField(term2232594, term2232594.getClass(), "metalCost", 1410031315);
        setIntField(term2232594, term2232594.getClass(), "imageIndex", -1611939816);
        setDoubleField(term2232594, term2232594.getClass(), "fleetCapacity", 0.6230884462892928);
        setField(term2232594, term2232594.getClass(), "originalBuilder", null);
        setField(term2232593, term2232593.getClass(), "hull", term2232594);
        setField(term2232593, term2232593.getClass(), "components", term2232602);
        setIntElement(term2232605, 0, -234679564);
        setIntElement(term2232605, 1, -1876101946);
        setField(term2232593, term2232593.getClass(), "hullPoints", term2232605);
        setIntField(term2232593, term2232593.getClass(), "shield", 512237549);
        setIntField(term2232593, term2232593.getClass(), "armor", -1509837060);
        setIntField(term2232610, term2232610.getClass(), "imageType", -1855775615);
        setField(term2232610, term2232610.getClass(), "colorModel", null);
        setField(term2232610, term2232610.getClass(), "raster", null);
        setField(term2232610, term2232610.getClass(), "osis", null);
        setField(term2232610, term2232610.getClass(), "properties", null);
        setFloatField(term2232610, term2232610.getClass(), "accelerationPriority", 0.07054943F);
        setField(term2232610, term2232610.getClass(), "surfaceManager", null);
        setField(term2232593, term2232593.getClass(), "image", term2232610);
        setIntField(term2232593, term2232593.getClass(), "colonist", -530023566);
        setIntField(term2232593, term2232593.getClass(), "metal", -630125585);
        setIntField(term2232593, term2232593.getClass(), "experience", -1430538240);
        setIntField(term2232593, term2232593.getClass(), "culture", 1314321583);
        setIntField(term2232593, term2232593.getClass(), "specialFlags", 669722620);
        setIntField(term2232618, term2232618.getClass(), "x", -45425243);
        setIntField(term2232618, term2232618.getClass(), "y", 1990371152);
        setField(term2232593, term2232593.getClass(), "tradeCoordinates", term2232618);
        setField(term2232593, term2232593.getClass(), "name", null);
        setField(term2232593, term2232593.getClass(), "iconId", null);
        setField(term2232593, term2232593.getClass(), "description", null);
        setIntField(term2232593, term2232593.getClass(), "prodCost", 0);
        setIntField(term2232593, term2232593.getClass(), "metalCost", 0);
        Object term2232623 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term2232623, term2232623.getClass(), "hull", null);
        setField(term2232623, term2232623.getClass(), "components", null);
        setField(term2232623, term2232623.getClass(), "hullPoints", null);
        setIntField(term2232623, term2232623.getClass(), "shield", 0);
        setIntField(term2232623, term2232623.getClass(), "armor", 0);
        setField(term2232623, term2232623.getClass(), "image", null);
        setIntField(term2232623, term2232623.getClass(), "colonist", 0);
        setIntField(term2232623, term2232623.getClass(), "metal", 0);
        setIntField(term2232623, term2232623.getClass(), "experience", 0);
        setIntField(term2232623, term2232623.getClass(), "culture", 0);
        setIntField(term2232623, term2232623.getClass(), "specialFlags", 0);
        setField(term2232623, term2232623.getClass(), "tradeCoordinates", null);
        setField(term2232623, term2232623.getClass(), "name", null);
        setField(term2232623, term2232623.getClass(), "iconId", null);
        setField(term2232623, term2232623.getClass(), "description", null);
        setIntField(term2232623, term2232623.getClass(), "prodCost", 0);
        setIntField(term2232623, term2232623.getClass(), "metalCost", 0);
        ArrayList term2232591 = new ArrayList();
        ((ArrayList) term2232591).add(term2232593);
        ((ArrayList) term2232591).add(term2232623);
        term2232590 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term2232635 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term2232651 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term2232657 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term2232663 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term2232590, term2232590.getClass(), "ships", term2232591);
        setIntField(term2232635, term2232635.getClass(), "x", 0);
        setIntField(term2232635, term2232635.getClass(), "y", 0);
        setField(term2232590, term2232590.getClass(), "coordinate", term2232635);
        setField(term2232590, term2232590.getClass(), "name", "dtMiXHIMJH");
        setIntField(term2232590, term2232590.getClass(), "movesLeft", -1396787968);
        setDoubleField(term2232651, term2232651.getClass(), "startX", 0.0);
        setDoubleField(term2232651, term2232651.getClass(), "startY", 0.0);
        setDoubleField(term2232651, term2232651.getClass(), "endX", 0.0);
        setDoubleField(term2232651, term2232651.getClass(), "endY", 0.0);
        setField(term2232651, term2232651.getClass(), "nextPoints", null);
        setIntField(term2232651, term2232651.getClass(), "ftlSpeed", 0);
        setField(term2232590, term2232590.getClass(), "route", term2232651);
        setField(term2232657, term2232657.getClass(), "name", null);
        setField(term2232657, term2232657.getClass(), "homeworld", null);
        setIntField(term2232657, term2232657.getClass(), "age", 0);
        setIntField(term2232657, term2232657.getClass(), "timeInJob", 0);
        setIntField(term2232657, term2232657.getClass(), "level", 0);
        setIntField(term2232657, term2232657.getClass(), "experience", 0);
        setField(term2232657, term2232657.getClass(), "militaryRank", null);
        setField(term2232657, term2232657.getClass(), "gender", null);
        setField(term2232657, term2232657.getClass(), "race", null);
        setField(term2232657, term2232657.getClass(), "title", null);
        setField(term2232657, term2232657.getClass(), "job", null);
        setField(term2232657, term2232657.getClass(), "parent", null);
        setIntField(term2232657, term2232657.getClass(), "parentIndex", 0);
        setField(term2232657, term2232657.getClass(), "perkList", null);
        setField(term2232657, term2232657.getClass(), "stats", null);
        setField(term2232590, term2232590.getClass(), "commander", term2232657);
        setIntField(term2232663, term2232663.getClass(), "maxX", 0);
        setIntField(term2232663, term2232663.getClass(), "maxY", 0);
        setField(term2232663, term2232663.getClass(), "blockMap", null);
        setField(term2232663, term2232663.getClass(), "points", null);
        setIntField(term2232663, term2232663.getClass(), "tx", 0);
        setIntField(term2232663, term2232663.getClass(), "ty", 0);
        setIntField(term2232663, term2232663.getClass(), "targetDistance", 0);
        setField(term2232663, term2232663.getClass(), "targetPoint", null);
        setIntField(term2232663, term2232663.getClass(), "routeIndex", 0);
        setField(term2232590, term2232590.getClass(), "aStarSearch", term2232663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.FleetList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[2];
        args[0] = "mCLsaIvEUG";
        args[1] = term2232590;
        callMethod(klass, "isUniqueName", argTypes, term2232572, args);
    }

};


