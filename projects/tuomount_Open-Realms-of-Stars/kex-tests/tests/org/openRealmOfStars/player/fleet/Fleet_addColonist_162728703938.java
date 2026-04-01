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

public class Fleet_addColonist_162728703938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101008;

    public Fleet_addColonist_162728703938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term101020 = new ArrayList();
        ((ArrayList) term101020).add((Object)null);
        ((ArrayList) term101020).add((Object)null);
        ((ArrayList) term101020).add((Object)null);
        ((ArrayList) term101020).add((Object)null);
        ((ArrayList) term101020).add((Object)null);
        ((ArrayList) term101020).add((Object)null);
        Object term101011 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term101012 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term101023 = (int[]) newIntArray(8);
        Object term101034 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term101042 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term101012, term101012.getClass(), "index", -794841275);
        setField(term101012, term101012.getClass(), "name", null);
        setIntField(term101012, term101012.getClass(), "maxSlot", -1965551214);
        setIntField(term101012, term101012.getClass(), "slotHull", 417272371);
        setField(term101012, term101012.getClass(), "hullType", null);
        setField(term101012, term101012.getClass(), "size", null);
        setIntField(term101012, term101012.getClass(), "cost", -93440765);
        setIntField(term101012, term101012.getClass(), "metalCost", -1763224766);
        setIntField(term101012, term101012.getClass(), "imageIndex", -966554344);
        setDoubleField(term101012, term101012.getClass(), "fleetCapacity", 0.1858089882752998);
        setField(term101012, term101012.getClass(), "originalBuilder", null);
        setField(term101011, term101011.getClass(), "hull", term101012);
        setField(term101011, term101011.getClass(), "components", term101020);
        setIntElement(term101023, 0, 1090258751);
        setIntElement(term101023, 1, 1121387085);
        setIntElement(term101023, 2, 239345617);
        setIntElement(term101023, 3, -1703154971);
        setIntElement(term101023, 4, -187409593);
        setIntElement(term101023, 5, 1976370886);
        setIntElement(term101023, 6, 55334433);
        setIntElement(term101023, 7, -666821151);
        setField(term101011, term101011.getClass(), "hullPoints", term101023);
        setIntField(term101011, term101011.getClass(), "shield", -36525575);
        setIntField(term101011, term101011.getClass(), "armor", -933677706);
        setIntField(term101034, term101034.getClass(), "imageType", -1767089569);
        setField(term101034, term101034.getClass(), "colorModel", null);
        setField(term101034, term101034.getClass(), "raster", null);
        setField(term101034, term101034.getClass(), "osis", null);
        setField(term101034, term101034.getClass(), "properties", null);
        setFloatField(term101034, term101034.getClass(), "accelerationPriority", 0.15826964F);
        setField(term101034, term101034.getClass(), "surfaceManager", null);
        setField(term101011, term101011.getClass(), "image", term101034);
        setIntField(term101011, term101011.getClass(), "colonist", 1974397033);
        setIntField(term101011, term101011.getClass(), "metal", 1265335644);
        setIntField(term101011, term101011.getClass(), "experience", -419899874);
        setIntField(term101011, term101011.getClass(), "culture", 1798812338);
        setIntField(term101011, term101011.getClass(), "specialFlags", 1746403267);
        setIntField(term101042, term101042.getClass(), "x", 1970079675);
        setIntField(term101042, term101042.getClass(), "y", 1835484929);
        setField(term101011, term101011.getClass(), "tradeCoordinates", term101042);
        setField(term101011, term101011.getClass(), "name", null);
        setField(term101011, term101011.getClass(), "iconId", null);
        setField(term101011, term101011.getClass(), "description", null);
        setIntField(term101011, term101011.getClass(), "prodCost", 0);
        setIntField(term101011, term101011.getClass(), "metalCost", 0);
        Object term101047 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term101047, term101047.getClass(), "hull", null);
        setField(term101047, term101047.getClass(), "components", null);
        setField(term101047, term101047.getClass(), "hullPoints", null);
        setIntField(term101047, term101047.getClass(), "shield", 0);
        setIntField(term101047, term101047.getClass(), "armor", 0);
        setField(term101047, term101047.getClass(), "image", null);
        setIntField(term101047, term101047.getClass(), "colonist", 0);
        setIntField(term101047, term101047.getClass(), "metal", 0);
        setIntField(term101047, term101047.getClass(), "experience", 0);
        setIntField(term101047, term101047.getClass(), "culture", 0);
        setIntField(term101047, term101047.getClass(), "specialFlags", 0);
        setField(term101047, term101047.getClass(), "tradeCoordinates", null);
        setField(term101047, term101047.getClass(), "name", null);
        setField(term101047, term101047.getClass(), "iconId", null);
        setField(term101047, term101047.getClass(), "description", null);
        setIntField(term101047, term101047.getClass(), "prodCost", 0);
        setIntField(term101047, term101047.getClass(), "metalCost", 0);
        ArrayList term101009 = new ArrayList();
        ((ArrayList) term101009).add(term101011);
        ((ArrayList) term101009).add(term101047);
        term101008 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term101059 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term101075 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term101081 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term101087 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term101008, term101008.getClass(), "ships", term101009);
        setIntField(term101059, term101059.getClass(), "x", 0);
        setIntField(term101059, term101059.getClass(), "y", 0);
        setField(term101008, term101008.getClass(), "coordinate", term101059);
        setField(term101008, term101008.getClass(), "name", "adcoGovSer");
        setIntField(term101008, term101008.getClass(), "movesLeft", 2146550038);
        setDoubleField(term101075, term101075.getClass(), "startX", 0.0);
        setDoubleField(term101075, term101075.getClass(), "startY", 0.0);
        setDoubleField(term101075, term101075.getClass(), "endX", 0.0);
        setDoubleField(term101075, term101075.getClass(), "endY", 0.0);
        setField(term101075, term101075.getClass(), "nextPoints", null);
        setIntField(term101075, term101075.getClass(), "ftlSpeed", 0);
        setField(term101008, term101008.getClass(), "route", term101075);
        setField(term101081, term101081.getClass(), "name", null);
        setField(term101081, term101081.getClass(), "homeworld", null);
        setIntField(term101081, term101081.getClass(), "age", 0);
        setIntField(term101081, term101081.getClass(), "timeInJob", 0);
        setIntField(term101081, term101081.getClass(), "level", 0);
        setIntField(term101081, term101081.getClass(), "experience", 0);
        setField(term101081, term101081.getClass(), "militaryRank", null);
        setField(term101081, term101081.getClass(), "gender", null);
        setField(term101081, term101081.getClass(), "race", null);
        setField(term101081, term101081.getClass(), "title", null);
        setField(term101081, term101081.getClass(), "job", null);
        setField(term101081, term101081.getClass(), "parent", null);
        setIntField(term101081, term101081.getClass(), "parentIndex", 0);
        setField(term101081, term101081.getClass(), "perkList", null);
        setField(term101081, term101081.getClass(), "stats", null);
        setField(term101008, term101008.getClass(), "commander", term101081);
        setIntField(term101087, term101087.getClass(), "maxX", 0);
        setIntField(term101087, term101087.getClass(), "maxY", 0);
        setField(term101087, term101087.getClass(), "blockMap", null);
        setField(term101087, term101087.getClass(), "points", null);
        setIntField(term101087, term101087.getClass(), "tx", 0);
        setIntField(term101087, term101087.getClass(), "ty", 0);
        setIntField(term101087, term101087.getClass(), "targetDistance", 0);
        setField(term101087, term101087.getClass(), "targetPoint", null);
        setIntField(term101087, term101087.getClass(), "routeIndex", 0);
        setField(term101008, term101008.getClass(), "aStarSearch", term101087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "addColonist", argTypes, term101008, args);
    }

};


