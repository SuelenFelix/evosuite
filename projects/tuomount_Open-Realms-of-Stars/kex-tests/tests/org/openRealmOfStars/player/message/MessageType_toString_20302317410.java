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

public class MessageType_toString_20302317410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16565;

    public MessageType_toString_20302317410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16596 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term16595 = ((Class) term16596).getDeclaredField((String) "LEADER");
        ((Field) term16595).setAccessible(true);
        Object enum52 = ((Field) term16595).get((Object) null);
        Class<? extends Object> term16831 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term16830 = ((Class) term16831).getDeclaredField((String) "FOUND_GAS_GIANT");
        ((Field) term16830).setAccessible(true);
        Object enum53 = ((Field) term16830).get((Object) null);
        term16565 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        setField(term16565, term16565.getClass(), "mainType", enum52);
        setField(term16565, term16565.getClass(), "subType", enum53);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.MessageType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term16565, args);
    }

};


