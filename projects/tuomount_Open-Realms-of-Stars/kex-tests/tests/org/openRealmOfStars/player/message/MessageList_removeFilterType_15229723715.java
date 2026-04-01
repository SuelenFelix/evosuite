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

public class MessageList_removeFilterType_15229723715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8106;

    public MessageList_removeFilterType_15229723715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8137 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term8136 = ((Class) term8137).getDeclaredField((String) "INFORMATION");
        ((Field) term8136).setAccessible(true);
        Object enum20 = ((Field) term8136).get((Object) null);
        Class<? extends Object> term8387 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term8386 = ((Class) term8387).getDeclaredField((String) "TRADE_STOP");
        ((Field) term8386).setAccessible(true);
        Object enum21 = ((Field) term8386).get((Object) null);
        term8106 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        setField(term8106, term8106.getClass(), "mainType", enum20);
        setField(term8106, term8106.getClass(), "subType", enum21);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.MessageList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.message.MessageType");
        Object[] args = new Object[1];
        args[0] = term8106;
        callMethod(klass, "removeFilterType", argTypes, null, args);
    }

};


