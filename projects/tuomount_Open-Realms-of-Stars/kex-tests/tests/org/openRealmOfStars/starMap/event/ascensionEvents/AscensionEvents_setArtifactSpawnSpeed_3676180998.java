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
import java.lang.Integer;

public class AscensionEvents_setArtifactSpawnSpeed_3676180998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2535;
     Object term2541;

    public AscensionEvents_setArtifactSpawnSpeed_3676180998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2535 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEvents"));
        setIntField(term2535, term2535.getClass(), "artifactSpawnSpeed", 339854490);
        setIntField(term2535, term2535.getClass(), "spaceDevourerSpeed", -615654495);
        setIntField(term2535, term2535.getClass(), "chanceForArtifact", -1476117762);
        setIntField(term2535, term2535.getClass(), "chanceForDevourer", -341962980);
        setByteField(term2535, term2535.getClass(), "ascensionActivation", (byte) 45);
        term2541 = new Integer(1532716628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEvents");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2541;
        callMethod(klass, "setArtifactSpawnSpeed", argTypes, term2535, args);
    }

};


