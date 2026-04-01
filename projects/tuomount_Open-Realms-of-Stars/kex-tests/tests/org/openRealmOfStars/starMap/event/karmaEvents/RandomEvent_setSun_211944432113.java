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

public class RandomEvent_setSun_211944432113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56036;

    public RandomEvent_setSun_211944432113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56036 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent"));
        setField(term56036, term56036.getClass(), "type", null);
        setField(term56036, term56036.getClass(), "realm", null);
        setField(term56036, term56036.getClass(), "planet", null);
        setField(term56036, term56036.getClass(), "sun", null);
        setField(term56036, term56036.getClass(), "fleet", null);
        setField(term56036, term56036.getClass(), "text", null);
        setField(term56036, term56036.getClass(), "leader", null);
        setField(term56036, term56036.getClass(), "imageInstructions", null);
        setBooleanField(term56036, term56036.getClass(), "newsWorthy", false);
        setBooleanField(term56036, term56036.getClass(), "popupShown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Sun");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSun", argTypes, term56036, args);
    }

};


