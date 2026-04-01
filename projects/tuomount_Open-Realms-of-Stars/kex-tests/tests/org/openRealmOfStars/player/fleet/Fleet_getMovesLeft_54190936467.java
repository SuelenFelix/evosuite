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

public class Fleet_getMovesLeft_54190936467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129146;

    public Fleet_getMovesLeft_54190936467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term129158 = new ArrayList();
        ((ArrayList) term129158).add((Object)null);
        ((ArrayList) term129158).add((Object)null);
        ((ArrayList) term129158).add((Object)null);
        ((ArrayList) term129158).add((Object)null);
        ((ArrayList) term129158).add((Object)null);
        ((ArrayList) term129158).add((Object)null);
        Object term129149 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term129150 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term129161 = (int[]) newIntArray(4);
        Object term129168 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term129176 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term129150, term129150.getClass(), "index", 1155067850);
        setField(term129150, term129150.getClass(), "name", null);
        setIntField(term129150, term129150.getClass(), "maxSlot", -1941137904);
        setIntField(term129150, term129150.getClass(), "slotHull", -2027575410);
        setField(term129150, term129150.getClass(), "hullType", null);
        setField(term129150, term129150.getClass(), "size", null);
        setIntField(term129150, term129150.getClass(), "cost", -2077238638);
        setIntField(term129150, term129150.getClass(), "metalCost", -708951514);
        setIntField(term129150, term129150.getClass(), "imageIndex", 287450588);
        setDoubleField(term129150, term129150.getClass(), "fleetCapacity", 0.20341461558365515);
        setField(term129150, term129150.getClass(), "originalBuilder", null);
        setField(term129149, term129149.getClass(), "hull", term129150);
        setField(term129149, term129149.getClass(), "components", term129158);
        setIntElement(term129161, 0, 1742486272);
        setIntElement(term129161, 1, -973045837);
        setIntElement(term129161, 2, 134712754);
        setIntElement(term129161, 3, -1259800083);
        setField(term129149, term129149.getClass(), "hullPoints", term129161);
        setIntField(term129149, term129149.getClass(), "shield", 34131474);
        setIntField(term129149, term129149.getClass(), "armor", -631704303);
        setIntField(term129168, term129168.getClass(), "imageType", -1635979050);
        setField(term129168, term129168.getClass(), "colorModel", null);
        setField(term129168, term129168.getClass(), "raster", null);
        setField(term129168, term129168.getClass(), "osis", null);
        setField(term129168, term129168.getClass(), "properties", null);
        setFloatField(term129168, term129168.getClass(), "accelerationPriority", 0.51208574F);
        setField(term129168, term129168.getClass(), "surfaceManager", null);
        setField(term129149, term129149.getClass(), "image", term129168);
        setIntField(term129149, term129149.getClass(), "colonist", -809294633);
        setIntField(term129149, term129149.getClass(), "metal", 725438012);
        setIntField(term129149, term129149.getClass(), "experience", -459474609);
        setIntField(term129149, term129149.getClass(), "culture", -729912360);
        setIntField(term129149, term129149.getClass(), "specialFlags", 1127806915);
        setIntField(term129176, term129176.getClass(), "x", 1677810938);
        setIntField(term129176, term129176.getClass(), "y", 1009836664);
        setField(term129149, term129149.getClass(), "tradeCoordinates", term129176);
        setField(term129149, term129149.getClass(), "name", null);
        setField(term129149, term129149.getClass(), "iconId", null);
        setField(term129149, term129149.getClass(), "description", null);
        setIntField(term129149, term129149.getClass(), "prodCost", 0);
        setIntField(term129149, term129149.getClass(), "metalCost", 0);
        Object term129181 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term129181, term129181.getClass(), "hull", null);
        setField(term129181, term129181.getClass(), "components", null);
        setField(term129181, term129181.getClass(), "hullPoints", null);
        setIntField(term129181, term129181.getClass(), "shield", 0);
        setIntField(term129181, term129181.getClass(), "armor", 0);
        setField(term129181, term129181.getClass(), "image", null);
        setIntField(term129181, term129181.getClass(), "colonist", 0);
        setIntField(term129181, term129181.getClass(), "metal", 0);
        setIntField(term129181, term129181.getClass(), "experience", 0);
        setIntField(term129181, term129181.getClass(), "culture", 0);
        setIntField(term129181, term129181.getClass(), "specialFlags", 0);
        setField(term129181, term129181.getClass(), "tradeCoordinates", null);
        setField(term129181, term129181.getClass(), "name", null);
        setField(term129181, term129181.getClass(), "iconId", null);
        setField(term129181, term129181.getClass(), "description", null);
        setIntField(term129181, term129181.getClass(), "prodCost", 0);
        setIntField(term129181, term129181.getClass(), "metalCost", 0);
        Object term129191 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term129191, term129191.getClass(), "hull", null);
        setField(term129191, term129191.getClass(), "components", null);
        setField(term129191, term129191.getClass(), "hullPoints", null);
        setIntField(term129191, term129191.getClass(), "shield", 0);
        setIntField(term129191, term129191.getClass(), "armor", 0);
        setField(term129191, term129191.getClass(), "image", null);
        setIntField(term129191, term129191.getClass(), "colonist", 0);
        setIntField(term129191, term129191.getClass(), "metal", 0);
        setIntField(term129191, term129191.getClass(), "experience", 0);
        setIntField(term129191, term129191.getClass(), "culture", 0);
        setIntField(term129191, term129191.getClass(), "specialFlags", 0);
        setField(term129191, term129191.getClass(), "tradeCoordinates", null);
        setField(term129191, term129191.getClass(), "name", null);
        setField(term129191, term129191.getClass(), "iconId", null);
        setField(term129191, term129191.getClass(), "description", null);
        setIntField(term129191, term129191.getClass(), "prodCost", 0);
        setIntField(term129191, term129191.getClass(), "metalCost", 0);
        Object term129201 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term129201, term129201.getClass(), "hull", null);
        setField(term129201, term129201.getClass(), "components", null);
        setField(term129201, term129201.getClass(), "hullPoints", null);
        setIntField(term129201, term129201.getClass(), "shield", 0);
        setIntField(term129201, term129201.getClass(), "armor", 0);
        setField(term129201, term129201.getClass(), "image", null);
        setIntField(term129201, term129201.getClass(), "colonist", 0);
        setIntField(term129201, term129201.getClass(), "metal", 0);
        setIntField(term129201, term129201.getClass(), "experience", 0);
        setIntField(term129201, term129201.getClass(), "culture", 0);
        setIntField(term129201, term129201.getClass(), "specialFlags", 0);
        setField(term129201, term129201.getClass(), "tradeCoordinates", null);
        setField(term129201, term129201.getClass(), "name", null);
        setField(term129201, term129201.getClass(), "iconId", null);
        setField(term129201, term129201.getClass(), "description", null);
        setIntField(term129201, term129201.getClass(), "prodCost", 0);
        setIntField(term129201, term129201.getClass(), "metalCost", 0);
        ArrayList term129147 = new ArrayList();
        ((ArrayList) term129147).add(term129149);
        ((ArrayList) term129147).add(term129181);
        ((ArrayList) term129147).add(term129191);
        ((ArrayList) term129147).add(term129201);
        term129146 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term129213 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term129229 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term129235 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term129241 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term129146, term129146.getClass(), "ships", term129147);
        setIntField(term129213, term129213.getClass(), "x", 0);
        setIntField(term129213, term129213.getClass(), "y", 0);
        setField(term129146, term129146.getClass(), "coordinate", term129213);
        setField(term129146, term129146.getClass(), "name", "qoqYRoXwDw");
        setIntField(term129146, term129146.getClass(), "movesLeft", -1768664198);
        setDoubleField(term129229, term129229.getClass(), "startX", 0.0);
        setDoubleField(term129229, term129229.getClass(), "startY", 0.0);
        setDoubleField(term129229, term129229.getClass(), "endX", 0.0);
        setDoubleField(term129229, term129229.getClass(), "endY", 0.0);
        setField(term129229, term129229.getClass(), "nextPoints", null);
        setIntField(term129229, term129229.getClass(), "ftlSpeed", 0);
        setField(term129146, term129146.getClass(), "route", term129229);
        setField(term129235, term129235.getClass(), "name", null);
        setField(term129235, term129235.getClass(), "homeworld", null);
        setIntField(term129235, term129235.getClass(), "age", 0);
        setIntField(term129235, term129235.getClass(), "timeInJob", 0);
        setIntField(term129235, term129235.getClass(), "level", 0);
        setIntField(term129235, term129235.getClass(), "experience", 0);
        setField(term129235, term129235.getClass(), "militaryRank", null);
        setField(term129235, term129235.getClass(), "gender", null);
        setField(term129235, term129235.getClass(), "race", null);
        setField(term129235, term129235.getClass(), "title", null);
        setField(term129235, term129235.getClass(), "job", null);
        setField(term129235, term129235.getClass(), "parent", null);
        setIntField(term129235, term129235.getClass(), "parentIndex", 0);
        setField(term129235, term129235.getClass(), "perkList", null);
        setField(term129235, term129235.getClass(), "stats", null);
        setField(term129146, term129146.getClass(), "commander", term129235);
        setIntField(term129241, term129241.getClass(), "maxX", 0);
        setIntField(term129241, term129241.getClass(), "maxY", 0);
        setField(term129241, term129241.getClass(), "blockMap", null);
        setField(term129241, term129241.getClass(), "points", null);
        setIntField(term129241, term129241.getClass(), "tx", 0);
        setIntField(term129241, term129241.getClass(), "ty", 0);
        setIntField(term129241, term129241.getClass(), "targetDistance", 0);
        setField(term129241, term129241.getClass(), "targetPoint", null);
        setIntField(term129241, term129241.getClass(), "routeIndex", 0);
        setField(term129146, term129146.getClass(), "aStarSearch", term129241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMovesLeft", argTypes, term129146, args);
    }

};


