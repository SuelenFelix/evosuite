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

public class IntelligenceList_getPlayerIndex_5451877040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public IntelligenceList_getPlayerIndex_5451877040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term96 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term95 = ((Class) term96).getDeclaredField((String) "SPY_FLEET");
        ((Field) term95).setAccessible(true);
        Object enum0 = ((Field) term95).get((Object) null);
        Object term9 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term9, term9.getClass(), "type", enum0);
        setIntField(term9, term9.getClass(), "value", -616727354);
        setField(term9, term9.getClass(), "description", "");
        Class<? extends Object> term425 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term424 = ((Class) term425).getDeclaredField((String) "SPY_FLEET");
        ((Field) term424).setAccessible(true);
        Object enum1 = ((Field) term424).get((Object) null);
        Object term14 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term14, term14.getClass(), "type", enum1);
        setIntField(term14, term14.getClass(), "value", -1955890973);
        setField(term14, term14.getClass(), "description", "");
        Class<? extends Object> term754 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term753 = ((Class) term754).getDeclaredField((String) "CHATTERBOX");
        ((Field) term753).setAccessible(true);
        Object enum2 = ((Field) term753).get((Object) null);
        Object term19 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term19, term19.getClass(), "type", enum2);
        setIntField(term19, term19.getClass(), "value", -2038273078);
        setField(term19, term19.getClass(), "description", "");
        Object term24 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term24, term24.getClass(), "type", enum2);
        setIntField(term24, term24.getClass(), "value", 1227103734);
        setField(term24, term24.getClass(), "description", "");
        Object term27 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term27, term27.getClass(), "type", enum1);
        setIntField(term27, term27.getClass(), "value", -1339778481);
        setField(term27, term27.getClass(), "description", "");
        ArrayList term7 = new ArrayList();
        ((ArrayList) term7).add(term9);
        ((ArrayList) term7).add(term14);
        ((ArrayList) term7).add(term19);
        ((ArrayList) term7).add(term24);
        ((ArrayList) term7).add(term27);
        term1 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term1, term1.getClass(), "playerIndex", 568599855);
        setIntField(term1, term1.getClass(), "intelligenceLevel1Estimate", 1162663216);
        setIntField(term1, term1.getClass(), "intelligenceLevel3Estimate", 1484323161);
        setIntField(term1, term1.getClass(), "intelligenceLevel5Estimate", 391863371);
        setIntField(term1, term1.getClass(), "intelligenceLevel7Estimate", -1922583790);
        setField(term1, term1.getClass(), "list", term7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerIndex", argTypes, term1, args);
    }

};


