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
import java.lang.Boolean;

public class RandomEvent_setPopupShown_98728723630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115727;
     Object term115730;

    public RandomEvent_setPopupShown_98728723630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115727 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent"));
        setField(term115727, term115727.getClass(), "type", null);
        setField(term115727, term115727.getClass(), "realm", null);
        setField(term115727, term115727.getClass(), "planet", null);
        setField(term115727, term115727.getClass(), "sun", null);
        setField(term115727, term115727.getClass(), "fleet", null);
        setField(term115727, term115727.getClass(), "text", null);
        setField(term115727, term115727.getClass(), "leader", null);
        setField(term115727, term115727.getClass(), "imageInstructions", null);
        setBooleanField(term115727, term115727.getClass(), "newsWorthy", false);
        setBooleanField(term115727, term115727.getClass(), "popupShown", false);
        term115730 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term115730;
        callMethod(klass, "setPopupShown", argTypes, term115727, args);
    }

};


