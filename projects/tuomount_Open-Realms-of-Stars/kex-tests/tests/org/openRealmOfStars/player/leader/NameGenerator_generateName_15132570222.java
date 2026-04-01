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

public class NameGenerator_generateName_15132570222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum2049;
     Object enum2050;

    public NameGenerator_generateName_15132570222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term637553 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term637552 = ((Class) term637553).getDeclaredField((String) "PIRATE");
        ((Field) term637552).setAccessible(true);
        enum2049 = ((Field) term637552).get((Object) null);
        Class<? extends Object> term637838 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term637837 = ((Class) term637838).getDeclaredField((String) "NONE");
        ((Field) term637837).setAccessible(true);
        enum2050 = ((Field) term637837).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.NameGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.NameGeneratorType");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.leader.Gender");
        Object[] args = new Object[2];
        args[0] = enum2049;
        args[1] = enum2050;
        callMethod(klass, "generateName", argTypes, null, args);
    }

};


