package org.openRealmOfStars.player.diplomacy;

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
import static org.openRealmOfStars.player.diplomacy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class DiplomacyBonusList_addBonus_201406469917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46471;
     Object term46484;

    public DiplomacyBonusList_addBonus_201406469917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46507 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term46506 = ((Class) term46507).getDeclaredField((String) "IN_WAR");
        ((Field) term46506).setAccessible(true);
        Object enum129 = ((Field) term46506).get((Object) null);
        Object term46475 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term46475, term46475.getClass(), "type", enum129);
        setBooleanField(term46475, term46475.getClass(), "onlyOne", false);
        setIntField(term46475, term46475.getClass(), "bonusValue", -1698809299);
        setIntField(term46475, term46475.getClass(), "bonusLasting", 401512128);
        ArrayList term46473 = new ArrayList();
        ((ArrayList) term46473).add(term46475);
        term46471 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term46471, term46471.getClass(), "playerIndex", -752870423);
        setField(term46471, term46471.getClass(), "list", term46473);
        setIntField(term46471, term46471.getClass(), "numberOfMeetings", -2069930777);
        Class<? extends Object> term46812 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term46811 = ((Class) term46812).getDeclaredField((String) "BORDER_CROSSED");
        ((Field) term46811).setAccessible(true);
        Object enum130 = ((Field) term46811).get((Object) null);
        term46484 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term46484, term46484.getClass(), "type", enum130);
        setBooleanField(term46484, term46484.getClass(), "onlyOne", true);
        setIntField(term46484, term46484.getClass(), "bonusValue", 1543696412);
        setIntField(term46484, term46484.getClass(), "bonusLasting", -1385748168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus");
        Object[] args = new Object[1];
        args[0] = term46484;
        callMethod(klass, "addBonus", argTypes, term46471, args);
    }

};


