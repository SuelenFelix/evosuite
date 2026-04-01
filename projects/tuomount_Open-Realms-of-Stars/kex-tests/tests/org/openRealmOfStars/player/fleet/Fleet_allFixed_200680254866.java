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

public class Fleet_allFixed_200680254866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129046;

    public Fleet_allFixed_200680254866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term129058 = new ArrayList();
        ((ArrayList) term129058).add((Object)null);
        ((ArrayList) term129058).add((Object)null);
        ((ArrayList) term129058).add((Object)null);
        ((ArrayList) term129058).add((Object)null);
        ((ArrayList) term129058).add((Object)null);
        ((ArrayList) term129058).add((Object)null);
        Object term129049 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term129050 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term129061 = (int[]) newIntArray(6);
        Object term129070 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term129078 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term129050, term129050.getClass(), "index", -1149872871);
        setField(term129050, term129050.getClass(), "name", null);
        setIntField(term129050, term129050.getClass(), "maxSlot", -1399922144);
        setIntField(term129050, term129050.getClass(), "slotHull", -480385546);
        setField(term129050, term129050.getClass(), "hullType", null);
        setField(term129050, term129050.getClass(), "size", null);
        setIntField(term129050, term129050.getClass(), "cost", 1949625839);
        setIntField(term129050, term129050.getClass(), "metalCost", 444643271);
        setIntField(term129050, term129050.getClass(), "imageIndex", -979081687);
        setDoubleField(term129050, term129050.getClass(), "fleetCapacity", 0.16852568658760048);
        setField(term129050, term129050.getClass(), "originalBuilder", null);
        setField(term129049, term129049.getClass(), "hull", term129050);
        setField(term129049, term129049.getClass(), "components", term129058);
        setIntElement(term129061, 0, -1919736389);
        setIntElement(term129061, 1, -50803568);
        setIntElement(term129061, 2, 355570570);
        setIntElement(term129061, 3, -1567660546);
        setIntElement(term129061, 4, -301726238);
        setIntElement(term129061, 5, -724083201);
        setField(term129049, term129049.getClass(), "hullPoints", term129061);
        setIntField(term129049, term129049.getClass(), "shield", 603902059);
        setIntField(term129049, term129049.getClass(), "armor", 2127733128);
        setIntField(term129070, term129070.getClass(), "imageType", -1881343665);
        setField(term129070, term129070.getClass(), "colorModel", null);
        setField(term129070, term129070.getClass(), "raster", null);
        setField(term129070, term129070.getClass(), "osis", null);
        setField(term129070, term129070.getClass(), "properties", null);
        setFloatField(term129070, term129070.getClass(), "accelerationPriority", 0.6805867F);
        setField(term129070, term129070.getClass(), "surfaceManager", null);
        setField(term129049, term129049.getClass(), "image", term129070);
        setIntField(term129049, term129049.getClass(), "colonist", -333180006);
        setIntField(term129049, term129049.getClass(), "metal", -575052731);
        setIntField(term129049, term129049.getClass(), "experience", -1792389700);
        setIntField(term129049, term129049.getClass(), "culture", 852503132);
        setIntField(term129049, term129049.getClass(), "specialFlags", -725027019);
        setIntField(term129078, term129078.getClass(), "x", -1677510716);
        setIntField(term129078, term129078.getClass(), "y", -1566098062);
        setField(term129049, term129049.getClass(), "tradeCoordinates", term129078);
        setField(term129049, term129049.getClass(), "name", null);
        setField(term129049, term129049.getClass(), "iconId", null);
        setField(term129049, term129049.getClass(), "description", null);
        setIntField(term129049, term129049.getClass(), "prodCost", 0);
        setIntField(term129049, term129049.getClass(), "metalCost", 0);
        Object term129083 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term129083, term129083.getClass(), "hull", null);
        setField(term129083, term129083.getClass(), "components", null);
        setField(term129083, term129083.getClass(), "hullPoints", null);
        setIntField(term129083, term129083.getClass(), "shield", 0);
        setIntField(term129083, term129083.getClass(), "armor", 0);
        setField(term129083, term129083.getClass(), "image", null);
        setIntField(term129083, term129083.getClass(), "colonist", 0);
        setIntField(term129083, term129083.getClass(), "metal", 0);
        setIntField(term129083, term129083.getClass(), "experience", 0);
        setIntField(term129083, term129083.getClass(), "culture", 0);
        setIntField(term129083, term129083.getClass(), "specialFlags", 0);
        setField(term129083, term129083.getClass(), "tradeCoordinates", null);
        setField(term129083, term129083.getClass(), "name", null);
        setField(term129083, term129083.getClass(), "iconId", null);
        setField(term129083, term129083.getClass(), "description", null);
        setIntField(term129083, term129083.getClass(), "prodCost", 0);
        setIntField(term129083, term129083.getClass(), "metalCost", 0);
        ArrayList term129047 = new ArrayList();
        ((ArrayList) term129047).add(term129049);
        ((ArrayList) term129047).add(term129083);
        term129046 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term129095 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term129111 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term129117 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term129123 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term129046, term129046.getClass(), "ships", term129047);
        setIntField(term129095, term129095.getClass(), "x", 0);
        setIntField(term129095, term129095.getClass(), "y", 0);
        setField(term129046, term129046.getClass(), "coordinate", term129095);
        setField(term129046, term129046.getClass(), "name", "stEQoDImRV");
        setIntField(term129046, term129046.getClass(), "movesLeft", -1152232729);
        setDoubleField(term129111, term129111.getClass(), "startX", 0.0);
        setDoubleField(term129111, term129111.getClass(), "startY", 0.0);
        setDoubleField(term129111, term129111.getClass(), "endX", 0.0);
        setDoubleField(term129111, term129111.getClass(), "endY", 0.0);
        setField(term129111, term129111.getClass(), "nextPoints", null);
        setIntField(term129111, term129111.getClass(), "ftlSpeed", 0);
        setField(term129046, term129046.getClass(), "route", term129111);
        setField(term129117, term129117.getClass(), "name", null);
        setField(term129117, term129117.getClass(), "homeworld", null);
        setIntField(term129117, term129117.getClass(), "age", 0);
        setIntField(term129117, term129117.getClass(), "timeInJob", 0);
        setIntField(term129117, term129117.getClass(), "level", 0);
        setIntField(term129117, term129117.getClass(), "experience", 0);
        setField(term129117, term129117.getClass(), "militaryRank", null);
        setField(term129117, term129117.getClass(), "gender", null);
        setField(term129117, term129117.getClass(), "race", null);
        setField(term129117, term129117.getClass(), "title", null);
        setField(term129117, term129117.getClass(), "job", null);
        setField(term129117, term129117.getClass(), "parent", null);
        setIntField(term129117, term129117.getClass(), "parentIndex", 0);
        setField(term129117, term129117.getClass(), "perkList", null);
        setField(term129117, term129117.getClass(), "stats", null);
        setField(term129046, term129046.getClass(), "commander", term129117);
        setIntField(term129123, term129123.getClass(), "maxX", 0);
        setIntField(term129123, term129123.getClass(), "maxY", 0);
        setField(term129123, term129123.getClass(), "blockMap", null);
        setField(term129123, term129123.getClass(), "points", null);
        setIntField(term129123, term129123.getClass(), "tx", 0);
        setIntField(term129123, term129123.getClass(), "ty", 0);
        setIntField(term129123, term129123.getClass(), "targetDistance", 0);
        setField(term129123, term129123.getClass(), "targetPoint", null);
        setIntField(term129123, term129123.getClass(), "routeIndex", 0);
        setField(term129046, term129046.getClass(), "aStarSearch", term129123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "allFixed", argTypes, term129046, args);
    }

};


