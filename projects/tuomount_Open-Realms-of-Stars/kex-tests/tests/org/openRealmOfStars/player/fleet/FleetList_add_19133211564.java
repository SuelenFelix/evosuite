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

public class FleetList_add_19133211564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220175;
     Object term220181;

    public FleetList_add_19133211564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term220176 = new ArrayList();
        term220175 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.FleetList"));
        setField(term220175, term220175.getClass(), "fleetList", term220176);
        setIntField(term220175, term220175.getClass(), "index", -1);
        ArrayList term220193 = new ArrayList();
        ((ArrayList) term220193).add((Object)null);
        ((ArrayList) term220193).add((Object)null);
        ((ArrayList) term220193).add((Object)null);
        ((ArrayList) term220193).add((Object)null);
        Object term220184 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term220185 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term220196 = (int[]) newIntArray(2);
        Object term220201 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term220209 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term220185, term220185.getClass(), "index", 389915231);
        setField(term220185, term220185.getClass(), "name", null);
        setIntField(term220185, term220185.getClass(), "maxSlot", 804747162);
        setIntField(term220185, term220185.getClass(), "slotHull", -791466650);
        setField(term220185, term220185.getClass(), "hullType", null);
        setField(term220185, term220185.getClass(), "size", null);
        setIntField(term220185, term220185.getClass(), "cost", -523835907);
        setIntField(term220185, term220185.getClass(), "metalCost", 385209642);
        setIntField(term220185, term220185.getClass(), "imageIndex", -1815702004);
        setDoubleField(term220185, term220185.getClass(), "fleetCapacity", 0.24168508149332457);
        setField(term220185, term220185.getClass(), "originalBuilder", null);
        setField(term220184, term220184.getClass(), "hull", term220185);
        setField(term220184, term220184.getClass(), "components", term220193);
        setIntElement(term220196, 0, -2099268660);
        setIntElement(term220196, 1, 1667337184);
        setField(term220184, term220184.getClass(), "hullPoints", term220196);
        setIntField(term220184, term220184.getClass(), "shield", 824363409);
        setIntField(term220184, term220184.getClass(), "armor", -386686554);
        setIntField(term220201, term220201.getClass(), "imageType", 271252577);
        setField(term220201, term220201.getClass(), "colorModel", null);
        setField(term220201, term220201.getClass(), "raster", null);
        setField(term220201, term220201.getClass(), "osis", null);
        setField(term220201, term220201.getClass(), "properties", null);
        setFloatField(term220201, term220201.getClass(), "accelerationPriority", 0.8704517F);
        setField(term220201, term220201.getClass(), "surfaceManager", null);
        setField(term220184, term220184.getClass(), "image", term220201);
        setIntField(term220184, term220184.getClass(), "colonist", -1724136965);
        setIntField(term220184, term220184.getClass(), "metal", 838077311);
        setIntField(term220184, term220184.getClass(), "experience", 247997035);
        setIntField(term220184, term220184.getClass(), "culture", 484164039);
        setIntField(term220184, term220184.getClass(), "specialFlags", 1132248674);
        setIntField(term220209, term220209.getClass(), "x", 145644776);
        setIntField(term220209, term220209.getClass(), "y", -831867823);
        setField(term220184, term220184.getClass(), "tradeCoordinates", term220209);
        setField(term220184, term220184.getClass(), "name", null);
        setField(term220184, term220184.getClass(), "iconId", null);
        setField(term220184, term220184.getClass(), "description", null);
        setIntField(term220184, term220184.getClass(), "prodCost", 0);
        setIntField(term220184, term220184.getClass(), "metalCost", 0);
        ArrayList term220182 = new ArrayList();
        ((ArrayList) term220182).add(term220184);
        term220181 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term220216 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term220232 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term220238 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term220244 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term220181, term220181.getClass(), "ships", term220182);
        setIntField(term220216, term220216.getClass(), "x", 0);
        setIntField(term220216, term220216.getClass(), "y", 0);
        setField(term220181, term220181.getClass(), "coordinate", term220216);
        setField(term220181, term220181.getClass(), "name", "DCUNPyCrFE");
        setIntField(term220181, term220181.getClass(), "movesLeft", -1692196889);
        setDoubleField(term220232, term220232.getClass(), "startX", 0.0);
        setDoubleField(term220232, term220232.getClass(), "startY", 0.0);
        setDoubleField(term220232, term220232.getClass(), "endX", 0.0);
        setDoubleField(term220232, term220232.getClass(), "endY", 0.0);
        setField(term220232, term220232.getClass(), "nextPoints", null);
        setIntField(term220232, term220232.getClass(), "ftlSpeed", 0);
        setField(term220181, term220181.getClass(), "route", term220232);
        setField(term220238, term220238.getClass(), "name", null);
        setField(term220238, term220238.getClass(), "homeworld", null);
        setIntField(term220238, term220238.getClass(), "age", 0);
        setIntField(term220238, term220238.getClass(), "timeInJob", 0);
        setIntField(term220238, term220238.getClass(), "level", 0);
        setIntField(term220238, term220238.getClass(), "experience", 0);
        setField(term220238, term220238.getClass(), "militaryRank", null);
        setField(term220238, term220238.getClass(), "gender", null);
        setField(term220238, term220238.getClass(), "race", null);
        setField(term220238, term220238.getClass(), "title", null);
        setField(term220238, term220238.getClass(), "job", null);
        setField(term220238, term220238.getClass(), "parent", null);
        setIntField(term220238, term220238.getClass(), "parentIndex", 0);
        setField(term220238, term220238.getClass(), "perkList", null);
        setField(term220238, term220238.getClass(), "stats", null);
        setField(term220181, term220181.getClass(), "commander", term220238);
        setIntField(term220244, term220244.getClass(), "maxX", 0);
        setIntField(term220244, term220244.getClass(), "maxY", 0);
        setField(term220244, term220244.getClass(), "blockMap", null);
        setField(term220244, term220244.getClass(), "points", null);
        setIntField(term220244, term220244.getClass(), "tx", 0);
        setIntField(term220244, term220244.getClass(), "ty", 0);
        setIntField(term220244, term220244.getClass(), "targetDistance", 0);
        setField(term220244, term220244.getClass(), "targetPoint", null);
        setIntField(term220244, term220244.getClass(), "routeIndex", 0);
        setField(term220181, term220181.getClass(), "aStarSearch", term220244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.FleetList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[1];
        args[0] = term220181;
        callMethod(klass, "add", argTypes, term220175, args);
    }

};


