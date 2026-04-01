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

public class RandomEvent_setLeader_88178700033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145721;

    public RandomEvent_setLeader_88178700033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145721 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent"));
        setField(term145721, term145721.getClass(), "type", null);
        setField(term145721, term145721.getClass(), "realm", null);
        setField(term145721, term145721.getClass(), "planet", null);
        setField(term145721, term145721.getClass(), "sun", null);
        setField(term145721, term145721.getClass(), "fleet", null);
        setField(term145721, term145721.getClass(), "text", null);
        setField(term145721, term145721.getClass(), "leader", null);
        setField(term145721, term145721.getClass(), "imageInstructions", null);
        setBooleanField(term145721, term145721.getClass(), "newsWorthy", false);
        setBooleanField(term145721, term145721.getClass(), "popupShown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.RandomEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLeader", argTypes, term145721, args);
    }

};


