package org.openRealmOfStars.player.leader;

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
import static org.openRealmOfStars.player.leader.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Perk_getPerkScore_179973107612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum1081;
     Object enum1082;

    public Perk_getPerkScore_179973107612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term331491 = Class.forName((String) "org.openRealmOfStars.player.leader.Perk");
        Field term331490 = ((Class) term331491).getDeclaredField((String) "PEACEFUL");
        ((Field) term331490).setAccessible(true);
        enum1081 = ((Field) term331490).get((Object) null);
        Class<? extends Object> term331717 = Class.forName((String) "org.openRealmOfStars.player.leader.Job");
        Field term331716 = ((Class) term331717).getDeclaredField((String) "DEAD");
        ((Field) term331716).setAccessible(true);
        enum1082 = ((Field) term331716).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.Perk");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.Job");
        Object[] args = new Object[1];
        args[0] = enum1082;
        callMethod(klass, "getPerkScore", argTypes, enum1081, args);
    }

};


