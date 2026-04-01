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

public class NameGenerator_generateGaseousPeople_116656349618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum2045;

    public NameGenerator_generateGaseousPeople_116656349618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term636595 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term636594 = ((Class) term636595).getDeclaredField((String) "MALE");
        ((Field) term636594).setAccessible(true);
        enum2045 = ((Field) term636594).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.NameGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.Gender");
        Object[] args = new Object[1];
        args[0] = enum2045;
        callMethod(klass, "generateGaseousPeople", argTypes, null, args);
    }

};


