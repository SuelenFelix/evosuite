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

public class Tech_getType_78691204131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159256;

    public Tech_getType_78691204131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159256 = newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"));
        setField(term159256, term159256.getClass(), "name", null);
        setField(term159256, term159256.getClass(), "type", null);
        setIntField(term159256, term159256.getClass(), "level", 0);
        setField(term159256, term159256.getClass(), "component", null);
        setField(term159256, term159256.getClass(), "improvement", null);
        setField(term159256, term159256.getClass(), "hull", null);
        setBooleanField(term159256, term159256.getClass(), "rareTech", false);
        setIntField(term159256, term159256.getClass(), "nextTechLevel", 0);
        setField(term159256, term159256.getClass(), "icon", null);
        setBooleanField(term159256, term159256.getClass(), "tradeable", false);
        setBooleanField(term159256, term159256.getClass(), "excludeList", false);
        setField(term159256, term159256.getClass(), "spaceRaces", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.Tech");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term159256, args);
    }

};


