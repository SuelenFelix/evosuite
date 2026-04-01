package org.openRealmOfStars.player.diplomacy;

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
import static org.openRealmOfStars.player.diplomacy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class AttitudeScore_init_18805173550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum1245;

    public AttitudeScore_init_18805173550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term434078 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term434077 = ((Class) term434078).getDeclaredField((String) "AGGRESSIVE");
        ((Field) term434077).setAccessible(true);
        enum1245 = ((Field) term434077).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.AttitudeScore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.Attitude");
        Object[] args = new Object[1];
        args[0] = enum1245;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


