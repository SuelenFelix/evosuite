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
import java.lang.Object;

public class MessageList_saveMessageList_19707309042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7571;

    public MessageList_saveMessageList_19707309042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7571 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term7573 = (byte[]) newByteArray(9);
        byte[] term7583 = (byte[]) newByteArray(6);
        Object term7591 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term7571, term7571.getClass(), "written", 1283079251);
        setByteElement(term7573, 0, (byte) -22);
        setByteElement(term7573, 1, (byte) 93);
        setByteElement(term7573, 2, (byte) 69);
        setByteElement(term7573, 3, (byte) -74);
        setByteElement(term7573, 4, (byte) -123);
        setByteElement(term7573, 5, (byte) -23);
        setByteElement(term7573, 6, (byte) 100);
        setByteElement(term7573, 7, (byte) 106);
        setByteElement(term7573, 8, (byte) -57);
        setField(term7571, term7571.getClass(), "bytearr", term7573);
        setByteElement(term7583, 0, (byte) -103);
        setByteElement(term7583, 1, (byte) 98);
        setByteElement(term7583, 2, (byte) 79);
        setByteElement(term7583, 3, (byte) 61);
        setByteElement(term7583, 4, (byte) -92);
        setByteElement(term7583, 5, (byte) -42);
        setField(term7571, term7571.getClass(), "writeBuffer", term7583);
        setField(term7571, term7571.getClass(), "out", null);
        setBooleanField(term7571, term7571.getClass(), "closed", true);
        setField(term7571, term7571.getClass(), "closeLock", term7591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.MessageList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = term7571;
        callMethod(klass, "saveMessageList", argTypes, null, args);
    }

};


