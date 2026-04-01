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

public class MessageType_equals_11624695399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16069;
     Object term16091;

    public MessageType_equals_11624695399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16093 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term16092 = ((Class) term16093).getDeclaredField((String) "PLANETARY");
        ((Field) term16092).setAccessible(true);
        Object enum50 = ((Field) term16092).get((Object) null);
        Class<? extends Object> term16337 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term16336 = ((Class) term16337).getDeclaredField((String) "VOTE");
        ((Field) term16336).setAccessible(true);
        Object enum51 = ((Field) term16336).get((Object) null);
        term16069 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        setField(term16069, term16069.getClass(), "mainType", enum50);
        setField(term16069, term16069.getClass(), "subType", enum51);
        term16091 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.MessageType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16091;
        callMethod(klass, "equals", argTypes, term16069, args);
    }

};


