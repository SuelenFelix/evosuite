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

public class Mission_setSunName_178747494014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606738;

    public Mission_setSunName_178747494014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term606848 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionType");
        Field term606847 = ((Class) term606848).getDeclaredField((String) "DESTROY_STARBASE");
        ((Field) term606847).setAccessible(true);
        Object enum1697 = ((Field) term606847).get((Object) null);
        Class<? extends Object> term607118 = Class.forName((String) "org.openRealmOfStars.ai.mission.MissionPhase");
        Field term607117 = ((Class) term607118).getDeclaredField((String) "TREKKING");
        ((Field) term607117).setAccessible(true);
        Object enum1698 = ((Field) term607117).get((Object) null);
        term606738 = newInstance(Class.forName("org.openRealmOfStars.ai.mission.Mission"));
        Object term606771 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term606738, term606738.getClass(), "type", enum1697);
        setField(term606738, term606738.getClass(), "phase", enum1698);
        setIntField(term606771, term606771.getClass(), "x", 1232073677);
        setIntField(term606771, term606771.getClass(), "y", -1467737409);
        setField(term606738, term606738.getClass(), "targetCoordinate", term606771);
        setField(term606738, term606738.getClass(), "fleetName", "nNxaFYbFhk");
        setField(term606738, term606738.getClass(), "planetBuilding", "GzYvECDdOa");
        setField(term606738, term606738.getClass(), "planetGathering", "wgbgSBZLwP");
        setField(term606738, term606738.getClass(), "targetPlanet", "RbJAjtOyEC");
        setField(term606738, term606738.getClass(), "parameter", "tdVhrcRQQm");
        setIntField(term606738, term606738.getClass(), "missionTime", -379667315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ejKPlzUUki";
        callMethod(klass, "setSunName", argTypes, term606738, args);
    }

};


