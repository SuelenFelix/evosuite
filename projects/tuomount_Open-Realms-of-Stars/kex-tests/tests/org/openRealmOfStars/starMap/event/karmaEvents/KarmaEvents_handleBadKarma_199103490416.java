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

public class KarmaEvents_handleBadKarma_199103490416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308193;

    public KarmaEvents_handleBadKarma_199103490416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term308193 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.KarmaEvents"));
        setField(term308193, term308193.getClass(), "karmaSelection", null);
        setIntField(term308193, term308193.getClass(), "karmaSpeed", 0);
        setIntField(term308193, term308193.getClass(), "goodKarmaCount", 0);
        setIntField(term308193, term308193.getClass(), "badKarmaCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.KarmaEvents");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleBadKarma", argTypes, term308193, args);
    }

};


