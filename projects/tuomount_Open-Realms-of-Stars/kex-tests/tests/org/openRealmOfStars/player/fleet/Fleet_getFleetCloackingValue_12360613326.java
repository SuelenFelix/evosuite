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

public class Fleet_getFleetCloackingValue_12360613326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85387;

    public Fleet_getFleetCloackingValue_12360613326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term85399 = new ArrayList();
        ((ArrayList) term85399).add((Object)null);
        ((ArrayList) term85399).add((Object)null);
        ((ArrayList) term85399).add((Object)null);
        ((ArrayList) term85399).add((Object)null);
        Object term85390 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term85391 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term85402 = (int[]) newIntArray(6);
        Object term85411 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term85419 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term85391, term85391.getClass(), "index", 1392281647);
        setField(term85391, term85391.getClass(), "name", null);
        setIntField(term85391, term85391.getClass(), "maxSlot", 1896966568);
        setIntField(term85391, term85391.getClass(), "slotHull", 95747063);
        setField(term85391, term85391.getClass(), "hullType", null);
        setField(term85391, term85391.getClass(), "size", null);
        setIntField(term85391, term85391.getClass(), "cost", 1353810730);
        setIntField(term85391, term85391.getClass(), "metalCost", 1704841611);
        setIntField(term85391, term85391.getClass(), "imageIndex", -1055865904);
        setDoubleField(term85391, term85391.getClass(), "fleetCapacity", 0.6428742553484879);
        setField(term85391, term85391.getClass(), "originalBuilder", null);
        setField(term85390, term85390.getClass(), "hull", term85391);
        setField(term85390, term85390.getClass(), "components", term85399);
        setIntElement(term85402, 0, -1976851292);
        setIntElement(term85402, 1, 1007436356);
        setIntElement(term85402, 2, 953383703);
        setIntElement(term85402, 3, 379942336);
        setIntElement(term85402, 4, -1553154317);
        setIntElement(term85402, 5, -1016850135);
        setField(term85390, term85390.getClass(), "hullPoints", term85402);
        setIntField(term85390, term85390.getClass(), "shield", 475367008);
        setIntField(term85390, term85390.getClass(), "armor", -1916736881);
        setIntField(term85411, term85411.getClass(), "imageType", -1918049413);
        setField(term85411, term85411.getClass(), "colorModel", null);
        setField(term85411, term85411.getClass(), "raster", null);
        setField(term85411, term85411.getClass(), "osis", null);
        setField(term85411, term85411.getClass(), "properties", null);
        setFloatField(term85411, term85411.getClass(), "accelerationPriority", 0.20144695F);
        setField(term85411, term85411.getClass(), "surfaceManager", null);
        setField(term85390, term85390.getClass(), "image", term85411);
        setIntField(term85390, term85390.getClass(), "colonist", -1191829886);
        setIntField(term85390, term85390.getClass(), "metal", -1544525961);
        setIntField(term85390, term85390.getClass(), "experience", 190733490);
        setIntField(term85390, term85390.getClass(), "culture", 2100537808);
        setIntField(term85390, term85390.getClass(), "specialFlags", 1383366759);
        setIntField(term85419, term85419.getClass(), "x", -424387882);
        setIntField(term85419, term85419.getClass(), "y", -1591399293);
        setField(term85390, term85390.getClass(), "tradeCoordinates", term85419);
        setField(term85390, term85390.getClass(), "name", null);
        setField(term85390, term85390.getClass(), "iconId", null);
        setField(term85390, term85390.getClass(), "description", null);
        setIntField(term85390, term85390.getClass(), "prodCost", 0);
        setIntField(term85390, term85390.getClass(), "metalCost", 0);
        Object term85424 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term85424, term85424.getClass(), "hull", null);
        setField(term85424, term85424.getClass(), "components", null);
        setField(term85424, term85424.getClass(), "hullPoints", null);
        setIntField(term85424, term85424.getClass(), "shield", 0);
        setIntField(term85424, term85424.getClass(), "armor", 0);
        setField(term85424, term85424.getClass(), "image", null);
        setIntField(term85424, term85424.getClass(), "colonist", 0);
        setIntField(term85424, term85424.getClass(), "metal", 0);
        setIntField(term85424, term85424.getClass(), "experience", 0);
        setIntField(term85424, term85424.getClass(), "culture", 0);
        setIntField(term85424, term85424.getClass(), "specialFlags", 0);
        setField(term85424, term85424.getClass(), "tradeCoordinates", null);
        setField(term85424, term85424.getClass(), "name", null);
        setField(term85424, term85424.getClass(), "iconId", null);
        setField(term85424, term85424.getClass(), "description", null);
        setIntField(term85424, term85424.getClass(), "prodCost", 0);
        setIntField(term85424, term85424.getClass(), "metalCost", 0);
        Object term85434 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term85434, term85434.getClass(), "hull", null);
        setField(term85434, term85434.getClass(), "components", null);
        setField(term85434, term85434.getClass(), "hullPoints", null);
        setIntField(term85434, term85434.getClass(), "shield", 0);
        setIntField(term85434, term85434.getClass(), "armor", 0);
        setField(term85434, term85434.getClass(), "image", null);
        setIntField(term85434, term85434.getClass(), "colonist", 0);
        setIntField(term85434, term85434.getClass(), "metal", 0);
        setIntField(term85434, term85434.getClass(), "experience", 0);
        setIntField(term85434, term85434.getClass(), "culture", 0);
        setIntField(term85434, term85434.getClass(), "specialFlags", 0);
        setField(term85434, term85434.getClass(), "tradeCoordinates", null);
        setField(term85434, term85434.getClass(), "name", null);
        setField(term85434, term85434.getClass(), "iconId", null);
        setField(term85434, term85434.getClass(), "description", null);
        setIntField(term85434, term85434.getClass(), "prodCost", 0);
        setIntField(term85434, term85434.getClass(), "metalCost", 0);
        Object term85444 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term85444, term85444.getClass(), "hull", null);
        setField(term85444, term85444.getClass(), "components", null);
        setField(term85444, term85444.getClass(), "hullPoints", null);
        setIntField(term85444, term85444.getClass(), "shield", 0);
        setIntField(term85444, term85444.getClass(), "armor", 0);
        setField(term85444, term85444.getClass(), "image", null);
        setIntField(term85444, term85444.getClass(), "colonist", 0);
        setIntField(term85444, term85444.getClass(), "metal", 0);
        setIntField(term85444, term85444.getClass(), "experience", 0);
        setIntField(term85444, term85444.getClass(), "culture", 0);
        setIntField(term85444, term85444.getClass(), "specialFlags", 0);
        setField(term85444, term85444.getClass(), "tradeCoordinates", null);
        setField(term85444, term85444.getClass(), "name", null);
        setField(term85444, term85444.getClass(), "iconId", null);
        setField(term85444, term85444.getClass(), "description", null);
        setIntField(term85444, term85444.getClass(), "prodCost", 0);
        setIntField(term85444, term85444.getClass(), "metalCost", 0);
        ArrayList term85388 = new ArrayList();
        ((ArrayList) term85388).add(term85390);
        ((ArrayList) term85388).add(term85424);
        ((ArrayList) term85388).add(term85434);
        ((ArrayList) term85388).add(term85444);
        term85387 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term85456 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term85472 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term85478 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term85484 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term85387, term85387.getClass(), "ships", term85388);
        setIntField(term85456, term85456.getClass(), "x", 0);
        setIntField(term85456, term85456.getClass(), "y", 0);
        setField(term85387, term85387.getClass(), "coordinate", term85456);
        setField(term85387, term85387.getClass(), "name", "fiwockBanw");
        setIntField(term85387, term85387.getClass(), "movesLeft", 1341679614);
        setDoubleField(term85472, term85472.getClass(), "startX", 0.0);
        setDoubleField(term85472, term85472.getClass(), "startY", 0.0);
        setDoubleField(term85472, term85472.getClass(), "endX", 0.0);
        setDoubleField(term85472, term85472.getClass(), "endY", 0.0);
        setField(term85472, term85472.getClass(), "nextPoints", null);
        setIntField(term85472, term85472.getClass(), "ftlSpeed", 0);
        setField(term85387, term85387.getClass(), "route", term85472);
        setField(term85478, term85478.getClass(), "name", null);
        setField(term85478, term85478.getClass(), "homeworld", null);
        setIntField(term85478, term85478.getClass(), "age", 0);
        setIntField(term85478, term85478.getClass(), "timeInJob", 0);
        setIntField(term85478, term85478.getClass(), "level", 0);
        setIntField(term85478, term85478.getClass(), "experience", 0);
        setField(term85478, term85478.getClass(), "militaryRank", null);
        setField(term85478, term85478.getClass(), "gender", null);
        setField(term85478, term85478.getClass(), "race", null);
        setField(term85478, term85478.getClass(), "title", null);
        setField(term85478, term85478.getClass(), "job", null);
        setField(term85478, term85478.getClass(), "parent", null);
        setIntField(term85478, term85478.getClass(), "parentIndex", 0);
        setField(term85478, term85478.getClass(), "perkList", null);
        setField(term85478, term85478.getClass(), "stats", null);
        setField(term85387, term85387.getClass(), "commander", term85478);
        setIntField(term85484, term85484.getClass(), "maxX", 0);
        setIntField(term85484, term85484.getClass(), "maxY", 0);
        setField(term85484, term85484.getClass(), "blockMap", null);
        setField(term85484, term85484.getClass(), "points", null);
        setIntField(term85484, term85484.getClass(), "tx", 0);
        setIntField(term85484, term85484.getClass(), "ty", 0);
        setIntField(term85484, term85484.getClass(), "targetDistance", 0);
        setField(term85484, term85484.getClass(), "targetPoint", null);
        setIntField(term85484, term85484.getClass(), "routeIndex", 0);
        setField(term85387, term85387.getClass(), "aStarSearch", term85484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFleetCloackingValue", argTypes, term85387, args);
    }

};


