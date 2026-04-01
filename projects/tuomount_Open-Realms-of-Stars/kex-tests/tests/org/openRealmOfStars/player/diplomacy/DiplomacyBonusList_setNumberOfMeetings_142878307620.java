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
import java.lang.Integer;

public class DiplomacyBonusList_setNumberOfMeetings_142878307620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50785;
     Object term50804;

    public DiplomacyBonusList_setNumberOfMeetings_142878307620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50807 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term50806 = ((Class) term50807).getDeclaredField((String) "SPY_TRADE");
        ((Field) term50806).setAccessible(true);
        Object enum142 = ((Field) term50806).get((Object) null);
        Object term50789 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term50789, term50789.getClass(), "type", enum142);
        setBooleanField(term50789, term50789.getClass(), "onlyOne", false);
        setIntField(term50789, term50789.getClass(), "bonusValue", 1505480070);
        setIntField(term50789, term50789.getClass(), "bonusLasting", -829088844);
        Class<? extends Object> term51121 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term51120 = ((Class) term51121).getDeclaredField((String) "PROMISED_VOTE_NO");
        ((Field) term51120).setAccessible(true);
        Object enum143 = ((Field) term51120).get((Object) null);
        Object term50795 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term50795, term50795.getClass(), "type", enum143);
        setBooleanField(term50795, term50795.getClass(), "onlyOne", true);
        setIntField(term50795, term50795.getClass(), "bonusValue", -31751777);
        setIntField(term50795, term50795.getClass(), "bonusLasting", -246967963);
        ArrayList term50787 = new ArrayList();
        ((ArrayList) term50787).add(term50789);
        ((ArrayList) term50787).add(term50795);
        term50785 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term50785, term50785.getClass(), "playerIndex", -558146961);
        setField(term50785, term50785.getClass(), "list", term50787);
        setIntField(term50785, term50785.getClass(), "numberOfMeetings", -1777140369);
        term50804 = new Integer(993627098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term50804;
        callMethod(klass, "setNumberOfMeetings", argTypes, term50785, args);
    }

};


