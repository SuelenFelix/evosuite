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

public class MessageList_isFilteredIgnoreApply_19049538207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9112;

    public MessageList_isFilteredIgnoreApply_19049538207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9140 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term9139 = ((Class) term9140).getDeclaredField((String) "PLANETARY");
        ((Field) term9139).setAccessible(true);
        Object enum24 = ((Field) term9139).get((Object) null);
        Class<? extends Object> term9384 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term9383 = ((Class) term9384).getDeclaredField((String) "FREE_JAIL");
        ((Field) term9383).setAccessible(true);
        Object enum25 = ((Field) term9383).get((Object) null);
        term9112 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        setField(term9112, term9112.getClass(), "mainType", enum24);
        setField(term9112, term9112.getClass(), "subType", enum25);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.MessageList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.message.MessageType");
        Object[] args = new Object[1];
        args[0] = term9112;
        callMethod(klass, "isFilteredIgnoreApply", argTypes, null, args);
    }

};


