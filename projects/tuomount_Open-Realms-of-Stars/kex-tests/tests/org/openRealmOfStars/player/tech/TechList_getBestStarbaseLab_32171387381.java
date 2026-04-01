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

public class TechList_getBestStarbaseLab_32171387381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3314944;

    public TechList_getBestStarbaseLab_32171387381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3314944 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        setField(term3314944, term3314944.getClass(), "techList", null);
        setField(term3314944, term3314944.getClass(), "techLevels", null);
        setField(term3314944, term3314944.getClass(), "techFocus", null);
        setField(term3314944, term3314944.getClass(), "techResearchPoint", null);
        setField(term3314944, term3314944.getClass(), "race", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBestStarbaseLab", argTypes, term3314944, args);
    }

};


