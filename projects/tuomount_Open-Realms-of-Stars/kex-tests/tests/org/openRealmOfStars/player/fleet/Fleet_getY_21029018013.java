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

public class Fleet_getY_21029018013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78026;

    public Fleet_getY_21029018013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term78038 = new ArrayList();
        ((ArrayList) term78038).add((Object)null);
        ((ArrayList) term78038).add((Object)null);
        ((ArrayList) term78038).add((Object)null);
        ((ArrayList) term78038).add((Object)null);
        ((ArrayList) term78038).add((Object)null);
        ((ArrayList) term78038).add((Object)null);
        Object term78029 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        Object term78030 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        int[] term78041 = (int[]) newIntArray(3);
        Object term78047 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term78055 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term78030, term78030.getClass(), "index", 970094723);
        setField(term78030, term78030.getClass(), "name", null);
        setIntField(term78030, term78030.getClass(), "maxSlot", 376622340);
        setIntField(term78030, term78030.getClass(), "slotHull", 1985101421);
        setField(term78030, term78030.getClass(), "hullType", null);
        setField(term78030, term78030.getClass(), "size", null);
        setIntField(term78030, term78030.getClass(), "cost", 422564495);
        setIntField(term78030, term78030.getClass(), "metalCost", -1614243846);
        setIntField(term78030, term78030.getClass(), "imageIndex", 1218830458);
        setDoubleField(term78030, term78030.getClass(), "fleetCapacity", 0.9511861072660375);
        setField(term78030, term78030.getClass(), "originalBuilder", null);
        setField(term78029, term78029.getClass(), "hull", term78030);
        setField(term78029, term78029.getClass(), "components", term78038);
        setIntElement(term78041, 0, -76877870);
        setIntElement(term78041, 1, 2104799551);
        setIntElement(term78041, 2, 1728341653);
        setField(term78029, term78029.getClass(), "hullPoints", term78041);
        setIntField(term78029, term78029.getClass(), "shield", 1063150462);
        setIntField(term78029, term78029.getClass(), "armor", 1817004190);
        setIntField(term78047, term78047.getClass(), "imageType", -1901062134);
        setField(term78047, term78047.getClass(), "colorModel", null);
        setField(term78047, term78047.getClass(), "raster", null);
        setField(term78047, term78047.getClass(), "osis", null);
        setField(term78047, term78047.getClass(), "properties", null);
        setFloatField(term78047, term78047.getClass(), "accelerationPriority", 0.6608425F);
        setField(term78047, term78047.getClass(), "surfaceManager", null);
        setField(term78029, term78029.getClass(), "image", term78047);
        setIntField(term78029, term78029.getClass(), "colonist", 859867598);
        setIntField(term78029, term78029.getClass(), "metal", 781983880);
        setIntField(term78029, term78029.getClass(), "experience", -1804104652);
        setIntField(term78029, term78029.getClass(), "culture", -618717355);
        setIntField(term78029, term78029.getClass(), "specialFlags", 942277782);
        setIntField(term78055, term78055.getClass(), "x", 1822833628);
        setIntField(term78055, term78055.getClass(), "y", -125384487);
        setField(term78029, term78029.getClass(), "tradeCoordinates", term78055);
        setField(term78029, term78029.getClass(), "name", null);
        setField(term78029, term78029.getClass(), "iconId", null);
        setField(term78029, term78029.getClass(), "description", null);
        setIntField(term78029, term78029.getClass(), "prodCost", 0);
        setIntField(term78029, term78029.getClass(), "metalCost", 0);
        Object term78060 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term78060, term78060.getClass(), "hull", null);
        setField(term78060, term78060.getClass(), "components", null);
        setField(term78060, term78060.getClass(), "hullPoints", null);
        setIntField(term78060, term78060.getClass(), "shield", 0);
        setIntField(term78060, term78060.getClass(), "armor", 0);
        setField(term78060, term78060.getClass(), "image", null);
        setIntField(term78060, term78060.getClass(), "colonist", 0);
        setIntField(term78060, term78060.getClass(), "metal", 0);
        setIntField(term78060, term78060.getClass(), "experience", 0);
        setIntField(term78060, term78060.getClass(), "culture", 0);
        setIntField(term78060, term78060.getClass(), "specialFlags", 0);
        setField(term78060, term78060.getClass(), "tradeCoordinates", null);
        setField(term78060, term78060.getClass(), "name", null);
        setField(term78060, term78060.getClass(), "iconId", null);
        setField(term78060, term78060.getClass(), "description", null);
        setIntField(term78060, term78060.getClass(), "prodCost", 0);
        setIntField(term78060, term78060.getClass(), "metalCost", 0);
        ArrayList term78027 = new ArrayList();
        ((ArrayList) term78027).add(term78029);
        ((ArrayList) term78027).add(term78060);
        term78026 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        Object term78072 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        Object term78088 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        Object term78094 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        Object term78100 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        setField(term78026, term78026.getClass(), "ships", term78027);
        setIntField(term78072, term78072.getClass(), "x", 0);
        setIntField(term78072, term78072.getClass(), "y", 0);
        setField(term78026, term78026.getClass(), "coordinate", term78072);
        setField(term78026, term78026.getClass(), "name", "BczZfNSwaD");
        setIntField(term78026, term78026.getClass(), "movesLeft", -1408698769);
        setDoubleField(term78088, term78088.getClass(), "startX", 0.0);
        setDoubleField(term78088, term78088.getClass(), "startY", 0.0);
        setDoubleField(term78088, term78088.getClass(), "endX", 0.0);
        setDoubleField(term78088, term78088.getClass(), "endY", 0.0);
        setField(term78088, term78088.getClass(), "nextPoints", null);
        setIntField(term78088, term78088.getClass(), "ftlSpeed", 0);
        setField(term78026, term78026.getClass(), "route", term78088);
        setField(term78094, term78094.getClass(), "name", null);
        setField(term78094, term78094.getClass(), "homeworld", null);
        setIntField(term78094, term78094.getClass(), "age", 0);
        setIntField(term78094, term78094.getClass(), "timeInJob", 0);
        setIntField(term78094, term78094.getClass(), "level", 0);
        setIntField(term78094, term78094.getClass(), "experience", 0);
        setField(term78094, term78094.getClass(), "militaryRank", null);
        setField(term78094, term78094.getClass(), "gender", null);
        setField(term78094, term78094.getClass(), "race", null);
        setField(term78094, term78094.getClass(), "title", null);
        setField(term78094, term78094.getClass(), "job", null);
        setField(term78094, term78094.getClass(), "parent", null);
        setIntField(term78094, term78094.getClass(), "parentIndex", 0);
        setField(term78094, term78094.getClass(), "perkList", null);
        setField(term78094, term78094.getClass(), "stats", null);
        setField(term78026, term78026.getClass(), "commander", term78094);
        setIntField(term78100, term78100.getClass(), "maxX", 0);
        setIntField(term78100, term78100.getClass(), "maxY", 0);
        setField(term78100, term78100.getClass(), "blockMap", null);
        setField(term78100, term78100.getClass(), "points", null);
        setIntField(term78100, term78100.getClass(), "tx", 0);
        setIntField(term78100, term78100.getClass(), "ty", 0);
        setIntField(term78100, term78100.getClass(), "targetDistance", 0);
        setField(term78100, term78100.getClass(), "targetPoint", null);
        setIntField(term78100, term78100.getClass(), "routeIndex", 0);
        setField(term78026, term78026.getClass(), "aStarSearch", term78100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getY", argTypes, term78026, args);
    }

};


