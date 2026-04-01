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

public class Tech_getSpaceRaces_158357786354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159404;

    public Tech_getSpaceRaces_158357786354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159404 = newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"));
        setField(term159404, term159404.getClass(), "name", null);
        setField(term159404, term159404.getClass(), "type", null);
        setIntField(term159404, term159404.getClass(), "level", 0);
        setField(term159404, term159404.getClass(), "component", null);
        setField(term159404, term159404.getClass(), "improvement", null);
        setField(term159404, term159404.getClass(), "hull", null);
        setBooleanField(term159404, term159404.getClass(), "rareTech", false);
        setIntField(term159404, term159404.getClass(), "nextTechLevel", 0);
        setField(term159404, term159404.getClass(), "icon", null);
        setBooleanField(term159404, term159404.getClass(), "tradeable", false);
        setBooleanField(term159404, term159404.getClass(), "excludeList", false);
        setField(term159404, term159404.getClass(), "spaceRaces", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.Tech");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpaceRaces", argTypes, term159404, args);
    }

};


