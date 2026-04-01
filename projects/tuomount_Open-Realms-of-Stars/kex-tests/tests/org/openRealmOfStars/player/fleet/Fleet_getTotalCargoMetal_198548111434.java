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

public class Fleet_getTotalCargoMetal_198548111434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100576;

    public Fleet_getTotalCargoMetal_198548111434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term100588 = new ArrayList();
        Object term100579 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term100580 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term100591 = (int[]) newIntArray(0);
        Object term100594 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term100602 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term100580, term100580.getClass(), "index", -1586790224);
        setField(term100580, term100580.getClass(), "name", null);
        setIntField(term100580, term100580.getClass(), "maxSlot", 188981994);
        setIntField(term100580, term100580.getClass(), "slotHull", -1348114075);
        setField(term100580, term100580.getClass(), "hullType", null);
        setField(term100580, term100580.getClass(), "size", null);
        setIntField(term100580, term100580.getClass(), "cost", -1005643858);
        setIntField(term100580, term100580.getClass(), "metalCost", 456312486);
        setIntField(term100580, term100580.getClass(), "imageIndex", 1799058363);
        setDoubleField(term100580, term100580.getClass(), "fleetCapacity", 0.5407563152320285);
        setField(term100580, term100580.getClass(), "originalBuilder", null);
        setField(term100579, term100579.getClass(), "hull", term100580);
        setField(term100579, term100579.getClass(), "components", term100588);
        setField(term100579, term100579.getClass(), "hullPoints", term100591);
        setIntField(term100579, term100579.getClass(), "shield", -1542784975);
        setIntField(term100579, term100579.getClass(), "armor", 1798581458);
        setIntField(term100594, term100594.getClass(), "imageType", -151417122);
        setField(term100594, term100594.getClass(), "colorModel", null);
        setField(term100594, term100594.getClass(), "raster", null);
        setField(term100594, term100594.getClass(), "osis", null);
        setField(term100594, term100594.getClass(), "properties", null);
        setFloatField(term100594, term100594.getClass(), "accelerationPriority", 0.7467328F);
        setField(term100594, term100594.getClass(), "surfaceManager", null);
        setField(term100579, term100579.getClass(), "image", term100594);
        setIntField(term100579, term100579.getClass(), "colonist", 1156977610);
        setIntField(term100579, term100579.getClass(), "metal", -800343585);
        setIntField(term100579, term100579.getClass(), "experience", 1248328125);
        setIntField(term100579, term100579.getClass(), "culture", 395562077);
        setIntField(term100579, term100579.getClass(), "specialFlags", -294800497);
        setIntField(term100602, term100602.getClass(), "x", 979334169);
        setIntField(term100602, term100602.getClass(), "y", 840412156);
        setField(term100579, term100579.getClass(), "tradeCoordinates", term100602);
        setField(term100579, term100579.getClass(), "name", null);
        setField(term100579, term100579.getClass(), "iconId", null);
        setField(term100579, term100579.getClass(), "description", null);
        setIntField(term100579, term100579.getClass(), "prodCost", 0);
        setIntField(term100579, term100579.getClass(), "metalCost", 0);
        Object term100607 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term100607, term100607.getClass(), "hull", null);
        setField(term100607, term100607.getClass(), "components", null);
        setField(term100607, term100607.getClass(), "hullPoints", null);
        setIntField(term100607, term100607.getClass(), "shield", 0);
        setIntField(term100607, term100607.getClass(), "armor", 0);
        setField(term100607, term100607.getClass(), "image", null);
        setIntField(term100607, term100607.getClass(), "colonist", 0);
        setIntField(term100607, term100607.getClass(), "metal", 0);
        setIntField(term100607, term100607.getClass(), "experience", 0);
        setIntField(term100607, term100607.getClass(), "culture", 0);
        setIntField(term100607, term100607.getClass(), "specialFlags", 0);
        setField(term100607, term100607.getClass(), "tradeCoordinates", null);
        setField(term100607, term100607.getClass(), "name", null);
        setField(term100607, term100607.getClass(), "iconId", null);
        setField(term100607, term100607.getClass(), "description", null);
        setIntField(term100607, term100607.getClass(), "prodCost", 0);
        setIntField(term100607, term100607.getClass(), "metalCost", 0);
        Object term100617 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term100617, term100617.getClass(), "hull", null);
        setField(term100617, term100617.getClass(), "components", null);
        setField(term100617, term100617.getClass(), "hullPoints", null);
        setIntField(term100617, term100617.getClass(), "shield", 0);
        setIntField(term100617, term100617.getClass(), "armor", 0);
        setField(term100617, term100617.getClass(), "image", null);
        setIntField(term100617, term100617.getClass(), "colonist", 0);
        setIntField(term100617, term100617.getClass(), "metal", 0);
        setIntField(term100617, term100617.getClass(), "experience", 0);
        setIntField(term100617, term100617.getClass(), "culture", 0);
        setIntField(term100617, term100617.getClass(), "specialFlags", 0);
        setField(term100617, term100617.getClass(), "tradeCoordinates", null);
        setField(term100617, term100617.getClass(), "name", null);
        setField(term100617, term100617.getClass(), "iconId", null);
        setField(term100617, term100617.getClass(), "description", null);
        setIntField(term100617, term100617.getClass(), "prodCost", 0);
        setIntField(term100617, term100617.getClass(), "metalCost", 0);
        ArrayList term100577 = new ArrayList();
        ((ArrayList) term100577).add(term100579);
        ((ArrayList) term100577).add(term100607);
        ((ArrayList) term100577).add(term100617);
        term100576 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term100629 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term100645 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term100651 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term100657 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term100576, term100576.getClass(), "ships", term100577);
        setIntField(term100629, term100629.getClass(), "x", 0);
        setIntField(term100629, term100629.getClass(), "y", 0);
        setField(term100576, term100576.getClass(), "coordinate", term100629);
        setField(term100576, term100576.getClass(), "name", "JbyjPaAJuH");
        setIntField(term100576, term100576.getClass(), "movesLeft", -1032395364);
        setDoubleField(term100645, term100645.getClass(), "startX", 0.0);
        setDoubleField(term100645, term100645.getClass(), "startY", 0.0);
        setDoubleField(term100645, term100645.getClass(), "endX", 0.0);
        setDoubleField(term100645, term100645.getClass(), "endY", 0.0);
        setField(term100645, term100645.getClass(), "nextPoints", null);
        setIntField(term100645, term100645.getClass(), "ftlSpeed", 0);
        setField(term100576, term100576.getClass(), "route", term100645);
        setField(term100651, term100651.getClass(), "name", null);
        setField(term100651, term100651.getClass(), "homeworld", null);
        setIntField(term100651, term100651.getClass(), "age", 0);
        setIntField(term100651, term100651.getClass(), "timeInJob", 0);
        setIntField(term100651, term100651.getClass(), "level", 0);
        setIntField(term100651, term100651.getClass(), "experience", 0);
        setField(term100651, term100651.getClass(), "militaryRank", null);
        setField(term100651, term100651.getClass(), "gender", null);
        setField(term100651, term100651.getClass(), "race", null);
        setField(term100651, term100651.getClass(), "title", null);
        setField(term100651, term100651.getClass(), "job", null);
        setField(term100651, term100651.getClass(), "parent", null);
        setIntField(term100651, term100651.getClass(), "parentIndex", 0);
        setField(term100651, term100651.getClass(), "perkList", null);
        setField(term100651, term100651.getClass(), "stats", null);
        setField(term100576, term100576.getClass(), "commander", term100651);
        setIntField(term100657, term100657.getClass(), "maxX", 0);
        setIntField(term100657, term100657.getClass(), "maxY", 0);
        setField(term100657, term100657.getClass(), "blockMap", null);
        setField(term100657, term100657.getClass(), "points", null);
        setIntField(term100657, term100657.getClass(), "tx", 0);
        setIntField(term100657, term100657.getClass(), "ty", 0);
        setIntField(term100657, term100657.getClass(), "targetDistance", 0);
        setField(term100657, term100657.getClass(), "targetPoint", null);
        setIntField(term100657, term100657.getClass(), "routeIndex", 0);
        setField(term100576, term100576.getClass(), "aStarSearch", term100657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalCargoMetal", argTypes, term100576, args);
    }

};


