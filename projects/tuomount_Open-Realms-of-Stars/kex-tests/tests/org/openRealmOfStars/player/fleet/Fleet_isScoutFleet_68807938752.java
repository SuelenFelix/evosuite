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

public class Fleet_isScoutFleet_68807938752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104687;

    public Fleet_isScoutFleet_68807938752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term104699 = new ArrayList();
        ((ArrayList) term104699).add((Object)null);
        ((ArrayList) term104699).add((Object)null);
        ((ArrayList) term104699).add((Object)null);
        ((ArrayList) term104699).add((Object)null);
        Object term104690 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term104691 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term104702 = (int[]) newIntArray(5);
        Object term104710 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term104718 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term104691, term104691.getClass(), "index", -1932506949);
        setField(term104691, term104691.getClass(), "name", null);
        setIntField(term104691, term104691.getClass(), "maxSlot", -1191178740);
        setIntField(term104691, term104691.getClass(), "slotHull", -1072911681);
        setField(term104691, term104691.getClass(), "hullType", null);
        setField(term104691, term104691.getClass(), "size", null);
        setIntField(term104691, term104691.getClass(), "cost", 237096319);
        setIntField(term104691, term104691.getClass(), "metalCost", -129239539);
        setIntField(term104691, term104691.getClass(), "imageIndex", 1898041134);
        setDoubleField(term104691, term104691.getClass(), "fleetCapacity", 0.36312400202399575);
        setField(term104691, term104691.getClass(), "originalBuilder", null);
        setField(term104690, term104690.getClass(), "hull", term104691);
        setField(term104690, term104690.getClass(), "components", term104699);
        setIntElement(term104702, 0, 1697090986);
        setIntElement(term104702, 1, -1830375526);
        setIntElement(term104702, 2, 936265526);
        setIntElement(term104702, 3, -495686058);
        setIntElement(term104702, 4, 611713058);
        setField(term104690, term104690.getClass(), "hullPoints", term104702);
        setIntField(term104690, term104690.getClass(), "shield", -1354326923);
        setIntField(term104690, term104690.getClass(), "armor", -986698677);
        setIntField(term104710, term104710.getClass(), "imageType", -1381534227);
        setField(term104710, term104710.getClass(), "colorModel", null);
        setField(term104710, term104710.getClass(), "raster", null);
        setField(term104710, term104710.getClass(), "osis", null);
        setField(term104710, term104710.getClass(), "properties", null);
        setFloatField(term104710, term104710.getClass(), "accelerationPriority", 0.5840714F);
        setField(term104710, term104710.getClass(), "surfaceManager", null);
        setField(term104690, term104690.getClass(), "image", term104710);
        setIntField(term104690, term104690.getClass(), "colonist", 1700393240);
        setIntField(term104690, term104690.getClass(), "metal", -2014947462);
        setIntField(term104690, term104690.getClass(), "experience", -719658316);
        setIntField(term104690, term104690.getClass(), "culture", 303187441);
        setIntField(term104690, term104690.getClass(), "specialFlags", -1129294722);
        setIntField(term104718, term104718.getClass(), "x", -1465687477);
        setIntField(term104718, term104718.getClass(), "y", 1456965553);
        setField(term104690, term104690.getClass(), "tradeCoordinates", term104718);
        setField(term104690, term104690.getClass(), "name", null);
        setField(term104690, term104690.getClass(), "iconId", null);
        setField(term104690, term104690.getClass(), "description", null);
        setIntField(term104690, term104690.getClass(), "prodCost", 0);
        setIntField(term104690, term104690.getClass(), "metalCost", 0);
        ArrayList term104688 = new ArrayList();
        ((ArrayList) term104688).add(term104690);
        term104687 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term104725 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term104741 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term104747 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term104753 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term104687, term104687.getClass(), "ships", term104688);
        setIntField(term104725, term104725.getClass(), "x", 0);
        setIntField(term104725, term104725.getClass(), "y", 0);
        setField(term104687, term104687.getClass(), "coordinate", term104725);
        setField(term104687, term104687.getClass(), "name", "acUFFUizDE");
        setIntField(term104687, term104687.getClass(), "movesLeft", -2061421262);
        setDoubleField(term104741, term104741.getClass(), "startX", 0.0);
        setDoubleField(term104741, term104741.getClass(), "startY", 0.0);
        setDoubleField(term104741, term104741.getClass(), "endX", 0.0);
        setDoubleField(term104741, term104741.getClass(), "endY", 0.0);
        setField(term104741, term104741.getClass(), "nextPoints", null);
        setIntField(term104741, term104741.getClass(), "ftlSpeed", 0);
        setField(term104687, term104687.getClass(), "route", term104741);
        setField(term104747, term104747.getClass(), "name", null);
        setField(term104747, term104747.getClass(), "homeworld", null);
        setIntField(term104747, term104747.getClass(), "age", 0);
        setIntField(term104747, term104747.getClass(), "timeInJob", 0);
        setIntField(term104747, term104747.getClass(), "level", 0);
        setIntField(term104747, term104747.getClass(), "experience", 0);
        setField(term104747, term104747.getClass(), "militaryRank", null);
        setField(term104747, term104747.getClass(), "gender", null);
        setField(term104747, term104747.getClass(), "race", null);
        setField(term104747, term104747.getClass(), "title", null);
        setField(term104747, term104747.getClass(), "job", null);
        setField(term104747, term104747.getClass(), "parent", null);
        setIntField(term104747, term104747.getClass(), "parentIndex", 0);
        setField(term104747, term104747.getClass(), "perkList", null);
        setField(term104747, term104747.getClass(), "stats", null);
        setField(term104687, term104687.getClass(), "commander", term104747);
        setIntField(term104753, term104753.getClass(), "maxX", 0);
        setIntField(term104753, term104753.getClass(), "maxY", 0);
        setField(term104753, term104753.getClass(), "blockMap", null);
        setField(term104753, term104753.getClass(), "points", null);
        setIntField(term104753, term104753.getClass(), "tx", 0);
        setIntField(term104753, term104753.getClass(), "ty", 0);
        setIntField(term104753, term104753.getClass(), "targetDistance", 0);
        setField(term104753, term104753.getClass(), "targetPoint", null);
        setIntField(term104753, term104753.getClass(), "routeIndex", 0);
        setField(term104687, term104687.getClass(), "aStarSearch", term104753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isScoutFleet", argTypes, term104687, args);
    }

};


