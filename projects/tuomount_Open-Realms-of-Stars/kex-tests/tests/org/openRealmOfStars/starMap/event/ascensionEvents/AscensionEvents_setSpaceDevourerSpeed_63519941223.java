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

public class AscensionEvents_setSpaceDevourerSpeed_63519941223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2621;
     Object term2627;

    public AscensionEvents_setSpaceDevourerSpeed_63519941223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2621 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEvents"));
        setIntField(term2621, term2621.getClass(), "artifactSpawnSpeed", 0);
        setIntField(term2621, term2621.getClass(), "spaceDevourerSpeed", 0);
        setIntField(term2621, term2621.getClass(), "chanceForArtifact", 0);
        setIntField(term2621, term2621.getClass(), "chanceForDevourer", 0);
        setByteField(term2621, term2621.getClass(), "ascensionActivation", (byte) 0);
        term2627 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEvents");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2627;
        callMethod(klass, "setSpaceDevourerSpeed", argTypes, term2621, args);
    }

};


