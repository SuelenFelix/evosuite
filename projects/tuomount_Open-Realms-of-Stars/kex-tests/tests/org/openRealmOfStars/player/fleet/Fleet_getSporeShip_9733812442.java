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

public class Fleet_getSporeShip_9733812442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101524;

    public Fleet_getSporeShip_9733812442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term101536 = new ArrayList();
        ((ArrayList) term101536).add((Object)null);
        ((ArrayList) term101536).add((Object)null);
        ((ArrayList) term101536).add((Object)null);
        ((ArrayList) term101536).add((Object)null);
        ((ArrayList) term101536).add((Object)null);
        Object term101527 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term101528 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term101539 = (int[]) newIntArray(8);
        Object term101550 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term101558 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term101528, term101528.getClass(), "index", 1107432374);
        setField(term101528, term101528.getClass(), "name", null);
        setIntField(term101528, term101528.getClass(), "maxSlot", 1623768155);
        setIntField(term101528, term101528.getClass(), "slotHull", -919788156);
        setField(term101528, term101528.getClass(), "hullType", null);
        setField(term101528, term101528.getClass(), "size", null);
        setIntField(term101528, term101528.getClass(), "cost", 29020862);
        setIntField(term101528, term101528.getClass(), "metalCost", 1981104215);
        setIntField(term101528, term101528.getClass(), "imageIndex", 2123592941);
        setDoubleField(term101528, term101528.getClass(), "fleetCapacity", 0.7046974927834232);
        setField(term101528, term101528.getClass(), "originalBuilder", null);
        setField(term101527, term101527.getClass(), "hull", term101528);
        setField(term101527, term101527.getClass(), "components", term101536);
        setIntElement(term101539, 0, 901132234);
        setIntElement(term101539, 1, -205835456);
        setIntElement(term101539, 2, 889992615);
        setIntElement(term101539, 3, 1184212871);
        setIntElement(term101539, 4, 1318633291);
        setIntElement(term101539, 5, 163521915);
        setIntElement(term101539, 6, 208383602);
        setIntElement(term101539, 7, -936623097);
        setField(term101527, term101527.getClass(), "hullPoints", term101539);
        setIntField(term101527, term101527.getClass(), "shield", -1148000466);
        setIntField(term101527, term101527.getClass(), "armor", 1299330727);
        setIntField(term101550, term101550.getClass(), "imageType", 1541672801);
        setField(term101550, term101550.getClass(), "colorModel", null);
        setField(term101550, term101550.getClass(), "raster", null);
        setField(term101550, term101550.getClass(), "osis", null);
        setField(term101550, term101550.getClass(), "properties", null);
        setFloatField(term101550, term101550.getClass(), "accelerationPriority", 0.96323884F);
        setField(term101550, term101550.getClass(), "surfaceManager", null);
        setField(term101527, term101527.getClass(), "image", term101550);
        setIntField(term101527, term101527.getClass(), "colonist", -2030213410);
        setIntField(term101527, term101527.getClass(), "metal", -63736169);
        setIntField(term101527, term101527.getClass(), "experience", 1480163997);
        setIntField(term101527, term101527.getClass(), "culture", -949949277);
        setIntField(term101527, term101527.getClass(), "specialFlags", -1805950945);
        setIntField(term101558, term101558.getClass(), "x", 674695717);
        setIntField(term101558, term101558.getClass(), "y", 1298497946);
        setField(term101527, term101527.getClass(), "tradeCoordinates", term101558);
        setField(term101527, term101527.getClass(), "name", null);
        setField(term101527, term101527.getClass(), "iconId", null);
        setField(term101527, term101527.getClass(), "description", null);
        setIntField(term101527, term101527.getClass(), "prodCost", 0);
        setIntField(term101527, term101527.getClass(), "metalCost", 0);
        Object term101563 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term101563, term101563.getClass(), "hull", null);
        setField(term101563, term101563.getClass(), "components", null);
        setField(term101563, term101563.getClass(), "hullPoints", null);
        setIntField(term101563, term101563.getClass(), "shield", 0);
        setIntField(term101563, term101563.getClass(), "armor", 0);
        setField(term101563, term101563.getClass(), "image", null);
        setIntField(term101563, term101563.getClass(), "colonist", 0);
        setIntField(term101563, term101563.getClass(), "metal", 0);
        setIntField(term101563, term101563.getClass(), "experience", 0);
        setIntField(term101563, term101563.getClass(), "culture", 0);
        setIntField(term101563, term101563.getClass(), "specialFlags", 0);
        setField(term101563, term101563.getClass(), "tradeCoordinates", null);
        setField(term101563, term101563.getClass(), "name", null);
        setField(term101563, term101563.getClass(), "iconId", null);
        setField(term101563, term101563.getClass(), "description", null);
        setIntField(term101563, term101563.getClass(), "prodCost", 0);
        setIntField(term101563, term101563.getClass(), "metalCost", 0);
        Object term101573 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term101573, term101573.getClass(), "hull", null);
        setField(term101573, term101573.getClass(), "components", null);
        setField(term101573, term101573.getClass(), "hullPoints", null);
        setIntField(term101573, term101573.getClass(), "shield", 0);
        setIntField(term101573, term101573.getClass(), "armor", 0);
        setField(term101573, term101573.getClass(), "image", null);
        setIntField(term101573, term101573.getClass(), "colonist", 0);
        setIntField(term101573, term101573.getClass(), "metal", 0);
        setIntField(term101573, term101573.getClass(), "experience", 0);
        setIntField(term101573, term101573.getClass(), "culture", 0);
        setIntField(term101573, term101573.getClass(), "specialFlags", 0);
        setField(term101573, term101573.getClass(), "tradeCoordinates", null);
        setField(term101573, term101573.getClass(), "name", null);
        setField(term101573, term101573.getClass(), "iconId", null);
        setField(term101573, term101573.getClass(), "description", null);
        setIntField(term101573, term101573.getClass(), "prodCost", 0);
        setIntField(term101573, term101573.getClass(), "metalCost", 0);
        ArrayList term101525 = new ArrayList();
        ((ArrayList) term101525).add(term101527);
        ((ArrayList) term101525).add(term101563);
        ((ArrayList) term101525).add(term101573);
        term101524 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term101585 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term101601 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term101607 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term101613 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term101524, term101524.getClass(), "ships", term101525);
        setIntField(term101585, term101585.getClass(), "x", 0);
        setIntField(term101585, term101585.getClass(), "y", 0);
        setField(term101524, term101524.getClass(), "coordinate", term101585);
        setField(term101524, term101524.getClass(), "name", "ZgWEffEuOS");
        setIntField(term101524, term101524.getClass(), "movesLeft", -358531856);
        setDoubleField(term101601, term101601.getClass(), "startX", 0.0);
        setDoubleField(term101601, term101601.getClass(), "startY", 0.0);
        setDoubleField(term101601, term101601.getClass(), "endX", 0.0);
        setDoubleField(term101601, term101601.getClass(), "endY", 0.0);
        setField(term101601, term101601.getClass(), "nextPoints", null);
        setIntField(term101601, term101601.getClass(), "ftlSpeed", 0);
        setField(term101524, term101524.getClass(), "route", term101601);
        setField(term101607, term101607.getClass(), "name", null);
        setField(term101607, term101607.getClass(), "homeworld", null);
        setIntField(term101607, term101607.getClass(), "age", 0);
        setIntField(term101607, term101607.getClass(), "timeInJob", 0);
        setIntField(term101607, term101607.getClass(), "level", 0);
        setIntField(term101607, term101607.getClass(), "experience", 0);
        setField(term101607, term101607.getClass(), "militaryRank", null);
        setField(term101607, term101607.getClass(), "gender", null);
        setField(term101607, term101607.getClass(), "race", null);
        setField(term101607, term101607.getClass(), "title", null);
        setField(term101607, term101607.getClass(), "job", null);
        setField(term101607, term101607.getClass(), "parent", null);
        setIntField(term101607, term101607.getClass(), "parentIndex", 0);
        setField(term101607, term101607.getClass(), "perkList", null);
        setField(term101607, term101607.getClass(), "stats", null);
        setField(term101524, term101524.getClass(), "commander", term101607);
        setIntField(term101613, term101613.getClass(), "maxX", 0);
        setIntField(term101613, term101613.getClass(), "maxY", 0);
        setField(term101613, term101613.getClass(), "blockMap", null);
        setField(term101613, term101613.getClass(), "points", null);
        setIntField(term101613, term101613.getClass(), "tx", 0);
        setIntField(term101613, term101613.getClass(), "ty", 0);
        setIntField(term101613, term101613.getClass(), "targetDistance", 0);
        setField(term101613, term101613.getClass(), "targetPoint", null);
        setIntField(term101613, term101613.getClass(), "routeIndex", 0);
        setField(term101524, term101524.getClass(), "aStarSearch", term101613);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSporeShip", argTypes, term101524, args);
    }

};


