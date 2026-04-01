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

public class RandomEvent_getPlanet_4873488967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32086;

    public RandomEvent_getPlanet_4873488967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32086 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent"));
        setField(term32086, term32086.getClass(), "type", null);
        setField(term32086, term32086.getClass(), "realm", null);
        setField(term32086, term32086.getClass(), "planet", null);
        setField(term32086, term32086.getClass(), "sun", null);
        setField(term32086, term32086.getClass(), "fleet", null);
        setField(term32086, term32086.getClass(), "text", null);
        setField(term32086, term32086.getClass(), "leader", null);
        setField(term32086, term32086.getClass(), "imageInstructions", null);
        setBooleanField(term32086, term32086.getClass(), "newsWorthy", false);
        setBooleanField(term32086, term32086.getClass(), "popupShown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanet", argTypes, term32086, args);
    }

};


