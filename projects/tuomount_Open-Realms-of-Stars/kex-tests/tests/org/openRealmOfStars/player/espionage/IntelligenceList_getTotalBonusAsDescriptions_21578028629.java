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

public class IntelligenceList_getTotalBonusAsDescriptions_21578028629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16733;
     Object term16739;

    public IntelligenceList_getTotalBonusAsDescriptions_21578028629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16733 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term16733, term16733.getClass(), "playerIndex", 0);
        setIntField(term16733, term16733.getClass(), "intelligenceLevel1Estimate", 0);
        setIntField(term16733, term16733.getClass(), "intelligenceLevel3Estimate", 0);
        setIntField(term16733, term16733.getClass(), "intelligenceLevel5Estimate", 0);
        setIntField(term16733, term16733.getClass(), "intelligenceLevel7Estimate", 0);
        setField(term16733, term16733.getClass(), "list", null);
        term16739 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term16739;
        callMethod(klass, "getTotalBonusAsDescriptions", argTypes, term16733, args);
    }

};


