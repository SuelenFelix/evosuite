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
import java.lang.Boolean;

public class Tech_setRareTech_132975540747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159354;
     Object term159360;

    public Tech_setRareTech_132975540747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159354 = newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"));
        setField(term159354, term159354.getClass(), "name", null);
        setField(term159354, term159354.getClass(), "type", null);
        setIntField(term159354, term159354.getClass(), "level", 0);
        setField(term159354, term159354.getClass(), "component", null);
        setField(term159354, term159354.getClass(), "improvement", null);
        setField(term159354, term159354.getClass(), "hull", null);
        setBooleanField(term159354, term159354.getClass(), "rareTech", false);
        setIntField(term159354, term159354.getClass(), "nextTechLevel", 0);
        setField(term159354, term159354.getClass(), "icon", null);
        setBooleanField(term159354, term159354.getClass(), "tradeable", false);
        setBooleanField(term159354, term159354.getClass(), "excludeList", false);
        setField(term159354, term159354.getClass(), "spaceRaces", null);
        term159360 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.Tech");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term159360;
        callMethod(klass, "setRareTech", argTypes, term159354, args);
    }

};


