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

public class IntelligenceList_getIntelligence_4999654554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3150;
     Object term3195;

    public IntelligenceList_getIntelligence_4999654554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3198 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term3197 = ((Class) term3198).getDeclaredField((String) "NEGOTIATOR");
        ((Field) term3197).setAccessible(true);
        Object enum9 = ((Field) term3197).get((Object) null);
        Object term3158 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term3158, term3158.getClass(), "type", enum9);
        setIntField(term3158, term3158.getClass(), "value", -469968304);
        setField(term3158, term3158.getClass(), "description", "");
        Class<? extends Object> term3530 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term3529 = ((Class) term3530).getDeclaredField((String) "NEGOTIATOR");
        ((Field) term3529).setAccessible(true);
        Object enum10 = ((Field) term3529).get((Object) null);
        Object term3163 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term3163, term3163.getClass(), "type", enum10);
        setIntField(term3163, term3163.getClass(), "value", -1145578966);
        setField(term3163, term3163.getClass(), "description", "");
        Object term3168 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term3168, term3168.getClass(), "type", enum10);
        setIntField(term3168, term3168.getClass(), "value", 679763016);
        setField(term3168, term3168.getClass(), "description", "");
        Class<? extends Object> term3862 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term3861 = ((Class) term3862).getDeclaredField((String) "CHATTERBOX");
        ((Field) term3861).setAccessible(true);
        Object enum11 = ((Field) term3861).get((Object) null);
        Object term3171 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term3171, term3171.getClass(), "type", enum11);
        setIntField(term3171, term3171.getClass(), "value", 1962444399);
        setField(term3171, term3171.getClass(), "description", "");
        Object term3176 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term3176, term3176.getClass(), "type", enum10);
        setIntField(term3176, term3176.getClass(), "value", 767834723);
        setField(term3176, term3176.getClass(), "description", "");
        Object term3179 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term3179, term3179.getClass(), "type", enum10);
        setIntField(term3179, term3179.getClass(), "value", -602026508);
        setField(term3179, term3179.getClass(), "description", "");
        Class<? extends Object> term4194 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term4193 = ((Class) term4194).getDeclaredField((String) "NEGOTIATOR");
        ((Field) term4193).setAccessible(true);
        Object enum12 = ((Field) term4193).get((Object) null);
        Object term3182 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term3182, term3182.getClass(), "type", enum12);
        setIntField(term3182, term3182.getClass(), "value", -157887805);
        setField(term3182, term3182.getClass(), "description", "");
        Object term3187 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term3187, term3187.getClass(), "type", enum12);
        setIntField(term3187, term3187.getClass(), "value", 1876565163);
        setField(term3187, term3187.getClass(), "description", "");
        Object term3190 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term3190, term3190.getClass(), "type", enum12);
        setIntField(term3190, term3190.getClass(), "value", -817164822);
        setField(term3190, term3190.getClass(), "description", "");
        ArrayList term3156 = new ArrayList();
        ((ArrayList) term3156).add(term3158);
        ((ArrayList) term3156).add(term3163);
        ((ArrayList) term3156).add(term3168);
        ((ArrayList) term3156).add(term3171);
        ((ArrayList) term3156).add(term3176);
        ((ArrayList) term3156).add(term3179);
        ((ArrayList) term3156).add(term3182);
        ((ArrayList) term3156).add(term3187);
        ((ArrayList) term3156).add(term3190);
        term3150 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term3150, term3150.getClass(), "playerIndex", -73683645);
        setIntField(term3150, term3150.getClass(), "intelligenceLevel1Estimate", -226514366);
        setIntField(term3150, term3150.getClass(), "intelligenceLevel3Estimate", 1193880199);
        setIntField(term3150, term3150.getClass(), "intelligenceLevel5Estimate", -1087774327);
        setIntField(term3150, term3150.getClass(), "intelligenceLevel7Estimate", -1530420153);
        setField(term3150, term3150.getClass(), "list", term3156);
        term3195 = new Integer(-1016503459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3195;
        callMethod(klass, "getIntelligence", argTypes, term3150, args);
    }

};


