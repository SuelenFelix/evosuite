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

public class Fleet_getFleetCloakDetection_80494951825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85293;

    public Fleet_getFleetCloakDetection_80494951825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term85305 = new ArrayList();
        ((ArrayList) term85305).add((Object)null);
        ((ArrayList) term85305).add((Object)null);
        ((ArrayList) term85305).add((Object)null);
        ((ArrayList) term85305).add((Object)null);
        Object term85296 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term85297 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term85308 = (int[]) newIntArray(3);
        Object term85314 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term85322 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term85297, term85297.getClass(), "index", 444110876);
        setField(term85297, term85297.getClass(), "name", null);
        setIntField(term85297, term85297.getClass(), "maxSlot", 1331389613);
        setIntField(term85297, term85297.getClass(), "slotHull", -112675568);
        setField(term85297, term85297.getClass(), "hullType", null);
        setField(term85297, term85297.getClass(), "size", null);
        setIntField(term85297, term85297.getClass(), "cost", 1560144379);
        setIntField(term85297, term85297.getClass(), "metalCost", 1375062894);
        setIntField(term85297, term85297.getClass(), "imageIndex", -1230393533);
        setDoubleField(term85297, term85297.getClass(), "fleetCapacity", 0.7859316615744082);
        setField(term85297, term85297.getClass(), "originalBuilder", null);
        setField(term85296, term85296.getClass(), "hull", term85297);
        setField(term85296, term85296.getClass(), "components", term85305);
        setIntElement(term85308, 0, 1563333150);
        setIntElement(term85308, 1, -766475202);
        setIntElement(term85308, 2, 1362362674);
        setField(term85296, term85296.getClass(), "hullPoints", term85308);
        setIntField(term85296, term85296.getClass(), "shield", 553585097);
        setIntField(term85296, term85296.getClass(), "armor", 1212393039);
        setIntField(term85314, term85314.getClass(), "imageType", -1346793067);
        setField(term85314, term85314.getClass(), "colorModel", null);
        setField(term85314, term85314.getClass(), "raster", null);
        setField(term85314, term85314.getClass(), "osis", null);
        setField(term85314, term85314.getClass(), "properties", null);
        setFloatField(term85314, term85314.getClass(), "accelerationPriority", 0.13745493F);
        setField(term85314, term85314.getClass(), "surfaceManager", null);
        setField(term85296, term85296.getClass(), "image", term85314);
        setIntField(term85296, term85296.getClass(), "colonist", 815999627);
        setIntField(term85296, term85296.getClass(), "metal", -1361096912);
        setIntField(term85296, term85296.getClass(), "experience", -1489448292);
        setIntField(term85296, term85296.getClass(), "culture", -111099654);
        setIntField(term85296, term85296.getClass(), "specialFlags", 1865814659);
        setIntField(term85322, term85322.getClass(), "x", -715300089);
        setIntField(term85322, term85322.getClass(), "y", 493602399);
        setField(term85296, term85296.getClass(), "tradeCoordinates", term85322);
        setField(term85296, term85296.getClass(), "name", null);
        setField(term85296, term85296.getClass(), "iconId", null);
        setField(term85296, term85296.getClass(), "description", null);
        setIntField(term85296, term85296.getClass(), "prodCost", 0);
        setIntField(term85296, term85296.getClass(), "metalCost", 0);
        Object term85327 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term85327, term85327.getClass(), "hull", null);
        setField(term85327, term85327.getClass(), "components", null);
        setField(term85327, term85327.getClass(), "hullPoints", null);
        setIntField(term85327, term85327.getClass(), "shield", 0);
        setIntField(term85327, term85327.getClass(), "armor", 0);
        setField(term85327, term85327.getClass(), "image", null);
        setIntField(term85327, term85327.getClass(), "colonist", 0);
        setIntField(term85327, term85327.getClass(), "metal", 0);
        setIntField(term85327, term85327.getClass(), "experience", 0);
        setIntField(term85327, term85327.getClass(), "culture", 0);
        setIntField(term85327, term85327.getClass(), "specialFlags", 0);
        setField(term85327, term85327.getClass(), "tradeCoordinates", null);
        setField(term85327, term85327.getClass(), "name", null);
        setField(term85327, term85327.getClass(), "iconId", null);
        setField(term85327, term85327.getClass(), "description", null);
        setIntField(term85327, term85327.getClass(), "prodCost", 0);
        setIntField(term85327, term85327.getClass(), "metalCost", 0);
        ArrayList term85294 = new ArrayList();
        ((ArrayList) term85294).add(term85296);
        ((ArrayList) term85294).add(term85327);
        term85293 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term85339 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term85355 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term85361 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term85367 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term85293, term85293.getClass(), "ships", term85294);
        setIntField(term85339, term85339.getClass(), "x", 0);
        setIntField(term85339, term85339.getClass(), "y", 0);
        setField(term85293, term85293.getClass(), "coordinate", term85339);
        setField(term85293, term85293.getClass(), "name", "igRVOATJPd");
        setIntField(term85293, term85293.getClass(), "movesLeft", -131718261);
        setDoubleField(term85355, term85355.getClass(), "startX", 0.0);
        setDoubleField(term85355, term85355.getClass(), "startY", 0.0);
        setDoubleField(term85355, term85355.getClass(), "endX", 0.0);
        setDoubleField(term85355, term85355.getClass(), "endY", 0.0);
        setField(term85355, term85355.getClass(), "nextPoints", null);
        setIntField(term85355, term85355.getClass(), "ftlSpeed", 0);
        setField(term85293, term85293.getClass(), "route", term85355);
        setField(term85361, term85361.getClass(), "name", null);
        setField(term85361, term85361.getClass(), "homeworld", null);
        setIntField(term85361, term85361.getClass(), "age", 0);
        setIntField(term85361, term85361.getClass(), "timeInJob", 0);
        setIntField(term85361, term85361.getClass(), "level", 0);
        setIntField(term85361, term85361.getClass(), "experience", 0);
        setField(term85361, term85361.getClass(), "militaryRank", null);
        setField(term85361, term85361.getClass(), "gender", null);
        setField(term85361, term85361.getClass(), "race", null);
        setField(term85361, term85361.getClass(), "title", null);
        setField(term85361, term85361.getClass(), "job", null);
        setField(term85361, term85361.getClass(), "parent", null);
        setIntField(term85361, term85361.getClass(), "parentIndex", 0);
        setField(term85361, term85361.getClass(), "perkList", null);
        setField(term85361, term85361.getClass(), "stats", null);
        setField(term85293, term85293.getClass(), "commander", term85361);
        setIntField(term85367, term85367.getClass(), "maxX", 0);
        setIntField(term85367, term85367.getClass(), "maxY", 0);
        setField(term85367, term85367.getClass(), "blockMap", null);
        setField(term85367, term85367.getClass(), "points", null);
        setIntField(term85367, term85367.getClass(), "tx", 0);
        setIntField(term85367, term85367.getClass(), "ty", 0);
        setIntField(term85367, term85367.getClass(), "targetDistance", 0);
        setField(term85367, term85367.getClass(), "targetPoint", null);
        setIntField(term85367, term85367.getClass(), "routeIndex", 0);
        setField(term85293, term85293.getClass(), "aStarSearch", term85367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFleetCloakDetection", argTypes, term85293, args);
    }

};


