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

public class Tech_setImprovement_163782697238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159300;

    public Tech_setImprovement_163782697238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159300 = newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"));
        setField(term159300, term159300.getClass(), "name", null);
        setField(term159300, term159300.getClass(), "type", null);
        setIntField(term159300, term159300.getClass(), "level", 0);
        setField(term159300, term159300.getClass(), "component", null);
        setField(term159300, term159300.getClass(), "improvement", null);
        setField(term159300, term159300.getClass(), "hull", null);
        setBooleanField(term159300, term159300.getClass(), "rareTech", false);
        setIntField(term159300, term159300.getClass(), "nextTechLevel", 0);
        setField(term159300, term159300.getClass(), "icon", null);
        setBooleanField(term159300, term159300.getClass(), "tradeable", false);
        setBooleanField(term159300, term159300.getClass(), "excludeList", false);
        setField(term159300, term159300.getClass(), "spaceRaces", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.Tech");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setImprovement", argTypes, term159300, args);
    }

};


