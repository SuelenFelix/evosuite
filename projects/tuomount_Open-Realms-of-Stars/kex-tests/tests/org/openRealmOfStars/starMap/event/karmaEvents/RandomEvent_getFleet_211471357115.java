package org.openRealmOfStars.starMap.event.karmaEvents;

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
import static org.openRealmOfStars.starMap.event.karmaEvents.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RandomEvent_getFleet_211471357115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61605;

    public RandomEvent_getFleet_211471357115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61605 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent"));
        setField(term61605, term61605.getClass(), "type", null);
        setField(term61605, term61605.getClass(), "realm", null);
        setField(term61605, term61605.getClass(), "planet", null);
        setField(term61605, term61605.getClass(), "sun", null);
        setField(term61605, term61605.getClass(), "fleet", null);
        setField(term61605, term61605.getClass(), "text", null);
        setField(term61605, term61605.getClass(), "leader", null);
        setField(term61605, term61605.getClass(), "imageInstructions", null);
        setBooleanField(term61605, term61605.getClass(), "newsWorthy", false);
        setBooleanField(term61605, term61605.getClass(), "popupShown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFleet", argTypes, term61605, args);
    }

};


