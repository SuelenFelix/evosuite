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

public class TechList_getBestStarbaseFleetCap_212832006685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424444;

    public TechList_getBestStarbaseFleetCap_212832006685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424444 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        setField(term424444, term424444.getClass(), "techList", null);
        setField(term424444, term424444.getClass(), "techLevels", null);
        setField(term424444, term424444.getClass(), "techFocus", null);
        setField(term424444, term424444.getClass(), "techResearchPoint", null);
        setField(term424444, term424444.getClass(), "race", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBestStarbaseFleetCap", argTypes, term424444, args);
    }

};


