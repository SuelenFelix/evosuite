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

public class Fleet_getCulturalValue_173561149465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128956;

    public Fleet_getCulturalValue_173561149465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term128968 = new ArrayList();
        ((ArrayList) term128968).add((Object)null);
        ((ArrayList) term128968).add((Object)null);
        ((ArrayList) term128968).add((Object)null);
        ((ArrayList) term128968).add((Object)null);
        ((ArrayList) term128968).add((Object)null);
        ((ArrayList) term128968).add((Object)null);
        ((ArrayList) term128968).add((Object)null);
        Object term128959 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term128960 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term128971 = (int[]) newIntArray(1);
        Object term128975 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term128983 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term128960, term128960.getClass(), "index", 1081947752);
        setField(term128960, term128960.getClass(), "name", null);
        setIntField(term128960, term128960.getClass(), "maxSlot", 1276576124);
        setIntField(term128960, term128960.getClass(), "slotHull", 806312193);
        setField(term128960, term128960.getClass(), "hullType", null);
        setField(term128960, term128960.getClass(), "size", null);
        setIntField(term128960, term128960.getClass(), "cost", -34164224);
        setIntField(term128960, term128960.getClass(), "metalCost", -1800382588);
        setIntField(term128960, term128960.getClass(), "imageIndex", -414071951);
        setDoubleField(term128960, term128960.getClass(), "fleetCapacity", 0.198746516614277);
        setField(term128960, term128960.getClass(), "originalBuilder", null);
        setField(term128959, term128959.getClass(), "hull", term128960);
        setField(term128959, term128959.getClass(), "components", term128968);
        setIntElement(term128971, 0, 206793849);
        setField(term128959, term128959.getClass(), "hullPoints", term128971);
        setIntField(term128959, term128959.getClass(), "shield", 1243580461);
        setIntField(term128959, term128959.getClass(), "armor", 198372440);
        setIntField(term128975, term128975.getClass(), "imageType", -1531562967);
        setField(term128975, term128975.getClass(), "colorModel", null);
        setField(term128975, term128975.getClass(), "raster", null);
        setField(term128975, term128975.getClass(), "osis", null);
        setField(term128975, term128975.getClass(), "properties", null);
        setFloatField(term128975, term128975.getClass(), "accelerationPriority", 0.022591352F);
        setField(term128975, term128975.getClass(), "surfaceManager", null);
        setField(term128959, term128959.getClass(), "image", term128975);
        setIntField(term128959, term128959.getClass(), "colonist", -19247990);
        setIntField(term128959, term128959.getClass(), "metal", 1986476279);
        setIntField(term128959, term128959.getClass(), "experience", -715837772);
        setIntField(term128959, term128959.getClass(), "culture", 1707313333);
        setIntField(term128959, term128959.getClass(), "specialFlags", 789086911);
        setIntField(term128983, term128983.getClass(), "x", 1249593171);
        setIntField(term128983, term128983.getClass(), "y", -860135164);
        setField(term128959, term128959.getClass(), "tradeCoordinates", term128983);
        setField(term128959, term128959.getClass(), "name", null);
        setField(term128959, term128959.getClass(), "iconId", null);
        setField(term128959, term128959.getClass(), "description", null);
        setIntField(term128959, term128959.getClass(), "prodCost", 0);
        setIntField(term128959, term128959.getClass(), "metalCost", 0);
        Object term128988 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term128988, term128988.getClass(), "hull", null);
        setField(term128988, term128988.getClass(), "components", null);
        setField(term128988, term128988.getClass(), "hullPoints", null);
        setIntField(term128988, term128988.getClass(), "shield", 0);
        setIntField(term128988, term128988.getClass(), "armor", 0);
        setField(term128988, term128988.getClass(), "image", null);
        setIntField(term128988, term128988.getClass(), "colonist", 0);
        setIntField(term128988, term128988.getClass(), "metal", 0);
        setIntField(term128988, term128988.getClass(), "experience", 0);
        setIntField(term128988, term128988.getClass(), "culture", 0);
        setIntField(term128988, term128988.getClass(), "specialFlags", 0);
        setField(term128988, term128988.getClass(), "tradeCoordinates", null);
        setField(term128988, term128988.getClass(), "name", null);
        setField(term128988, term128988.getClass(), "iconId", null);
        setField(term128988, term128988.getClass(), "description", null);
        setIntField(term128988, term128988.getClass(), "prodCost", 0);
        setIntField(term128988, term128988.getClass(), "metalCost", 0);
        ArrayList term128957 = new ArrayList();
        ((ArrayList) term128957).add(term128959);
        ((ArrayList) term128957).add(term128988);
        term128956 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term129000 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term129016 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term129022 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term129028 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term128956, term128956.getClass(), "ships", term128957);
        setIntField(term129000, term129000.getClass(), "x", 0);
        setIntField(term129000, term129000.getClass(), "y", 0);
        setField(term128956, term128956.getClass(), "coordinate", term129000);
        setField(term128956, term128956.getClass(), "name", "XjZjmwoHED");
        setIntField(term128956, term128956.getClass(), "movesLeft", -1138154515);
        setDoubleField(term129016, term129016.getClass(), "startX", 0.0);
        setDoubleField(term129016, term129016.getClass(), "startY", 0.0);
        setDoubleField(term129016, term129016.getClass(), "endX", 0.0);
        setDoubleField(term129016, term129016.getClass(), "endY", 0.0);
        setField(term129016, term129016.getClass(), "nextPoints", null);
        setIntField(term129016, term129016.getClass(), "ftlSpeed", 0);
        setField(term128956, term128956.getClass(), "route", term129016);
        setField(term129022, term129022.getClass(), "name", null);
        setField(term129022, term129022.getClass(), "homeworld", null);
        setIntField(term129022, term129022.getClass(), "age", 0);
        setIntField(term129022, term129022.getClass(), "timeInJob", 0);
        setIntField(term129022, term129022.getClass(), "level", 0);
        setIntField(term129022, term129022.getClass(), "experience", 0);
        setField(term129022, term129022.getClass(), "militaryRank", null);
        setField(term129022, term129022.getClass(), "gender", null);
        setField(term129022, term129022.getClass(), "race", null);
        setField(term129022, term129022.getClass(), "title", null);
        setField(term129022, term129022.getClass(), "job", null);
        setField(term129022, term129022.getClass(), "parent", null);
        setIntField(term129022, term129022.getClass(), "parentIndex", 0);
        setField(term129022, term129022.getClass(), "perkList", null);
        setField(term129022, term129022.getClass(), "stats", null);
        setField(term128956, term128956.getClass(), "commander", term129022);
        setIntField(term129028, term129028.getClass(), "maxX", 0);
        setIntField(term129028, term129028.getClass(), "maxY", 0);
        setField(term129028, term129028.getClass(), "blockMap", null);
        setField(term129028, term129028.getClass(), "points", null);
        setIntField(term129028, term129028.getClass(), "tx", 0);
        setIntField(term129028, term129028.getClass(), "ty", 0);
        setIntField(term129028, term129028.getClass(), "targetDistance", 0);
        setField(term129028, term129028.getClass(), "targetPoint", null);
        setIntField(term129028, term129028.getClass(), "routeIndex", 0);
        setField(term128956, term128956.getClass(), "aStarSearch", term129028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCulturalValue", argTypes, term128956, args);
    }

};


