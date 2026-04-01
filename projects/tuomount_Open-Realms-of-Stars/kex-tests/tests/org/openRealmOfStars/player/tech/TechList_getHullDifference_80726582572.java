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

public class TechList_getHullDifference_80726582572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424431;

    public TechList_getHullDifference_80726582572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424431 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        setField(term424431, term424431.getClass(), "techList", null);
        setField(term424431, term424431.getClass(), "techLevels", null);
        setField(term424431, term424431.getClass(), "techFocus", null);
        setField(term424431, term424431.getClass(), "techResearchPoint", null);
        setField(term424431, term424431.getClass(), "race", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.tech.Tech");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.tech.Tech");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getHullDifference", argTypes, term424431, args);
    }

};


