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

public class Tech_setNextTechLevel_78353512249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159368;
     Object term159374;

    public Tech_setNextTechLevel_78353512249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159368 = newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"));
        setField(term159368, term159368.getClass(), "name", null);
        setField(term159368, term159368.getClass(), "type", null);
        setIntField(term159368, term159368.getClass(), "level", 0);
        setField(term159368, term159368.getClass(), "component", null);
        setField(term159368, term159368.getClass(), "improvement", null);
        setField(term159368, term159368.getClass(), "hull", null);
        setBooleanField(term159368, term159368.getClass(), "rareTech", false);
        setIntField(term159368, term159368.getClass(), "nextTechLevel", 0);
        setField(term159368, term159368.getClass(), "icon", null);
        setBooleanField(term159368, term159368.getClass(), "tradeable", false);
        setBooleanField(term159368, term159368.getClass(), "excludeList", false);
        setField(term159368, term159368.getClass(), "spaceRaces", null);
        term159374 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.Tech");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term159374;
        callMethod(klass, "setNextTechLevel", argTypes, term159368, args);
    }

};


