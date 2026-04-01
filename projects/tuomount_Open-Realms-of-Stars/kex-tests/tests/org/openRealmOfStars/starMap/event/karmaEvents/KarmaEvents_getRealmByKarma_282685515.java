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

public class KarmaEvents_getRealmByKarma_282685515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308187;
     Object term308191;

    public KarmaEvents_getRealmByKarma_282685515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term308187 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.KarmaEvents"));
        setField(term308187, term308187.getClass(), "karmaSelection", null);
        setIntField(term308187, term308187.getClass(), "karmaSpeed", 0);
        setIntField(term308187, term308187.getClass(), "goodKarmaCount", 0);
        setIntField(term308187, term308187.getClass(), "badKarmaCount", 0);
        term308191 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.KarmaEvents");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term308191;
        callMethod(klass, "getRealmByKarma", argTypes, term308187, args);
    }

};


