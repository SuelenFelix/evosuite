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

public class Fleet_getFreeSpaceForMetal_9160662136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100784;

    public Fleet_getFreeSpaceForMetal_9160662136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term100796 = new ArrayList();
        ((ArrayList) term100796).add((Object)null);
        ((ArrayList) term100796).add((Object)null);
        ((ArrayList) term100796).add((Object)null);
        ((ArrayList) term100796).add((Object)null);
        ((ArrayList) term100796).add((Object)null);
        ((ArrayList) term100796).add((Object)null);
        ((ArrayList) term100796).add((Object)null);
        ((ArrayList) term100796).add((Object)null);
        ((ArrayList) term100796).add((Object)null);
        Object term100787 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term100788 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term100799 = (int[]) newIntArray(1);
        Object term100803 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term100811 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term100788, term100788.getClass(), "index", -69028914);
        setField(term100788, term100788.getClass(), "name", null);
        setIntField(term100788, term100788.getClass(), "maxSlot", -887976125);
        setIntField(term100788, term100788.getClass(), "slotHull", 448725036);
        setField(term100788, term100788.getClass(), "hullType", null);
        setField(term100788, term100788.getClass(), "size", null);
        setIntField(term100788, term100788.getClass(), "cost", -1464798371);
        setIntField(term100788, term100788.getClass(), "metalCost", 528481490);
        setIntField(term100788, term100788.getClass(), "imageIndex", -117880593);
        setDoubleField(term100788, term100788.getClass(), "fleetCapacity", 0.5179319342588155);
        setField(term100788, term100788.getClass(), "originalBuilder", null);
        setField(term100787, term100787.getClass(), "hull", term100788);
        setField(term100787, term100787.getClass(), "components", term100796);
        setIntElement(term100799, 0, -1659254800);
        setField(term100787, term100787.getClass(), "hullPoints", term100799);
        setIntField(term100787, term100787.getClass(), "shield", 1069040713);
        setIntField(term100787, term100787.getClass(), "armor", -932319157);
        setIntField(term100803, term100803.getClass(), "imageType", 2096486142);
        setField(term100803, term100803.getClass(), "colorModel", null);
        setField(term100803, term100803.getClass(), "raster", null);
        setField(term100803, term100803.getClass(), "osis", null);
        setField(term100803, term100803.getClass(), "properties", null);
        setFloatField(term100803, term100803.getClass(), "accelerationPriority", 0.89057696F);
        setField(term100803, term100803.getClass(), "surfaceManager", null);
        setField(term100787, term100787.getClass(), "image", term100803);
        setIntField(term100787, term100787.getClass(), "colonist", -181204804);
        setIntField(term100787, term100787.getClass(), "metal", 2073462223);
        setIntField(term100787, term100787.getClass(), "experience", 509141438);
        setIntField(term100787, term100787.getClass(), "culture", 55918608);
        setIntField(term100787, term100787.getClass(), "specialFlags", 1863053491);
        setIntField(term100811, term100811.getClass(), "x", 1569101532);
        setIntField(term100811, term100811.getClass(), "y", -1825428555);
        setField(term100787, term100787.getClass(), "tradeCoordinates", term100811);
        setField(term100787, term100787.getClass(), "name", null);
        setField(term100787, term100787.getClass(), "iconId", null);
        setField(term100787, term100787.getClass(), "description", null);
        setIntField(term100787, term100787.getClass(), "prodCost", 0);
        setIntField(term100787, term100787.getClass(), "metalCost", 0);
        Object term100816 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term100816, term100816.getClass(), "hull", null);
        setField(term100816, term100816.getClass(), "components", null);
        setField(term100816, term100816.getClass(), "hullPoints", null);
        setIntField(term100816, term100816.getClass(), "shield", 0);
        setIntField(term100816, term100816.getClass(), "armor", 0);
        setField(term100816, term100816.getClass(), "image", null);
        setIntField(term100816, term100816.getClass(), "colonist", 0);
        setIntField(term100816, term100816.getClass(), "metal", 0);
        setIntField(term100816, term100816.getClass(), "experience", 0);
        setIntField(term100816, term100816.getClass(), "culture", 0);
        setIntField(term100816, term100816.getClass(), "specialFlags", 0);
        setField(term100816, term100816.getClass(), "tradeCoordinates", null);
        setField(term100816, term100816.getClass(), "name", null);
        setField(term100816, term100816.getClass(), "iconId", null);
        setField(term100816, term100816.getClass(), "description", null);
        setIntField(term100816, term100816.getClass(), "prodCost", 0);
        setIntField(term100816, term100816.getClass(), "metalCost", 0);
        Object term100826 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term100826, term100826.getClass(), "hull", null);
        setField(term100826, term100826.getClass(), "components", null);
        setField(term100826, term100826.getClass(), "hullPoints", null);
        setIntField(term100826, term100826.getClass(), "shield", 0);
        setIntField(term100826, term100826.getClass(), "armor", 0);
        setField(term100826, term100826.getClass(), "image", null);
        setIntField(term100826, term100826.getClass(), "colonist", 0);
        setIntField(term100826, term100826.getClass(), "metal", 0);
        setIntField(term100826, term100826.getClass(), "experience", 0);
        setIntField(term100826, term100826.getClass(), "culture", 0);
        setIntField(term100826, term100826.getClass(), "specialFlags", 0);
        setField(term100826, term100826.getClass(), "tradeCoordinates", null);
        setField(term100826, term100826.getClass(), "name", null);
        setField(term100826, term100826.getClass(), "iconId", null);
        setField(term100826, term100826.getClass(), "description", null);
        setIntField(term100826, term100826.getClass(), "prodCost", 0);
        setIntField(term100826, term100826.getClass(), "metalCost", 0);
        Object term100836 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term100836, term100836.getClass(), "hull", null);
        setField(term100836, term100836.getClass(), "components", null);
        setField(term100836, term100836.getClass(), "hullPoints", null);
        setIntField(term100836, term100836.getClass(), "shield", 0);
        setIntField(term100836, term100836.getClass(), "armor", 0);
        setField(term100836, term100836.getClass(), "image", null);
        setIntField(term100836, term100836.getClass(), "colonist", 0);
        setIntField(term100836, term100836.getClass(), "metal", 0);
        setIntField(term100836, term100836.getClass(), "experience", 0);
        setIntField(term100836, term100836.getClass(), "culture", 0);
        setIntField(term100836, term100836.getClass(), "specialFlags", 0);
        setField(term100836, term100836.getClass(), "tradeCoordinates", null);
        setField(term100836, term100836.getClass(), "name", null);
        setField(term100836, term100836.getClass(), "iconId", null);
        setField(term100836, term100836.getClass(), "description", null);
        setIntField(term100836, term100836.getClass(), "prodCost", 0);
        setIntField(term100836, term100836.getClass(), "metalCost", 0);
        ArrayList term100785 = new ArrayList();
        ((ArrayList) term100785).add(term100787);
        ((ArrayList) term100785).add(term100816);
        ((ArrayList) term100785).add(term100826);
        ((ArrayList) term100785).add(term100836);
        term100784 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term100848 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term100864 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term100870 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term100876 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term100784, term100784.getClass(), "ships", term100785);
        setIntField(term100848, term100848.getClass(), "x", 0);
        setIntField(term100848, term100848.getClass(), "y", 0);
        setField(term100784, term100784.getClass(), "coordinate", term100848);
        setField(term100784, term100784.getClass(), "name", "BHUMLKEWjf");
        setIntField(term100784, term100784.getClass(), "movesLeft", 684495339);
        setDoubleField(term100864, term100864.getClass(), "startX", 0.0);
        setDoubleField(term100864, term100864.getClass(), "startY", 0.0);
        setDoubleField(term100864, term100864.getClass(), "endX", 0.0);
        setDoubleField(term100864, term100864.getClass(), "endY", 0.0);
        setField(term100864, term100864.getClass(), "nextPoints", null);
        setIntField(term100864, term100864.getClass(), "ftlSpeed", 0);
        setField(term100784, term100784.getClass(), "route", term100864);
        setField(term100870, term100870.getClass(), "name", null);
        setField(term100870, term100870.getClass(), "homeworld", null);
        setIntField(term100870, term100870.getClass(), "age", 0);
        setIntField(term100870, term100870.getClass(), "timeInJob", 0);
        setIntField(term100870, term100870.getClass(), "level", 0);
        setIntField(term100870, term100870.getClass(), "experience", 0);
        setField(term100870, term100870.getClass(), "militaryRank", null);
        setField(term100870, term100870.getClass(), "gender", null);
        setField(term100870, term100870.getClass(), "race", null);
        setField(term100870, term100870.getClass(), "title", null);
        setField(term100870, term100870.getClass(), "job", null);
        setField(term100870, term100870.getClass(), "parent", null);
        setIntField(term100870, term100870.getClass(), "parentIndex", 0);
        setField(term100870, term100870.getClass(), "perkList", null);
        setField(term100870, term100870.getClass(), "stats", null);
        setField(term100784, term100784.getClass(), "commander", term100870);
        setIntField(term100876, term100876.getClass(), "maxX", 0);
        setIntField(term100876, term100876.getClass(), "maxY", 0);
        setField(term100876, term100876.getClass(), "blockMap", null);
        setField(term100876, term100876.getClass(), "points", null);
        setIntField(term100876, term100876.getClass(), "tx", 0);
        setIntField(term100876, term100876.getClass(), "ty", 0);
        setIntField(term100876, term100876.getClass(), "targetDistance", 0);
        setField(term100876, term100876.getClass(), "targetPoint", null);
        setIntField(term100876, term100876.getClass(), "routeIndex", 0);
        setField(term100784, term100784.getClass(), "aStarSearch", term100876);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreeSpaceForMetal", argTypes, term100784, args);
    }

};


