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

public class Fleet_getTotalCargoColonist_147856115835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100674;

    public Fleet_getTotalCargoColonist_147856115835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term100686 = new ArrayList();
        ((ArrayList) term100686).add((Object)null);
        ((ArrayList) term100686).add((Object)null);
        Object term100677 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term100678 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term100689 = (int[]) newIntArray(6);
        Object term100698 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term100706 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term100678, term100678.getClass(), "index", -552556865);
        setField(term100678, term100678.getClass(), "name", null);
        setIntField(term100678, term100678.getClass(), "maxSlot", -1908071026);
        setIntField(term100678, term100678.getClass(), "slotHull", 737590127);
        setField(term100678, term100678.getClass(), "hullType", null);
        setField(term100678, term100678.getClass(), "size", null);
        setIntField(term100678, term100678.getClass(), "cost", 1091000908);
        setIntField(term100678, term100678.getClass(), "metalCost", 417959197);
        setIntField(term100678, term100678.getClass(), "imageIndex", 736672515);
        setDoubleField(term100678, term100678.getClass(), "fleetCapacity", 0.9485929668765458);
        setField(term100678, term100678.getClass(), "originalBuilder", null);
        setField(term100677, term100677.getClass(), "hull", term100678);
        setField(term100677, term100677.getClass(), "components", term100686);
        setIntElement(term100689, 0, -1172515373);
        setIntElement(term100689, 1, 997927264);
        setIntElement(term100689, 2, 2027000196);
        setIntElement(term100689, 3, 969594087);
        setIntElement(term100689, 4, -1821087116);
        setIntElement(term100689, 5, 1300292635);
        setField(term100677, term100677.getClass(), "hullPoints", term100689);
        setIntField(term100677, term100677.getClass(), "shield", -476484302);
        setIntField(term100677, term100677.getClass(), "armor", 1763908335);
        setIntField(term100698, term100698.getClass(), "imageType", -1248507539);
        setField(term100698, term100698.getClass(), "colorModel", null);
        setField(term100698, term100698.getClass(), "raster", null);
        setField(term100698, term100698.getClass(), "osis", null);
        setField(term100698, term100698.getClass(), "properties", null);
        setFloatField(term100698, term100698.getClass(), "accelerationPriority", 0.6436713F);
        setField(term100698, term100698.getClass(), "surfaceManager", null);
        setField(term100677, term100677.getClass(), "image", term100698);
        setIntField(term100677, term100677.getClass(), "colonist", 1327091194);
        setIntField(term100677, term100677.getClass(), "metal", 589230936);
        setIntField(term100677, term100677.getClass(), "experience", -1303562294);
        setIntField(term100677, term100677.getClass(), "culture", -604799051);
        setIntField(term100677, term100677.getClass(), "specialFlags", -157085169);
        setIntField(term100706, term100706.getClass(), "x", -1984025761);
        setIntField(term100706, term100706.getClass(), "y", 1401125758);
        setField(term100677, term100677.getClass(), "tradeCoordinates", term100706);
        setField(term100677, term100677.getClass(), "name", null);
        setField(term100677, term100677.getClass(), "iconId", null);
        setField(term100677, term100677.getClass(), "description", null);
        setIntField(term100677, term100677.getClass(), "prodCost", 0);
        setIntField(term100677, term100677.getClass(), "metalCost", 0);
        Object term100711 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term100711, term100711.getClass(), "hull", null);
        setField(term100711, term100711.getClass(), "components", null);
        setField(term100711, term100711.getClass(), "hullPoints", null);
        setIntField(term100711, term100711.getClass(), "shield", 0);
        setIntField(term100711, term100711.getClass(), "armor", 0);
        setField(term100711, term100711.getClass(), "image", null);
        setIntField(term100711, term100711.getClass(), "colonist", 0);
        setIntField(term100711, term100711.getClass(), "metal", 0);
        setIntField(term100711, term100711.getClass(), "experience", 0);
        setIntField(term100711, term100711.getClass(), "culture", 0);
        setIntField(term100711, term100711.getClass(), "specialFlags", 0);
        setField(term100711, term100711.getClass(), "tradeCoordinates", null);
        setField(term100711, term100711.getClass(), "name", null);
        setField(term100711, term100711.getClass(), "iconId", null);
        setField(term100711, term100711.getClass(), "description", null);
        setIntField(term100711, term100711.getClass(), "prodCost", 0);
        setIntField(term100711, term100711.getClass(), "metalCost", 0);
        Object term100721 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term100721, term100721.getClass(), "hull", null);
        setField(term100721, term100721.getClass(), "components", null);
        setField(term100721, term100721.getClass(), "hullPoints", null);
        setIntField(term100721, term100721.getClass(), "shield", 0);
        setIntField(term100721, term100721.getClass(), "armor", 0);
        setField(term100721, term100721.getClass(), "image", null);
        setIntField(term100721, term100721.getClass(), "colonist", 0);
        setIntField(term100721, term100721.getClass(), "metal", 0);
        setIntField(term100721, term100721.getClass(), "experience", 0);
        setIntField(term100721, term100721.getClass(), "culture", 0);
        setIntField(term100721, term100721.getClass(), "specialFlags", 0);
        setField(term100721, term100721.getClass(), "tradeCoordinates", null);
        setField(term100721, term100721.getClass(), "name", null);
        setField(term100721, term100721.getClass(), "iconId", null);
        setField(term100721, term100721.getClass(), "description", null);
        setIntField(term100721, term100721.getClass(), "prodCost", 0);
        setIntField(term100721, term100721.getClass(), "metalCost", 0);
        ArrayList term100675 = new ArrayList();
        ((ArrayList) term100675).add(term100677);
        ((ArrayList) term100675).add(term100711);
        ((ArrayList) term100675).add(term100721);
        term100674 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term100733 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term100749 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term100755 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term100761 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term100674, term100674.getClass(), "ships", term100675);
        setIntField(term100733, term100733.getClass(), "x", 0);
        setIntField(term100733, term100733.getClass(), "y", 0);
        setField(term100674, term100674.getClass(), "coordinate", term100733);
        setField(term100674, term100674.getClass(), "name", "RVyPHqsjIQ");
        setIntField(term100674, term100674.getClass(), "movesLeft", -1262847411);
        setDoubleField(term100749, term100749.getClass(), "startX", 0.0);
        setDoubleField(term100749, term100749.getClass(), "startY", 0.0);
        setDoubleField(term100749, term100749.getClass(), "endX", 0.0);
        setDoubleField(term100749, term100749.getClass(), "endY", 0.0);
        setField(term100749, term100749.getClass(), "nextPoints", null);
        setIntField(term100749, term100749.getClass(), "ftlSpeed", 0);
        setField(term100674, term100674.getClass(), "route", term100749);
        setField(term100755, term100755.getClass(), "name", null);
        setField(term100755, term100755.getClass(), "homeworld", null);
        setIntField(term100755, term100755.getClass(), "age", 0);
        setIntField(term100755, term100755.getClass(), "timeInJob", 0);
        setIntField(term100755, term100755.getClass(), "level", 0);
        setIntField(term100755, term100755.getClass(), "experience", 0);
        setField(term100755, term100755.getClass(), "militaryRank", null);
        setField(term100755, term100755.getClass(), "gender", null);
        setField(term100755, term100755.getClass(), "race", null);
        setField(term100755, term100755.getClass(), "title", null);
        setField(term100755, term100755.getClass(), "job", null);
        setField(term100755, term100755.getClass(), "parent", null);
        setIntField(term100755, term100755.getClass(), "parentIndex", 0);
        setField(term100755, term100755.getClass(), "perkList", null);
        setField(term100755, term100755.getClass(), "stats", null);
        setField(term100674, term100674.getClass(), "commander", term100755);
        setIntField(term100761, term100761.getClass(), "maxX", 0);
        setIntField(term100761, term100761.getClass(), "maxY", 0);
        setField(term100761, term100761.getClass(), "blockMap", null);
        setField(term100761, term100761.getClass(), "points", null);
        setIntField(term100761, term100761.getClass(), "tx", 0);
        setIntField(term100761, term100761.getClass(), "ty", 0);
        setIntField(term100761, term100761.getClass(), "targetDistance", 0);
        setField(term100761, term100761.getClass(), "targetPoint", null);
        setIntField(term100761, term100761.getClass(), "routeIndex", 0);
        setField(term100674, term100674.getClass(), "aStarSearch", term100761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalCargoColonist", argTypes, term100674, args);
    }

};


