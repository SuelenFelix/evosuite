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

public class MessageList_addFilterType_9660629604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7607;

    public MessageList_addFilterType_9660629604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7631 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term7630 = ((Class) term7631).getDeclaredField((String) "LEADER");
        ((Field) term7630).setAccessible(true);
        Object enum18 = ((Field) term7630).get((Object) null);
        Class<? extends Object> term7866 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term7865 = ((Class) term7866).getDeclaredField((String) "ARTIFACT");
        ((Field) term7865).setAccessible(true);
        Object enum19 = ((Field) term7865).get((Object) null);
        term7607 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        setField(term7607, term7607.getClass(), "mainType", enum18);
        setField(term7607, term7607.getClass(), "subType", enum19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.MessageList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.message.MessageType");
        Object[] args = new Object[1];
        args[0] = term7607;
        callMethod(klass, "addFilterType", argTypes, null, args);
    }

};


