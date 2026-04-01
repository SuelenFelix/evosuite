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

public class RandomEvent_setNewsWorthy_178670000335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145727;
     Object term145730;

    public RandomEvent_setNewsWorthy_178670000335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145727 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent"));
        setField(term145727, term145727.getClass(), "type", null);
        setField(term145727, term145727.getClass(), "realm", null);
        setField(term145727, term145727.getClass(), "planet", null);
        setField(term145727, term145727.getClass(), "sun", null);
        setField(term145727, term145727.getClass(), "fleet", null);
        setField(term145727, term145727.getClass(), "text", null);
        setField(term145727, term145727.getClass(), "leader", null);
        setField(term145727, term145727.getClass(), "imageInstructions", null);
        setBooleanField(term145727, term145727.getClass(), "newsWorthy", false);
        setBooleanField(term145727, term145727.getClass(), "popupShown", false);
        term145730 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term145730;
        callMethod(klass, "setNewsWorthy", argTypes, term145727, args);
    }

};


