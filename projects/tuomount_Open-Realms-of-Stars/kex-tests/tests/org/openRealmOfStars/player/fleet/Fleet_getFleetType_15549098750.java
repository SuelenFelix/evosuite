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

public class Fleet_getFleetType_15549098750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104447;

    public Fleet_getFleetType_15549098750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term104459 = new ArrayList();
        ((ArrayList) term104459).add((Object)null);
        ((ArrayList) term104459).add((Object)null);
        ((ArrayList) term104459).add((Object)null);
        ((ArrayList) term104459).add((Object)null);
        ((ArrayList) term104459).add((Object)null);
        ((ArrayList) term104459).add((Object)null);
        ((ArrayList) term104459).add((Object)null);
        ((ArrayList) term104459).add((Object)null);
        ((ArrayList) term104459).add((Object)null);
        Object term104450 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term104451 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term104462 = (int[]) newIntArray(9);
        Object term104474 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term104482 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term104451, term104451.getClass(), "index", 2113830045);
        setField(term104451, term104451.getClass(), "name", null);
        setIntField(term104451, term104451.getClass(), "maxSlot", 957422050);
        setIntField(term104451, term104451.getClass(), "slotHull", -443514250);
        setField(term104451, term104451.getClass(), "hullType", null);
        setField(term104451, term104451.getClass(), "size", null);
        setIntField(term104451, term104451.getClass(), "cost", 1623408712);
        setIntField(term104451, term104451.getClass(), "metalCost", -689716944);
        setIntField(term104451, term104451.getClass(), "imageIndex", -76212338);
        setDoubleField(term104451, term104451.getClass(), "fleetCapacity", 0.6382060245198228);
        setField(term104451, term104451.getClass(), "originalBuilder", null);
        setField(term104450, term104450.getClass(), "hull", term104451);
        setField(term104450, term104450.getClass(), "components", term104459);
        setIntElement(term104462, 0, 1916400220);
        setIntElement(term104462, 1, -1141686836);
        setIntElement(term104462, 2, 478352224);
        setIntElement(term104462, 3, -1101969321);
        setIntElement(term104462, 4, -1548753200);
        setIntElement(term104462, 5, 464016562);
        setIntElement(term104462, 6, -1354580524);
        setIntElement(term104462, 7, 1631553778);
        setIntElement(term104462, 8, 518955314);
        setField(term104450, term104450.getClass(), "hullPoints", term104462);
        setIntField(term104450, term104450.getClass(), "shield", 947568502);
        setIntField(term104450, term104450.getClass(), "armor", -1214145327);
        setIntField(term104474, term104474.getClass(), "imageType", -1998835806);
        setField(term104474, term104474.getClass(), "colorModel", null);
        setField(term104474, term104474.getClass(), "raster", null);
        setField(term104474, term104474.getClass(), "osis", null);
        setField(term104474, term104474.getClass(), "properties", null);
        setFloatField(term104474, term104474.getClass(), "accelerationPriority", 0.38000882F);
        setField(term104474, term104474.getClass(), "surfaceManager", null);
        setField(term104450, term104450.getClass(), "image", term104474);
        setIntField(term104450, term104450.getClass(), "colonist", -573316300);
        setIntField(term104450, term104450.getClass(), "metal", 578872264);
        setIntField(term104450, term104450.getClass(), "experience", -278464853);
        setIntField(term104450, term104450.getClass(), "culture", 184087281);
        setIntField(term104450, term104450.getClass(), "specialFlags", 467765373);
        setIntField(term104482, term104482.getClass(), "x", 1278171430);
        setIntField(term104482, term104482.getClass(), "y", 513629950);
        setField(term104450, term104450.getClass(), "tradeCoordinates", term104482);
        setField(term104450, term104450.getClass(), "name", null);
        setField(term104450, term104450.getClass(), "iconId", null);
        setField(term104450, term104450.getClass(), "description", null);
        setIntField(term104450, term104450.getClass(), "prodCost", 0);
        setIntField(term104450, term104450.getClass(), "metalCost", 0);
        Object term104487 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term104487, term104487.getClass(), "hull", null);
        setField(term104487, term104487.getClass(), "components", null);
        setField(term104487, term104487.getClass(), "hullPoints", null);
        setIntField(term104487, term104487.getClass(), "shield", 0);
        setIntField(term104487, term104487.getClass(), "armor", 0);
        setField(term104487, term104487.getClass(), "image", null);
        setIntField(term104487, term104487.getClass(), "colonist", 0);
        setIntField(term104487, term104487.getClass(), "metal", 0);
        setIntField(term104487, term104487.getClass(), "experience", 0);
        setIntField(term104487, term104487.getClass(), "culture", 0);
        setIntField(term104487, term104487.getClass(), "specialFlags", 0);
        setField(term104487, term104487.getClass(), "tradeCoordinates", null);
        setField(term104487, term104487.getClass(), "name", null);
        setField(term104487, term104487.getClass(), "iconId", null);
        setField(term104487, term104487.getClass(), "description", null);
        setIntField(term104487, term104487.getClass(), "prodCost", 0);
        setIntField(term104487, term104487.getClass(), "metalCost", 0);
        ArrayList term104448 = new ArrayList();
        ((ArrayList) term104448).add(term104450);
        ((ArrayList) term104448).add(term104487);
        term104447 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term104499 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term104515 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term104521 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term104527 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term104447, term104447.getClass(), "ships", term104448);
        setIntField(term104499, term104499.getClass(), "x", 0);
        setIntField(term104499, term104499.getClass(), "y", 0);
        setField(term104447, term104447.getClass(), "coordinate", term104499);
        setField(term104447, term104447.getClass(), "name", "hpFqndTGJq");
        setIntField(term104447, term104447.getClass(), "movesLeft", -691945518);
        setDoubleField(term104515, term104515.getClass(), "startX", 0.0);
        setDoubleField(term104515, term104515.getClass(), "startY", 0.0);
        setDoubleField(term104515, term104515.getClass(), "endX", 0.0);
        setDoubleField(term104515, term104515.getClass(), "endY", 0.0);
        setField(term104515, term104515.getClass(), "nextPoints", null);
        setIntField(term104515, term104515.getClass(), "ftlSpeed", 0);
        setField(term104447, term104447.getClass(), "route", term104515);
        setField(term104521, term104521.getClass(), "name", null);
        setField(term104521, term104521.getClass(), "homeworld", null);
        setIntField(term104521, term104521.getClass(), "age", 0);
        setIntField(term104521, term104521.getClass(), "timeInJob", 0);
        setIntField(term104521, term104521.getClass(), "level", 0);
        setIntField(term104521, term104521.getClass(), "experience", 0);
        setField(term104521, term104521.getClass(), "militaryRank", null);
        setField(term104521, term104521.getClass(), "gender", null);
        setField(term104521, term104521.getClass(), "race", null);
        setField(term104521, term104521.getClass(), "title", null);
        setField(term104521, term104521.getClass(), "job", null);
        setField(term104521, term104521.getClass(), "parent", null);
        setIntField(term104521, term104521.getClass(), "parentIndex", 0);
        setField(term104521, term104521.getClass(), "perkList", null);
        setField(term104521, term104521.getClass(), "stats", null);
        setField(term104447, term104447.getClass(), "commander", term104521);
        setIntField(term104527, term104527.getClass(), "maxX", 0);
        setIntField(term104527, term104527.getClass(), "maxY", 0);
        setField(term104527, term104527.getClass(), "blockMap", null);
        setField(term104527, term104527.getClass(), "points", null);
        setIntField(term104527, term104527.getClass(), "tx", 0);
        setIntField(term104527, term104527.getClass(), "ty", 0);
        setIntField(term104527, term104527.getClass(), "targetDistance", 0);
        setField(term104527, term104527.getClass(), "targetPoint", null);
        setIntField(term104527, term104527.getClass(), "routeIndex", 0);
        setField(term104447, term104447.getClass(), "aStarSearch", term104527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFleetType", argTypes, term104447, args);
    }

};


