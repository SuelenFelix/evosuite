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

public class Mission_setType_2346184433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599033;
     Object enum1675;

    public Mission_setType_2346184433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term599148 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term599147 = ((Class) term599148).getDeclaredField((String) "ESPIONAGE_MISSION");
        ((Field) term599147).setAccessible(true);
        Object enum1673 = ((Field) term599147).get((Object) null);
        Class<? extends Object> term599421 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term599420 = ((Class) term599421).getDeclaredField((String) "BUILDING");
        ((Field) term599420).setAccessible(true);
        Object enum1674 = ((Field) term599420).get((Object) null);
        term599033 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term599067 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term599033, term599033.getClass(), "type", enum1673);
        setField(term599033, term599033.getClass(), "phase", enum1674);
        setIntField(term599067, term599067.getClass(), "x", -634909207);
        setIntField(term599067, term599067.getClass(), "y", -167225645);
        setField(term599033, term599033.getClass(), "targetCoordinate", term599067);
        setField(term599033, term599033.getClass(), "fleetName", "dixYrXNYqo");
        setField(term599033, term599033.getClass(), "planetBuilding", "ahVvdSqaKT");
        setField(term599033, term599033.getClass(), "planetGathering", "QkrqqBMJHS");
        setField(term599033, term599033.getClass(), "targetPlanet", "YIJfrIwdZb");
        setField(term599033, term599033.getClass(), "parameter", "IokWRyGwaH");
        setIntField(term599033, term599033.getClass(), "missionTime", 1558825635);
        Class<? extends Object> term599722 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term599721 = ((Class) term599722).getDeclaredField((String) "SPORE_COLONY");
        ((Field) term599721).setAccessible(true);
        enum1675 = ((Field) term599721).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.ai.mission.MissionType");
        Object[] args = new Object[1];
        args[0] = enum1675;
        callMethod(klass, "setType", argTypes, term599033, args);
    }

};


