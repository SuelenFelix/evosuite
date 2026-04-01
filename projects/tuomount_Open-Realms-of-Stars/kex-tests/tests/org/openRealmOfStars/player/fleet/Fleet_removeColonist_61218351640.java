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

public class Fleet_removeColonist_61218351640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101252;

    public Fleet_removeColonist_61218351640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term101264 = new ArrayList();
        ((ArrayList) term101264).add((Object)null);
        ((ArrayList) term101264).add((Object)null);
        Object term101255 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term101256 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term101267 = (int[]) newIntArray(1);
        Object term101271 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term101279 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term101256, term101256.getClass(), "index", 112739257);
        setField(term101256, term101256.getClass(), "name", null);
        setIntField(term101256, term101256.getClass(), "maxSlot", 1199908250);
        setIntField(term101256, term101256.getClass(), "slotHull", 1616884797);
        setField(term101256, term101256.getClass(), "hullType", null);
        setField(term101256, term101256.getClass(), "size", null);
        setIntField(term101256, term101256.getClass(), "cost", 2030586700);
        setIntField(term101256, term101256.getClass(), "metalCost", -340603553);
        setIntField(term101256, term101256.getClass(), "imageIndex", 225498620);
        setDoubleField(term101256, term101256.getClass(), "fleetCapacity", 0.7977455176064363);
        setField(term101256, term101256.getClass(), "originalBuilder", null);
        setField(term101255, term101255.getClass(), "hull", term101256);
        setField(term101255, term101255.getClass(), "components", term101264);
        setIntElement(term101267, 0, 721981536);
        setField(term101255, term101255.getClass(), "hullPoints", term101267);
        setIntField(term101255, term101255.getClass(), "shield", 91610201);
        setIntField(term101255, term101255.getClass(), "armor", -1281117768);
        setIntField(term101271, term101271.getClass(), "imageType", 208991599);
        setField(term101271, term101271.getClass(), "colorModel", null);
        setField(term101271, term101271.getClass(), "raster", null);
        setField(term101271, term101271.getClass(), "osis", null);
        setField(term101271, term101271.getClass(), "properties", null);
        setFloatField(term101271, term101271.getClass(), "accelerationPriority", 0.17877543F);
        setField(term101271, term101271.getClass(), "surfaceManager", null);
        setField(term101255, term101255.getClass(), "image", term101271);
        setIntField(term101255, term101255.getClass(), "colonist", -1720693402);
        setIntField(term101255, term101255.getClass(), "metal", 325282129);
        setIntField(term101255, term101255.getClass(), "experience", -446219627);
        setIntField(term101255, term101255.getClass(), "culture", 1440215146);
        setIntField(term101255, term101255.getClass(), "specialFlags", 593096680);
        setIntField(term101279, term101279.getClass(), "x", -223776565);
        setIntField(term101279, term101279.getClass(), "y", -1246811706);
        setField(term101255, term101255.getClass(), "tradeCoordinates", term101279);
        setField(term101255, term101255.getClass(), "name", null);
        setField(term101255, term101255.getClass(), "iconId", null);
        setField(term101255, term101255.getClass(), "description", null);
        setIntField(term101255, term101255.getClass(), "prodCost", 0);
        setIntField(term101255, term101255.getClass(), "metalCost", 0);
        Object term101284 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term101284, term101284.getClass(), "hull", null);
        setField(term101284, term101284.getClass(), "components", null);
        setField(term101284, term101284.getClass(), "hullPoints", null);
        setIntField(term101284, term101284.getClass(), "shield", 0);
        setIntField(term101284, term101284.getClass(), "armor", 0);
        setField(term101284, term101284.getClass(), "image", null);
        setIntField(term101284, term101284.getClass(), "colonist", 0);
        setIntField(term101284, term101284.getClass(), "metal", 0);
        setIntField(term101284, term101284.getClass(), "experience", 0);
        setIntField(term101284, term101284.getClass(), "culture", 0);
        setIntField(term101284, term101284.getClass(), "specialFlags", 0);
        setField(term101284, term101284.getClass(), "tradeCoordinates", null);
        setField(term101284, term101284.getClass(), "name", null);
        setField(term101284, term101284.getClass(), "iconId", null);
        setField(term101284, term101284.getClass(), "description", null);
        setIntField(term101284, term101284.getClass(), "prodCost", 0);
        setIntField(term101284, term101284.getClass(), "metalCost", 0);
        Object term101294 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term101294, term101294.getClass(), "hull", null);
        setField(term101294, term101294.getClass(), "components", null);
        setField(term101294, term101294.getClass(), "hullPoints", null);
        setIntField(term101294, term101294.getClass(), "shield", 0);
        setIntField(term101294, term101294.getClass(), "armor", 0);
        setField(term101294, term101294.getClass(), "image", null);
        setIntField(term101294, term101294.getClass(), "colonist", 0);
        setIntField(term101294, term101294.getClass(), "metal", 0);
        setIntField(term101294, term101294.getClass(), "experience", 0);
        setIntField(term101294, term101294.getClass(), "culture", 0);
        setIntField(term101294, term101294.getClass(), "specialFlags", 0);
        setField(term101294, term101294.getClass(), "tradeCoordinates", null);
        setField(term101294, term101294.getClass(), "name", null);
        setField(term101294, term101294.getClass(), "iconId", null);
        setField(term101294, term101294.getClass(), "description", null);
        setIntField(term101294, term101294.getClass(), "prodCost", 0);
        setIntField(term101294, term101294.getClass(), "metalCost", 0);
        Object term101304 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term101304, term101304.getClass(), "hull", null);
        setField(term101304, term101304.getClass(), "components", null);
        setField(term101304, term101304.getClass(), "hullPoints", null);
        setIntField(term101304, term101304.getClass(), "shield", 0);
        setIntField(term101304, term101304.getClass(), "armor", 0);
        setField(term101304, term101304.getClass(), "image", null);
        setIntField(term101304, term101304.getClass(), "colonist", 0);
        setIntField(term101304, term101304.getClass(), "metal", 0);
        setIntField(term101304, term101304.getClass(), "experience", 0);
        setIntField(term101304, term101304.getClass(), "culture", 0);
        setIntField(term101304, term101304.getClass(), "specialFlags", 0);
        setField(term101304, term101304.getClass(), "tradeCoordinates", null);
        setField(term101304, term101304.getClass(), "name", null);
        setField(term101304, term101304.getClass(), "iconId", null);
        setField(term101304, term101304.getClass(), "description", null);
        setIntField(term101304, term101304.getClass(), "prodCost", 0);
        setIntField(term101304, term101304.getClass(), "metalCost", 0);
        ArrayList term101253 = new ArrayList();
        ((ArrayList) term101253).add(term101255);
        ((ArrayList) term101253).add(term101284);
        ((ArrayList) term101253).add(term101294);
        ((ArrayList) term101253).add(term101304);
        term101252 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term101316 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term101332 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term101338 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term101344 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term101252, term101252.getClass(), "ships", term101253);
        setIntField(term101316, term101316.getClass(), "x", 0);
        setIntField(term101316, term101316.getClass(), "y", 0);
        setField(term101252, term101252.getClass(), "coordinate", term101316);
        setField(term101252, term101252.getClass(), "name", "PyCZLyLBQT");
        setIntField(term101252, term101252.getClass(), "movesLeft", 552468029);
        setDoubleField(term101332, term101332.getClass(), "startX", 0.0);
        setDoubleField(term101332, term101332.getClass(), "startY", 0.0);
        setDoubleField(term101332, term101332.getClass(), "endX", 0.0);
        setDoubleField(term101332, term101332.getClass(), "endY", 0.0);
        setField(term101332, term101332.getClass(), "nextPoints", null);
        setIntField(term101332, term101332.getClass(), "ftlSpeed", 0);
        setField(term101252, term101252.getClass(), "route", term101332);
        setField(term101338, term101338.getClass(), "name", null);
        setField(term101338, term101338.getClass(), "homeworld", null);
        setIntField(term101338, term101338.getClass(), "age", 0);
        setIntField(term101338, term101338.getClass(), "timeInJob", 0);
        setIntField(term101338, term101338.getClass(), "level", 0);
        setIntField(term101338, term101338.getClass(), "experience", 0);
        setField(term101338, term101338.getClass(), "militaryRank", null);
        setField(term101338, term101338.getClass(), "gender", null);
        setField(term101338, term101338.getClass(), "race", null);
        setField(term101338, term101338.getClass(), "title", null);
        setField(term101338, term101338.getClass(), "job", null);
        setField(term101338, term101338.getClass(), "parent", null);
        setIntField(term101338, term101338.getClass(), "parentIndex", 0);
        setField(term101338, term101338.getClass(), "perkList", null);
        setField(term101338, term101338.getClass(), "stats", null);
        setField(term101252, term101252.getClass(), "commander", term101338);
        setIntField(term101344, term101344.getClass(), "maxX", 0);
        setIntField(term101344, term101344.getClass(), "maxY", 0);
        setField(term101344, term101344.getClass(), "blockMap", null);
        setField(term101344, term101344.getClass(), "points", null);
        setIntField(term101344, term101344.getClass(), "tx", 0);
        setIntField(term101344, term101344.getClass(), "ty", 0);
        setIntField(term101344, term101344.getClass(), "targetDistance", 0);
        setField(term101344, term101344.getClass(), "targetPoint", null);
        setIntField(term101344, term101344.getClass(), "routeIndex", 0);
        setField(term101252, term101252.getClass(), "aStarSearch", term101344);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeColonist", argTypes, term101252, args);
    }

};


