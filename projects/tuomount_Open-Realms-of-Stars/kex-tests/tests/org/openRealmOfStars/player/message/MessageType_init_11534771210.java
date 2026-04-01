package org.openRealmOfStars.player.message;

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
import static org.openRealmOfStars.player.message.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class MessageType_init_11534771210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum32;
     Object enum33;

    public MessageType_init_11534771210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11465 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term11464 = ((Class) term11465).getDeclaredField((String) "POPULATION");
        ((Field) term11464).setAccessible(true);
        enum32 = ((Field) term11464).get((Object) null);
        Class<? extends Object> term11712 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term11711 = ((Class) term11712).getDeclaredField((String) "EVASION");
        ((Field) term11711).setAccessible(true);
        enum33 = ((Field) term11711).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.MessageType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.message.MmType");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.message.SmType");
        Object[] args = new Object[2];
        args[0] = enum32;
        args[1] = enum33;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


