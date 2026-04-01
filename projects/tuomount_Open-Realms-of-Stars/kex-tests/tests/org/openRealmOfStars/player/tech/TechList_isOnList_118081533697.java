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

public class TechList_isOnList_118081533697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3314974;

    public TechList_isOnList_118081533697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3314974 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        setField(term3314974, term3314974.getClass(), "techList", null);
        setField(term3314974, term3314974.getClass(), "techLevels", null);
        setField(term3314974, term3314974.getClass(), "techFocus", null);
        setField(term3314974, term3314974.getClass(), "techResearchPoint", null);
        setField(term3314974, term3314974.getClass(), "race", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"), 0).getClass();
        argTypes[1] = Class.forName("org.openRealmOfStars.player.tech.Tech");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "isOnList", argTypes, term3314974, args);
    }

};


