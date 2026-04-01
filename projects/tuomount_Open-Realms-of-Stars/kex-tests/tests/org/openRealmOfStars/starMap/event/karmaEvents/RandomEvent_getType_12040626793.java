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

public class RandomEvent_getType_12040626793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20760;

    public RandomEvent_getType_12040626793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20760 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent"));
        setField(term20760, term20760.getClass(), "type", null);
        setField(term20760, term20760.getClass(), "realm", null);
        setField(term20760, term20760.getClass(), "planet", null);
        setField(term20760, term20760.getClass(), "sun", null);
        setField(term20760, term20760.getClass(), "fleet", null);
        setField(term20760, term20760.getClass(), "text", null);
        setField(term20760, term20760.getClass(), "leader", null);
        setField(term20760, term20760.getClass(), "imageInstructions", null);
        setBooleanField(term20760, term20760.getClass(), "newsWorthy", false);
        setBooleanField(term20760, term20760.getClass(), "popupShown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term20760, args);
    }

};


