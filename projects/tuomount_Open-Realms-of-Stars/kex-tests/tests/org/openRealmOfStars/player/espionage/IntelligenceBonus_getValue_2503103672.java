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

public class IntelligenceBonus_getValue_2503103672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63822;

    public IntelligenceBonus_getValue_2503103672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63850 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term63849 = ((Class) term63850).getDeclaredField((String) "OWN_REALM");
        ((Field) term63849).setAccessible(true);
        Object enum180 = ((Field) term63849).get((Object) null);
        term63822 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term63822, term63822.getClass(), "type", enum180);
        setIntField(term63822, term63822.getClass(), "value", 2039931383);
        setField(term63822, term63822.getClass(), "description", "KNgeIkQoef");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term63822, args);
    }

};


