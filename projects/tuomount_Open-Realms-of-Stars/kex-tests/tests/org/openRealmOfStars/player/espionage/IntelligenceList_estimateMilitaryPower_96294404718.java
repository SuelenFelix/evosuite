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
import java.util.ArrayList;
import java.lang.Integer;

public class IntelligenceList_estimateMilitaryPower_96294404718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15300;
     Object term15310;

    public IntelligenceList_estimateMilitaryPower_96294404718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term15306 = new ArrayList();
        term15300 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term15300, term15300.getClass(), "playerIndex", 11724947);
        setIntField(term15300, term15300.getClass(), "intelligenceLevel1Estimate", 1953277050);
        setIntField(term15300, term15300.getClass(), "intelligenceLevel3Estimate", 1283079251);
        setIntField(term15300, term15300.getClass(), "intelligenceLevel5Estimate", -523949691);
        setIntField(term15300, term15300.getClass(), "intelligenceLevel7Estimate", 1398204340);
        setField(term15300, term15300.getClass(), "list", term15306);
        term15310 = new Integer(229204365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term15310;
        callMethod(klass, "estimateMilitaryPower", argTypes, term15300, args);
    }

};


