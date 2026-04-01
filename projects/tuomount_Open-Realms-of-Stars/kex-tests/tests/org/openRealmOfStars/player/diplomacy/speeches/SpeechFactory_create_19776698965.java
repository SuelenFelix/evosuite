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

public class SpeechFactory_create_19776698965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum9;

    public SpeechFactory_create_19776698965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4165 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term4164 = ((Class) term4165).getDeclaredField((String) "INSULT_RESPOND");
        ((Field) term4164).setAccessible(true);
        enum9 = ((Field) term4164).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.speeches.SpeechFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = enum9;
        args[1] = "gGSMzuGICf";
        args[2] = "hxCBltsObl";
        callMethod(klass, "create", argTypes, null, args);
    }

};


