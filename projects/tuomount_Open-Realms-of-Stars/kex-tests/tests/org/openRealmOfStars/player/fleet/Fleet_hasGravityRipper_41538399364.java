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

public class Fleet_hasGravityRipper_41538399364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128864;

    public Fleet_hasGravityRipper_41538399364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term128876 = new ArrayList();
        Object term128867 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term128868 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term128879 = (int[]) newIntArray(2);
        Object term128884 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term128892 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term128868, term128868.getClass(), "index", 1382626372);
        setField(term128868, term128868.getClass(), "name", null);
        setIntField(term128868, term128868.getClass(), "maxSlot", -894391605);
        setIntField(term128868, term128868.getClass(), "slotHull", 1886259870);
        setField(term128868, term128868.getClass(), "hullType", null);
        setField(term128868, term128868.getClass(), "size", null);
        setIntField(term128868, term128868.getClass(), "cost", -240613804);
        setIntField(term128868, term128868.getClass(), "metalCost", -883570215);
        setIntField(term128868, term128868.getClass(), "imageIndex", 949378719);
        setDoubleField(term128868, term128868.getClass(), "fleetCapacity", 0.06795505641704636);
        setField(term128868, term128868.getClass(), "originalBuilder", null);
        setField(term128867, term128867.getClass(), "hull", term128868);
        setField(term128867, term128867.getClass(), "components", term128876);
        setIntElement(term128879, 0, -1246013301);
        setIntElement(term128879, 1, 943091152);
        setField(term128867, term128867.getClass(), "hullPoints", term128879);
        setIntField(term128867, term128867.getClass(), "shield", 820624409);
        setIntField(term128867, term128867.getClass(), "armor", 330572913);
        setIntField(term128884, term128884.getClass(), "imageType", -854584753);
        setField(term128884, term128884.getClass(), "colorModel", null);
        setField(term128884, term128884.getClass(), "raster", null);
        setField(term128884, term128884.getClass(), "osis", null);
        setField(term128884, term128884.getClass(), "properties", null);
        setFloatField(term128884, term128884.getClass(), "accelerationPriority", 0.37161416F);
        setField(term128884, term128884.getClass(), "surfaceManager", null);
        setField(term128867, term128867.getClass(), "image", term128884);
        setIntField(term128867, term128867.getClass(), "colonist", 843651557);
        setIntField(term128867, term128867.getClass(), "metal", -1996144425);
        setIntField(term128867, term128867.getClass(), "experience", -645546910);
        setIntField(term128867, term128867.getClass(), "culture", -1272725557);
        setIntField(term128867, term128867.getClass(), "specialFlags", -757065748);
        setIntField(term128892, term128892.getClass(), "x", -374472220);
        setIntField(term128892, term128892.getClass(), "y", -1374592335);
        setField(term128867, term128867.getClass(), "tradeCoordinates", term128892);
        setField(term128867, term128867.getClass(), "name", null);
        setField(term128867, term128867.getClass(), "iconId", null);
        setField(term128867, term128867.getClass(), "description", null);
        setIntField(term128867, term128867.getClass(), "prodCost", 0);
        setIntField(term128867, term128867.getClass(), "metalCost", 0);
        Object term128897 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term128897, term128897.getClass(), "hull", null);
        setField(term128897, term128897.getClass(), "components", null);
        setField(term128897, term128897.getClass(), "hullPoints", null);
        setIntField(term128897, term128897.getClass(), "shield", 0);
        setIntField(term128897, term128897.getClass(), "armor", 0);
        setField(term128897, term128897.getClass(), "image", null);
        setIntField(term128897, term128897.getClass(), "colonist", 0);
        setIntField(term128897, term128897.getClass(), "metal", 0);
        setIntField(term128897, term128897.getClass(), "experience", 0);
        setIntField(term128897, term128897.getClass(), "culture", 0);
        setIntField(term128897, term128897.getClass(), "specialFlags", 0);
        setField(term128897, term128897.getClass(), "tradeCoordinates", null);
        setField(term128897, term128897.getClass(), "name", null);
        setField(term128897, term128897.getClass(), "iconId", null);
        setField(term128897, term128897.getClass(), "description", null);
        setIntField(term128897, term128897.getClass(), "prodCost", 0);
        setIntField(term128897, term128897.getClass(), "metalCost", 0);
        ArrayList term128865 = new ArrayList();
        ((ArrayList) term128865).add(term128867);
        ((ArrayList) term128865).add(term128897);
        term128864 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term128909 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term128925 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term128931 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term128937 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term128864, term128864.getClass(), "ships", term128865);
        setIntField(term128909, term128909.getClass(), "x", 0);
        setIntField(term128909, term128909.getClass(), "y", 0);
        setField(term128864, term128864.getClass(), "coordinate", term128909);
        setField(term128864, term128864.getClass(), "name", "EjLCKTHFYE");
        setIntField(term128864, term128864.getClass(), "movesLeft", -1834354298);
        setDoubleField(term128925, term128925.getClass(), "startX", 0.0);
        setDoubleField(term128925, term128925.getClass(), "startY", 0.0);
        setDoubleField(term128925, term128925.getClass(), "endX", 0.0);
        setDoubleField(term128925, term128925.getClass(), "endY", 0.0);
        setField(term128925, term128925.getClass(), "nextPoints", null);
        setIntField(term128925, term128925.getClass(), "ftlSpeed", 0);
        setField(term128864, term128864.getClass(), "route", term128925);
        setField(term128931, term128931.getClass(), "name", null);
        setField(term128931, term128931.getClass(), "homeworld", null);
        setIntField(term128931, term128931.getClass(), "age", 0);
        setIntField(term128931, term128931.getClass(), "timeInJob", 0);
        setIntField(term128931, term128931.getClass(), "level", 0);
        setIntField(term128931, term128931.getClass(), "experience", 0);
        setField(term128931, term128931.getClass(), "militaryRank", null);
        setField(term128931, term128931.getClass(), "gender", null);
        setField(term128931, term128931.getClass(), "race", null);
        setField(term128931, term128931.getClass(), "title", null);
        setField(term128931, term128931.getClass(), "job", null);
        setField(term128931, term128931.getClass(), "parent", null);
        setIntField(term128931, term128931.getClass(), "parentIndex", 0);
        setField(term128931, term128931.getClass(), "perkList", null);
        setField(term128931, term128931.getClass(), "stats", null);
        setField(term128864, term128864.getClass(), "commander", term128931);
        setIntField(term128937, term128937.getClass(), "maxX", 0);
        setIntField(term128937, term128937.getClass(), "maxY", 0);
        setField(term128937, term128937.getClass(), "blockMap", null);
        setField(term128937, term128937.getClass(), "points", null);
        setIntField(term128937, term128937.getClass(), "tx", 0);
        setIntField(term128937, term128937.getClass(), "ty", 0);
        setIntField(term128937, term128937.getClass(), "targetDistance", 0);
        setField(term128937, term128937.getClass(), "targetPoint", null);
        setIntField(term128937, term128937.getClass(), "routeIndex", 0);
        setField(term128864, term128864.getClass(), "aStarSearch", term128937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasGravityRipper", argTypes, term128864, args);
    }

};


