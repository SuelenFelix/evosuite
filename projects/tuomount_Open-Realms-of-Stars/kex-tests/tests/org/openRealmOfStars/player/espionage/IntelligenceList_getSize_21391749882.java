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

public class IntelligenceList_getSize_21391749882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1087;

    public IntelligenceList_getSize_21391749882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1116 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term1115 = ((Class) term1116).getDeclaredField((String) "NEGOTIATOR");
        ((Field) term1115).setAccessible(true);
        Object enum3 = ((Field) term1115).get((Object) null);
        Object term1095 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term1095, term1095.getClass(), "type", enum3);
        setIntField(term1095, term1095.getClass(), "value", -1685132342);
        setField(term1095, term1095.getClass(), "description", "");
        Object term1100 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term1100, term1100.getClass(), "type", enum3);
        setIntField(term1100, term1100.getClass(), "value", -1456670397);
        setField(term1100, term1100.getClass(), "description", "");
        Class<? extends Object> term1448 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term1447 = ((Class) term1448).getDeclaredField((String) "OWN_REALM");
        ((Field) term1447).setAccessible(true);
        Object enum4 = ((Field) term1447).get((Object) null);
        Object term1103 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term1103, term1103.getClass(), "type", enum4);
        setIntField(term1103, term1103.getClass(), "value", 1622346318);
        setField(term1103, term1103.getClass(), "description", "");
        Class<? extends Object> term1777 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term1776 = ((Class) term1777).getDeclaredField((String) "OWN_REALM");
        ((Field) term1776).setAccessible(true);
        Object enum5 = ((Field) term1776).get((Object) null);
        Object term1108 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term1108, term1108.getClass(), "type", enum5);
        setIntField(term1108, term1108.getClass(), "value", 1048535127);
        setField(term1108, term1108.getClass(), "description", "");
        ArrayList term1093 = new ArrayList();
        ((ArrayList) term1093).add(term1095);
        ((ArrayList) term1093).add(term1100);
        ((ArrayList) term1093).add(term1103);
        ((ArrayList) term1093).add(term1108);
        term1087 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term1087, term1087.getClass(), "playerIndex", -522618178);
        setIntField(term1087, term1087.getClass(), "intelligenceLevel1Estimate", 1134449235);
        setIntField(term1087, term1087.getClass(), "intelligenceLevel3Estimate", -883034806);
        setIntField(term1087, term1087.getClass(), "intelligenceLevel5Estimate", 1585847225);
        setIntField(term1087, term1087.getClass(), "intelligenceLevel7Estimate", 597278769);
        setField(term1087, term1087.getClass(), "list", term1093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSize", argTypes, term1087, args);
    }

};


