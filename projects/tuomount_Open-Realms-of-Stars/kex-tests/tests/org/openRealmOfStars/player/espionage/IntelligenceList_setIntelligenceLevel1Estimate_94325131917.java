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

public class IntelligenceList_setIntelligenceLevel1Estimate_94325131917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14966;
     Object term14981;

    public IntelligenceList_setIntelligenceLevel1Estimate_94325131917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14984 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term14983 = ((Class) term14984).getDeclaredField((String) "TRADE");
        ((Field) term14983).setAccessible(true);
        Object enum44 = ((Field) term14983).get((Object) null);
        Object term14974 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term14974, term14974.getClass(), "type", enum44);
        setIntField(term14974, term14974.getClass(), "value", 1830648570);
        setField(term14974, term14974.getClass(), "description", "");
        ArrayList term14972 = new ArrayList();
        ((ArrayList) term14972).add(term14974);
        term14966 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term14966, term14966.getClass(), "playerIndex", 98922530);
        setIntField(term14966, term14966.getClass(), "intelligenceLevel1Estimate", -1388471422);
        setIntField(term14966, term14966.getClass(), "intelligenceLevel3Estimate", -1498296052);
        setIntField(term14966, term14966.getClass(), "intelligenceLevel5Estimate", 2098647989);
        setIntField(term14966, term14966.getClass(), "intelligenceLevel7Estimate", 1598895173);
        setField(term14966, term14966.getClass(), "list", term14972);
        term14981 = new Integer(-227365013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term14981;
        callMethod(klass, "setIntelligenceLevel1Estimate", argTypes, term14966, args);
    }

};


