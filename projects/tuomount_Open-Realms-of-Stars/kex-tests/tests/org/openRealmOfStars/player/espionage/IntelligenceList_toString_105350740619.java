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

public class IntelligenceList_toString_105350740619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15312;

    public IntelligenceList_toString_105350740619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15358 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term15357 = ((Class) term15358).getDeclaredField((String) "SPY_FLEET");
        ((Field) term15357).setAccessible(true);
        Object enum45 = ((Field) term15357).get((Object) null);
        Object term15320 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term15320, term15320.getClass(), "type", enum45);
        setIntField(term15320, term15320.getClass(), "value", 1296895584);
        setField(term15320, term15320.getClass(), "description", "");
        Class<? extends Object> term15687 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term15686 = ((Class) term15687).getDeclaredField((String) "OWN_REALM");
        ((Field) term15686).setAccessible(true);
        Object enum46 = ((Field) term15686).get((Object) null);
        Object term15325 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term15325, term15325.getClass(), "type", enum46);
        setIntField(term15325, term15325.getClass(), "value", 628918458);
        setField(term15325, term15325.getClass(), "description", "");
        Object term15330 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term15330, term15330.getClass(), "type", enum46);
        setIntField(term15330, term15330.getClass(), "value", -1274456137);
        setField(term15330, term15330.getClass(), "description", "");
        Class<? extends Object> term16016 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term16015 = ((Class) term16016).getDeclaredField((String) "NEGOTIATOR");
        ((Field) term16015).setAccessible(true);
        Object enum47 = ((Field) term16015).get((Object) null);
        Object term15333 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term15333, term15333.getClass(), "type", enum47);
        setIntField(term15333, term15333.getClass(), "value", 1041916673);
        setField(term15333, term15333.getClass(), "description", "");
        Class<? extends Object> term16348 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term16347 = ((Class) term16348).getDeclaredField((String) "CHATTERBOX");
        ((Field) term16347).setAccessible(true);
        Object enum48 = ((Field) term16347).get((Object) null);
        Object term15338 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term15338, term15338.getClass(), "type", enum48);
        setIntField(term15338, term15338.getClass(), "value", -601863069);
        setField(term15338, term15338.getClass(), "description", "");
        Object term15343 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term15343, term15343.getClass(), "type", enum48);
        setIntField(term15343, term15343.getClass(), "value", 663292551);
        setField(term15343, term15343.getClass(), "description", "");
        Object term15346 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term15346, term15346.getClass(), "type", enum48);
        setIntField(term15346, term15346.getClass(), "value", -1885090354);
        setField(term15346, term15346.getClass(), "description", "");
        Object term15349 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term15349, term15349.getClass(), "type", enum46);
        setIntField(term15349, term15349.getClass(), "value", -2066804303);
        setField(term15349, term15349.getClass(), "description", "");
        Object term15352 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term15352, term15352.getClass(), "type", enum45);
        setIntField(term15352, term15352.getClass(), "value", -1731761810);
        setField(term15352, term15352.getClass(), "description", "");
        ArrayList term15318 = new ArrayList();
        ((ArrayList) term15318).add(term15320);
        ((ArrayList) term15318).add(term15325);
        ((ArrayList) term15318).add(term15330);
        ((ArrayList) term15318).add(term15333);
        ((ArrayList) term15318).add(term15338);
        ((ArrayList) term15318).add(term15343);
        ((ArrayList) term15318).add(term15346);
        ((ArrayList) term15318).add(term15349);
        ((ArrayList) term15318).add(term15352);
        term15312 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term15312, term15312.getClass(), "playerIndex", -461771056);
        setIntField(term15312, term15312.getClass(), "intelligenceLevel1Estimate", -243422082);
        setIntField(term15312, term15312.getClass(), "intelligenceLevel3Estimate", 1384592638);
        setIntField(term15312, term15312.getClass(), "intelligenceLevel5Estimate", -1002370457);
        setIntField(term15312, term15312.getClass(), "intelligenceLevel7Estimate", -2014576105);
        setField(term15312, term15312.getClass(), "list", term15318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term15312, args);
    }

};


