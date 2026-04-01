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

public class IntelligenceBonus_setDescription_7475651354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64554;

    public IntelligenceBonus_setDescription_7475651354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64595 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term64594 = ((Class) term64595).getDeclaredField((String) "CHATTERBOX");
        ((Field) term64594).setAccessible(true);
        Object enum182 = ((Field) term64594).get((Object) null);
        term64554 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term64554, term64554.getClass(), "type", enum182);
        setIntField(term64554, term64554.getClass(), "value", -1576801556);
        setField(term64554, term64554.getClass(), "description", "lTuLOcnSnJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "govbBrRstA";
        callMethod(klass, "setDescription", argTypes, term64554, args);
    }

};


