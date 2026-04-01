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

public class RandomEvent_isPopupShown_198003055028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109301;

    public RandomEvent_isPopupShown_198003055028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109301 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent"));
        setField(term109301, term109301.getClass(), "type", null);
        setField(term109301, term109301.getClass(), "realm", null);
        setField(term109301, term109301.getClass(), "planet", null);
        setField(term109301, term109301.getClass(), "sun", null);
        setField(term109301, term109301.getClass(), "fleet", null);
        setField(term109301, term109301.getClass(), "text", null);
        setField(term109301, term109301.getClass(), "leader", null);
        setField(term109301, term109301.getClass(), "imageInstructions", null);
        setBooleanField(term109301, term109301.getClass(), "newsWorthy", false);
        setBooleanField(term109301, term109301.getClass(), "popupShown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPopupShown", argTypes, term109301, args);
    }

};


