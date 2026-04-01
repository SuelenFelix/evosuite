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
import java.lang.Integer;

public class Tech_setLevel_99733359134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159274;
     Object term159280;

    public Tech_setLevel_99733359134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159274 = newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"));
        setField(term159274, term159274.getClass(), "name", null);
        setField(term159274, term159274.getClass(), "type", null);
        setIntField(term159274, term159274.getClass(), "level", 0);
        setField(term159274, term159274.getClass(), "component", null);
        setField(term159274, term159274.getClass(), "improvement", null);
        setField(term159274, term159274.getClass(), "hull", null);
        setBooleanField(term159274, term159274.getClass(), "rareTech", false);
        setIntField(term159274, term159274.getClass(), "nextTechLevel", 0);
        setField(term159274, term159274.getClass(), "icon", null);
        setBooleanField(term159274, term159274.getClass(), "tradeable", false);
        setBooleanField(term159274, term159274.getClass(), "excludeList", false);
        setField(term159274, term159274.getClass(), "spaceRaces", null);
        term159280 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.Tech");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term159280;
        callMethod(klass, "setLevel", argTypes, term159274, args);
    }

};


