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

public class Mission_getTargetRealmName_165389759015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term607428;

    public Mission_getTargetRealmName_165389759015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term607521 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term607520 = ((Class) term607521).getDeclaredField((String) "TRADE_FLEET");
        ((Field) term607520).setAccessible(true);
        Object enum1699 = ((Field) term607520).get((Object) null);
        Class<? extends Object> term607776 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term607775 = ((Class) term607776).getDeclaredField((String) "BUILDING");
        ((Field) term607775).setAccessible(true);
        Object enum1700 = ((Field) term607775).get((Object) null);
        term607428 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term607456 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term607428, term607428.getClass(), "type", enum1699);
        setField(term607428, term607428.getClass(), "phase", enum1700);
        setIntField(term607456, term607456.getClass(), "x", 632837650);
        setIntField(term607456, term607456.getClass(), "y", 1534101651);
        setField(term607428, term607428.getClass(), "targetCoordinate", term607456);
        setField(term607428, term607428.getClass(), "fleetName", "SiKsjwmkPz");
        setField(term607428, term607428.getClass(), "planetBuilding", "IxDbGrRCSC");
        setField(term607428, term607428.getClass(), "planetGathering", "xVKwejMUSh");
        setField(term607428, term607428.getClass(), "targetPlanet", "YHuQNQayjx");
        setField(term607428, term607428.getClass(), "parameter", "ywwACyUAUR");
        setIntField(term607428, term607428.getClass(), "missionTime", -2034728751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTargetRealmName", argTypes, term607428, args);
    }

};


