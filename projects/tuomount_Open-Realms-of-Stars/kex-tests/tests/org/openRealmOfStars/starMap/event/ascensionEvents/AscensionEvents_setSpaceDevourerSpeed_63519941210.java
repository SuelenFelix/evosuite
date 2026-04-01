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

public class AscensionEvents_setSpaceDevourerSpeed_63519941210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2549;
     Object term2555;

    public AscensionEvents_setSpaceDevourerSpeed_63519941210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2549 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEvents"));
        setIntField(term2549, term2549.getClass(), "artifactSpawnSpeed", -893623680);
        setIntField(term2549, term2549.getClass(), "spaceDevourerSpeed", -1963434938);
        setIntField(term2549, term2549.getClass(), "chanceForArtifact", 906181092);
        setIntField(term2549, term2549.getClass(), "chanceForDevourer", 1045657203);
        setByteField(term2549, term2549.getClass(), "ascensionActivation", (byte) 77);
        term2555 = new Integer(1386130016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEvents");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2555;
        callMethod(klass, "setSpaceDevourerSpeed", argTypes, term2549, args);
    }

};


