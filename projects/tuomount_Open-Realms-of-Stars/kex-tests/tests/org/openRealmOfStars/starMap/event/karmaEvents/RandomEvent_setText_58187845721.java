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

public class RandomEvent_setText_58187845721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79690;

    public RandomEvent_setText_58187845721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79690 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent"));
        setField(term79690, term79690.getClass(), "type", null);
        setField(term79690, term79690.getClass(), "realm", null);
        setField(term79690, term79690.getClass(), "planet", null);
        setField(term79690, term79690.getClass(), "sun", null);
        setField(term79690, term79690.getClass(), "fleet", null);
        setField(term79690, term79690.getClass(), "text", null);
        setField(term79690, term79690.getClass(), "leader", null);
        setField(term79690, term79690.getClass(), "imageInstructions", null);
        setBooleanField(term79690, term79690.getClass(), "newsWorthy", false);
        setBooleanField(term79690, term79690.getClass(), "popupShown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term79690, args);
    }

};


