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

public class DiplomacyBonusList_makeEmbargo_17927217096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32205;

    public DiplomacyBonusList_makeEmbargo_17927217096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32219 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term32218 = ((Class) term32219).getDeclaredField((String) "MADE_DEMAND");
        ((Field) term32218).setAccessible(true);
        Object enum86 = ((Field) term32218).get((Object) null);
        Object term32209 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term32209, term32209.getClass(), "type", enum86);
        setBooleanField(term32209, term32209.getClass(), "onlyOne", false);
        setIntField(term32209, term32209.getClass(), "bonusValue", 2068435279);
        setIntField(term32209, term32209.getClass(), "bonusLasting", -1556527718);
        ArrayList term32207 = new ArrayList();
        ((ArrayList) term32207).add(term32209);
        term32205 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term32205, term32205.getClass(), "playerIndex", -1622760744);
        setField(term32205, term32205.getClass(), "list", term32207);
        setIntField(term32205, term32205.getClass(), "numberOfMeetings", 895255351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "makeEmbargo", argTypes, term32205, args);
    }

};


