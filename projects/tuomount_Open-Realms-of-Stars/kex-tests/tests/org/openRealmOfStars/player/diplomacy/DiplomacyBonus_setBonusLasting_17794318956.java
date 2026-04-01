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

public class DiplomacyBonus_setBonusLasting_17794318956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6228;
     Object term6250;

    public DiplomacyBonus_setBonusLasting_17794318956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6253 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term6252 = ((Class) term6253).getDeclaredField((String) "WAR_DECLARTION");
        ((Field) term6252).setAccessible(true);
        Object enum14 = ((Field) term6252).get((Object) null);
        term6228 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term6228, term6228.getClass(), "type", enum14);
        setBooleanField(term6228, term6228.getClass(), "onlyOne", true);
        setIntField(term6228, term6228.getClass(), "bonusValue", 1134449235);
        setIntField(term6228, term6228.getClass(), "bonusLasting", -883034806);
        term6250 = new Integer(1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6250;
        callMethod(klass, "setBonusLasting", argTypes, term6228, args);
    }

};


