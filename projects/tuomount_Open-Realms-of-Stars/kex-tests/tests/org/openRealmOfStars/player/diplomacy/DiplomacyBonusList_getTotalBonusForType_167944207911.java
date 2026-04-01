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

public class DiplomacyBonusList_getTotalBonusForType_167944207911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36207;
     Object enum99;

    public DiplomacyBonusList_getTotalBonusForType_167944207911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36247 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term36246 = ((Class) term36247).getDeclaredField((String) "EMBARGO");
        ((Field) term36246).setAccessible(true);
        Object enum98 = ((Field) term36246).get((Object) null);
        Object term36211 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term36211, term36211.getClass(), "type", enum98);
        setBooleanField(term36211, term36211.getClass(), "onlyOne", true);
        setIntField(term36211, term36211.getClass(), "bonusValue", 612177768);
        setIntField(term36211, term36211.getClass(), "bonusLasting", -1626451656);
        ArrayList term36209 = new ArrayList();
        ((ArrayList) term36209).add(term36211);
        term36207 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term36207, term36207.getClass(), "playerIndex", -1415256843);
        setField(term36207, term36207.getClass(), "list", term36209);
        setIntField(term36207, term36207.getClass(), "numberOfMeetings", 173952451);
        Class<? extends Object> term36555 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term36554 = ((Class) term36555).getDeclaredField((String) "ESPIONAGE_BORDER_CROSS");
        ((Field) term36554).setAccessible(true);
        enum99 = ((Field) term36554).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Object[] args = new Object[1];
        args[0] = enum99;
        callMethod(klass, "getTotalBonusForType", argTypes, term36207, args);
    }

};


