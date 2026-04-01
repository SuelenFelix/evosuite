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
import java.lang.Byte;

public class AscensionEvents_setAscensionActivation_12951408812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2563;
     Object term2569;

    public AscensionEvents_setAscensionActivation_12951408812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2563 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEvents"));
        setIntField(term2563, term2563.getClass(), "artifactSpawnSpeed", 53410913);
        setIntField(term2563, term2563.getClass(), "spaceDevourerSpeed", -375014958);
        setIntField(term2563, term2563.getClass(), "chanceForArtifact", 1107176718);
        setIntField(term2563, term2563.getClass(), "chanceForDevourer", 480137250);
        setByteField(term2563, term2563.getClass(), "ascensionActivation", (byte) 66);
        term2569 = new Byte((byte) 123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEvents");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = term2569;
        callMethod(klass, "setAscensionActivation", argTypes, term2563, args);
    }

};


