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

public class IntelligenceBonus_getType_9015661991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63472;

    public IntelligenceBonus_getType_9015661991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63496 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term63495 = ((Class) term63496).getDeclaredField((String) "TRADE");
        ((Field) term63495).setAccessible(true);
        Object enum179 = ((Field) term63495).get((Object) null);
        term63472 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term63472, term63472.getClass(), "type", enum179);
        setIntField(term63472, term63472.getClass(), "value", -719765151);
        setField(term63472, term63472.getClass(), "description", "rKIvvYydou");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term63472, args);
    }

};


