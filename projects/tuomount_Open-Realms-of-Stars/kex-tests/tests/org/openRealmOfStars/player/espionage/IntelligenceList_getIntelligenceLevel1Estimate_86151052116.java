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

public class IntelligenceList_getIntelligenceLevel1Estimate_86151052116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13963;

    public IntelligenceList_getIntelligenceLevel1Estimate_86151052116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13989 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term13988 = ((Class) term13989).getDeclaredField((String) "TRADE");
        ((Field) term13988).setAccessible(true);
        Object enum41 = ((Field) term13988).get((Object) null);
        Object term13971 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term13971, term13971.getClass(), "type", enum41);
        setIntField(term13971, term13971.getClass(), "value", 158873461);
        setField(term13971, term13971.getClass(), "description", "");
        Class<? extends Object> term14306 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term14305 = ((Class) term14306).getDeclaredField((String) "NEGOTIATOR");
        ((Field) term14305).setAccessible(true);
        Object enum42 = ((Field) term14305).get((Object) null);
        Object term13976 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term13976, term13976.getClass(), "type", enum42);
        setIntField(term13976, term13976.getClass(), "value", -430151637);
        setField(term13976, term13976.getClass(), "description", "");
        Class<? extends Object> term14638 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term14637 = ((Class) term14638).getDeclaredField((String) "SPY_FLEET");
        ((Field) term14637).setAccessible(true);
        Object enum43 = ((Field) term14637).get((Object) null);
        Object term13981 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term13981, term13981.getClass(), "type", enum43);
        setIntField(term13981, term13981.getClass(), "value", -1697741339);
        setField(term13981, term13981.getClass(), "description", "");
        ArrayList term13969 = new ArrayList();
        ((ArrayList) term13969).add(term13971);
        ((ArrayList) term13969).add(term13976);
        ((ArrayList) term13969).add(term13981);
        term13963 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term13963, term13963.getClass(), "playerIndex", 344323424);
        setIntField(term13963, term13963.getClass(), "intelligenceLevel1Estimate", 9726679);
        setIntField(term13963, term13963.getClass(), "intelligenceLevel3Estimate", -25637976);
        setIntField(term13963, term13963.getClass(), "intelligenceLevel5Estimate", 1555897383);
        setIntField(term13963, term13963.getClass(), "intelligenceLevel7Estimate", 202001407);
        setField(term13963, term13963.getClass(), "list", term13969);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntelligenceLevel1Estimate", argTypes, term13963, args);
    }

};


