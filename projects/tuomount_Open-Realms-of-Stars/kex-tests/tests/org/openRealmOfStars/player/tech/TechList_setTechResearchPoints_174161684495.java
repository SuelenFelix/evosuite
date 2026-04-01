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

public class TechList_setTechResearchPoints_174161684495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3314968;
     Object term3314969;

    public TechList_setTechResearchPoints_174161684495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3314968 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        setField(term3314968, term3314968.getClass(), "techList", null);
        setField(term3314968, term3314968.getClass(), "techLevels", null);
        setField(term3314968, term3314968.getClass(), "techFocus", null);
        setField(term3314968, term3314968.getClass(), "techResearchPoint", null);
        setField(term3314968, term3314968.getClass(), "race", null);
        term3314969 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3314969;
        callMethod(klass, "setTechResearchPoints", argTypes, term3314968, args);
    }

};


