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

public class IntelligenceList_getIntelligenceLevel3Estimate_16044594334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16769;

    public IntelligenceList_getIntelligenceLevel3Estimate_16044594334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16769 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term16769, term16769.getClass(), "playerIndex", 0);
        setIntField(term16769, term16769.getClass(), "intelligenceLevel1Estimate", 0);
        setIntField(term16769, term16769.getClass(), "intelligenceLevel3Estimate", 0);
        setIntField(term16769, term16769.getClass(), "intelligenceLevel5Estimate", 0);
        setIntField(term16769, term16769.getClass(), "intelligenceLevel7Estimate", 0);
        setField(term16769, term16769.getClass(), "list", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntelligenceLevel3Estimate", argTypes, term16769, args);
    }

};


