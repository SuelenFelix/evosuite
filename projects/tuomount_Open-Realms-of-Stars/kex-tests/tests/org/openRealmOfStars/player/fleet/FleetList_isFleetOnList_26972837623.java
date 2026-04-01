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

public class FleetList_isFleetOnList_26972837623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2233007;
     Object term2233013;

    public FleetList_isFleetOnList_26972837623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2233008 = new ArrayList();
        term2233007 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.FleetList"));
        setField(term2233007, term2233007.getClass(), "fleetList", term2233008);
        setIntField(term2233007, term2233007.getClass(), "index", -1);
        ArrayList term2233025 = new ArrayList();
        ((ArrayList) term2233025).add((Object)null);
        ((ArrayList) term2233025).add((Object)null);
        ((ArrayList) term2233025).add((Object)null);
        ((ArrayList) term2233025).add((Object)null);
        Object term2233016 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term2233017 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term2233028 = (int[]) newIntArray(1);
        Object term2233032 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term2233040 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term2233017, term2233017.getClass(), "index", -1239101645);
        setField(term2233017, term2233017.getClass(), "name", null);
        setIntField(term2233017, term2233017.getClass(), "maxSlot", -1729847573);
        setIntField(term2233017, term2233017.getClass(), "slotHull", -1541197210);
        setField(term2233017, term2233017.getClass(), "hullType", null);
        setField(term2233017, term2233017.getClass(), "size", null);
        setIntField(term2233017, term2233017.getClass(), "cost", 2092376138);
        setIntField(term2233017, term2233017.getClass(), "metalCost", 1184065644);
        setIntField(term2233017, term2233017.getClass(), "imageIndex", -1413197399);
        setDoubleField(term2233017, term2233017.getClass(), "fleetCapacity", 0.5733115411959432);
        setField(term2233017, term2233017.getClass(), "originalBuilder", null);
        setField(term2233016, term2233016.getClass(), "hull", term2233017);
        setField(term2233016, term2233016.getClass(), "components", term2233025);
        setIntElement(term2233028, 0, 527283445);
        setField(term2233016, term2233016.getClass(), "hullPoints", term2233028);
        setIntField(term2233016, term2233016.getClass(), "shield", -1597666888);
        setIntField(term2233016, term2233016.getClass(), "armor", -132834996);
        setIntField(term2233032, term2233032.getClass(), "imageType", 1052634594);
        setField(term2233032, term2233032.getClass(), "colorModel", null);
        setField(term2233032, term2233032.getClass(), "raster", null);
        setField(term2233032, term2233032.getClass(), "osis", null);
        setField(term2233032, term2233032.getClass(), "properties", null);
        setFloatField(term2233032, term2233032.getClass(), "accelerationPriority", 0.6191887F);
        setField(term2233032, term2233032.getClass(), "surfaceManager", null);
        setField(term2233016, term2233016.getClass(), "image", term2233032);
        setIntField(term2233016, term2233016.getClass(), "colonist", 1921956628);
        setIntField(term2233016, term2233016.getClass(), "metal", 1920619209);
        setIntField(term2233016, term2233016.getClass(), "experience", -1206820899);
        setIntField(term2233016, term2233016.getClass(), "culture", -1971533590);
        setIntField(term2233016, term2233016.getClass(), "specialFlags", 917142674);
        setIntField(term2233040, term2233040.getClass(), "x", -1766738844);
        setIntField(term2233040, term2233040.getClass(), "y", 287029578);
        setField(term2233016, term2233016.getClass(), "tradeCoordinates", term2233040);
        setField(term2233016, term2233016.getClass(), "name", null);
        setField(term2233016, term2233016.getClass(), "iconId", null);
        setField(term2233016, term2233016.getClass(), "description", null);
        setIntField(term2233016, term2233016.getClass(), "prodCost", 0);
        setIntField(term2233016, term2233016.getClass(), "metalCost", 0);
        Object term2233045 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term2233045, term2233045.getClass(), "hull", null);
        setField(term2233045, term2233045.getClass(), "components", null);
        setField(term2233045, term2233045.getClass(), "hullPoints", null);
        setIntField(term2233045, term2233045.getClass(), "shield", 0);
        setIntField(term2233045, term2233045.getClass(), "armor", 0);
        setField(term2233045, term2233045.getClass(), "image", null);
        setIntField(term2233045, term2233045.getClass(), "colonist", 0);
        setIntField(term2233045, term2233045.getClass(), "metal", 0);
        setIntField(term2233045, term2233045.getClass(), "experience", 0);
        setIntField(term2233045, term2233045.getClass(), "culture", 0);
        setIntField(term2233045, term2233045.getClass(), "specialFlags", 0);
        setField(term2233045, term2233045.getClass(), "tradeCoordinates", null);
        setField(term2233045, term2233045.getClass(), "name", null);
        setField(term2233045, term2233045.getClass(), "iconId", null);
        setField(term2233045, term2233045.getClass(), "description", null);
        setIntField(term2233045, term2233045.getClass(), "prodCost", 0);
        setIntField(term2233045, term2233045.getClass(), "metalCost", 0);
        Object term2233055 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term2233055, term2233055.getClass(), "hull", null);
        setField(term2233055, term2233055.getClass(), "components", null);
        setField(term2233055, term2233055.getClass(), "hullPoints", null);
        setIntField(term2233055, term2233055.getClass(), "shield", 0);
        setIntField(term2233055, term2233055.getClass(), "armor", 0);
        setField(term2233055, term2233055.getClass(), "image", null);
        setIntField(term2233055, term2233055.getClass(), "colonist", 0);
        setIntField(term2233055, term2233055.getClass(), "metal", 0);
        setIntField(term2233055, term2233055.getClass(), "experience", 0);
        setIntField(term2233055, term2233055.getClass(), "culture", 0);
        setIntField(term2233055, term2233055.getClass(), "specialFlags", 0);
        setField(term2233055, term2233055.getClass(), "tradeCoordinates", null);
        setField(term2233055, term2233055.getClass(), "name", null);
        setField(term2233055, term2233055.getClass(), "iconId", null);
        setField(term2233055, term2233055.getClass(), "description", null);
        setIntField(term2233055, term2233055.getClass(), "prodCost", 0);
        setIntField(term2233055, term2233055.getClass(), "metalCost", 0);
        Object term2233065 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term2233065, term2233065.getClass(), "hull", null);
        setField(term2233065, term2233065.getClass(), "components", null);
        setField(term2233065, term2233065.getClass(), "hullPoints", null);
        setIntField(term2233065, term2233065.getClass(), "shield", 0);
        setIntField(term2233065, term2233065.getClass(), "armor", 0);
        setField(term2233065, term2233065.getClass(), "image", null);
        setIntField(term2233065, term2233065.getClass(), "colonist", 0);
        setIntField(term2233065, term2233065.getClass(), "metal", 0);
        setIntField(term2233065, term2233065.getClass(), "experience", 0);
        setIntField(term2233065, term2233065.getClass(), "culture", 0);
        setIntField(term2233065, term2233065.getClass(), "specialFlags", 0);
        setField(term2233065, term2233065.getClass(), "tradeCoordinates", null);
        setField(term2233065, term2233065.getClass(), "name", null);
        setField(term2233065, term2233065.getClass(), "iconId", null);
        setField(term2233065, term2233065.getClass(), "description", null);
        setIntField(term2233065, term2233065.getClass(), "prodCost", 0);
        setIntField(term2233065, term2233065.getClass(), "metalCost", 0);
        ArrayList term2233014 = new ArrayList();
        ((ArrayList) term2233014).add(term2233016);
        ((ArrayList) term2233014).add(term2233045);
        ((ArrayList) term2233014).add(term2233055);
        ((ArrayList) term2233014).add(term2233065);
        term2233013 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term2233077 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term2233093 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term2233099 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term2233105 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term2233013, term2233013.getClass(), "ships", term2233014);
        setIntField(term2233077, term2233077.getClass(), "x", 0);
        setIntField(term2233077, term2233077.getClass(), "y", 0);
        setField(term2233013, term2233013.getClass(), "coordinate", term2233077);
        setField(term2233013, term2233013.getClass(), "name", "eFrrWkFgXi");
        setIntField(term2233013, term2233013.getClass(), "movesLeft", 207768963);
        setDoubleField(term2233093, term2233093.getClass(), "startX", 0.0);
        setDoubleField(term2233093, term2233093.getClass(), "startY", 0.0);
        setDoubleField(term2233093, term2233093.getClass(), "endX", 0.0);
        setDoubleField(term2233093, term2233093.getClass(), "endY", 0.0);
        setField(term2233093, term2233093.getClass(), "nextPoints", null);
        setIntField(term2233093, term2233093.getClass(), "ftlSpeed", 0);
        setField(term2233013, term2233013.getClass(), "route", term2233093);
        setField(term2233099, term2233099.getClass(), "name", null);
        setField(term2233099, term2233099.getClass(), "homeworld", null);
        setIntField(term2233099, term2233099.getClass(), "age", 0);
        setIntField(term2233099, term2233099.getClass(), "timeInJob", 0);
        setIntField(term2233099, term2233099.getClass(), "level", 0);
        setIntField(term2233099, term2233099.getClass(), "experience", 0);
        setField(term2233099, term2233099.getClass(), "militaryRank", null);
        setField(term2233099, term2233099.getClass(), "gender", null);
        setField(term2233099, term2233099.getClass(), "race", null);
        setField(term2233099, term2233099.getClass(), "title", null);
        setField(term2233099, term2233099.getClass(), "job", null);
        setField(term2233099, term2233099.getClass(), "parent", null);
        setIntField(term2233099, term2233099.getClass(), "parentIndex", 0);
        setField(term2233099, term2233099.getClass(), "perkList", null);
        setField(term2233099, term2233099.getClass(), "stats", null);
        setField(term2233013, term2233013.getClass(), "commander", term2233099);
        setIntField(term2233105, term2233105.getClass(), "maxX", 0);
        setIntField(term2233105, term2233105.getClass(), "maxY", 0);
        setField(term2233105, term2233105.getClass(), "blockMap", null);
        setField(term2233105, term2233105.getClass(), "points", null);
        setIntField(term2233105, term2233105.getClass(), "tx", 0);
        setIntField(term2233105, term2233105.getClass(), "ty", 0);
        setIntField(term2233105, term2233105.getClass(), "targetDistance", 0);
        setField(term2233105, term2233105.getClass(), "targetPoint", null);
        setIntField(term2233105, term2233105.getClass(), "routeIndex", 0);
        setField(term2233013, term2233013.getClass(), "aStarSearch", term2233105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.FleetList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[1];
        args[0] = term2233013;
        callMethod(klass, "isFleetOnList", argTypes, term2233007, args);
    }

};


