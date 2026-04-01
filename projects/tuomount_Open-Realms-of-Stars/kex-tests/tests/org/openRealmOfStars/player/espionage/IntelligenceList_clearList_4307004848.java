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

public class IntelligenceList_clearList_4307004848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7199;

    public IntelligenceList_clearList_4307004848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7220 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term7219 = ((Class) term7220).getDeclaredField((String) "TRADE");
        ((Field) term7219).setAccessible(true);
        Object enum21 = ((Field) term7219).get((Object) null);
        Object term7207 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term7207, term7207.getClass(), "type", enum21);
        setIntField(term7207, term7207.getClass(), "value", 1063420942);
        setField(term7207, term7207.getClass(), "description", "");
        Class<? extends Object> term7537 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term7536 = ((Class) term7537).getDeclaredField((String) "TRADE");
        ((Field) term7536).setAccessible(true);
        Object enum22 = ((Field) term7536).get((Object) null);
        Object term7212 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term7212, term7212.getClass(), "type", enum22);
        setIntField(term7212, term7212.getClass(), "value", 1375330971);
        setField(term7212, term7212.getClass(), "description", "");
        ArrayList term7205 = new ArrayList();
        ((ArrayList) term7205).add(term7207);
        ((ArrayList) term7205).add(term7212);
        term7199 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term7199, term7199.getClass(), "playerIndex", 1540719661);
        setIntField(term7199, term7199.getClass(), "intelligenceLevel1Estimate", 1265463001);
        setIntField(term7199, term7199.getClass(), "intelligenceLevel3Estimate", 335112684);
        setIntField(term7199, term7199.getClass(), "intelligenceLevel5Estimate", 1551099402);
        setIntField(term7199, term7199.getClass(), "intelligenceLevel7Estimate", -2027534003);
        setField(term7199, term7199.getClass(), "list", term7205);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearList", argTypes, term7199, args);
    }

};


