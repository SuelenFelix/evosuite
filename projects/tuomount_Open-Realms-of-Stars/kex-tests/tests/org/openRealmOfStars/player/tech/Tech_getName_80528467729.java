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

public class Tech_getName_80528467729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159244;

    public Tech_getName_80528467729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159244 = newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"));
        setField(term159244, term159244.getClass(), "name", null);
        setField(term159244, term159244.getClass(), "type", null);
        setIntField(term159244, term159244.getClass(), "level", 0);
        setField(term159244, term159244.getClass(), "component", null);
        setField(term159244, term159244.getClass(), "improvement", null);
        setField(term159244, term159244.getClass(), "hull", null);
        setBooleanField(term159244, term159244.getClass(), "rareTech", false);
        setIntField(term159244, term159244.getClass(), "nextTechLevel", 0);
        setField(term159244, term159244.getClass(), "icon", null);
        setBooleanField(term159244, term159244.getClass(), "tradeable", false);
        setBooleanField(term159244, term159244.getClass(), "excludeList", false);
        setField(term159244, term159244.getClass(), "spaceRaces", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.Tech");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term159244, args);
    }

};


