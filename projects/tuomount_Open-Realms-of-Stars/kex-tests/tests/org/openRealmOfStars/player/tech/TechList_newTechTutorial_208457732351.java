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

public class TechList_newTechTutorial_208457732351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410550;

    public TechList_newTechTutorial_208457732351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term410550 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        setField(term410550, term410550.getClass(), "techList", null);
        setField(term410550, term410550.getClass(), "techLevels", null);
        setField(term410550, term410550.getClass(), "techFocus", null);
        setField(term410550, term410550.getClass(), "techResearchPoint", null);
        setField(term410550, term410550.getClass(), "race", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.tech.Tech");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "newTechTutorial", argTypes, term410550, args);
    }

};


