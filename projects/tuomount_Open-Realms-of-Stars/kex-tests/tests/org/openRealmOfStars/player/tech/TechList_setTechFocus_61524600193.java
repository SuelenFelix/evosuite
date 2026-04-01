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

public class TechList_setTechFocus_61524600193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424460;
     Object term424461;

    public TechList_setTechFocus_61524600193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424460 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        setField(term424460, term424460.getClass(), "techList", null);
        setField(term424460, term424460.getClass(), "techLevels", null);
        setField(term424460, term424460.getClass(), "techFocus", null);
        setField(term424460, term424460.getClass(), "techResearchPoint", null);
        setField(term424460, term424460.getClass(), "race", null);
        term424461 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term424461;
        callMethod(klass, "setTechFocus", argTypes, term424460, args);
    }

};


