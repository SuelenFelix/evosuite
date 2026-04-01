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

public class KarmaEvents_createBadRandomEvent_9361606517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316438;

    public KarmaEvents_createBadRandomEvent_9361606517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term316438 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.KarmaEvents"));
        setField(term316438, term316438.getClass(), "karmaSelection", null);
        setIntField(term316438, term316438.getClass(), "karmaSpeed", 0);
        setIntField(term316438, term316438.getClass(), "goodKarmaCount", 0);
        setIntField(term316438, term316438.getClass(), "badKarmaCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.KarmaEvents");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createBadRandomEvent", argTypes, term316438, args);
    }

};


