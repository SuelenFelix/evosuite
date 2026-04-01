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

public class Fleet_getTotalFleetCapacity_167403966079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145669;

    public Fleet_getTotalFleetCapacity_167403966079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term145681 = new ArrayList();
        ((ArrayList) term145681).add((Object)null);
        ((ArrayList) term145681).add((Object)null);
        ((ArrayList) term145681).add((Object)null);
        ((ArrayList) term145681).add((Object)null);
        ((ArrayList) term145681).add((Object)null);
        ((ArrayList) term145681).add((Object)null);
        ((ArrayList) term145681).add((Object)null);
        ((ArrayList) term145681).add((Object)null);
        ((ArrayList) term145681).add((Object)null);
        Object term145672 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term145673 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term145684 = (int[]) newIntArray(0);
        Object term145687 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term145695 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term145673, term145673.getClass(), "index", -354597292);
        setField(term145673, term145673.getClass(), "name", null);
        setIntField(term145673, term145673.getClass(), "maxSlot", -581675259);
        setIntField(term145673, term145673.getClass(), "slotHull", -495803538);
        setField(term145673, term145673.getClass(), "hullType", null);
        setField(term145673, term145673.getClass(), "size", null);
        setIntField(term145673, term145673.getClass(), "cost", -168864726);
        setIntField(term145673, term145673.getClass(), "metalCost", 970702834);
        setIntField(term145673, term145673.getClass(), "imageIndex", -863293599);
        setDoubleField(term145673, term145673.getClass(), "fleetCapacity", 0.20131600000037786);
        setField(term145673, term145673.getClass(), "originalBuilder", null);
        setField(term145672, term145672.getClass(), "hull", term145673);
        setField(term145672, term145672.getClass(), "components", term145681);
        setField(term145672, term145672.getClass(), "hullPoints", term145684);
        setIntField(term145672, term145672.getClass(), "shield", -215542299);
        setIntField(term145672, term145672.getClass(), "armor", 1063632099);
        setIntField(term145687, term145687.getClass(), "imageType", -1851410176);
        setField(term145687, term145687.getClass(), "colorModel", null);
        setField(term145687, term145687.getClass(), "raster", null);
        setField(term145687, term145687.getClass(), "osis", null);
        setField(term145687, term145687.getClass(), "properties", null);
        setFloatField(term145687, term145687.getClass(), "accelerationPriority", 0.07802445F);
        setField(term145687, term145687.getClass(), "surfaceManager", null);
        setField(term145672, term145672.getClass(), "image", term145687);
        setIntField(term145672, term145672.getClass(), "colonist", -1208938714);
        setIntField(term145672, term145672.getClass(), "metal", -1241552174);
        setIntField(term145672, term145672.getClass(), "experience", 1571367099);
        setIntField(term145672, term145672.getClass(), "culture", -106290041);
        setIntField(term145672, term145672.getClass(), "specialFlags", -1931235714);
        setIntField(term145695, term145695.getClass(), "x", 1975801653);
        setIntField(term145695, term145695.getClass(), "y", -2017767309);
        setField(term145672, term145672.getClass(), "tradeCoordinates", term145695);
        setField(term145672, term145672.getClass(), "name", null);
        setField(term145672, term145672.getClass(), "iconId", null);
        setField(term145672, term145672.getClass(), "description", null);
        setIntField(term145672, term145672.getClass(), "prodCost", 0);
        setIntField(term145672, term145672.getClass(), "metalCost", 0);
        Object term145700 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term145700, term145700.getClass(), "hull", null);
        setField(term145700, term145700.getClass(), "components", null);
        setField(term145700, term145700.getClass(), "hullPoints", null);
        setIntField(term145700, term145700.getClass(), "shield", 0);
        setIntField(term145700, term145700.getClass(), "armor", 0);
        setField(term145700, term145700.getClass(), "image", null);
        setIntField(term145700, term145700.getClass(), "colonist", 0);
        setIntField(term145700, term145700.getClass(), "metal", 0);
        setIntField(term145700, term145700.getClass(), "experience", 0);
        setIntField(term145700, term145700.getClass(), "culture", 0);
        setIntField(term145700, term145700.getClass(), "specialFlags", 0);
        setField(term145700, term145700.getClass(), "tradeCoordinates", null);
        setField(term145700, term145700.getClass(), "name", null);
        setField(term145700, term145700.getClass(), "iconId", null);
        setField(term145700, term145700.getClass(), "description", null);
        setIntField(term145700, term145700.getClass(), "prodCost", 0);
        setIntField(term145700, term145700.getClass(), "metalCost", 0);
        Object term145710 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term145710, term145710.getClass(), "hull", null);
        setField(term145710, term145710.getClass(), "components", null);
        setField(term145710, term145710.getClass(), "hullPoints", null);
        setIntField(term145710, term145710.getClass(), "shield", 0);
        setIntField(term145710, term145710.getClass(), "armor", 0);
        setField(term145710, term145710.getClass(), "image", null);
        setIntField(term145710, term145710.getClass(), "colonist", 0);
        setIntField(term145710, term145710.getClass(), "metal", 0);
        setIntField(term145710, term145710.getClass(), "experience", 0);
        setIntField(term145710, term145710.getClass(), "culture", 0);
        setIntField(term145710, term145710.getClass(), "specialFlags", 0);
        setField(term145710, term145710.getClass(), "tradeCoordinates", null);
        setField(term145710, term145710.getClass(), "name", null);
        setField(term145710, term145710.getClass(), "iconId", null);
        setField(term145710, term145710.getClass(), "description", null);
        setIntField(term145710, term145710.getClass(), "prodCost", 0);
        setIntField(term145710, term145710.getClass(), "metalCost", 0);
        ArrayList term145670 = new ArrayList();
        ((ArrayList) term145670).add(term145672);
        ((ArrayList) term145670).add(term145700);
        ((ArrayList) term145670).add(term145710);
        term145669 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term145722 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term145738 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term145744 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term145750 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term145669, term145669.getClass(), "ships", term145670);
        setIntField(term145722, term145722.getClass(), "x", 0);
        setIntField(term145722, term145722.getClass(), "y", 0);
        setField(term145669, term145669.getClass(), "coordinate", term145722);
        setField(term145669, term145669.getClass(), "name", "yVPTdGtpeE");
        setIntField(term145669, term145669.getClass(), "movesLeft", -1479981191);
        setDoubleField(term145738, term145738.getClass(), "startX", 0.0);
        setDoubleField(term145738, term145738.getClass(), "startY", 0.0);
        setDoubleField(term145738, term145738.getClass(), "endX", 0.0);
        setDoubleField(term145738, term145738.getClass(), "endY", 0.0);
        setField(term145738, term145738.getClass(), "nextPoints", null);
        setIntField(term145738, term145738.getClass(), "ftlSpeed", 0);
        setField(term145669, term145669.getClass(), "route", term145738);
        setField(term145744, term145744.getClass(), "name", null);
        setField(term145744, term145744.getClass(), "homeworld", null);
        setIntField(term145744, term145744.getClass(), "age", 0);
        setIntField(term145744, term145744.getClass(), "timeInJob", 0);
        setIntField(term145744, term145744.getClass(), "level", 0);
        setIntField(term145744, term145744.getClass(), "experience", 0);
        setField(term145744, term145744.getClass(), "militaryRank", null);
        setField(term145744, term145744.getClass(), "gender", null);
        setField(term145744, term145744.getClass(), "race", null);
        setField(term145744, term145744.getClass(), "title", null);
        setField(term145744, term145744.getClass(), "job", null);
        setField(term145744, term145744.getClass(), "parent", null);
        setIntField(term145744, term145744.getClass(), "parentIndex", 0);
        setField(term145744, term145744.getClass(), "perkList", null);
        setField(term145744, term145744.getClass(), "stats", null);
        setField(term145669, term145669.getClass(), "commander", term145744);
        setIntField(term145750, term145750.getClass(), "maxX", 0);
        setIntField(term145750, term145750.getClass(), "maxY", 0);
        setField(term145750, term145750.getClass(), "blockMap", null);
        setField(term145750, term145750.getClass(), "points", null);
        setIntField(term145750, term145750.getClass(), "tx", 0);
        setIntField(term145750, term145750.getClass(), "ty", 0);
        setIntField(term145750, term145750.getClass(), "targetDistance", 0);
        setField(term145750, term145750.getClass(), "targetPoint", null);
        setIntField(term145750, term145750.getClass(), "routeIndex", 0);
        setField(term145669, term145669.getClass(), "aStarSearch", term145750);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalFleetCapacity", argTypes, term145669, args);
    }

};


