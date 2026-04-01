package org.openRealmOfStars.starMap.event.ascensionEvents;

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
import static org.openRealmOfStars.starMap.event.ascensionEvents.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class AscensionEvents_eventHappens_1245913296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1883;
     Object enum3;

    public AscensionEvents_eventHappens_1245913296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1883 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEvents"));
        setIntField(term1883, term1883.getClass(), "artifactSpawnSpeed", 304775596);
        setIntField(term1883, term1883.getClass(), "spaceDevourerSpeed", -1347665717);
        setIntField(term1883, term1883.getClass(), "chanceForArtifact", -1888585309);
        setIntField(term1883, term1883.getClass(), "chanceForDevourer", 683666002);
        setByteField(term1883, term1883.getClass(), "ascensionActivation", (byte) 13);
        Class<? extends Object> term2100 = Class.forName((String) "org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEventType");
        Field term2099 = ((Class) term2100).getDeclaredField((String) "GAIN_ASCENSION_PORTAL_TECH");
        ((Field) term2099).setAccessible(true);
        enum3 = ((Field) term2099).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEvents");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEventType");
        Object[] args = new Object[1];
        args[0] = enum3;
        callMethod(klass, "eventHappens", argTypes, term1883, args);
    }

};


