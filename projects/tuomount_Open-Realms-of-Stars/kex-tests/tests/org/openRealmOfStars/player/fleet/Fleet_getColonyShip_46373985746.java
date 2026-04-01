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
import java.lang.Boolean;

public class Fleet_getColonyShip_46373985746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101992;
     Object term102066;

    public Fleet_getColonyShip_46373985746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term102004 = new ArrayList();
        ((ArrayList) term102004).add((Object)null);
        ((ArrayList) term102004).add((Object)null);
        ((ArrayList) term102004).add((Object)null);
        ((ArrayList) term102004).add((Object)null);
        ((ArrayList) term102004).add((Object)null);
        ((ArrayList) term102004).add((Object)null);
        ((ArrayList) term102004).add((Object)null);
        ((ArrayList) term102004).add((Object)null);
        ((ArrayList) term102004).add((Object)null);
        Object term101995 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term101996 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term102007 = (int[]) newIntArray(6);
        Object term102016 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term102024 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term101996, term101996.getClass(), "index", -1771065834);
        setField(term101996, term101996.getClass(), "name", null);
        setIntField(term101996, term101996.getClass(), "maxSlot", -1607856343);
        setIntField(term101996, term101996.getClass(), "slotHull", -1393066070);
        setField(term101996, term101996.getClass(), "hullType", null);
        setField(term101996, term101996.getClass(), "size", null);
        setIntField(term101996, term101996.getClass(), "cost", 1089906374);
        setIntField(term101996, term101996.getClass(), "metalCost", 1430244220);
        setIntField(term101996, term101996.getClass(), "imageIndex", 871438955);
        setDoubleField(term101996, term101996.getClass(), "fleetCapacity", 0.25474180574060834);
        setField(term101996, term101996.getClass(), "originalBuilder", null);
        setField(term101995, term101995.getClass(), "hull", term101996);
        setField(term101995, term101995.getClass(), "components", term102004);
        setIntElement(term102007, 0, 1529668856);
        setIntElement(term102007, 1, 1327244707);
        setIntElement(term102007, 2, 636264680);
        setIntElement(term102007, 3, 549590868);
        setIntElement(term102007, 4, -2123777150);
        setIntElement(term102007, 5, 1239505784);
        setField(term101995, term101995.getClass(), "hullPoints", term102007);
        setIntField(term101995, term101995.getClass(), "shield", 1973303309);
        setIntField(term101995, term101995.getClass(), "armor", 1732667310);
        setIntField(term102016, term102016.getClass(), "imageType", 1895584040);
        setField(term102016, term102016.getClass(), "colorModel", null);
        setField(term102016, term102016.getClass(), "raster", null);
        setField(term102016, term102016.getClass(), "osis", null);
        setField(term102016, term102016.getClass(), "properties", null);
        setFloatField(term102016, term102016.getClass(), "accelerationPriority", 0.541592F);
        setField(term102016, term102016.getClass(), "surfaceManager", null);
        setField(term101995, term101995.getClass(), "image", term102016);
        setIntField(term101995, term101995.getClass(), "colonist", -2127214606);
        setIntField(term101995, term101995.getClass(), "metal", -1001373806);
        setIntField(term101995, term101995.getClass(), "experience", -1431802716);
        setIntField(term101995, term101995.getClass(), "culture", -1927075382);
        setIntField(term101995, term101995.getClass(), "specialFlags", -1834614967);
        setIntField(term102024, term102024.getClass(), "x", 2144962544);
        setIntField(term102024, term102024.getClass(), "y", 28864647);
        setField(term101995, term101995.getClass(), "tradeCoordinates", term102024);
        setField(term101995, term101995.getClass(), "name", null);
        setField(term101995, term101995.getClass(), "iconId", null);
        setField(term101995, term101995.getClass(), "description", null);
        setIntField(term101995, term101995.getClass(), "prodCost", 0);
        setIntField(term101995, term101995.getClass(), "metalCost", 0);
        ArrayList term101993 = new ArrayList();
        ((ArrayList) term101993).add(term101995);
        term101992 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term102031 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term102047 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term102053 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term102059 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term101992, term101992.getClass(), "ships", term101993);
        setIntField(term102031, term102031.getClass(), "x", 0);
        setIntField(term102031, term102031.getClass(), "y", 0);
        setField(term101992, term101992.getClass(), "coordinate", term102031);
        setField(term101992, term101992.getClass(), "name", "fZAngeuZqR");
        setIntField(term101992, term101992.getClass(), "movesLeft", 1182607812);
        setDoubleField(term102047, term102047.getClass(), "startX", 0.0);
        setDoubleField(term102047, term102047.getClass(), "startY", 0.0);
        setDoubleField(term102047, term102047.getClass(), "endX", 0.0);
        setDoubleField(term102047, term102047.getClass(), "endY", 0.0);
        setField(term102047, term102047.getClass(), "nextPoints", null);
        setIntField(term102047, term102047.getClass(), "ftlSpeed", 0);
        setField(term101992, term101992.getClass(), "route", term102047);
        setField(term102053, term102053.getClass(), "name", null);
        setField(term102053, term102053.getClass(), "homeworld", null);
        setIntField(term102053, term102053.getClass(), "age", 0);
        setIntField(term102053, term102053.getClass(), "timeInJob", 0);
        setIntField(term102053, term102053.getClass(), "level", 0);
        setIntField(term102053, term102053.getClass(), "experience", 0);
        setField(term102053, term102053.getClass(), "militaryRank", null);
        setField(term102053, term102053.getClass(), "gender", null);
        setField(term102053, term102053.getClass(), "race", null);
        setField(term102053, term102053.getClass(), "title", null);
        setField(term102053, term102053.getClass(), "job", null);
        setField(term102053, term102053.getClass(), "parent", null);
        setIntField(term102053, term102053.getClass(), "parentIndex", 0);
        setField(term102053, term102053.getClass(), "perkList", null);
        setField(term102053, term102053.getClass(), "stats", null);
        setField(term101992, term101992.getClass(), "commander", term102053);
        setIntField(term102059, term102059.getClass(), "maxX", 0);
        setIntField(term102059, term102059.getClass(), "maxY", 0);
        setField(term102059, term102059.getClass(), "blockMap", null);
        setField(term102059, term102059.getClass(), "points", null);
        setIntField(term102059, term102059.getClass(), "tx", 0);
        setIntField(term102059, term102059.getClass(), "ty", 0);
        setIntField(term102059, term102059.getClass(), "targetDistance", 0);
        setField(term102059, term102059.getClass(), "targetPoint", null);
        setIntField(term102059, term102059.getClass(), "routeIndex", 0);
        setField(term101992, term101992.getClass(), "aStarSearch", term102059);
        term102066 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term102066;
        callMethod(klass, "getColonyShip", argTypes, term101992, args);
    }

};


