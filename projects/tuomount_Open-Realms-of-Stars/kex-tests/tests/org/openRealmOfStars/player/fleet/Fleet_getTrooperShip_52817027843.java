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

public class Fleet_getTrooperShip_52817027843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101638;

    public Fleet_getTrooperShip_52817027843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term101650 = new ArrayList();
        ((ArrayList) term101650).add((Object)null);
        ((ArrayList) term101650).add((Object)null);
        ((ArrayList) term101650).add((Object)null);
        ((ArrayList) term101650).add((Object)null);
        ((ArrayList) term101650).add((Object)null);
        ((ArrayList) term101650).add((Object)null);
        ((ArrayList) term101650).add((Object)null);
        ((ArrayList) term101650).add((Object)null);
        Object term101641 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term101642 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term101653 = (int[]) newIntArray(0);
        Object term101656 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term101664 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term101642, term101642.getClass(), "index", 249710866);
        setField(term101642, term101642.getClass(), "name", null);
        setIntField(term101642, term101642.getClass(), "maxSlot", -1526265440);
        setIntField(term101642, term101642.getClass(), "slotHull", 1627034192);
        setField(term101642, term101642.getClass(), "hullType", null);
        setField(term101642, term101642.getClass(), "size", null);
        setIntField(term101642, term101642.getClass(), "cost", -1316138191);
        setIntField(term101642, term101642.getClass(), "metalCost", 1739661119);
        setIntField(term101642, term101642.getClass(), "imageIndex", -616399232);
        setDoubleField(term101642, term101642.getClass(), "fleetCapacity", 0.6896952303224777);
        setField(term101642, term101642.getClass(), "originalBuilder", null);
        setField(term101641, term101641.getClass(), "hull", term101642);
        setField(term101641, term101641.getClass(), "components", term101650);
        setField(term101641, term101641.getClass(), "hullPoints", term101653);
        setIntField(term101641, term101641.getClass(), "shield", 257618497);
        setIntField(term101641, term101641.getClass(), "armor", -1053171626);
        setIntField(term101656, term101656.getClass(), "imageType", -523085747);
        setField(term101656, term101656.getClass(), "colorModel", null);
        setField(term101656, term101656.getClass(), "raster", null);
        setField(term101656, term101656.getClass(), "osis", null);
        setField(term101656, term101656.getClass(), "properties", null);
        setFloatField(term101656, term101656.getClass(), "accelerationPriority", 0.43692183F);
        setField(term101656, term101656.getClass(), "surfaceManager", null);
        setField(term101641, term101641.getClass(), "image", term101656);
        setIntField(term101641, term101641.getClass(), "colonist", -1354012258);
        setIntField(term101641, term101641.getClass(), "metal", -734919944);
        setIntField(term101641, term101641.getClass(), "experience", -91371563);
        setIntField(term101641, term101641.getClass(), "culture", 4662703);
        setIntField(term101641, term101641.getClass(), "specialFlags", -2118566618);
        setIntField(term101664, term101664.getClass(), "x", 1655029720);
        setIntField(term101664, term101664.getClass(), "y", -793892224);
        setField(term101641, term101641.getClass(), "tradeCoordinates", term101664);
        setField(term101641, term101641.getClass(), "name", null);
        setField(term101641, term101641.getClass(), "iconId", null);
        setField(term101641, term101641.getClass(), "description", null);
        setIntField(term101641, term101641.getClass(), "prodCost", 0);
        setIntField(term101641, term101641.getClass(), "metalCost", 0);
        ArrayList term101639 = new ArrayList();
        ((ArrayList) term101639).add(term101641);
        term101638 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term101671 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term101687 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term101693 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term101699 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term101638, term101638.getClass(), "ships", term101639);
        setIntField(term101671, term101671.getClass(), "x", 0);
        setIntField(term101671, term101671.getClass(), "y", 0);
        setField(term101638, term101638.getClass(), "coordinate", term101671);
        setField(term101638, term101638.getClass(), "name", "cuNrapAQtZ");
        setIntField(term101638, term101638.getClass(), "movesLeft", 749518086);
        setDoubleField(term101687, term101687.getClass(), "startX", 0.0);
        setDoubleField(term101687, term101687.getClass(), "startY", 0.0);
        setDoubleField(term101687, term101687.getClass(), "endX", 0.0);
        setDoubleField(term101687, term101687.getClass(), "endY", 0.0);
        setField(term101687, term101687.getClass(), "nextPoints", null);
        setIntField(term101687, term101687.getClass(), "ftlSpeed", 0);
        setField(term101638, term101638.getClass(), "route", term101687);
        setField(term101693, term101693.getClass(), "name", null);
        setField(term101693, term101693.getClass(), "homeworld", null);
        setIntField(term101693, term101693.getClass(), "age", 0);
        setIntField(term101693, term101693.getClass(), "timeInJob", 0);
        setIntField(term101693, term101693.getClass(), "level", 0);
        setIntField(term101693, term101693.getClass(), "experience", 0);
        setField(term101693, term101693.getClass(), "militaryRank", null);
        setField(term101693, term101693.getClass(), "gender", null);
        setField(term101693, term101693.getClass(), "race", null);
        setField(term101693, term101693.getClass(), "title", null);
        setField(term101693, term101693.getClass(), "job", null);
        setField(term101693, term101693.getClass(), "parent", null);
        setIntField(term101693, term101693.getClass(), "parentIndex", 0);
        setField(term101693, term101693.getClass(), "perkList", null);
        setField(term101693, term101693.getClass(), "stats", null);
        setField(term101638, term101638.getClass(), "commander", term101693);
        setIntField(term101699, term101699.getClass(), "maxX", 0);
        setIntField(term101699, term101699.getClass(), "maxY", 0);
        setField(term101699, term101699.getClass(), "blockMap", null);
        setField(term101699, term101699.getClass(), "points", null);
        setIntField(term101699, term101699.getClass(), "tx", 0);
        setIntField(term101699, term101699.getClass(), "ty", 0);
        setIntField(term101699, term101699.getClass(), "targetDistance", 0);
        setField(term101699, term101699.getClass(), "targetPoint", null);
        setIntField(term101699, term101699.getClass(), "routeIndex", 0);
        setField(term101638, term101638.getClass(), "aStarSearch", term101699);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrooperShip", argTypes, term101638, args);
    }

};


