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

public class Fleet_getTotalFleetCapacityBonus_109552620274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129908;

    public Fleet_getTotalFleetCapacityBonus_109552620274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term129920 = new ArrayList();
        ((ArrayList) term129920).add((Object)null);
        ((ArrayList) term129920).add((Object)null);
        Object term129911 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term129912 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term129923 = (int[]) newIntArray(2);
        Object term129928 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term129936 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term129912, term129912.getClass(), "index", 1700904086);
        setField(term129912, term129912.getClass(), "name", null);
        setIntField(term129912, term129912.getClass(), "maxSlot", -362916771);
        setIntField(term129912, term129912.getClass(), "slotHull", 1886181117);
        setField(term129912, term129912.getClass(), "hullType", null);
        setField(term129912, term129912.getClass(), "size", null);
        setIntField(term129912, term129912.getClass(), "cost", -229212246);
        setIntField(term129912, term129912.getClass(), "metalCost", 1726721533);
        setIntField(term129912, term129912.getClass(), "imageIndex", -328854592);
        setDoubleField(term129912, term129912.getClass(), "fleetCapacity", 0.7444535250398684);
        setField(term129912, term129912.getClass(), "originalBuilder", null);
        setField(term129911, term129911.getClass(), "hull", term129912);
        setField(term129911, term129911.getClass(), "components", term129920);
        setIntElement(term129923, 0, -712836753);
        setIntElement(term129923, 1, 2051479764);
        setField(term129911, term129911.getClass(), "hullPoints", term129923);
        setIntField(term129911, term129911.getClass(), "shield", -967390932);
        setIntField(term129911, term129911.getClass(), "armor", -1594865304);
        setIntField(term129928, term129928.getClass(), "imageType", 1209270458);
        setField(term129928, term129928.getClass(), "colorModel", null);
        setField(term129928, term129928.getClass(), "raster", null);
        setField(term129928, term129928.getClass(), "osis", null);
        setField(term129928, term129928.getClass(), "properties", null);
        setFloatField(term129928, term129928.getClass(), "accelerationPriority", 0.06688923F);
        setField(term129928, term129928.getClass(), "surfaceManager", null);
        setField(term129911, term129911.getClass(), "image", term129928);
        setIntField(term129911, term129911.getClass(), "colonist", -1219404857);
        setIntField(term129911, term129911.getClass(), "metal", 2121914051);
        setIntField(term129911, term129911.getClass(), "experience", 192590998);
        setIntField(term129911, term129911.getClass(), "culture", -263763571);
        setIntField(term129911, term129911.getClass(), "specialFlags", 329639070);
        setIntField(term129936, term129936.getClass(), "x", 2043358189);
        setIntField(term129936, term129936.getClass(), "y", 1222446497);
        setField(term129911, term129911.getClass(), "tradeCoordinates", term129936);
        setField(term129911, term129911.getClass(), "name", null);
        setField(term129911, term129911.getClass(), "iconId", null);
        setField(term129911, term129911.getClass(), "description", null);
        setIntField(term129911, term129911.getClass(), "prodCost", 0);
        setIntField(term129911, term129911.getClass(), "metalCost", 0);
        Object term129941 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term129941, term129941.getClass(), "hull", null);
        setField(term129941, term129941.getClass(), "components", null);
        setField(term129941, term129941.getClass(), "hullPoints", null);
        setIntField(term129941, term129941.getClass(), "shield", 0);
        setIntField(term129941, term129941.getClass(), "armor", 0);
        setField(term129941, term129941.getClass(), "image", null);
        setIntField(term129941, term129941.getClass(), "colonist", 0);
        setIntField(term129941, term129941.getClass(), "metal", 0);
        setIntField(term129941, term129941.getClass(), "experience", 0);
        setIntField(term129941, term129941.getClass(), "culture", 0);
        setIntField(term129941, term129941.getClass(), "specialFlags", 0);
        setField(term129941, term129941.getClass(), "tradeCoordinates", null);
        setField(term129941, term129941.getClass(), "name", null);
        setField(term129941, term129941.getClass(), "iconId", null);
        setField(term129941, term129941.getClass(), "description", null);
        setIntField(term129941, term129941.getClass(), "prodCost", 0);
        setIntField(term129941, term129941.getClass(), "metalCost", 0);
        Object term129951 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term129951, term129951.getClass(), "hull", null);
        setField(term129951, term129951.getClass(), "components", null);
        setField(term129951, term129951.getClass(), "hullPoints", null);
        setIntField(term129951, term129951.getClass(), "shield", 0);
        setIntField(term129951, term129951.getClass(), "armor", 0);
        setField(term129951, term129951.getClass(), "image", null);
        setIntField(term129951, term129951.getClass(), "colonist", 0);
        setIntField(term129951, term129951.getClass(), "metal", 0);
        setIntField(term129951, term129951.getClass(), "experience", 0);
        setIntField(term129951, term129951.getClass(), "culture", 0);
        setIntField(term129951, term129951.getClass(), "specialFlags", 0);
        setField(term129951, term129951.getClass(), "tradeCoordinates", null);
        setField(term129951, term129951.getClass(), "name", null);
        setField(term129951, term129951.getClass(), "iconId", null);
        setField(term129951, term129951.getClass(), "description", null);
        setIntField(term129951, term129951.getClass(), "prodCost", 0);
        setIntField(term129951, term129951.getClass(), "metalCost", 0);
        ArrayList term129909 = new ArrayList();
        ((ArrayList) term129909).add(term129911);
        ((ArrayList) term129909).add(term129941);
        ((ArrayList) term129909).add(term129951);
        term129908 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term129963 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term129979 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term129985 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term129991 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term129908, term129908.getClass(), "ships", term129909);
        setIntField(term129963, term129963.getClass(), "x", 0);
        setIntField(term129963, term129963.getClass(), "y", 0);
        setField(term129908, term129908.getClass(), "coordinate", term129963);
        setField(term129908, term129908.getClass(), "name", "dWXmVZsdHl");
        setIntField(term129908, term129908.getClass(), "movesLeft", 120466526);
        setDoubleField(term129979, term129979.getClass(), "startX", 0.0);
        setDoubleField(term129979, term129979.getClass(), "startY", 0.0);
        setDoubleField(term129979, term129979.getClass(), "endX", 0.0);
        setDoubleField(term129979, term129979.getClass(), "endY", 0.0);
        setField(term129979, term129979.getClass(), "nextPoints", null);
        setIntField(term129979, term129979.getClass(), "ftlSpeed", 0);
        setField(term129908, term129908.getClass(), "route", term129979);
        setField(term129985, term129985.getClass(), "name", null);
        setField(term129985, term129985.getClass(), "homeworld", null);
        setIntField(term129985, term129985.getClass(), "age", 0);
        setIntField(term129985, term129985.getClass(), "timeInJob", 0);
        setIntField(term129985, term129985.getClass(), "level", 0);
        setIntField(term129985, term129985.getClass(), "experience", 0);
        setField(term129985, term129985.getClass(), "militaryRank", null);
        setField(term129985, term129985.getClass(), "gender", null);
        setField(term129985, term129985.getClass(), "race", null);
        setField(term129985, term129985.getClass(), "title", null);
        setField(term129985, term129985.getClass(), "job", null);
        setField(term129985, term129985.getClass(), "parent", null);
        setIntField(term129985, term129985.getClass(), "parentIndex", 0);
        setField(term129985, term129985.getClass(), "perkList", null);
        setField(term129985, term129985.getClass(), "stats", null);
        setField(term129908, term129908.getClass(), "commander", term129985);
        setIntField(term129991, term129991.getClass(), "maxX", 0);
        setIntField(term129991, term129991.getClass(), "maxY", 0);
        setField(term129991, term129991.getClass(), "blockMap", null);
        setField(term129991, term129991.getClass(), "points", null);
        setIntField(term129991, term129991.getClass(), "tx", 0);
        setIntField(term129991, term129991.getClass(), "ty", 0);
        setIntField(term129991, term129991.getClass(), "targetDistance", 0);
        setField(term129991, term129991.getClass(), "targetPoint", null);
        setIntField(term129991, term129991.getClass(), "routeIndex", 0);
        setField(term129908, term129908.getClass(), "aStarSearch", term129991);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalFleetCapacityBonus", argTypes, term129908, args);
    }

};


