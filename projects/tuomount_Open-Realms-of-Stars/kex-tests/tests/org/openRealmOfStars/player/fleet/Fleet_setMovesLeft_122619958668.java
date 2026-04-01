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
import java.lang.Integer;

public class Fleet_setMovesLeft_122619958668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129262;
     Object term129351;

    public Fleet_setMovesLeft_122619958668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term129274 = new ArrayList();
        ((ArrayList) term129274).add((Object)null);
        ((ArrayList) term129274).add((Object)null);
        ((ArrayList) term129274).add((Object)null);
        ((ArrayList) term129274).add((Object)null);
        ((ArrayList) term129274).add((Object)null);
        ((ArrayList) term129274).add((Object)null);
        ((ArrayList) term129274).add((Object)null);
        Object term129265 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term129266 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term129277 = (int[]) newIntArray(1);
        Object term129281 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term129289 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term129266, term129266.getClass(), "index", 524170199);
        setField(term129266, term129266.getClass(), "name", null);
        setIntField(term129266, term129266.getClass(), "maxSlot", 700143207);
        setIntField(term129266, term129266.getClass(), "slotHull", -1290125128);
        setField(term129266, term129266.getClass(), "hullType", null);
        setField(term129266, term129266.getClass(), "size", null);
        setIntField(term129266, term129266.getClass(), "cost", 2090150392);
        setIntField(term129266, term129266.getClass(), "metalCost", 1308493754);
        setIntField(term129266, term129266.getClass(), "imageIndex", 1144770109);
        setDoubleField(term129266, term129266.getClass(), "fleetCapacity", 0.10087360265456191);
        setField(term129266, term129266.getClass(), "originalBuilder", null);
        setField(term129265, term129265.getClass(), "hull", term129266);
        setField(term129265, term129265.getClass(), "components", term129274);
        setIntElement(term129277, 0, -859574139);
        setField(term129265, term129265.getClass(), "hullPoints", term129277);
        setIntField(term129265, term129265.getClass(), "shield", -869816828);
        setIntField(term129265, term129265.getClass(), "armor", 1368030099);
        setIntField(term129281, term129281.getClass(), "imageType", 992346246);
        setField(term129281, term129281.getClass(), "colorModel", null);
        setField(term129281, term129281.getClass(), "raster", null);
        setField(term129281, term129281.getClass(), "osis", null);
        setField(term129281, term129281.getClass(), "properties", null);
        setFloatField(term129281, term129281.getClass(), "accelerationPriority", 0.28528106F);
        setField(term129281, term129281.getClass(), "surfaceManager", null);
        setField(term129265, term129265.getClass(), "image", term129281);
        setIntField(term129265, term129265.getClass(), "colonist", -263180012);
        setIntField(term129265, term129265.getClass(), "metal", -697527464);
        setIntField(term129265, term129265.getClass(), "experience", 1717185086);
        setIntField(term129265, term129265.getClass(), "culture", -915266907);
        setIntField(term129265, term129265.getClass(), "specialFlags", 1774186491);
        setIntField(term129289, term129289.getClass(), "x", -1176292056);
        setIntField(term129289, term129289.getClass(), "y", -419239990);
        setField(term129265, term129265.getClass(), "tradeCoordinates", term129289);
        setField(term129265, term129265.getClass(), "name", null);
        setField(term129265, term129265.getClass(), "iconId", null);
        setField(term129265, term129265.getClass(), "description", null);
        setIntField(term129265, term129265.getClass(), "prodCost", 0);
        setIntField(term129265, term129265.getClass(), "metalCost", 0);
        Object term129294 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term129294, term129294.getClass(), "hull", null);
        setField(term129294, term129294.getClass(), "components", null);
        setField(term129294, term129294.getClass(), "hullPoints", null);
        setIntField(term129294, term129294.getClass(), "shield", 0);
        setIntField(term129294, term129294.getClass(), "armor", 0);
        setField(term129294, term129294.getClass(), "image", null);
        setIntField(term129294, term129294.getClass(), "colonist", 0);
        setIntField(term129294, term129294.getClass(), "metal", 0);
        setIntField(term129294, term129294.getClass(), "experience", 0);
        setIntField(term129294, term129294.getClass(), "culture", 0);
        setIntField(term129294, term129294.getClass(), "specialFlags", 0);
        setField(term129294, term129294.getClass(), "tradeCoordinates", null);
        setField(term129294, term129294.getClass(), "name", null);
        setField(term129294, term129294.getClass(), "iconId", null);
        setField(term129294, term129294.getClass(), "description", null);
        setIntField(term129294, term129294.getClass(), "prodCost", 0);
        setIntField(term129294, term129294.getClass(), "metalCost", 0);
        Object term129304 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term129304, term129304.getClass(), "hull", null);
        setField(term129304, term129304.getClass(), "components", null);
        setField(term129304, term129304.getClass(), "hullPoints", null);
        setIntField(term129304, term129304.getClass(), "shield", 0);
        setIntField(term129304, term129304.getClass(), "armor", 0);
        setField(term129304, term129304.getClass(), "image", null);
        setIntField(term129304, term129304.getClass(), "colonist", 0);
        setIntField(term129304, term129304.getClass(), "metal", 0);
        setIntField(term129304, term129304.getClass(), "experience", 0);
        setIntField(term129304, term129304.getClass(), "culture", 0);
        setIntField(term129304, term129304.getClass(), "specialFlags", 0);
        setField(term129304, term129304.getClass(), "tradeCoordinates", null);
        setField(term129304, term129304.getClass(), "name", null);
        setField(term129304, term129304.getClass(), "iconId", null);
        setField(term129304, term129304.getClass(), "description", null);
        setIntField(term129304, term129304.getClass(), "prodCost", 0);
        setIntField(term129304, term129304.getClass(), "metalCost", 0);
        ArrayList term129263 = new ArrayList();
        ((ArrayList) term129263).add(term129265);
        ((ArrayList) term129263).add(term129294);
        ((ArrayList) term129263).add(term129304);
        term129262 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term129316 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term129332 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term129338 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term129344 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term129262, term129262.getClass(), "ships", term129263);
        setIntField(term129316, term129316.getClass(), "x", 0);
        setIntField(term129316, term129316.getClass(), "y", 0);
        setField(term129262, term129262.getClass(), "coordinate", term129316);
        setField(term129262, term129262.getClass(), "name", "mLQxMcHGBW");
        setIntField(term129262, term129262.getClass(), "movesLeft", 1703046066);
        setDoubleField(term129332, term129332.getClass(), "startX", 0.0);
        setDoubleField(term129332, term129332.getClass(), "startY", 0.0);
        setDoubleField(term129332, term129332.getClass(), "endX", 0.0);
        setDoubleField(term129332, term129332.getClass(), "endY", 0.0);
        setField(term129332, term129332.getClass(), "nextPoints", null);
        setIntField(term129332, term129332.getClass(), "ftlSpeed", 0);
        setField(term129262, term129262.getClass(), "route", term129332);
        setField(term129338, term129338.getClass(), "name", null);
        setField(term129338, term129338.getClass(), "homeworld", null);
        setIntField(term129338, term129338.getClass(), "age", 0);
        setIntField(term129338, term129338.getClass(), "timeInJob", 0);
        setIntField(term129338, term129338.getClass(), "level", 0);
        setIntField(term129338, term129338.getClass(), "experience", 0);
        setField(term129338, term129338.getClass(), "militaryRank", null);
        setField(term129338, term129338.getClass(), "gender", null);
        setField(term129338, term129338.getClass(), "race", null);
        setField(term129338, term129338.getClass(), "title", null);
        setField(term129338, term129338.getClass(), "job", null);
        setField(term129338, term129338.getClass(), "parent", null);
        setIntField(term129338, term129338.getClass(), "parentIndex", 0);
        setField(term129338, term129338.getClass(), "perkList", null);
        setField(term129338, term129338.getClass(), "stats", null);
        setField(term129262, term129262.getClass(), "commander", term129338);
        setIntField(term129344, term129344.getClass(), "maxX", 0);
        setIntField(term129344, term129344.getClass(), "maxY", 0);
        setField(term129344, term129344.getClass(), "blockMap", null);
        setField(term129344, term129344.getClass(), "points", null);
        setIntField(term129344, term129344.getClass(), "tx", 0);
        setIntField(term129344, term129344.getClass(), "ty", 0);
        setIntField(term129344, term129344.getClass(), "targetDistance", 0);
        setField(term129344, term129344.getClass(), "targetPoint", null);
        setIntField(term129344, term129344.getClass(), "routeIndex", 0);
        setField(term129262, term129262.getClass(), "aStarSearch", term129344);
        term129351 = new Integer(926839329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term129351;
        callMethod(klass, "setMovesLeft", argTypes, term129262, args);
    }

};


