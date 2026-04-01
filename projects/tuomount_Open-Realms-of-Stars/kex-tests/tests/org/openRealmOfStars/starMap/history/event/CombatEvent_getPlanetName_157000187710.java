package org.openRealmOfStars.starMap.history.event;

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
import static org.openRealmOfStars.starMap.history.event.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CombatEvent_getPlanetName_157000187710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41617;

    public CombatEvent_getPlanetName_157000187710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41617 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.CombatEvent"));
        setField(term41617, term41617.getClass(), "coordinate", null);
        setField(term41617, term41617.getClass(), "planetName", null);
        setField(term41617, term41617.getClass(), "text", null);
        setField(term41617, term41617.getClass(), "type", null);
        setByteField(term41617, term41617.getClass(), "playerIndex", (byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.CombatEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanetName", argTypes, term41617, args);
    }

};


