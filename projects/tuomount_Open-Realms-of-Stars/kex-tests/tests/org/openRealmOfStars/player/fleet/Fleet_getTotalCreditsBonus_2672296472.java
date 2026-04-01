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

public class Fleet_getTotalCreditsBonus_2672296472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129680;

    public Fleet_getTotalCreditsBonus_2672296472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term129692 = new ArrayList();
        ((ArrayList) term129692).add((Object)null);
        ((ArrayList) term129692).add((Object)null);
        ((ArrayList) term129692).add((Object)null);
        ((ArrayList) term129692).add((Object)null);
        ((ArrayList) term129692).add((Object)null);
        ((ArrayList) term129692).add((Object)null);
        ((ArrayList) term129692).add((Object)null);
        Object term129683 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term129684 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term129695 = (int[]) newIntArray(4);
        Object term129702 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term129710 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term129684, term129684.getClass(), "index", 820505709);
        setField(term129684, term129684.getClass(), "name", null);
        setIntField(term129684, term129684.getClass(), "maxSlot", -1269806468);
        setIntField(term129684, term129684.getClass(), "slotHull", 1341772926);
        setField(term129684, term129684.getClass(), "hullType", null);
        setField(term129684, term129684.getClass(), "size", null);
        setIntField(term129684, term129684.getClass(), "cost", -1897554844);
        setIntField(term129684, term129684.getClass(), "metalCost", -1108293327);
        setIntField(term129684, term129684.getClass(), "imageIndex", 798256751);
        setDoubleField(term129684, term129684.getClass(), "fleetCapacity", 0.24810335047389354);
        setField(term129684, term129684.getClass(), "originalBuilder", null);
        setField(term129683, term129683.getClass(), "hull", term129684);
        setField(term129683, term129683.getClass(), "components", term129692);
        setIntElement(term129695, 0, -807367593);
        setIntElement(term129695, 1, -1012649720);
        setIntElement(term129695, 2, 1728827702);
        setIntElement(term129695, 3, -125346559);
        setField(term129683, term129683.getClass(), "hullPoints", term129695);
        setIntField(term129683, term129683.getClass(), "shield", -705244323);
        setIntField(term129683, term129683.getClass(), "armor", 729298502);
        setIntField(term129702, term129702.getClass(), "imageType", 273885563);
        setField(term129702, term129702.getClass(), "colorModel", null);
        setField(term129702, term129702.getClass(), "raster", null);
        setField(term129702, term129702.getClass(), "osis", null);
        setField(term129702, term129702.getClass(), "properties", null);
        setFloatField(term129702, term129702.getClass(), "accelerationPriority", 0.9737084F);
        setField(term129702, term129702.getClass(), "surfaceManager", null);
        setField(term129683, term129683.getClass(), "image", term129702);
        setIntField(term129683, term129683.getClass(), "colonist", -785822775);
        setIntField(term129683, term129683.getClass(), "metal", -1481927507);
        setIntField(term129683, term129683.getClass(), "experience", -1877062491);
        setIntField(term129683, term129683.getClass(), "culture", 807661218);
        setIntField(term129683, term129683.getClass(), "specialFlags", -6550207);
        setIntField(term129710, term129710.getClass(), "x", 2028051965);
        setIntField(term129710, term129710.getClass(), "y", 1503074692);
        setField(term129683, term129683.getClass(), "tradeCoordinates", term129710);
        setField(term129683, term129683.getClass(), "name", null);
        setField(term129683, term129683.getClass(), "iconId", null);
        setField(term129683, term129683.getClass(), "description", null);
        setIntField(term129683, term129683.getClass(), "prodCost", 0);
        setIntField(term129683, term129683.getClass(), "metalCost", 0);
        ArrayList term129681 = new ArrayList();
        ((ArrayList) term129681).add(term129683);
        term129680 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term129717 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term129733 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term129739 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term129745 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term129680, term129680.getClass(), "ships", term129681);
        setIntField(term129717, term129717.getClass(), "x", 0);
        setIntField(term129717, term129717.getClass(), "y", 0);
        setField(term129680, term129680.getClass(), "coordinate", term129717);
        setField(term129680, term129680.getClass(), "name", "gwIPWwFNRB");
        setIntField(term129680, term129680.getClass(), "movesLeft", -556744853);
        setDoubleField(term129733, term129733.getClass(), "startX", 0.0);
        setDoubleField(term129733, term129733.getClass(), "startY", 0.0);
        setDoubleField(term129733, term129733.getClass(), "endX", 0.0);
        setDoubleField(term129733, term129733.getClass(), "endY", 0.0);
        setField(term129733, term129733.getClass(), "nextPoints", null);
        setIntField(term129733, term129733.getClass(), "ftlSpeed", 0);
        setField(term129680, term129680.getClass(), "route", term129733);
        setField(term129739, term129739.getClass(), "name", null);
        setField(term129739, term129739.getClass(), "homeworld", null);
        setIntField(term129739, term129739.getClass(), "age", 0);
        setIntField(term129739, term129739.getClass(), "timeInJob", 0);
        setIntField(term129739, term129739.getClass(), "level", 0);
        setIntField(term129739, term129739.getClass(), "experience", 0);
        setField(term129739, term129739.getClass(), "militaryRank", null);
        setField(term129739, term129739.getClass(), "gender", null);
        setField(term129739, term129739.getClass(), "race", null);
        setField(term129739, term129739.getClass(), "title", null);
        setField(term129739, term129739.getClass(), "job", null);
        setField(term129739, term129739.getClass(), "parent", null);
        setIntField(term129739, term129739.getClass(), "parentIndex", 0);
        setField(term129739, term129739.getClass(), "perkList", null);
        setField(term129739, term129739.getClass(), "stats", null);
        setField(term129680, term129680.getClass(), "commander", term129739);
        setIntField(term129745, term129745.getClass(), "maxX", 0);
        setIntField(term129745, term129745.getClass(), "maxY", 0);
        setField(term129745, term129745.getClass(), "blockMap", null);
        setField(term129745, term129745.getClass(), "points", null);
        setIntField(term129745, term129745.getClass(), "tx", 0);
        setIntField(term129745, term129745.getClass(), "ty", 0);
        setIntField(term129745, term129745.getClass(), "targetDistance", 0);
        setField(term129745, term129745.getClass(), "targetPoint", null);
        setIntField(term129745, term129745.getClass(), "routeIndex", 0);
        setField(term129680, term129680.getClass(), "aStarSearch", term129745);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalCreditsBonus", argTypes, term129680, args);
    }

};


