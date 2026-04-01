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
import java.lang.Integer;

public class DiplomacyBonus_setBonusValue_12017507244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5456;
     Object term5475;

    public DiplomacyBonus_setBonusValue_12017507244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5478 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term5477 = ((Class) term5478).getDeclaredField((String) "TRADE_FLEET");
        ((Field) term5477).setAccessible(true);
        Object enum12 = ((Field) term5477).get((Object) null);
        term5456 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term5456, term5456.getClass(), "type", enum12);
        setBooleanField(term5456, term5456.getClass(), "onlyOne", true);
        setIntField(term5456, term5456.getClass(), "bonusValue", -2038273078);
        setIntField(term5456, term5456.getClass(), "bonusLasting", 1227103734);
        term5475 = new Integer(-1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5475;
        callMethod(klass, "setBonusValue", argTypes, term5456, args);
    }

};


