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

public class Mission_getType_6830717992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term598385;

    public Mission_getType_6830717992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term598478 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term598477 = ((Class) term598478).getDeclaredField((String) "TRADE_FLEET");
        ((Field) term598477).setAccessible(true);
        Object enum1671 = ((Field) term598477).get((Object) null);
        Class<? extends Object> term598733 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term598732 = ((Class) term598733).getDeclaredField((String) "TREKKING");
        ((Field) term598732).setAccessible(true);
        Object enum1672 = ((Field) term598732).get((Object) null);
        term598385 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term598413 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term598385, term598385.getClass(), "type", enum1671);
        setField(term598385, term598385.getClass(), "phase", enum1672);
        setIntField(term598413, term598413.getClass(), "x", -855762476);
        setIntField(term598413, term598413.getClass(), "y", -559637675);
        setField(term598385, term598385.getClass(), "targetCoordinate", term598413);
        setField(term598385, term598385.getClass(), "fleetName", "pMEdUUGnHO");
        setField(term598385, term598385.getClass(), "planetBuilding", "rglkguiPxE");
        setField(term598385, term598385.getClass(), "planetGathering", "hplFGDxgfR");
        setField(term598385, term598385.getClass(), "targetPlanet", "kFQCKPJQDy");
        setField(term598385, term598385.getClass(), "parameter", "GpUrCxRwHg");
        setIntField(term598385, term598385.getClass(), "missionTime", -31351128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term598385, args);
    }

};


