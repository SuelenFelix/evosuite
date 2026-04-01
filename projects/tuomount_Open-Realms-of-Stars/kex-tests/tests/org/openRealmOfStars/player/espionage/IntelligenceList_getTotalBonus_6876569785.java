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

public class IntelligenceList_getTotalBonus_6876569785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4525;

    public IntelligenceList_getTotalBonus_6876569785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4567 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term4566 = ((Class) term4567).getDeclaredField((String) "TRADE");
        ((Field) term4566).setAccessible(true);
        Object enum13 = ((Field) term4566).get((Object) null);
        Object term4533 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term4533, term4533.getClass(), "type", enum13);
        setIntField(term4533, term4533.getClass(), "value", -1786399638);
        setField(term4533, term4533.getClass(), "description", "");
        Class<? extends Object> term4884 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term4883 = ((Class) term4884).getDeclaredField((String) "TRADE");
        ((Field) term4883).setAccessible(true);
        Object enum14 = ((Field) term4883).get((Object) null);
        Object term4538 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term4538, term4538.getClass(), "type", enum14);
        setIntField(term4538, term4538.getClass(), "value", 2055867847);
        setField(term4538, term4538.getClass(), "description", "");
        Class<? extends Object> term5201 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term5200 = ((Class) term5201).getDeclaredField((String) "CHATTERBOX");
        ((Field) term5200).setAccessible(true);
        Object enum15 = ((Field) term5200).get((Object) null);
        Object term4543 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term4543, term4543.getClass(), "type", enum15);
        setIntField(term4543, term4543.getClass(), "value", -1048298087);
        setField(term4543, term4543.getClass(), "description", "");
        Class<? extends Object> term5533 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term5532 = ((Class) term5533).getDeclaredField((String) "NEGOTIATOR");
        ((Field) term5532).setAccessible(true);
        Object enum16 = ((Field) term5532).get((Object) null);
        Object term4548 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term4548, term4548.getClass(), "type", enum16);
        setIntField(term4548, term4548.getClass(), "value", 292681826);
        setField(term4548, term4548.getClass(), "description", "");
        Class<? extends Object> term5865 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term5864 = ((Class) term5865).getDeclaredField((String) "OWN_REALM");
        ((Field) term5864).setAccessible(true);
        Object enum17 = ((Field) term5864).get((Object) null);
        Object term4553 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term4553, term4553.getClass(), "type", enum17);
        setIntField(term4553, term4553.getClass(), "value", 458147407);
        setField(term4553, term4553.getClass(), "description", "");
        Object term4558 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term4558, term4558.getClass(), "type", enum16);
        setIntField(term4558, term4558.getClass(), "value", -184153539);
        setField(term4558, term4558.getClass(), "description", "");
        Object term4561 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term4561, term4561.getClass(), "type", enum15);
        setIntField(term4561, term4561.getClass(), "value", 493620644);
        setField(term4561, term4561.getClass(), "description", "");
        ArrayList term4531 = new ArrayList();
        ((ArrayList) term4531).add(term4533);
        ((ArrayList) term4531).add(term4538);
        ((ArrayList) term4531).add(term4543);
        ((ArrayList) term4531).add(term4548);
        ((ArrayList) term4531).add(term4553);
        ((ArrayList) term4531).add(term4558);
        ((ArrayList) term4531).add(term4561);
        term4525 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term4525, term4525.getClass(), "playerIndex", -1968847291);
        setIntField(term4525, term4525.getClass(), "intelligenceLevel1Estimate", 579005622);
        setIntField(term4525, term4525.getClass(), "intelligenceLevel3Estimate", -14890619);
        setIntField(term4525, term4525.getClass(), "intelligenceLevel5Estimate", 1632125673);
        setIntField(term4525, term4525.getClass(), "intelligenceLevel7Estimate", 454281060);
        setField(term4525, term4525.getClass(), "list", term4531);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBonus", argTypes, term4525, args);
    }

};


