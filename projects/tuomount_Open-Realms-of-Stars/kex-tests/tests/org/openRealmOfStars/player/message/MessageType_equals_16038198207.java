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

public class MessageType_equals_16038198207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14580;
     Object term14604;

    public MessageType_equals_16038198207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14626 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term14625 = ((Class) term14626).getDeclaredField((String) "LEADER");
        ((Field) term14625).setAccessible(true);
        Object enum44 = ((Field) term14625).get((Object) null);
        Class<? extends Object> term14861 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term14860 = ((Class) term14861).getDeclaredField((String) "NEW_RULER");
        ((Field) term14860).setAccessible(true);
        Object enum45 = ((Field) term14860).get((Object) null);
        term14580 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        setField(term14580, term14580.getClass(), "mainType", enum44);
        setField(term14580, term14580.getClass(), "subType", enum45);
        Class<? extends Object> term15105 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term15104 = ((Class) term15105).getDeclaredField((String) "RESEARCH");
        ((Field) term15104).setAccessible(true);
        Object enum46 = ((Field) term15104).get((Object) null);
        Class<? extends Object> term15346 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term15345 = ((Class) term15346).getDeclaredField((String) "JAIL");
        ((Field) term15345).setAccessible(true);
        Object enum47 = ((Field) term15345).get((Object) null);
        term14604 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        setField(term14604, term14604.getClass(), "mainType", enum46);
        setField(term14604, term14604.getClass(), "subType", enum47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.MessageType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.message.MessageType");
        Object[] args = new Object[1];
        args[0] = term14604;
        callMethod(klass, "equals", argTypes, term14580, args);
    }

};


