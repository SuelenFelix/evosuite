package org.openRealmOfStars.player.diplomacy.speeches;

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
import static org.openRealmOfStars.player.diplomacy.speeches.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class SpeechLine_init_18550306300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum10;

    public SpeechLine_init_18550306300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4549 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term4548 = ((Class) term4549).getDeclaredField((String) "ASK_MOVE_FLEET");
        ((Field) term4548).setAccessible(true);
        enum10 = ((Field) term4548).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.speeches.SpeechLine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = enum10;
        args[1] = "BndsHwAFMv";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


