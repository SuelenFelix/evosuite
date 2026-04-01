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
import java.lang.String;
import java.lang.Object;

public class IntelligenceBonus_toString_13263359475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64946;

    public IntelligenceBonus_toString_13263359475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64974 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term64973 = ((Class) term64974).getDeclaredField((String) "SPY_FLEET");
        ((Field) term64973).setAccessible(true);
        Object enum183 = ((Field) term64973).get((Object) null);
        term64946 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term64946, term64946.getClass(), "type", enum183);
        setIntField(term64946, term64946.getClass(), "value", -1572718384);
        setField(term64946, term64946.getClass(), "description", "zSMUNzRRyM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term64946, args);
    }

};


