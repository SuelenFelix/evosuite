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

public class MessageType_getSubType_226927725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13329;

    public MessageType_getSubType_226927725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13354 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term13353 = ((Class) term13354).getDeclaredField((String) "RESEARCH");
        ((Field) term13353).setAccessible(true);
        Object enum39 = ((Field) term13353).get((Object) null);
        Class<? extends Object> term13595 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term13594 = ((Class) term13595).getDeclaredField((String) "CREDITS");
        ((Field) term13594).setAccessible(true);
        Object enum40 = ((Field) term13594).get((Object) null);
        term13329 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        setField(term13329, term13329.getClass(), "mainType", enum39);
        setField(term13329, term13329.getClass(), "subType", enum40);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.MessageType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubType", argTypes, term13329, args);
    }

};


