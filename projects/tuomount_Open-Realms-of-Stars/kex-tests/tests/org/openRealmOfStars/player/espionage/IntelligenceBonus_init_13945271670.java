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
import java.lang.Integer;

public class IntelligenceBonus_init_13945271670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum178;
     Object term63138;

    public IntelligenceBonus_init_13945271670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63141 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term63140 = ((Class) term63141).getDeclaredField((String) "CHATTERBOX");
        ((Field) term63140).setAccessible(true);
        enum178 = ((Field) term63140).get((Object) null);
        term63138 = new Integer(1642235898);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = enum178;
        args[1] = term63138;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


