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

public class TechList_setTechLevel_14558079563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424420;
     Object term424421;

    public TechList_setTechLevel_14558079563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424420 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        setField(term424420, term424420.getClass(), "techList", null);
        setField(term424420, term424420.getClass(), "techLevels", null);
        setField(term424420, term424420.getClass(), "techFocus", null);
        setField(term424420, term424420.getClass(), "techResearchPoint", null);
        setField(term424420, term424420.getClass(), "race", null);
        term424421 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term424421;
        callMethod(klass, "setTechLevel", argTypes, term424420, args);
    }

};


