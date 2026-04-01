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
import java.lang.Double;

public class TechList_setTechResearchPoints_174161684496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424465;
     Object term424466;

    public TechList_setTechResearchPoints_174161684496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424465 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        setField(term424465, term424465.getClass(), "techList", null);
        setField(term424465, term424465.getClass(), "techLevels", null);
        setField(term424465, term424465.getClass(), "techFocus", null);
        setField(term424465, term424465.getClass(), "techResearchPoint", null);
        setField(term424465, term424465.getClass(), "race", null);
        term424466 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term424466;
        callMethod(klass, "setTechResearchPoints", argTypes, term424465, args);
    }

};


