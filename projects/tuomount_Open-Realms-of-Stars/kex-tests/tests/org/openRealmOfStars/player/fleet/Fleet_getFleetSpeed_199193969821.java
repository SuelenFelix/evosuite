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
import java.lang.Boolean;

public class Fleet_getFleetSpeed_199193969821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78986;
     Object term79061;

    public Fleet_getFleetSpeed_199193969821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term78998 = new ArrayList();
        ((ArrayList) term78998).add((Object)null);
        ((ArrayList) term78998).add((Object)null);
        ((ArrayList) term78998).add((Object)null);
        ((ArrayList) term78998).add((Object)null);
        Object term78989 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term78990 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term79001 = (int[]) newIntArray(7);
        Object term79011 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term79019 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term78990, term78990.getClass(), "index", -2069953525);
        setField(term78990, term78990.getClass(), "name", null);
        setIntField(term78990, term78990.getClass(), "maxSlot", -1911653858);
        setIntField(term78990, term78990.getClass(), "slotHull", 1817540520);
        setField(term78990, term78990.getClass(), "hullType", null);
        setField(term78990, term78990.getClass(), "size", null);
        setIntField(term78990, term78990.getClass(), "cost", 83060289);
        setIntField(term78990, term78990.getClass(), "metalCost", -2109132583);
        setIntField(term78990, term78990.getClass(), "imageIndex", -1992824713);
        setDoubleField(term78990, term78990.getClass(), "fleetCapacity", 0.9123572866833729);
        setField(term78990, term78990.getClass(), "originalBuilder", null);
        setField(term78989, term78989.getClass(), "hull", term78990);
        setField(term78989, term78989.getClass(), "components", term78998);
        setIntElement(term79001, 0, 1407128598);
        setIntElement(term79001, 1, -799093829);
        setIntElement(term79001, 2, 432526848);
        setIntElement(term79001, 3, 1875904227);
        setIntElement(term79001, 4, -273652787);
        setIntElement(term79001, 5, -20800272);
        setIntElement(term79001, 6, -2012090266);
        setField(term78989, term78989.getClass(), "hullPoints", term79001);
        setIntField(term78989, term78989.getClass(), "shield", 1298920245);
        setIntField(term78989, term78989.getClass(), "armor", 1539128914);
        setIntField(term79011, term79011.getClass(), "imageType", 627813167);
        setField(term79011, term79011.getClass(), "colorModel", null);
        setField(term79011, term79011.getClass(), "raster", null);
        setField(term79011, term79011.getClass(), "osis", null);
        setField(term79011, term79011.getClass(), "properties", null);
        setFloatField(term79011, term79011.getClass(), "accelerationPriority", 0.97262454F);
        setField(term79011, term79011.getClass(), "surfaceManager", null);
        setField(term78989, term78989.getClass(), "image", term79011);
        setIntField(term78989, term78989.getClass(), "colonist", -726670877);
        setIntField(term78989, term78989.getClass(), "metal", 1595800712);
        setIntField(term78989, term78989.getClass(), "experience", -1315471137);
        setIntField(term78989, term78989.getClass(), "culture", 307541055);
        setIntField(term78989, term78989.getClass(), "specialFlags", -664242488);
        setIntField(term79019, term79019.getClass(), "x", 1562272299);
        setIntField(term79019, term79019.getClass(), "y", 961476617);
        setField(term78989, term78989.getClass(), "tradeCoordinates", term79019);
        setField(term78989, term78989.getClass(), "name", null);
        setField(term78989, term78989.getClass(), "iconId", null);
        setField(term78989, term78989.getClass(), "description", null);
        setIntField(term78989, term78989.getClass(), "prodCost", 0);
        setIntField(term78989, term78989.getClass(), "metalCost", 0);
        ArrayList term78987 = new ArrayList();
        ((ArrayList) term78987).add(term78989);
        term78986 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term79026 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term79042 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term79048 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term79054 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term78986, term78986.getClass(), "ships", term78987);
        setIntField(term79026, term79026.getClass(), "x", 0);
        setIntField(term79026, term79026.getClass(), "y", 0);
        setField(term78986, term78986.getClass(), "coordinate", term79026);
        setField(term78986, term78986.getClass(), "name", "oPjvcZQHAL");
        setIntField(term78986, term78986.getClass(), "movesLeft", 490711502);
        setDoubleField(term79042, term79042.getClass(), "startX", 0.0);
        setDoubleField(term79042, term79042.getClass(), "startY", 0.0);
        setDoubleField(term79042, term79042.getClass(), "endX", 0.0);
        setDoubleField(term79042, term79042.getClass(), "endY", 0.0);
        setField(term79042, term79042.getClass(), "nextPoints", null);
        setIntField(term79042, term79042.getClass(), "ftlSpeed", 0);
        setField(term78986, term78986.getClass(), "route", term79042);
        setField(term79048, term79048.getClass(), "name", null);
        setField(term79048, term79048.getClass(), "homeworld", null);
        setIntField(term79048, term79048.getClass(), "age", 0);
        setIntField(term79048, term79048.getClass(), "timeInJob", 0);
        setIntField(term79048, term79048.getClass(), "level", 0);
        setIntField(term79048, term79048.getClass(), "experience", 0);
        setField(term79048, term79048.getClass(), "militaryRank", null);
        setField(term79048, term79048.getClass(), "gender", null);
        setField(term79048, term79048.getClass(), "race", null);
        setField(term79048, term79048.getClass(), "title", null);
        setField(term79048, term79048.getClass(), "job", null);
        setField(term79048, term79048.getClass(), "parent", null);
        setIntField(term79048, term79048.getClass(), "parentIndex", 0);
        setField(term79048, term79048.getClass(), "perkList", null);
        setField(term79048, term79048.getClass(), "stats", null);
        setField(term78986, term78986.getClass(), "commander", term79048);
        setIntField(term79054, term79054.getClass(), "maxX", 0);
        setIntField(term79054, term79054.getClass(), "maxY", 0);
        setField(term79054, term79054.getClass(), "blockMap", null);
        setField(term79054, term79054.getClass(), "points", null);
        setIntField(term79054, term79054.getClass(), "tx", 0);
        setIntField(term79054, term79054.getClass(), "ty", 0);
        setIntField(term79054, term79054.getClass(), "targetDistance", 0);
        setField(term79054, term79054.getClass(), "targetPoint", null);
        setIntField(term79054, term79054.getClass(), "routeIndex", 0);
        setField(term78986, term78986.getClass(), "aStarSearch", term79054);
        term79061 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term79061;
        callMethod(klass, "getFleetSpeed", argTypes, term78986, args);
    }

};


