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

public class AscensionEvents_eventHappens_12459132919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2595;

    public AscensionEvents_eventHappens_12459132919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2595 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEvents"));
        setIntField(term2595, term2595.getClass(), "artifactSpawnSpeed", 0);
        setIntField(term2595, term2595.getClass(), "spaceDevourerSpeed", 0);
        setIntField(term2595, term2595.getClass(), "chanceForArtifact", 0);
        setIntField(term2595, term2595.getClass(), "chanceForDevourer", 0);
        setByteField(term2595, term2595.getClass(), "ascensionActivation", (byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEvents");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEventType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "eventHappens", argTypes, term2595, args);
    }

};


