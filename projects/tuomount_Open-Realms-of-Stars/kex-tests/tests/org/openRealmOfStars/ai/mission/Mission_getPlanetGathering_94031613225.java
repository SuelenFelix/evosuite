package org.openRealmOfStars.ai.mission;

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
import static org.openRealmOfStars.ai.mission.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Mission_getPlanetGathering_94031613225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term614360;

    public Mission_getPlanetGathering_94031613225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term614450 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term614449 = ((Class) term614450).getDeclaredField((String) "EXPLORE");
        ((Field) term614449).setAccessible(true);
        Object enum1720 = ((Field) term614449).get((Object) null);
        Class<? extends Object> term614693 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term614692 = ((Class) term614693).getDeclaredField((String) "EXECUTING");
        ((Field) term614692).setAccessible(true);
        Object enum1721 = ((Field) term614692).get((Object) null);
        term614360 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term614385 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term614360, term614360.getClass(), "type", enum1720);
        setField(term614360, term614360.getClass(), "phase", enum1721);
        setIntField(term614385, term614385.getClass(), "x", -1143133939);
        setIntField(term614385, term614385.getClass(), "y", 1626744743);
        setField(term614360, term614360.getClass(), "targetCoordinate", term614385);
        setField(term614360, term614360.getClass(), "fleetName", "GzUONbZYjN");
        setField(term614360, term614360.getClass(), "planetBuilding", "CiYjIPfAnM");
        setField(term614360, term614360.getClass(), "planetGathering", "FWndqLTHUy");
        setField(term614360, term614360.getClass(), "targetPlanet", "bAyChHtJAv");
        setField(term614360, term614360.getClass(), "parameter", "bXPnhSFozK");
        setIntField(term614360, term614360.getClass(), "missionTime", 2144652175);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanetGathering", argTypes, term614360, args);
    }

};


