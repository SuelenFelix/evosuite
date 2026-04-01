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

public class MessageType_getMainType_4133026074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12790;

    public MessageType_getMainType_4133026074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12824 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term12823 = ((Class) term12824).getDeclaredField((String) "PLANETARY");
        ((Field) term12823).setAccessible(true);
        Object enum37 = ((Field) term12823).get((Object) null);
        Class<? extends Object> term13068 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term13067 = ((Class) term13068).getDeclaredField((String) "FOUND_GAS_GIANT");
        ((Field) term13067).setAccessible(true);
        Object enum38 = ((Field) term13067).get((Object) null);
        term12790 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        setField(term12790, term12790.getClass(), "mainType", enum37);
        setField(term12790, term12790.getClass(), "subType", enum38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.MessageType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMainType", argTypes, term12790, args);
    }

};


