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
import java.lang.Object;
import java.lang.String;

public class IntelligenceList_getOwnBonus_5513919806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6193;

    public IntelligenceList_getOwnBonus_5513919806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6217 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term6216 = ((Class) term6217).getDeclaredField((String) "TRADE");
        ((Field) term6216).setAccessible(true);
        Object enum18 = ((Field) term6216).get((Object) null);
        Object term6201 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term6201, term6201.getClass(), "type", enum18);
        setIntField(term6201, term6201.getClass(), "value", 1225272962);
        setField(term6201, term6201.getClass(), "description", "");
        Object term6206 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term6206, term6206.getClass(), "type", enum18);
        setIntField(term6206, term6206.getClass(), "value", 1324040357);
        setField(term6206, term6206.getClass(), "description", "");
        Class<? extends Object> term6534 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term6533 = ((Class) term6534).getDeclaredField((String) "OWN_REALM");
        ((Field) term6533).setAccessible(true);
        Object enum19 = ((Field) term6533).get((Object) null);
        Object term6209 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term6209, term6209.getClass(), "type", enum19);
        setIntField(term6209, term6209.getClass(), "value", -1588772968);
        setField(term6209, term6209.getClass(), "description", "");
        ArrayList term6199 = new ArrayList();
        ((ArrayList) term6199).add(term6201);
        ((ArrayList) term6199).add(term6206);
        ((ArrayList) term6199).add(term6209);
        term6193 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term6193, term6193.getClass(), "playerIndex", 1328271830);
        setIntField(term6193, term6193.getClass(), "intelligenceLevel1Estimate", 1596070772);
        setIntField(term6193, term6193.getClass(), "intelligenceLevel3Estimate", 97029295);
        setIntField(term6193, term6193.getClass(), "intelligenceLevel5Estimate", -1371869594);
        setIntField(term6193, term6193.getClass(), "intelligenceLevel7Estimate", -2095575670);
        setField(term6193, term6193.getClass(), "list", term6199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOwnBonus", argTypes, term6193, args);
    }

};


