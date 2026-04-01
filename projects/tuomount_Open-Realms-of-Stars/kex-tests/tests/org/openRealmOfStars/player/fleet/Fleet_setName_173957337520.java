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

public class Fleet_setName_173957337520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78878;

    public Fleet_setName_173957337520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term78890 = new ArrayList();
        ((ArrayList) term78890).add((Object)null);
        ((ArrayList) term78890).add((Object)null);
        ((ArrayList) term78890).add((Object)null);
        ((ArrayList) term78890).add((Object)null);
        ((ArrayList) term78890).add((Object)null);
        ((ArrayList) term78890).add((Object)null);
        ((ArrayList) term78890).add((Object)null);
        Object term78881 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term78882 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term78893 = (int[]) newIntArray(4);
        Object term78900 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term78908 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term78882, term78882.getClass(), "index", 979019488);
        setField(term78882, term78882.getClass(), "name", null);
        setIntField(term78882, term78882.getClass(), "maxSlot", 1853235183);
        setIntField(term78882, term78882.getClass(), "slotHull", 2097371569);
        setField(term78882, term78882.getClass(), "hullType", null);
        setField(term78882, term78882.getClass(), "size", null);
        setIntField(term78882, term78882.getClass(), "cost", -10808205);
        setIntField(term78882, term78882.getClass(), "metalCost", -774591519);
        setIntField(term78882, term78882.getClass(), "imageIndex", 1785308866);
        setDoubleField(term78882, term78882.getClass(), "fleetCapacity", 0.04640022995603543);
        setField(term78882, term78882.getClass(), "originalBuilder", null);
        setField(term78881, term78881.getClass(), "hull", term78882);
        setField(term78881, term78881.getClass(), "components", term78890);
        setIntElement(term78893, 0, 673401830);
        setIntElement(term78893, 1, 274393548);
        setIntElement(term78893, 2, 2009167871);
        setIntElement(term78893, 3, -1001649335);
        setField(term78881, term78881.getClass(), "hullPoints", term78893);
        setIntField(term78881, term78881.getClass(), "shield", -1983284991);
        setIntField(term78881, term78881.getClass(), "armor", 386592778);
        setIntField(term78900, term78900.getClass(), "imageType", 1718374650);
        setField(term78900, term78900.getClass(), "colorModel", null);
        setField(term78900, term78900.getClass(), "raster", null);
        setField(term78900, term78900.getClass(), "osis", null);
        setField(term78900, term78900.getClass(), "properties", null);
        setFloatField(term78900, term78900.getClass(), "accelerationPriority", 0.51832694F);
        setField(term78900, term78900.getClass(), "surfaceManager", null);
        setField(term78881, term78881.getClass(), "image", term78900);
        setIntField(term78881, term78881.getClass(), "colonist", 78399484);
        setIntField(term78881, term78881.getClass(), "metal", -529573926);
        setIntField(term78881, term78881.getClass(), "experience", 1526559521);
        setIntField(term78881, term78881.getClass(), "culture", -1479591438);
        setIntField(term78881, term78881.getClass(), "specialFlags", -1395828554);
        setIntField(term78908, term78908.getClass(), "x", -2081139415);
        setIntField(term78908, term78908.getClass(), "y", 22197373);
        setField(term78881, term78881.getClass(), "tradeCoordinates", term78908);
        setField(term78881, term78881.getClass(), "name", null);
        setField(term78881, term78881.getClass(), "iconId", null);
        setField(term78881, term78881.getClass(), "description", null);
        setIntField(term78881, term78881.getClass(), "prodCost", 0);
        setIntField(term78881, term78881.getClass(), "metalCost", 0);
        ArrayList term78879 = new ArrayList();
        ((ArrayList) term78879).add(term78881);
        term78878 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term78915 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term78931 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term78937 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term78943 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term78878, term78878.getClass(), "ships", term78879);
        setIntField(term78915, term78915.getClass(), "x", 0);
        setIntField(term78915, term78915.getClass(), "y", 0);
        setField(term78878, term78878.getClass(), "coordinate", term78915);
        setField(term78878, term78878.getClass(), "name", "vjUObaeMjo");
        setIntField(term78878, term78878.getClass(), "movesLeft", -1791932674);
        setDoubleField(term78931, term78931.getClass(), "startX", 0.0);
        setDoubleField(term78931, term78931.getClass(), "startY", 0.0);
        setDoubleField(term78931, term78931.getClass(), "endX", 0.0);
        setDoubleField(term78931, term78931.getClass(), "endY", 0.0);
        setField(term78931, term78931.getClass(), "nextPoints", null);
        setIntField(term78931, term78931.getClass(), "ftlSpeed", 0);
        setField(term78878, term78878.getClass(), "route", term78931);
        setField(term78937, term78937.getClass(), "name", null);
        setField(term78937, term78937.getClass(), "homeworld", null);
        setIntField(term78937, term78937.getClass(), "age", 0);
        setIntField(term78937, term78937.getClass(), "timeInJob", 0);
        setIntField(term78937, term78937.getClass(), "level", 0);
        setIntField(term78937, term78937.getClass(), "experience", 0);
        setField(term78937, term78937.getClass(), "militaryRank", null);
        setField(term78937, term78937.getClass(), "gender", null);
        setField(term78937, term78937.getClass(), "race", null);
        setField(term78937, term78937.getClass(), "title", null);
        setField(term78937, term78937.getClass(), "job", null);
        setField(term78937, term78937.getClass(), "parent", null);
        setIntField(term78937, term78937.getClass(), "parentIndex", 0);
        setField(term78937, term78937.getClass(), "perkList", null);
        setField(term78937, term78937.getClass(), "stats", null);
        setField(term78878, term78878.getClass(), "commander", term78937);
        setIntField(term78943, term78943.getClass(), "maxX", 0);
        setIntField(term78943, term78943.getClass(), "maxY", 0);
        setField(term78943, term78943.getClass(), "blockMap", null);
        setField(term78943, term78943.getClass(), "points", null);
        setIntField(term78943, term78943.getClass(), "tx", 0);
        setIntField(term78943, term78943.getClass(), "ty", 0);
        setIntField(term78943, term78943.getClass(), "targetDistance", 0);
        setField(term78943, term78943.getClass(), "targetPoint", null);
        setIntField(term78943, term78943.getClass(), "routeIndex", 0);
        setField(term78878, term78878.getClass(), "aStarSearch", term78943);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JsIgccyWag";
        callMethod(klass, "setName", argTypes, term78878, args);
    }

};


