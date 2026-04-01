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

public class MessageList_isFiltered_16332568106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8633;

    public MessageList_isFiltered_16332568106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8652 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term8651 = ((Class) term8652).getDeclaredField((String) "NEWS");
        ((Field) term8651).setAccessible(true);
        Object enum22 = ((Field) term8651).get((Object) null);
        Class<? extends Object> term8881 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term8880 = ((Class) term8881).getDeclaredField((String) "HAPPY");
        ((Field) term8880).setAccessible(true);
        Object enum23 = ((Field) term8880).get((Object) null);
        term8633 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        setField(term8633, term8633.getClass(), "mainType", enum22);
        setField(term8633, term8633.getClass(), "subType", enum23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.MessageList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.message.MessageType");
        Object[] args = new Object[1];
        args[0] = term8633;
        callMethod(klass, "isFiltered", argTypes, null, args);
    }

};


