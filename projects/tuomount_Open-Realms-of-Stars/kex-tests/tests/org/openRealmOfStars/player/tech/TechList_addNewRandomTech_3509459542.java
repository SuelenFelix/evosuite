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

public class TechList_addNewRandomTech_3509459542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350515;

    public TechList_addNewRandomTech_3509459542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350515 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        setField(term350515, term350515.getClass(), "techList", null);
        setField(term350515, term350515.getClass(), "techLevels", null);
        setField(term350515, term350515.getClass(), "techFocus", null);
        setField(term350515, term350515.getClass(), "techResearchPoint", null);
        setField(term350515, term350515.getClass(), "race", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addNewRandomTech", argTypes, term350515, args);
    }

};


