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

public class RandomEvent_setImageInstructions_183226347836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145732;

    public RandomEvent_setImageInstructions_183226347836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145732 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent"));
        setField(term145732, term145732.getClass(), "type", null);
        setField(term145732, term145732.getClass(), "realm", null);
        setField(term145732, term145732.getClass(), "planet", null);
        setField(term145732, term145732.getClass(), "sun", null);
        setField(term145732, term145732.getClass(), "fleet", null);
        setField(term145732, term145732.getClass(), "text", null);
        setField(term145732, term145732.getClass(), "leader", null);
        setField(term145732, term145732.getClass(), "imageInstructions", null);
        setBooleanField(term145732, term145732.getClass(), "newsWorthy", false);
        setBooleanField(term145732, term145732.getClass(), "popupShown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setImageInstructions", argTypes, term145732, args);
    }

};


