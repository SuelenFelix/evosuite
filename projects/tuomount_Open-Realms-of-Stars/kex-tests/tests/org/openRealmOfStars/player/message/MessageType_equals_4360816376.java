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

public class MessageType_equals_4360816376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13832;
     Object enum43;

    public MessageType_equals_4360816376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13867 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term13866 = ((Class) term13867).getDeclaredField((String) "FLEET");
        ((Field) term13866).setAccessible(true);
        Object enum41 = ((Field) term13866).get((Object) null);
        Class<? extends Object> term14099 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term14098 = ((Class) term14099).getDeclaredField((String) "TRADE_STOP");
        ((Field) term14098).setAccessible(true);
        Object enum42 = ((Field) term14098).get((Object) null);
        term13832 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        setField(term13832, term13832.getClass(), "mainType", enum41);
        setField(term13832, term13832.getClass(), "subType", enum42);
        Class<? extends Object> term14346 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term14345 = ((Class) term14346).getDeclaredField((String) "LEADER");
        ((Field) term14345).setAccessible(true);
        enum43 = ((Field) term14345).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.MessageType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.message.MmType");
        Object[] args = new Object[1];
        args[0] = enum43;
        callMethod(klass, "equals", argTypes, term13832, args);
    }

};


