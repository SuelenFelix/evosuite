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

public class KarmaEvents_getRealmByKarma_282685513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316420;
     Object term316424;

    public KarmaEvents_getRealmByKarma_282685513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term316420 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.KarmaEvents"));
        setField(term316420, term316420.getClass(), "karmaSelection", null);
        setIntField(term316420, term316420.getClass(), "karmaSpeed", 0);
        setIntField(term316420, term316420.getClass(), "goodKarmaCount", 0);
        setIntField(term316420, term316420.getClass(), "badKarmaCount", 0);
        term316424 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.KarmaEvents");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term316424;
        callMethod(klass, "getRealmByKarma", argTypes, term316420, args);
    }

};


