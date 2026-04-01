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

public class Mission_getMissionTime_63824560121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term611784;

    public Mission_getMissionTime_63824560121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term611870 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term611869 = ((Class) term611870).getDeclaredField((String) "ROAM");
        ((Field) term611869).setAccessible(true);
        Object enum1712 = ((Field) term611869).get((Object) null);
        Class<? extends Object> term612104 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term612103 = ((Class) term612104).getDeclaredField((String) "PLANNING");
        ((Field) term612103).setAccessible(true);
        Object enum1713 = ((Field) term612103).get((Object) null);
        term611784 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term611805 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term611784, term611784.getClass(), "type", enum1712);
        setField(term611784, term611784.getClass(), "phase", enum1713);
        setIntField(term611805, term611805.getClass(), "x", 1770955610);
        setIntField(term611805, term611805.getClass(), "y", -258435141);
        setField(term611784, term611784.getClass(), "targetCoordinate", term611805);
        setField(term611784, term611784.getClass(), "fleetName", "YCEDDPVtCV");
        setField(term611784, term611784.getClass(), "planetBuilding", "OVCCpcKCVF");
        setField(term611784, term611784.getClass(), "planetGathering", "UjWAefdZPM");
        setField(term611784, term611784.getClass(), "targetPlanet", "hoVCTFodui");
        setField(term611784, term611784.getClass(), "parameter", "pDUcaeWbzv");
        setIntField(term611784, term611784.getClass(), "missionTime", -1611383163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMissionTime", argTypes, term611784, args);
    }

};


