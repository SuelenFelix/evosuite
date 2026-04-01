package org.openRealmOfStars.starMap;

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
import static org.openRealmOfStars.starMap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StarMapUtilities_getVotingSupportAccordingAttitude_26839218912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum10564;
     Object enum10565;

    public StarMapUtilities_getVotingSupportAccordingAttitude_26839218912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3583122 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term3583121 = ((Class) term3583122).getDeclaredField((String) "MERCHANTICAL");
        ((Field) term3583121).setAccessible(true);
        enum10564 = ((Field) term3583121).get((Object) null);
        Class<? extends Object> term3583395 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term3583394 = ((Class) term3583395).getDeclaredField((String) "GALACTIC_PEACE");
        ((Field) term3583394).setAccessible(true);
        enum10565 = ((Field) term3583394).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapUtilities");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.Attitude");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.vote.VotingType");
        Object[] args = new Object[2];
        args[0] = enum10564;
        args[1] = enum10565;
        callMethod(klass, "getVotingSupportAccordingAttitude", argTypes, null, args);
    }

};


