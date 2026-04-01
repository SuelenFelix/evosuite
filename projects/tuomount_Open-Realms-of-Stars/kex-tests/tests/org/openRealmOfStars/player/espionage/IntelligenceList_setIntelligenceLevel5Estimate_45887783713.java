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

public class IntelligenceList_setIntelligenceLevel5Estimate_45887783713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11254;
     Object term11279;

    public IntelligenceList_setIntelligenceLevel5Estimate_45887783713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11282 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term11281 = ((Class) term11282).getDeclaredField((String) "CHATTERBOX");
        ((Field) term11281).setAccessible(true);
        Object enum33 = ((Field) term11281).get((Object) null);
        Object term11262 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term11262, term11262.getClass(), "type", enum33);
        setIntField(term11262, term11262.getClass(), "value", 1861318859);
        setField(term11262, term11262.getClass(), "description", "");
        Class<? extends Object> term11614 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term11613 = ((Class) term11614).getDeclaredField((String) "CHATTERBOX");
        ((Field) term11613).setAccessible(true);
        Object enum34 = ((Field) term11613).get((Object) null);
        Object term11267 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term11267, term11267.getClass(), "type", enum34);
        setIntField(term11267, term11267.getClass(), "value", 1474524152);
        setField(term11267, term11267.getClass(), "description", "");
        Class<? extends Object> term11946 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term11945 = ((Class) term11946).getDeclaredField((String) "OWN_REALM");
        ((Field) term11945).setAccessible(true);
        Object enum35 = ((Field) term11945).get((Object) null);
        Object term11272 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term11272, term11272.getClass(), "type", enum35);
        setIntField(term11272, term11272.getClass(), "value", 568954359);
        setField(term11272, term11272.getClass(), "description", "");
        ArrayList term11260 = new ArrayList();
        ((ArrayList) term11260).add(term11262);
        ((ArrayList) term11260).add(term11267);
        ((ArrayList) term11260).add(term11272);
        term11254 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term11254, term11254.getClass(), "playerIndex", -1963434938);
        setIntField(term11254, term11254.getClass(), "intelligenceLevel1Estimate", 906181092);
        setIntField(term11254, term11254.getClass(), "intelligenceLevel3Estimate", 1045657203);
        setIntField(term11254, term11254.getClass(), "intelligenceLevel5Estimate", 1386130016);
        setIntField(term11254, term11254.getClass(), "intelligenceLevel7Estimate", 1072005683);
        setField(term11254, term11254.getClass(), "list", term11260);
        term11279 = new Integer(53410913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term11279;
        callMethod(klass, "setIntelligenceLevel5Estimate", argTypes, term11254, args);
    }

};


