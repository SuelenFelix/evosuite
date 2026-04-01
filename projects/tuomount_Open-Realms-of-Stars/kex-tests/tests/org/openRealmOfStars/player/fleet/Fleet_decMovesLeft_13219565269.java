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

public class Fleet_decMovesLeft_13219565269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129364;

    public Fleet_decMovesLeft_13219565269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term129376 = new ArrayList();
        ((ArrayList) term129376).add((Object)null);
        Object term129367 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term129368 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term129379 = (int[]) newIntArray(5);
        Object term129387 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term129395 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term129368, term129368.getClass(), "index", 1637499416);
        setField(term129368, term129368.getClass(), "name", null);
        setIntField(term129368, term129368.getClass(), "maxSlot", -1283934329);
        setIntField(term129368, term129368.getClass(), "slotHull", -413523309);
        setField(term129368, term129368.getClass(), "hullType", null);
        setField(term129368, term129368.getClass(), "size", null);
        setIntField(term129368, term129368.getClass(), "cost", -765029045);
        setIntField(term129368, term129368.getClass(), "metalCost", 989766200);
        setIntField(term129368, term129368.getClass(), "imageIndex", 676995399);
        setDoubleField(term129368, term129368.getClass(), "fleetCapacity", 0.5957631946929023);
        setField(term129368, term129368.getClass(), "originalBuilder", null);
        setField(term129367, term129367.getClass(), "hull", term129368);
        setField(term129367, term129367.getClass(), "components", term129376);
        setIntElement(term129379, 0, -2127910563);
        setIntElement(term129379, 1, -1206610681);
        setIntElement(term129379, 2, 304656853);
        setIntElement(term129379, 3, 800977713);
        setIntElement(term129379, 4, -1747527329);
        setField(term129367, term129367.getClass(), "hullPoints", term129379);
        setIntField(term129367, term129367.getClass(), "shield", 563611317);
        setIntField(term129367, term129367.getClass(), "armor", -1421851521);
        setIntField(term129387, term129387.getClass(), "imageType", -1305953629);
        setField(term129387, term129387.getClass(), "colorModel", null);
        setField(term129387, term129387.getClass(), "raster", null);
        setField(term129387, term129387.getClass(), "osis", null);
        setField(term129387, term129387.getClass(), "properties", null);
        setFloatField(term129387, term129387.getClass(), "accelerationPriority", 0.30827713F);
        setField(term129387, term129387.getClass(), "surfaceManager", null);
        setField(term129367, term129367.getClass(), "image", term129387);
        setIntField(term129367, term129367.getClass(), "colonist", 1995126818);
        setIntField(term129367, term129367.getClass(), "metal", -534461601);
        setIntField(term129367, term129367.getClass(), "experience", 213085106);
        setIntField(term129367, term129367.getClass(), "culture", 1527733173);
        setIntField(term129367, term129367.getClass(), "specialFlags", -837851405);
        setIntField(term129395, term129395.getClass(), "x", 2069187292);
        setIntField(term129395, term129395.getClass(), "y", 1160128853);
        setField(term129367, term129367.getClass(), "tradeCoordinates", term129395);
        setField(term129367, term129367.getClass(), "name", null);
        setField(term129367, term129367.getClass(), "iconId", null);
        setField(term129367, term129367.getClass(), "description", null);
        setIntField(term129367, term129367.getClass(), "prodCost", 0);
        setIntField(term129367, term129367.getClass(), "metalCost", 0);
        ArrayList term129365 = new ArrayList();
        ((ArrayList) term129365).add(term129367);
        term129364 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term129402 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term129418 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term129424 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term129430 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term129364, term129364.getClass(), "ships", term129365);
        setIntField(term129402, term129402.getClass(), "x", 0);
        setIntField(term129402, term129402.getClass(), "y", 0);
        setField(term129364, term129364.getClass(), "coordinate", term129402);
        setField(term129364, term129364.getClass(), "name", "CXCVrIiZYr");
        setIntField(term129364, term129364.getClass(), "movesLeft", 145609301);
        setDoubleField(term129418, term129418.getClass(), "startX", 0.0);
        setDoubleField(term129418, term129418.getClass(), "startY", 0.0);
        setDoubleField(term129418, term129418.getClass(), "endX", 0.0);
        setDoubleField(term129418, term129418.getClass(), "endY", 0.0);
        setField(term129418, term129418.getClass(), "nextPoints", null);
        setIntField(term129418, term129418.getClass(), "ftlSpeed", 0);
        setField(term129364, term129364.getClass(), "route", term129418);
        setField(term129424, term129424.getClass(), "name", null);
        setField(term129424, term129424.getClass(), "homeworld", null);
        setIntField(term129424, term129424.getClass(), "age", 0);
        setIntField(term129424, term129424.getClass(), "timeInJob", 0);
        setIntField(term129424, term129424.getClass(), "level", 0);
        setIntField(term129424, term129424.getClass(), "experience", 0);
        setField(term129424, term129424.getClass(), "militaryRank", null);
        setField(term129424, term129424.getClass(), "gender", null);
        setField(term129424, term129424.getClass(), "race", null);
        setField(term129424, term129424.getClass(), "title", null);
        setField(term129424, term129424.getClass(), "job", null);
        setField(term129424, term129424.getClass(), "parent", null);
        setIntField(term129424, term129424.getClass(), "parentIndex", 0);
        setField(term129424, term129424.getClass(), "perkList", null);
        setField(term129424, term129424.getClass(), "stats", null);
        setField(term129364, term129364.getClass(), "commander", term129424);
        setIntField(term129430, term129430.getClass(), "maxX", 0);
        setIntField(term129430, term129430.getClass(), "maxY", 0);
        setField(term129430, term129430.getClass(), "blockMap", null);
        setField(term129430, term129430.getClass(), "points", null);
        setIntField(term129430, term129430.getClass(), "tx", 0);
        setIntField(term129430, term129430.getClass(), "ty", 0);
        setIntField(term129430, term129430.getClass(), "targetDistance", 0);
        setField(term129430, term129430.getClass(), "targetPoint", null);
        setIntField(term129430, term129430.getClass(), "routeIndex", 0);
        setField(term129364, term129364.getClass(), "aStarSearch", term129430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "decMovesLeft", argTypes, term129364, args);
    }

};


