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

public class FleetList_isUniqueName_12027358566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220291;
     Object term220309;

    public FleetList_isUniqueName_12027358566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term220292 = new ArrayList();
        term220291 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.FleetList"));
        setField(term220291, term220291.getClass(), "fleetList", term220292);
        setIntField(term220291, term220291.getClass(), "index", -1);
        ArrayList term220321 = new ArrayList();
        ((ArrayList) term220321).add((Object)null);
        ((ArrayList) term220321).add((Object)null);
        ((ArrayList) term220321).add((Object)null);
        ((ArrayList) term220321).add((Object)null);
        ((ArrayList) term220321).add((Object)null);
        ((ArrayList) term220321).add((Object)null);
        ((ArrayList) term220321).add((Object)null);
        ((ArrayList) term220321).add((Object)null);
        ((ArrayList) term220321).add((Object)null);
        Object term220312 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term220313 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term220324 = (int[]) newIntArray(3);
        Object term220330 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term220338 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term220313, term220313.getClass(), "index", 25600877);
        setField(term220313, term220313.getClass(), "name", null);
        setIntField(term220313, term220313.getClass(), "maxSlot", -1756534726);
        setIntField(term220313, term220313.getClass(), "slotHull", -359047843);
        setField(term220313, term220313.getClass(), "hullType", null);
        setField(term220313, term220313.getClass(), "size", null);
        setIntField(term220313, term220313.getClass(), "cost", 1990411423);
        setIntField(term220313, term220313.getClass(), "metalCost", -1628643632);
        setIntField(term220313, term220313.getClass(), "imageIndex", 1972351840);
        setDoubleField(term220313, term220313.getClass(), "fleetCapacity", 0.9765582392968284);
        setField(term220313, term220313.getClass(), "originalBuilder", null);
        setField(term220312, term220312.getClass(), "hull", term220313);
        setField(term220312, term220312.getClass(), "components", term220321);
        setIntElement(term220324, 0, -1251439328);
        setIntElement(term220324, 1, 1798785752);
        setIntElement(term220324, 2, 195739943);
        setField(term220312, term220312.getClass(), "hullPoints", term220324);
        setIntField(term220312, term220312.getClass(), "shield", 594364543);
        setIntField(term220312, term220312.getClass(), "armor", 401266476);
        setIntField(term220330, term220330.getClass(), "imageType", -1352592419);
        setField(term220330, term220330.getClass(), "colorModel", null);
        setField(term220330, term220330.getClass(), "raster", null);
        setField(term220330, term220330.getClass(), "osis", null);
        setField(term220330, term220330.getClass(), "properties", null);
        setFloatField(term220330, term220330.getClass(), "accelerationPriority", 0.5873228F);
        setField(term220330, term220330.getClass(), "surfaceManager", null);
        setField(term220312, term220312.getClass(), "image", term220330);
        setIntField(term220312, term220312.getClass(), "colonist", -1315887759);
        setIntField(term220312, term220312.getClass(), "metal", -385751288);
        setIntField(term220312, term220312.getClass(), "experience", 1481730960);
        setIntField(term220312, term220312.getClass(), "culture", -681947751);
        setIntField(term220312, term220312.getClass(), "specialFlags", 542595949);
        setIntField(term220338, term220338.getClass(), "x", -2127757374);
        setIntField(term220338, term220338.getClass(), "y", -1843693519);
        setField(term220312, term220312.getClass(), "tradeCoordinates", term220338);
        setField(term220312, term220312.getClass(), "name", null);
        setField(term220312, term220312.getClass(), "iconId", null);
        setField(term220312, term220312.getClass(), "description", null);
        setIntField(term220312, term220312.getClass(), "prodCost", 0);
        setIntField(term220312, term220312.getClass(), "metalCost", 0);
        Object term220343 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term220343, term220343.getClass(), "hull", null);
        setField(term220343, term220343.getClass(), "components", null);
        setField(term220343, term220343.getClass(), "hullPoints", null);
        setIntField(term220343, term220343.getClass(), "shield", 0);
        setIntField(term220343, term220343.getClass(), "armor", 0);
        setField(term220343, term220343.getClass(), "image", null);
        setIntField(term220343, term220343.getClass(), "colonist", 0);
        setIntField(term220343, term220343.getClass(), "metal", 0);
        setIntField(term220343, term220343.getClass(), "experience", 0);
        setIntField(term220343, term220343.getClass(), "culture", 0);
        setIntField(term220343, term220343.getClass(), "specialFlags", 0);
        setField(term220343, term220343.getClass(), "tradeCoordinates", null);
        setField(term220343, term220343.getClass(), "name", null);
        setField(term220343, term220343.getClass(), "iconId", null);
        setField(term220343, term220343.getClass(), "description", null);
        setIntField(term220343, term220343.getClass(), "prodCost", 0);
        setIntField(term220343, term220343.getClass(), "metalCost", 0);
        Object term220353 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term220353, term220353.getClass(), "hull", null);
        setField(term220353, term220353.getClass(), "components", null);
        setField(term220353, term220353.getClass(), "hullPoints", null);
        setIntField(term220353, term220353.getClass(), "shield", 0);
        setIntField(term220353, term220353.getClass(), "armor", 0);
        setField(term220353, term220353.getClass(), "image", null);
        setIntField(term220353, term220353.getClass(), "colonist", 0);
        setIntField(term220353, term220353.getClass(), "metal", 0);
        setIntField(term220353, term220353.getClass(), "experience", 0);
        setIntField(term220353, term220353.getClass(), "culture", 0);
        setIntField(term220353, term220353.getClass(), "specialFlags", 0);
        setField(term220353, term220353.getClass(), "tradeCoordinates", null);
        setField(term220353, term220353.getClass(), "name", null);
        setField(term220353, term220353.getClass(), "iconId", null);
        setField(term220353, term220353.getClass(), "description", null);
        setIntField(term220353, term220353.getClass(), "prodCost", 0);
        setIntField(term220353, term220353.getClass(), "metalCost", 0);
        ArrayList term220310 = new ArrayList();
        ((ArrayList) term220310).add(term220312);
        ((ArrayList) term220310).add(term220343);
        ((ArrayList) term220310).add(term220353);
        term220309 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term220365 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term220381 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term220387 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term220393 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term220309, term220309.getClass(), "ships", term220310);
        setIntField(term220365, term220365.getClass(), "x", 0);
        setIntField(term220365, term220365.getClass(), "y", 0);
        setField(term220309, term220309.getClass(), "coordinate", term220365);
        setField(term220309, term220309.getClass(), "name", "DsuqUYdhHr");
        setIntField(term220309, term220309.getClass(), "movesLeft", -64038546);
        setDoubleField(term220381, term220381.getClass(), "startX", 0.0);
        setDoubleField(term220381, term220381.getClass(), "startY", 0.0);
        setDoubleField(term220381, term220381.getClass(), "endX", 0.0);
        setDoubleField(term220381, term220381.getClass(), "endY", 0.0);
        setField(term220381, term220381.getClass(), "nextPoints", null);
        setIntField(term220381, term220381.getClass(), "ftlSpeed", 0);
        setField(term220309, term220309.getClass(), "route", term220381);
        setField(term220387, term220387.getClass(), "name", null);
        setField(term220387, term220387.getClass(), "homeworld", null);
        setIntField(term220387, term220387.getClass(), "age", 0);
        setIntField(term220387, term220387.getClass(), "timeInJob", 0);
        setIntField(term220387, term220387.getClass(), "level", 0);
        setIntField(term220387, term220387.getClass(), "experience", 0);
        setField(term220387, term220387.getClass(), "militaryRank", null);
        setField(term220387, term220387.getClass(), "gender", null);
        setField(term220387, term220387.getClass(), "race", null);
        setField(term220387, term220387.getClass(), "title", null);
        setField(term220387, term220387.getClass(), "job", null);
        setField(term220387, term220387.getClass(), "parent", null);
        setIntField(term220387, term220387.getClass(), "parentIndex", 0);
        setField(term220387, term220387.getClass(), "perkList", null);
        setField(term220387, term220387.getClass(), "stats", null);
        setField(term220309, term220309.getClass(), "commander", term220387);
        setIntField(term220393, term220393.getClass(), "maxX", 0);
        setIntField(term220393, term220393.getClass(), "maxY", 0);
        setField(term220393, term220393.getClass(), "blockMap", null);
        setField(term220393, term220393.getClass(), "points", null);
        setIntField(term220393, term220393.getClass(), "tx", 0);
        setIntField(term220393, term220393.getClass(), "ty", 0);
        setIntField(term220393, term220393.getClass(), "targetDistance", 0);
        setField(term220393, term220393.getClass(), "targetPoint", null);
        setIntField(term220393, term220393.getClass(), "routeIndex", 0);
        setField(term220309, term220309.getClass(), "aStarSearch", term220393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.FleetList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[2];
        args[0] = "xcpoffFZBm";
        args[1] = term220309;
        callMethod(klass, "isUniqueName", argTypes, term220291, args);
    }

};


