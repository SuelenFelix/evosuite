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
import java.lang.Integer;

public class IntelligenceList_addIntelligenceBonus_188793807223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16693;
     Object term16699;

    public IntelligenceList_addIntelligenceBonus_188793807223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16693 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term16693, term16693.getClass(), "playerIndex", 0);
        setIntField(term16693, term16693.getClass(), "intelligenceLevel1Estimate", 0);
        setIntField(term16693, term16693.getClass(), "intelligenceLevel3Estimate", 0);
        setIntField(term16693, term16693.getClass(), "intelligenceLevel5Estimate", 0);
        setIntField(term16693, term16693.getClass(), "intelligenceLevel7Estimate", 0);
        setField(term16693, term16693.getClass(), "list", null);
        term16699 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term16699;
        args[2] = null;
        callMethod(klass, "addIntelligenceBonus", argTypes, term16693, args);
    }

};


