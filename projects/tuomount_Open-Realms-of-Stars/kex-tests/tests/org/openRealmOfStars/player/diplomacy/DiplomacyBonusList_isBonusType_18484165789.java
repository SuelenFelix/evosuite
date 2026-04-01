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

public class DiplomacyBonusList_isBonusType_18484165789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33533;
     Object enum92;

    public DiplomacyBonusList_isBonusType_18484165789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33566 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term33565 = ((Class) term33566).getDeclaredField((String) "REALM_LOST");
        ((Field) term33565).setAccessible(true);
        Object enum90 = ((Field) term33565).get((Object) null);
        Object term33537 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term33537, term33537.getClass(), "type", enum90);
        setBooleanField(term33537, term33537.getClass(), "onlyOne", false);
        setIntField(term33537, term33537.getClass(), "bonusValue", 1863910269);
        setIntField(term33537, term33537.getClass(), "bonusLasting", 864645689);
        Class<? extends Object> term33883 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term33882 = ((Class) term33883).getDeclaredField((String) "SAME_GOVERNMENT");
        ((Field) term33882).setAccessible(true);
        Object enum91 = ((Field) term33882).get((Object) null);
        Object term33543 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term33543, term33543.getClass(), "type", enum91);
        setBooleanField(term33543, term33543.getClass(), "onlyOne", true);
        setIntField(term33543, term33543.getClass(), "bonusValue", 279384872);
        setIntField(term33543, term33543.getClass(), "bonusLasting", 1427305953);
        ArrayList term33535 = new ArrayList();
        ((ArrayList) term33535).add(term33537);
        ((ArrayList) term33535).add(term33543);
        term33533 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term33533, term33533.getClass(), "playerIndex", 40571662);
        setField(term33533, term33533.getClass(), "list", term33535);
        setIntField(term33533, term33533.getClass(), "numberOfMeetings", -781832877);
        Class<? extends Object> term34215 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term34214 = ((Class) term34215).getDeclaredField((String) "SAME_RACE");
        ((Field) term34214).setAccessible(true);
        enum92 = ((Field) term34214).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Object[] args = new Object[1];
        args[0] = enum92;
        callMethod(klass, "isBonusType", argTypes, term33533, args);
    }

};


