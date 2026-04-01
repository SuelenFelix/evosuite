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

public class IntelligenceBonus_getDescription_6445143193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64188;

    public IntelligenceBonus_getDescription_6445143193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64216 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term64215 = ((Class) term64216).getDeclaredField((String) "SPY_FLEET");
        ((Field) term64215).setAccessible(true);
        Object enum181 = ((Field) term64215).get((Object) null);
        term64188 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term64188, term64188.getClass(), "type", enum181);
        setIntField(term64188, term64188.getClass(), "value", -2109330879);
        setField(term64188, term64188.getClass(), "description", "MeMWAHyjMR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term64188, args);
    }

};


