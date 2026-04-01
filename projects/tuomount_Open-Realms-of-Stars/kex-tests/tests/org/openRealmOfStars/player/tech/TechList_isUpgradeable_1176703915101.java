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

public class TechList_isUpgradeable_1176703915101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424476;

    public TechList_isUpgradeable_1176703915101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424476 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        setField(term424476, term424476.getClass(), "techList", null);
        setField(term424476, term424476.getClass(), "techLevels", null);
        setField(term424476, term424476.getClass(), "techFocus", null);
        setField(term424476, term424476.getClass(), "techResearchPoint", null);
        setField(term424476, term424476.getClass(), "race", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isUpgradeable", argTypes, term424476, args);
    }

};


