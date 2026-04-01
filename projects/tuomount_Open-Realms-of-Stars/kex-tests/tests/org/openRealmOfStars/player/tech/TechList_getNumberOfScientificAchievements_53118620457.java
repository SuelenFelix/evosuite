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

public class TechList_getNumberOfScientificAchievements_53118620457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424415;

    public TechList_getNumberOfScientificAchievements_53118620457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424415 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        setField(term424415, term424415.getClass(), "techList", null);
        setField(term424415, term424415.getClass(), "techLevels", null);
        setField(term424415, term424415.getClass(), "techFocus", null);
        setField(term424415, term424415.getClass(), "techResearchPoint", null);
        setField(term424415, term424415.getClass(), "race", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumberOfScientificAchievements", argTypes, term424415, args);
    }

};


