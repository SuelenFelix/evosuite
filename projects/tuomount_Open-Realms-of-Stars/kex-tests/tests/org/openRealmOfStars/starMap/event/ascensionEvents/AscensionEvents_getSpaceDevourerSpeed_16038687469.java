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

public class AscensionEvents_getSpaceDevourerSpeed_16038687469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2543;

    public AscensionEvents_getSpaceDevourerSpeed_16038687469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2543 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEvents"));
        setIntField(term2543, term2543.getClass(), "artifactSpawnSpeed", -1801760683);
        setIntField(term2543, term2543.getClass(), "spaceDevourerSpeed", 1141317871);
        setIntField(term2543, term2543.getClass(), "chanceForArtifact", 890669485);
        setIntField(term2543, term2543.getClass(), "chanceForDevourer", 691577392);
        setByteField(term2543, term2543.getClass(), "ascensionActivation", (byte) -20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEvents");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpaceDevourerSpeed", argTypes, term2543, args);
    }

};


