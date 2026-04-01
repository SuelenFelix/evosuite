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

public class Mission_getFleetName_15112727626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term601554;

    public Mission_getFleetName_15112727626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term601644 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term601643 = ((Class) term601644).getDeclaredField((String) "INTERCEPT");
        ((Field) term601643).setAccessible(true);
        Object enum1681 = ((Field) term601643).get((Object) null);
        Class<? extends Object> term601893 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term601892 = ((Class) term601893).getDeclaredField((String) "LOADING");
        ((Field) term601892).setAccessible(true);
        Object enum1682 = ((Field) term601892).get((Object) null);
        term601554 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term601579 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term601554, term601554.getClass(), "type", enum1681);
        setField(term601554, term601554.getClass(), "phase", enum1682);
        setIntField(term601579, term601579.getClass(), "x", -732115520);
        setIntField(term601579, term601579.getClass(), "y", 441210816);
        setField(term601554, term601554.getClass(), "targetCoordinate", term601579);
        setField(term601554, term601554.getClass(), "fleetName", "UxaAGtRgCD");
        setField(term601554, term601554.getClass(), "planetBuilding", "pRckFaBOim");
        setField(term601554, term601554.getClass(), "planetGathering", "FHGHhRcJFU");
        setField(term601554, term601554.getClass(), "targetPlanet", "YqEClxjfHz");
        setField(term601554, term601554.getClass(), "parameter", "yMGLPPbHtN");
        setIntField(term601554, term601554.getClass(), "missionTime", -263423483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFleetName", argTypes, term601554, args);
    }

};


