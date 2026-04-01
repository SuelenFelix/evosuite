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

public class Mission_getTargetPlanet_179989568223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term613058;

    public Mission_getTargetPlanet_179989568223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term613149 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term613148 = ((Class) term613149).getDeclaredField((String) "PRIVATEER");
        ((Field) term613148).setAccessible(true);
        Object enum1716 = ((Field) term613148).get((Object) null);
        Class<? extends Object> term613398 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term613397 = ((Class) term613398).getDeclaredField((String) "BUILDING");
        ((Field) term613397).setAccessible(true);
        Object enum1717 = ((Field) term613397).get((Object) null);
        term613058 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term613084 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term613058, term613058.getClass(), "type", enum1716);
        setField(term613058, term613058.getClass(), "phase", enum1717);
        setIntField(term613084, term613084.getClass(), "x", 1236106946);
        setIntField(term613084, term613084.getClass(), "y", -1057895738);
        setField(term613058, term613058.getClass(), "targetCoordinate", term613084);
        setField(term613058, term613058.getClass(), "fleetName", "hwTwJKOZeb");
        setField(term613058, term613058.getClass(), "planetBuilding", "TVTsoxMhcU");
        setField(term613058, term613058.getClass(), "planetGathering", "aSaxgEnUvV");
        setField(term613058, term613058.getClass(), "targetPlanet", "WWNcLpmIWb");
        setField(term613058, term613058.getClass(), "parameter", "LQXgUFLDaR");
        setIntField(term613058, term613058.getClass(), "missionTime", -1568804083);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTargetPlanet", argTypes, term613058, args);
    }

};


