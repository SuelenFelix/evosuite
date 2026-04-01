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

public class MessageType_hashCode_7137828648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15574;

    public MessageType_hashCode_7137828648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15597 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term15596 = ((Class) term15597).getDeclaredField((String) "RESEARCH");
        ((Field) term15596).setAccessible(true);
        Object enum48 = ((Field) term15596).get((Object) null);
        Class<? extends Object> term15838 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term15837 = ((Class) term15838).getDeclaredField((String) "TRADE");
        ((Field) term15837).setAccessible(true);
        Object enum49 = ((Field) term15837).get((Object) null);
        term15574 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        setField(term15574, term15574.getClass(), "mainType", enum48);
        setField(term15574, term15574.getClass(), "subType", enum49);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.MessageType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term15574, args);
    }

};


