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

public class AscensionEvents_getAscensionActivation_92996859024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2629;

    public AscensionEvents_getAscensionActivation_92996859024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2629 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEvents"));
        setIntField(term2629, term2629.getClass(), "artifactSpawnSpeed", 0);
        setIntField(term2629, term2629.getClass(), "spaceDevourerSpeed", 0);
        setIntField(term2629, term2629.getClass(), "chanceForArtifact", 0);
        setIntField(term2629, term2629.getClass(), "chanceForDevourer", 0);
        setByteField(term2629, term2629.getClass(), "ascensionActivation", (byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEvents");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAscensionActivation", argTypes, term2629, args);
    }

};


