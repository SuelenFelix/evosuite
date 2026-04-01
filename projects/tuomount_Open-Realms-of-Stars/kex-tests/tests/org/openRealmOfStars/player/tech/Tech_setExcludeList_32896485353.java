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

public class Tech_setExcludeList_32896485353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159396;
     Object term159402;

    public Tech_setExcludeList_32896485353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159396 = newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"));
        setField(term159396, term159396.getClass(), "name", null);
        setField(term159396, term159396.getClass(), "type", null);
        setIntField(term159396, term159396.getClass(), "level", 0);
        setField(term159396, term159396.getClass(), "component", null);
        setField(term159396, term159396.getClass(), "improvement", null);
        setField(term159396, term159396.getClass(), "hull", null);
        setBooleanField(term159396, term159396.getClass(), "rareTech", false);
        setIntField(term159396, term159396.getClass(), "nextTechLevel", 0);
        setField(term159396, term159396.getClass(), "icon", null);
        setBooleanField(term159396, term159396.getClass(), "tradeable", false);
        setBooleanField(term159396, term159396.getClass(), "excludeList", false);
        setField(term159396, term159396.getClass(), "spaceRaces", null);
        term159402 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.Tech");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term159402;
        callMethod(klass, "setExcludeList", argTypes, term159396, args);
    }

};


