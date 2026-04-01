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

public class Fleet_isStarBaseDeployed_94677109270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129452;

    public Fleet_isStarBaseDeployed_94677109270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term129464 = new ArrayList();
        ((ArrayList) term129464).add((Object)null);
        ((ArrayList) term129464).add((Object)null);
        ((ArrayList) term129464).add((Object)null);
        Object term129455 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term129456 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term129467 = (int[]) newIntArray(3);
        Object term129473 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term129481 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term129456, term129456.getClass(), "index", -804537981);
        setField(term129456, term129456.getClass(), "name", null);
        setIntField(term129456, term129456.getClass(), "maxSlot", 687292726);
        setIntField(term129456, term129456.getClass(), "slotHull", 1333460001);
        setField(term129456, term129456.getClass(), "hullType", null);
        setField(term129456, term129456.getClass(), "size", null);
        setIntField(term129456, term129456.getClass(), "cost", 535096386);
        setIntField(term129456, term129456.getClass(), "metalCost", 286007591);
        setIntField(term129456, term129456.getClass(), "imageIndex", -61827487);
        setDoubleField(term129456, term129456.getClass(), "fleetCapacity", 0.9963416078314885);
        setField(term129456, term129456.getClass(), "originalBuilder", null);
        setField(term129455, term129455.getClass(), "hull", term129456);
        setField(term129455, term129455.getClass(), "components", term129464);
        setIntElement(term129467, 0, -151824010);
        setIntElement(term129467, 1, -1151904761);
        setIntElement(term129467, 2, 1659023460);
        setField(term129455, term129455.getClass(), "hullPoints", term129467);
        setIntField(term129455, term129455.getClass(), "shield", 634488475);
        setIntField(term129455, term129455.getClass(), "armor", 1847355342);
        setIntField(term129473, term129473.getClass(), "imageType", 819839423);
        setField(term129473, term129473.getClass(), "colorModel", null);
        setField(term129473, term129473.getClass(), "raster", null);
        setField(term129473, term129473.getClass(), "osis", null);
        setField(term129473, term129473.getClass(), "properties", null);
        setFloatField(term129473, term129473.getClass(), "accelerationPriority", 0.63008493F);
        setField(term129473, term129473.getClass(), "surfaceManager", null);
        setField(term129455, term129455.getClass(), "image", term129473);
        setIntField(term129455, term129455.getClass(), "colonist", 1547448267);
        setIntField(term129455, term129455.getClass(), "metal", -1620492868);
        setIntField(term129455, term129455.getClass(), "experience", -1467327455);
        setIntField(term129455, term129455.getClass(), "culture", 735265706);
        setIntField(term129455, term129455.getClass(), "specialFlags", -1577402961);
        setIntField(term129481, term129481.getClass(), "x", 833268325);
        setIntField(term129481, term129481.getClass(), "y", 125421383);
        setField(term129455, term129455.getClass(), "tradeCoordinates", term129481);
        setField(term129455, term129455.getClass(), "name", null);
        setField(term129455, term129455.getClass(), "iconId", null);
        setField(term129455, term129455.getClass(), "description", null);
        setIntField(term129455, term129455.getClass(), "prodCost", 0);
        setIntField(term129455, term129455.getClass(), "metalCost", 0);
        Object term129486 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term129486, term129486.getClass(), "hull", null);
        setField(term129486, term129486.getClass(), "components", null);
        setField(term129486, term129486.getClass(), "hullPoints", null);
        setIntField(term129486, term129486.getClass(), "shield", 0);
        setIntField(term129486, term129486.getClass(), "armor", 0);
        setField(term129486, term129486.getClass(), "image", null);
        setIntField(term129486, term129486.getClass(), "colonist", 0);
        setIntField(term129486, term129486.getClass(), "metal", 0);
        setIntField(term129486, term129486.getClass(), "experience", 0);
        setIntField(term129486, term129486.getClass(), "culture", 0);
        setIntField(term129486, term129486.getClass(), "specialFlags", 0);
        setField(term129486, term129486.getClass(), "tradeCoordinates", null);
        setField(term129486, term129486.getClass(), "name", null);
        setField(term129486, term129486.getClass(), "iconId", null);
        setField(term129486, term129486.getClass(), "description", null);
        setIntField(term129486, term129486.getClass(), "prodCost", 0);
        setIntField(term129486, term129486.getClass(), "metalCost", 0);
        ArrayList term129453 = new ArrayList();
        ((ArrayList) term129453).add(term129455);
        ((ArrayList) term129453).add(term129486);
        term129452 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term129498 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term129514 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term129520 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term129526 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term129452, term129452.getClass(), "ships", term129453);
        setIntField(term129498, term129498.getClass(), "x", 0);
        setIntField(term129498, term129498.getClass(), "y", 0);
        setField(term129452, term129452.getClass(), "coordinate", term129498);
        setField(term129452, term129452.getClass(), "name", "rQdFYJTLhu");
        setIntField(term129452, term129452.getClass(), "movesLeft", 1328672666);
        setDoubleField(term129514, term129514.getClass(), "startX", 0.0);
        setDoubleField(term129514, term129514.getClass(), "startY", 0.0);
        setDoubleField(term129514, term129514.getClass(), "endX", 0.0);
        setDoubleField(term129514, term129514.getClass(), "endY", 0.0);
        setField(term129514, term129514.getClass(), "nextPoints", null);
        setIntField(term129514, term129514.getClass(), "ftlSpeed", 0);
        setField(term129452, term129452.getClass(), "route", term129514);
        setField(term129520, term129520.getClass(), "name", null);
        setField(term129520, term129520.getClass(), "homeworld", null);
        setIntField(term129520, term129520.getClass(), "age", 0);
        setIntField(term129520, term129520.getClass(), "timeInJob", 0);
        setIntField(term129520, term129520.getClass(), "level", 0);
        setIntField(term129520, term129520.getClass(), "experience", 0);
        setField(term129520, term129520.getClass(), "militaryRank", null);
        setField(term129520, term129520.getClass(), "gender", null);
        setField(term129520, term129520.getClass(), "race", null);
        setField(term129520, term129520.getClass(), "title", null);
        setField(term129520, term129520.getClass(), "job", null);
        setField(term129520, term129520.getClass(), "parent", null);
        setIntField(term129520, term129520.getClass(), "parentIndex", 0);
        setField(term129520, term129520.getClass(), "perkList", null);
        setField(term129520, term129520.getClass(), "stats", null);
        setField(term129452, term129452.getClass(), "commander", term129520);
        setIntField(term129526, term129526.getClass(), "maxX", 0);
        setIntField(term129526, term129526.getClass(), "maxY", 0);
        setField(term129526, term129526.getClass(), "blockMap", null);
        setField(term129526, term129526.getClass(), "points", null);
        setIntField(term129526, term129526.getClass(), "tx", 0);
        setIntField(term129526, term129526.getClass(), "ty", 0);
        setIntField(term129526, term129526.getClass(), "targetDistance", 0);
        setField(term129526, term129526.getClass(), "targetPoint", null);
        setIntField(term129526, term129526.getClass(), "routeIndex", 0);
        setField(term129452, term129452.getClass(), "aStarSearch", term129526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStarBaseDeployed", argTypes, term129452, args);
    }

};


