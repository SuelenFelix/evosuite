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

public class Tech_setHull_192313360140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159312;

    public Tech_setHull_192313360140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159312 = newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"));
        setField(term159312, term159312.getClass(), "name", null);
        setField(term159312, term159312.getClass(), "type", null);
        setIntField(term159312, term159312.getClass(), "level", 0);
        setField(term159312, term159312.getClass(), "component", null);
        setField(term159312, term159312.getClass(), "improvement", null);
        setField(term159312, term159312.getClass(), "hull", null);
        setBooleanField(term159312, term159312.getClass(), "rareTech", false);
        setIntField(term159312, term159312.getClass(), "nextTechLevel", 0);
        setField(term159312, term159312.getClass(), "icon", null);
        setBooleanField(term159312, term159312.getClass(), "tradeable", false);
        setBooleanField(term159312, term159312.getClass(), "excludeList", false);
        setField(term159312, term159312.getClass(), "spaceRaces", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.Tech");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHull", argTypes, term159312, args);
    }

};


