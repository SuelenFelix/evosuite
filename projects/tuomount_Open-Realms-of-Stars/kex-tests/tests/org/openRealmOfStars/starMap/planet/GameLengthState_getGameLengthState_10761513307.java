package org.openRealmOfStars.starMap.planet;

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
import static org.openRealmOfStars.starMap.planet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class GameLengthState_getGameLengthState_10761513307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum40;
     Object term16028;
     Object term16030;

    public GameLengthState_getGameLengthState_10761513307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16033 = Class.forName((String) "org.openRealmOfStars.starMap.planet.GameLengthState");
        Field term16032 = ((Class) term16033).getDeclaredField((String) "LATE_GAME");
        ((Field) term16032).setAccessible(true);
        enum40 = ((Field) term16032).get((Object) null);
        term16028 = new Integer(0);
        term16030 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.GameLengthState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term16028;
        args[1] = term16030;
        callMethod(klass, "getGameLengthState", argTypes, enum40, args);
    }

};


