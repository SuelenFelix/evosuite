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

public class TechList_getBestEnergySource_113010895874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424433;

    public TechList_getBestEnergySource_113010895874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424433 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        setField(term424433, term424433.getClass(), "techList", null);
        setField(term424433, term424433.getClass(), "techLevels", null);
        setField(term424433, term424433.getClass(), "techFocus", null);
        setField(term424433, term424433.getClass(), "techResearchPoint", null);
        setField(term424433, term424433.getClass(), "race", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBestEnergySource", argTypes, term424433, args);
    }

};


