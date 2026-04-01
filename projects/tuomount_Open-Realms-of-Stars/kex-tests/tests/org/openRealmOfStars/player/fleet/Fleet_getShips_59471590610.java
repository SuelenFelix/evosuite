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

public class Fleet_getShips_59471590610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77636;

    public Fleet_getShips_59471590610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term77648 = new ArrayList();
        ((ArrayList) term77648).add((Object)null);
        ((ArrayList) term77648).add((Object)null);
        ((ArrayList) term77648).add((Object)null);
        ((ArrayList) term77648).add((Object)null);
        ((ArrayList) term77648).add((Object)null);
        ((ArrayList) term77648).add((Object)null);
        Object term77639 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term77640 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term77651 = (int[]) newIntArray(1);
        Object term77655 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term77663 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term77640, term77640.getClass(), "index", 630565003);
        setField(term77640, term77640.getClass(), "name", null);
        setIntField(term77640, term77640.getClass(), "maxSlot", -1966988507);
        setIntField(term77640, term77640.getClass(), "slotHull", -1089838622);
        setField(term77640, term77640.getClass(), "hullType", null);
        setField(term77640, term77640.getClass(), "size", null);
        setIntField(term77640, term77640.getClass(), "cost", -937178869);
        setIntField(term77640, term77640.getClass(), "metalCost", -1952449836);
        setIntField(term77640, term77640.getClass(), "imageIndex", -405260008);
        setDoubleField(term77640, term77640.getClass(), "fleetCapacity", 0.6059734092898602);
        setField(term77640, term77640.getClass(), "originalBuilder", null);
        setField(term77639, term77639.getClass(), "hull", term77640);
        setField(term77639, term77639.getClass(), "components", term77648);
        setIntElement(term77651, 0, 2046964718);
        setField(term77639, term77639.getClass(), "hullPoints", term77651);
        setIntField(term77639, term77639.getClass(), "shield", 1610353449);
        setIntField(term77639, term77639.getClass(), "armor", -1431201540);
        setIntField(term77655, term77655.getClass(), "imageType", 921611666);
        setField(term77655, term77655.getClass(), "colorModel", null);
        setField(term77655, term77655.getClass(), "raster", null);
        setField(term77655, term77655.getClass(), "osis", null);
        setField(term77655, term77655.getClass(), "properties", null);
        setFloatField(term77655, term77655.getClass(), "accelerationPriority", 0.3692338F);
        setField(term77655, term77655.getClass(), "surfaceManager", null);
        setField(term77639, term77639.getClass(), "image", term77655);
        setIntField(term77639, term77639.getClass(), "colonist", -982945087);
        setIntField(term77639, term77639.getClass(), "metal", 171057010);
        setIntField(term77639, term77639.getClass(), "experience", -1039706080);
        setIntField(term77639, term77639.getClass(), "culture", 1009893493);
        setIntField(term77639, term77639.getClass(), "specialFlags", -1097846142);
        setIntField(term77663, term77663.getClass(), "x", 1026272483);
        setIntField(term77663, term77663.getClass(), "y", -48026838);
        setField(term77639, term77639.getClass(), "tradeCoordinates", term77663);
        setField(term77639, term77639.getClass(), "name", null);
        setField(term77639, term77639.getClass(), "iconId", null);
        setField(term77639, term77639.getClass(), "description", null);
        setIntField(term77639, term77639.getClass(), "prodCost", 0);
        setIntField(term77639, term77639.getClass(), "metalCost", 0);
        Object term77668 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term77668, term77668.getClass(), "hull", null);
        setField(term77668, term77668.getClass(), "components", null);
        setField(term77668, term77668.getClass(), "hullPoints", null);
        setIntField(term77668, term77668.getClass(), "shield", 0);
        setIntField(term77668, term77668.getClass(), "armor", 0);
        setField(term77668, term77668.getClass(), "image", null);
        setIntField(term77668, term77668.getClass(), "colonist", 0);
        setIntField(term77668, term77668.getClass(), "metal", 0);
        setIntField(term77668, term77668.getClass(), "experience", 0);
        setIntField(term77668, term77668.getClass(), "culture", 0);
        setIntField(term77668, term77668.getClass(), "specialFlags", 0);
        setField(term77668, term77668.getClass(), "tradeCoordinates", null);
        setField(term77668, term77668.getClass(), "name", null);
        setField(term77668, term77668.getClass(), "iconId", null);
        setField(term77668, term77668.getClass(), "description", null);
        setIntField(term77668, term77668.getClass(), "prodCost", 0);
        setIntField(term77668, term77668.getClass(), "metalCost", 0);
        Object term77678 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term77678, term77678.getClass(), "hull", null);
        setField(term77678, term77678.getClass(), "components", null);
        setField(term77678, term77678.getClass(), "hullPoints", null);
        setIntField(term77678, term77678.getClass(), "shield", 0);
        setIntField(term77678, term77678.getClass(), "armor", 0);
        setField(term77678, term77678.getClass(), "image", null);
        setIntField(term77678, term77678.getClass(), "colonist", 0);
        setIntField(term77678, term77678.getClass(), "metal", 0);
        setIntField(term77678, term77678.getClass(), "experience", 0);
        setIntField(term77678, term77678.getClass(), "culture", 0);
        setIntField(term77678, term77678.getClass(), "specialFlags", 0);
        setField(term77678, term77678.getClass(), "tradeCoordinates", null);
        setField(term77678, term77678.getClass(), "name", null);
        setField(term77678, term77678.getClass(), "iconId", null);
        setField(term77678, term77678.getClass(), "description", null);
        setIntField(term77678, term77678.getClass(), "prodCost", 0);
        setIntField(term77678, term77678.getClass(), "metalCost", 0);
        ArrayList term77637 = new ArrayList();
        ((ArrayList) term77637).add(term77639);
        ((ArrayList) term77637).add(term77668);
        ((ArrayList) term77637).add(term77678);
        term77636 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term77690 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term77706 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term77712 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term77718 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term77636, term77636.getClass(), "ships", term77637);
        setIntField(term77690, term77690.getClass(), "x", 0);
        setIntField(term77690, term77690.getClass(), "y", 0);
        setField(term77636, term77636.getClass(), "coordinate", term77690);
        setField(term77636, term77636.getClass(), "name", "TdSezgsZkW");
        setIntField(term77636, term77636.getClass(), "movesLeft", -1886407162);
        setDoubleField(term77706, term77706.getClass(), "startX", 0.0);
        setDoubleField(term77706, term77706.getClass(), "startY", 0.0);
        setDoubleField(term77706, term77706.getClass(), "endX", 0.0);
        setDoubleField(term77706, term77706.getClass(), "endY", 0.0);
        setField(term77706, term77706.getClass(), "nextPoints", null);
        setIntField(term77706, term77706.getClass(), "ftlSpeed", 0);
        setField(term77636, term77636.getClass(), "route", term77706);
        setField(term77712, term77712.getClass(), "name", null);
        setField(term77712, term77712.getClass(), "homeworld", null);
        setIntField(term77712, term77712.getClass(), "age", 0);
        setIntField(term77712, term77712.getClass(), "timeInJob", 0);
        setIntField(term77712, term77712.getClass(), "level", 0);
        setIntField(term77712, term77712.getClass(), "experience", 0);
        setField(term77712, term77712.getClass(), "militaryRank", null);
        setField(term77712, term77712.getClass(), "gender", null);
        setField(term77712, term77712.getClass(), "race", null);
        setField(term77712, term77712.getClass(), "title", null);
        setField(term77712, term77712.getClass(), "job", null);
        setField(term77712, term77712.getClass(), "parent", null);
        setIntField(term77712, term77712.getClass(), "parentIndex", 0);
        setField(term77712, term77712.getClass(), "perkList", null);
        setField(term77712, term77712.getClass(), "stats", null);
        setField(term77636, term77636.getClass(), "commander", term77712);
        setIntField(term77718, term77718.getClass(), "maxX", 0);
        setIntField(term77718, term77718.getClass(), "maxY", 0);
        setField(term77718, term77718.getClass(), "blockMap", null);
        setField(term77718, term77718.getClass(), "points", null);
        setIntField(term77718, term77718.getClass(), "tx", 0);
        setIntField(term77718, term77718.getClass(), "ty", 0);
        setIntField(term77718, term77718.getClass(), "targetDistance", 0);
        setField(term77718, term77718.getClass(), "targetPoint", null);
        setIntField(term77718, term77718.getClass(), "routeIndex", 0);
        setField(term77636, term77636.getClass(), "aStarSearch", term77718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShips", argTypes, term77636, args);
    }

};


