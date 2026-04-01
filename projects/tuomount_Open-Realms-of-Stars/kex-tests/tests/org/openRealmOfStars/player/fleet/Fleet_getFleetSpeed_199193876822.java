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

public class Fleet_getFleetSpeed_199193876822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79080;

    public Fleet_getFleetSpeed_199193876822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term79092 = new ArrayList();
        ((ArrayList) term79092).add((Object)null);
        ((ArrayList) term79092).add((Object)null);
        ((ArrayList) term79092).add((Object)null);
        ((ArrayList) term79092).add((Object)null);
        ((ArrayList) term79092).add((Object)null);
        ((ArrayList) term79092).add((Object)null);
        ((ArrayList) term79092).add((Object)null);
        Object term79083 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term79084 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term79095 = (int[]) newIntArray(7);
        Object term79105 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term79113 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term79084, term79084.getClass(), "index", -1967126524);
        setField(term79084, term79084.getClass(), "name", null);
        setIntField(term79084, term79084.getClass(), "maxSlot", -803436050);
        setIntField(term79084, term79084.getClass(), "slotHull", 1382240540);
        setField(term79084, term79084.getClass(), "hullType", null);
        setField(term79084, term79084.getClass(), "size", null);
        setIntField(term79084, term79084.getClass(), "cost", -894941864);
        setIntField(term79084, term79084.getClass(), "metalCost", -1796952360);
        setIntField(term79084, term79084.getClass(), "imageIndex", -29580694);
        setDoubleField(term79084, term79084.getClass(), "fleetCapacity", 0.40635376375558196);
        setField(term79084, term79084.getClass(), "originalBuilder", null);
        setField(term79083, term79083.getClass(), "hull", term79084);
        setField(term79083, term79083.getClass(), "components", term79092);
        setIntElement(term79095, 0, -699487881);
        setIntElement(term79095, 1, 562568318);
        setIntElement(term79095, 2, 297158063);
        setIntElement(term79095, 3, -38995653);
        setIntElement(term79095, 4, -1893842770);
        setIntElement(term79095, 5, 2048873968);
        setIntElement(term79095, 6, -1447906264);
        setField(term79083, term79083.getClass(), "hullPoints", term79095);
        setIntField(term79083, term79083.getClass(), "shield", 1527786708);
        setIntField(term79083, term79083.getClass(), "armor", -360741897);
        setIntField(term79105, term79105.getClass(), "imageType", 1762652682);
        setField(term79105, term79105.getClass(), "colorModel", null);
        setField(term79105, term79105.getClass(), "raster", null);
        setField(term79105, term79105.getClass(), "osis", null);
        setField(term79105, term79105.getClass(), "properties", null);
        setFloatField(term79105, term79105.getClass(), "accelerationPriority", 0.76550204F);
        setField(term79105, term79105.getClass(), "surfaceManager", null);
        setField(term79083, term79083.getClass(), "image", term79105);
        setIntField(term79083, term79083.getClass(), "colonist", 1448469662);
        setIntField(term79083, term79083.getClass(), "metal", -391447045);
        setIntField(term79083, term79083.getClass(), "experience", -396759931);
        setIntField(term79083, term79083.getClass(), "culture", 85098350);
        setIntField(term79083, term79083.getClass(), "specialFlags", 1519270868);
        setIntField(term79113, term79113.getClass(), "x", -1307675168);
        setIntField(term79113, term79113.getClass(), "y", 550509363);
        setField(term79083, term79083.getClass(), "tradeCoordinates", term79113);
        setField(term79083, term79083.getClass(), "name", null);
        setField(term79083, term79083.getClass(), "iconId", null);
        setField(term79083, term79083.getClass(), "description", null);
        setIntField(term79083, term79083.getClass(), "prodCost", 0);
        setIntField(term79083, term79083.getClass(), "metalCost", 0);
        Object term79118 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term79118, term79118.getClass(), "hull", null);
        setField(term79118, term79118.getClass(), "components", null);
        setField(term79118, term79118.getClass(), "hullPoints", null);
        setIntField(term79118, term79118.getClass(), "shield", 0);
        setIntField(term79118, term79118.getClass(), "armor", 0);
        setField(term79118, term79118.getClass(), "image", null);
        setIntField(term79118, term79118.getClass(), "colonist", 0);
        setIntField(term79118, term79118.getClass(), "metal", 0);
        setIntField(term79118, term79118.getClass(), "experience", 0);
        setIntField(term79118, term79118.getClass(), "culture", 0);
        setIntField(term79118, term79118.getClass(), "specialFlags", 0);
        setField(term79118, term79118.getClass(), "tradeCoordinates", null);
        setField(term79118, term79118.getClass(), "name", null);
        setField(term79118, term79118.getClass(), "iconId", null);
        setField(term79118, term79118.getClass(), "description", null);
        setIntField(term79118, term79118.getClass(), "prodCost", 0);
        setIntField(term79118, term79118.getClass(), "metalCost", 0);
        Object term79128 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term79128, term79128.getClass(), "hull", null);
        setField(term79128, term79128.getClass(), "components", null);
        setField(term79128, term79128.getClass(), "hullPoints", null);
        setIntField(term79128, term79128.getClass(), "shield", 0);
        setIntField(term79128, term79128.getClass(), "armor", 0);
        setField(term79128, term79128.getClass(), "image", null);
        setIntField(term79128, term79128.getClass(), "colonist", 0);
        setIntField(term79128, term79128.getClass(), "metal", 0);
        setIntField(term79128, term79128.getClass(), "experience", 0);
        setIntField(term79128, term79128.getClass(), "culture", 0);
        setIntField(term79128, term79128.getClass(), "specialFlags", 0);
        setField(term79128, term79128.getClass(), "tradeCoordinates", null);
        setField(term79128, term79128.getClass(), "name", null);
        setField(term79128, term79128.getClass(), "iconId", null);
        setField(term79128, term79128.getClass(), "description", null);
        setIntField(term79128, term79128.getClass(), "prodCost", 0);
        setIntField(term79128, term79128.getClass(), "metalCost", 0);
        Object term79138 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term79138, term79138.getClass(), "hull", null);
        setField(term79138, term79138.getClass(), "components", null);
        setField(term79138, term79138.getClass(), "hullPoints", null);
        setIntField(term79138, term79138.getClass(), "shield", 0);
        setIntField(term79138, term79138.getClass(), "armor", 0);
        setField(term79138, term79138.getClass(), "image", null);
        setIntField(term79138, term79138.getClass(), "colonist", 0);
        setIntField(term79138, term79138.getClass(), "metal", 0);
        setIntField(term79138, term79138.getClass(), "experience", 0);
        setIntField(term79138, term79138.getClass(), "culture", 0);
        setIntField(term79138, term79138.getClass(), "specialFlags", 0);
        setField(term79138, term79138.getClass(), "tradeCoordinates", null);
        setField(term79138, term79138.getClass(), "name", null);
        setField(term79138, term79138.getClass(), "iconId", null);
        setField(term79138, term79138.getClass(), "description", null);
        setIntField(term79138, term79138.getClass(), "prodCost", 0);
        setIntField(term79138, term79138.getClass(), "metalCost", 0);
        ArrayList term79081 = new ArrayList();
        ((ArrayList) term79081).add(term79083);
        ((ArrayList) term79081).add(term79118);
        ((ArrayList) term79081).add(term79128);
        ((ArrayList) term79081).add(term79138);
        term79080 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term79150 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term79166 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term79172 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term79178 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term79080, term79080.getClass(), "ships", term79081);
        setIntField(term79150, term79150.getClass(), "x", 0);
        setIntField(term79150, term79150.getClass(), "y", 0);
        setField(term79080, term79080.getClass(), "coordinate", term79150);
        setField(term79080, term79080.getClass(), "name", "QDGurdhyNf");
        setIntField(term79080, term79080.getClass(), "movesLeft", 933032980);
        setDoubleField(term79166, term79166.getClass(), "startX", 0.0);
        setDoubleField(term79166, term79166.getClass(), "startY", 0.0);
        setDoubleField(term79166, term79166.getClass(), "endX", 0.0);
        setDoubleField(term79166, term79166.getClass(), "endY", 0.0);
        setField(term79166, term79166.getClass(), "nextPoints", null);
        setIntField(term79166, term79166.getClass(), "ftlSpeed", 0);
        setField(term79080, term79080.getClass(), "route", term79166);
        setField(term79172, term79172.getClass(), "name", null);
        setField(term79172, term79172.getClass(), "homeworld", null);
        setIntField(term79172, term79172.getClass(), "age", 0);
        setIntField(term79172, term79172.getClass(), "timeInJob", 0);
        setIntField(term79172, term79172.getClass(), "level", 0);
        setIntField(term79172, term79172.getClass(), "experience", 0);
        setField(term79172, term79172.getClass(), "militaryRank", null);
        setField(term79172, term79172.getClass(), "gender", null);
        setField(term79172, term79172.getClass(), "race", null);
        setField(term79172, term79172.getClass(), "title", null);
        setField(term79172, term79172.getClass(), "job", null);
        setField(term79172, term79172.getClass(), "parent", null);
        setIntField(term79172, term79172.getClass(), "parentIndex", 0);
        setField(term79172, term79172.getClass(), "perkList", null);
        setField(term79172, term79172.getClass(), "stats", null);
        setField(term79080, term79080.getClass(), "commander", term79172);
        setIntField(term79178, term79178.getClass(), "maxX", 0);
        setIntField(term79178, term79178.getClass(), "maxY", 0);
        setField(term79178, term79178.getClass(), "blockMap", null);
        setField(term79178, term79178.getClass(), "points", null);
        setIntField(term79178, term79178.getClass(), "tx", 0);
        setIntField(term79178, term79178.getClass(), "ty", 0);
        setIntField(term79178, term79178.getClass(), "targetDistance", 0);
        setField(term79178, term79178.getClass(), "targetPoint", null);
        setIntField(term79178, term79178.getClass(), "routeIndex", 0);
        setField(term79080, term79080.getClass(), "aStarSearch", term79178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFleetSpeed", argTypes, term79080, args);
    }

};


