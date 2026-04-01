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

public class RandomEvent_getText_199321227119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74739;

    public RandomEvent_getText_199321227119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74739 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent"));
        setField(term74739, term74739.getClass(), "type", null);
        setField(term74739, term74739.getClass(), "realm", null);
        setField(term74739, term74739.getClass(), "planet", null);
        setField(term74739, term74739.getClass(), "sun", null);
        setField(term74739, term74739.getClass(), "fleet", null);
        setField(term74739, term74739.getClass(), "text", null);
        setField(term74739, term74739.getClass(), "leader", null);
        setField(term74739, term74739.getClass(), "imageInstructions", null);
        setBooleanField(term74739, term74739.getClass(), "newsWorthy", false);
        setBooleanField(term74739, term74739.getClass(), "popupShown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term74739, args);
    }

};


