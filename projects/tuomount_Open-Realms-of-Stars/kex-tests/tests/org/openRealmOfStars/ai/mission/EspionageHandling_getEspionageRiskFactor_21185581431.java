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

public class EspionageHandling_getEspionageRiskFactor_21185581431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum1246;

    public EspionageHandling_getEspionageRiskFactor_21185581431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term452475 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term452474 = ((Class) term452475).getDeclaredField((String) "LOGICAL");
        ((Field) term452474).setAccessible(true);
        enum1246 = ((Field) term452474).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.mission.EspionageHandling");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.Attitude");
        Object[] args = new Object[1];
        args[0] = enum1246;
        callMethod(klass, "getEspionageRiskFactor", argTypes, null, args);
    }

};


