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
import java.lang.String;
import java.lang.Object;

public class DiplomacyBonus_getBonusLasting_15790098355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5797;

    public DiplomacyBonus_getBonusLasting_15790098355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5840 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term5839 = ((Class) term5840).getDeclaredField((String) "SIMILAR_GOVERNMENT_DIFFERENT_GROUP");
        ((Field) term5839).setAccessible(true);
        Object enum13 = ((Field) term5839).get((Object) null);
        term5797 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term5797, term5797.getClass(), "type", enum13);
        setBooleanField(term5797, term5797.getClass(), "onlyOne", true);
        setIntField(term5797, term5797.getClass(), "bonusValue", 1725571209);
        setIntField(term5797, term5797.getClass(), "bonusLasting", -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBonusLasting", argTypes, term5797, args);
    }

};


