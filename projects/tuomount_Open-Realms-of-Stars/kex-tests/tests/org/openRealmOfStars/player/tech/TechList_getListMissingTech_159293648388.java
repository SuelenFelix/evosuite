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

public class TechList_getListMissingTech_159293648388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424449;
     Object term424450;

    public TechList_getListMissingTech_159293648388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424449 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        setField(term424449, term424449.getClass(), "techList", null);
        setField(term424449, term424449.getClass(), "techLevels", null);
        setField(term424449, term424449.getClass(), "techFocus", null);
        setField(term424449, term424449.getClass(), "techResearchPoint", null);
        setField(term424449, term424449.getClass(), "race", null);
        term424450 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term424450;
        callMethod(klass, "getListMissingTech", argTypes, term424449, args);
    }

};


