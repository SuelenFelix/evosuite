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

public class Fleet_getFreeSpaceForColonist_188952622537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100894;

    public Fleet_getFreeSpaceForColonist_188952622537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term100906 = new ArrayList();
        ((ArrayList) term100906).add((Object)null);
        ((ArrayList) term100906).add((Object)null);
        ((ArrayList) term100906).add((Object)null);
        ((ArrayList) term100906).add((Object)null);
        ((ArrayList) term100906).add((Object)null);
        ((ArrayList) term100906).add((Object)null);
        ((ArrayList) term100906).add((Object)null);
        ((ArrayList) term100906).add((Object)null);
        Object term100897 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term100898 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term100909 = (int[]) newIntArray(3);
        Object term100915 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term100923 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term100898, term100898.getClass(), "index", 361364617);
        setField(term100898, term100898.getClass(), "name", null);
        setIntField(term100898, term100898.getClass(), "maxSlot", -132332846);
        setIntField(term100898, term100898.getClass(), "slotHull", -160055040);
        setField(term100898, term100898.getClass(), "hullType", null);
        setField(term100898, term100898.getClass(), "size", null);
        setIntField(term100898, term100898.getClass(), "cost", 7043168);
        setIntField(term100898, term100898.getClass(), "metalCost", 2007440099);
        setIntField(term100898, term100898.getClass(), "imageIndex", 1462309526);
        setDoubleField(term100898, term100898.getClass(), "fleetCapacity", 0.25025774487844066);
        setField(term100898, term100898.getClass(), "originalBuilder", null);
        setField(term100897, term100897.getClass(), "hull", term100898);
        setField(term100897, term100897.getClass(), "components", term100906);
        setIntElement(term100909, 0, 864697708);
        setIntElement(term100909, 1, -218244630);
        setIntElement(term100909, 2, -963363890);
        setField(term100897, term100897.getClass(), "hullPoints", term100909);
        setIntField(term100897, term100897.getClass(), "shield", 1294401720);
        setIntField(term100897, term100897.getClass(), "armor", -1605686410);
        setIntField(term100915, term100915.getClass(), "imageType", 890902750);
        setField(term100915, term100915.getClass(), "colorModel", null);
        setField(term100915, term100915.getClass(), "raster", null);
        setField(term100915, term100915.getClass(), "osis", null);
        setField(term100915, term100915.getClass(), "properties", null);
        setFloatField(term100915, term100915.getClass(), "accelerationPriority", 0.7332741F);
        setField(term100915, term100915.getClass(), "surfaceManager", null);
        setField(term100897, term100897.getClass(), "image", term100915);
        setIntField(term100897, term100897.getClass(), "colonist", -1168974406);
        setIntField(term100897, term100897.getClass(), "metal", 649099374);
        setIntField(term100897, term100897.getClass(), "experience", -1673318908);
        setIntField(term100897, term100897.getClass(), "culture", -748711480);
        setIntField(term100897, term100897.getClass(), "specialFlags", -1598682190);
        setIntField(term100923, term100923.getClass(), "x", -1485075510);
        setIntField(term100923, term100923.getClass(), "y", -628388239);
        setField(term100897, term100897.getClass(), "tradeCoordinates", term100923);
        setField(term100897, term100897.getClass(), "name", null);
        setField(term100897, term100897.getClass(), "iconId", null);
        setField(term100897, term100897.getClass(), "description", null);
        setIntField(term100897, term100897.getClass(), "prodCost", 0);
        setIntField(term100897, term100897.getClass(), "metalCost", 0);
        Object term100928 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term100928, term100928.getClass(), "hull", null);
        setField(term100928, term100928.getClass(), "components", null);
        setField(term100928, term100928.getClass(), "hullPoints", null);
        setIntField(term100928, term100928.getClass(), "shield", 0);
        setIntField(term100928, term100928.getClass(), "armor", 0);
        setField(term100928, term100928.getClass(), "image", null);
        setIntField(term100928, term100928.getClass(), "colonist", 0);
        setIntField(term100928, term100928.getClass(), "metal", 0);
        setIntField(term100928, term100928.getClass(), "experience", 0);
        setIntField(term100928, term100928.getClass(), "culture", 0);
        setIntField(term100928, term100928.getClass(), "specialFlags", 0);
        setField(term100928, term100928.getClass(), "tradeCoordinates", null);
        setField(term100928, term100928.getClass(), "name", null);
        setField(term100928, term100928.getClass(), "iconId", null);
        setField(term100928, term100928.getClass(), "description", null);
        setIntField(term100928, term100928.getClass(), "prodCost", 0);
        setIntField(term100928, term100928.getClass(), "metalCost", 0);
        Object term100938 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term100938, term100938.getClass(), "hull", null);
        setField(term100938, term100938.getClass(), "components", null);
        setField(term100938, term100938.getClass(), "hullPoints", null);
        setIntField(term100938, term100938.getClass(), "shield", 0);
        setIntField(term100938, term100938.getClass(), "armor", 0);
        setField(term100938, term100938.getClass(), "image", null);
        setIntField(term100938, term100938.getClass(), "colonist", 0);
        setIntField(term100938, term100938.getClass(), "metal", 0);
        setIntField(term100938, term100938.getClass(), "experience", 0);
        setIntField(term100938, term100938.getClass(), "culture", 0);
        setIntField(term100938, term100938.getClass(), "specialFlags", 0);
        setField(term100938, term100938.getClass(), "tradeCoordinates", null);
        setField(term100938, term100938.getClass(), "name", null);
        setField(term100938, term100938.getClass(), "iconId", null);
        setField(term100938, term100938.getClass(), "description", null);
        setIntField(term100938, term100938.getClass(), "prodCost", 0);
        setIntField(term100938, term100938.getClass(), "metalCost", 0);
        Object term100948 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term100948, term100948.getClass(), "hull", null);
        setField(term100948, term100948.getClass(), "components", null);
        setField(term100948, term100948.getClass(), "hullPoints", null);
        setIntField(term100948, term100948.getClass(), "shield", 0);
        setIntField(term100948, term100948.getClass(), "armor", 0);
        setField(term100948, term100948.getClass(), "image", null);
        setIntField(term100948, term100948.getClass(), "colonist", 0);
        setIntField(term100948, term100948.getClass(), "metal", 0);
        setIntField(term100948, term100948.getClass(), "experience", 0);
        setIntField(term100948, term100948.getClass(), "culture", 0);
        setIntField(term100948, term100948.getClass(), "specialFlags", 0);
        setField(term100948, term100948.getClass(), "tradeCoordinates", null);
        setField(term100948, term100948.getClass(), "name", null);
        setField(term100948, term100948.getClass(), "iconId", null);
        setField(term100948, term100948.getClass(), "description", null);
        setIntField(term100948, term100948.getClass(), "prodCost", 0);
        setIntField(term100948, term100948.getClass(), "metalCost", 0);
        ArrayList term100895 = new ArrayList();
        ((ArrayList) term100895).add(term100897);
        ((ArrayList) term100895).add(term100928);
        ((ArrayList) term100895).add(term100938);
        ((ArrayList) term100895).add(term100948);
        term100894 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term100960 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term100976 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term100982 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term100988 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term100894, term100894.getClass(), "ships", term100895);
        setIntField(term100960, term100960.getClass(), "x", 0);
        setIntField(term100960, term100960.getClass(), "y", 0);
        setField(term100894, term100894.getClass(), "coordinate", term100960);
        setField(term100894, term100894.getClass(), "name", "QZpJmHsqng");
        setIntField(term100894, term100894.getClass(), "movesLeft", 2050053472);
        setDoubleField(term100976, term100976.getClass(), "startX", 0.0);
        setDoubleField(term100976, term100976.getClass(), "startY", 0.0);
        setDoubleField(term100976, term100976.getClass(), "endX", 0.0);
        setDoubleField(term100976, term100976.getClass(), "endY", 0.0);
        setField(term100976, term100976.getClass(), "nextPoints", null);
        setIntField(term100976, term100976.getClass(), "ftlSpeed", 0);
        setField(term100894, term100894.getClass(), "route", term100976);
        setField(term100982, term100982.getClass(), "name", null);
        setField(term100982, term100982.getClass(), "homeworld", null);
        setIntField(term100982, term100982.getClass(), "age", 0);
        setIntField(term100982, term100982.getClass(), "timeInJob", 0);
        setIntField(term100982, term100982.getClass(), "level", 0);
        setIntField(term100982, term100982.getClass(), "experience", 0);
        setField(term100982, term100982.getClass(), "militaryRank", null);
        setField(term100982, term100982.getClass(), "gender", null);
        setField(term100982, term100982.getClass(), "race", null);
        setField(term100982, term100982.getClass(), "title", null);
        setField(term100982, term100982.getClass(), "job", null);
        setField(term100982, term100982.getClass(), "parent", null);
        setIntField(term100982, term100982.getClass(), "parentIndex", 0);
        setField(term100982, term100982.getClass(), "perkList", null);
        setField(term100982, term100982.getClass(), "stats", null);
        setField(term100894, term100894.getClass(), "commander", term100982);
        setIntField(term100988, term100988.getClass(), "maxX", 0);
        setIntField(term100988, term100988.getClass(), "maxY", 0);
        setField(term100988, term100988.getClass(), "blockMap", null);
        setField(term100988, term100988.getClass(), "points", null);
        setIntField(term100988, term100988.getClass(), "tx", 0);
        setIntField(term100988, term100988.getClass(), "ty", 0);
        setIntField(term100988, term100988.getClass(), "targetDistance", 0);
        setField(term100988, term100988.getClass(), "targetPoint", null);
        setIntField(term100988, term100988.getClass(), "routeIndex", 0);
        setField(term100894, term100894.getClass(), "aStarSearch", term100988);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreeSpaceForColonist", argTypes, term100894, args);
    }

};


