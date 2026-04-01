package org.openRealmOfStars.player.tech;

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
import static org.openRealmOfStars.player.tech.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Tech_toString_193704241643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159330;

    public Tech_toString_193704241643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159330 = newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"));
        setField(term159330, term159330.getClass(), "name", null);
        setField(term159330, term159330.getClass(), "type", null);
        setIntField(term159330, term159330.getClass(), "level", 0);
        setField(term159330, term159330.getClass(), "component", null);
        setField(term159330, term159330.getClass(), "improvement", null);
        setField(term159330, term159330.getClass(), "hull", null);
        setBooleanField(term159330, term159330.getClass(), "rareTech", false);
        setIntField(term159330, term159330.getClass(), "nextTechLevel", 0);
        setField(term159330, term159330.getClass(), "icon", null);
        setBooleanField(term159330, term159330.getClass(), "tradeable", false);
        setBooleanField(term159330, term159330.getClass(), "excludeList", false);
        setField(term159330, term159330.getClass(), "spaceRaces", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.Tech");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term159330, args);
    }

};


