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
import java.lang.Integer;

public class IntelligenceList_setIntelligenceLevel3Estimate_24218674115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13280;
     Object term13300;

    public IntelligenceList_setIntelligenceLevel3Estimate_24218674115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13303 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term13302 = ((Class) term13303).getDeclaredField((String) "NEGOTIATOR");
        ((Field) term13302).setAccessible(true);
        Object enum39 = ((Field) term13302).get((Object) null);
        Object term13288 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term13288, term13288.getClass(), "type", enum39);
        setIntField(term13288, term13288.getClass(), "value", -1222006000);
        setField(term13288, term13288.getClass(), "description", "");
        Class<? extends Object> term13635 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term13634 = ((Class) term13635).getDeclaredField((String) "OWN_REALM");
        ((Field) term13634).setAccessible(true);
        Object enum40 = ((Field) term13634).get((Object) null);
        Object term13293 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term13293, term13293.getClass(), "type", enum40);
        setIntField(term13293, term13293.getClass(), "value", 2095798786);
        setField(term13293, term13293.getClass(), "description", "");
        ArrayList term13286 = new ArrayList();
        ((ArrayList) term13286).add(term13288);
        ((ArrayList) term13286).add(term13293);
        term13280 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term13280, term13280.getClass(), "playerIndex", -1963464809);
        setIntField(term13280, term13280.getClass(), "intelligenceLevel1Estimate", 71190297);
        setIntField(term13280, term13280.getClass(), "intelligenceLevel3Estimate", 1202361360);
        setIntField(term13280, term13280.getClass(), "intelligenceLevel5Estimate", -2015048153);
        setIntField(term13280, term13280.getClass(), "intelligenceLevel7Estimate", -2063457669);
        setField(term13280, term13280.getClass(), "list", term13286);
        term13300 = new Integer(-1565502840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13300;
        callMethod(klass, "setIntelligenceLevel3Estimate", argTypes, term13280, args);
    }

};


