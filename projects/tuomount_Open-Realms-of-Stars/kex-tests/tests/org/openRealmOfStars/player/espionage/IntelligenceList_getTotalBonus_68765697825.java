package org.openRealmOfStars.player.espionage;

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
import static org.openRealmOfStars.player.espionage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IntelligenceList_getTotalBonus_68765697825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16709;

    public IntelligenceList_getTotalBonus_68765697825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16709 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term16709, term16709.getClass(), "playerIndex", 0);
        setIntField(term16709, term16709.getClass(), "intelligenceLevel1Estimate", 0);
        setIntField(term16709, term16709.getClass(), "intelligenceLevel3Estimate", 0);
        setIntField(term16709, term16709.getClass(), "intelligenceLevel5Estimate", 0);
        setIntField(term16709, term16709.getClass(), "intelligenceLevel7Estimate", 0);
        setField(term16709, term16709.getClass(), "list", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBonus", argTypes, term16709, args);
    }

};


