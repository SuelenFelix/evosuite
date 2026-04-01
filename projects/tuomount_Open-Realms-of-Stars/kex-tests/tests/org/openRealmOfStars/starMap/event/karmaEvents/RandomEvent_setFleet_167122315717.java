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

public class RandomEvent_setFleet_167122315717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67557;

    public RandomEvent_setFleet_167122315717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67557 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent"));
        setField(term67557, term67557.getClass(), "type", null);
        setField(term67557, term67557.getClass(), "realm", null);
        setField(term67557, term67557.getClass(), "planet", null);
        setField(term67557, term67557.getClass(), "sun", null);
        setField(term67557, term67557.getClass(), "fleet", null);
        setField(term67557, term67557.getClass(), "text", null);
        setField(term67557, term67557.getClass(), "leader", null);
        setField(term67557, term67557.getClass(), "imageInstructions", null);
        setBooleanField(term67557, term67557.getClass(), "newsWorthy", false);
        setBooleanField(term67557, term67557.getClass(), "popupShown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFleet", argTypes, term67557, args);
    }

};


