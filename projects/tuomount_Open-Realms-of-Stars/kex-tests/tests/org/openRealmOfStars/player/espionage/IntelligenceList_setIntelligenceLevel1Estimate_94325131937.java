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

public class IntelligenceList_setIntelligenceLevel1Estimate_94325131937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16789;
     Object term16795;

    public IntelligenceList_setIntelligenceLevel1Estimate_94325131937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16789 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term16789, term16789.getClass(), "playerIndex", 0);
        setIntField(term16789, term16789.getClass(), "intelligenceLevel1Estimate", 0);
        setIntField(term16789, term16789.getClass(), "intelligenceLevel3Estimate", 0);
        setIntField(term16789, term16789.getClass(), "intelligenceLevel5Estimate", 0);
        setIntField(term16789, term16789.getClass(), "intelligenceLevel7Estimate", 0);
        setField(term16789, term16789.getClass(), "list", null);
        term16795 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term16795;
        callMethod(klass, "setIntelligenceLevel1Estimate", argTypes, term16789, args);
    }

};


