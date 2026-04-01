package org.openRealmOfStars.starMap.planet.status;

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
import static org.openRealmOfStars.starMap.planet.status.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class StatusFactory_getTimedStatus_15118813193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum13;
     Object term12856;

    public StatusFactory_getTimedStatus_15118813193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12869 = Class.forName((String) "org.openRealmOfStars.starMap.planet.status.TimedStatusType");
        Field term12868 = ((Class) term12869).getDeclaredField((String) "AFTER_COLONIZATION_OR_AWAY_TEAM");
        ((Field) term12868).setAccessible(true);
        enum13 = ((Field) term12868).get((Object) null);
        term12856 = new Integer(1320570890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.StatusFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.planet.status.TimedStatusType");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "RDnkgWkcbz";
        args[1] = enum13;
        args[2] = term12856;
        callMethod(klass, "getTimedStatus", argTypes, null, args);
    }

};


