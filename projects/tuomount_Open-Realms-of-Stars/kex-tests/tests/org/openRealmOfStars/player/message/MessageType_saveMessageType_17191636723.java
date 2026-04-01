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

public class MessageType_saveMessageType_17191636723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12257;
     Object term12283;

    public MessageType_saveMessageType_17191636723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12298 = Class.forName((String) "org.openRealmOfStars.player.message.MmType");
        Field term12297 = ((Class) term12298).getDeclaredField((String) "RESEARCH");
        ((Field) term12297).setAccessible(true);
        Object enum35 = ((Field) term12297).get((Object) null);
        Class<? extends Object> term12539 = Class.forName((String) "org.openRealmOfStars.player.message.SmType");
        Field term12538 = ((Class) term12539).getDeclaredField((String) "ESPIONAGE");
        ((Field) term12538).setAccessible(true);
        Object enum36 = ((Field) term12538).get((Object) null);
        term12257 = newInstance(Class.forName("org.openRealmOfStars.player.message.MessageType"));
        setField(term12257, term12257.getClass(), "mainType", enum35);
        setField(term12257, term12257.getClass(), "subType", enum36);
        term12283 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term12285 = (byte[]) newByteArray(5);
        byte[] term12291 = (byte[]) newByteArray(3);
        Object term12296 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term12283, term12283.getClass(), "written", -2104981311);
        setByteElement(term12285, 0, (byte) -63);
        setByteElement(term12285, 1, (byte) 15);
        setByteElement(term12285, 2, (byte) 45);
        setByteElement(term12285, 3, (byte) -39);
        setByteElement(term12285, 4, (byte) -20);
        setField(term12283, term12283.getClass(), "bytearr", term12285);
        setByteElement(term12291, 0, (byte) 10);
        setByteElement(term12291, 1, (byte) 77);
        setByteElement(term12291, 2, (byte) 14);
        setField(term12283, term12283.getClass(), "writeBuffer", term12291);
        setField(term12283, term12283.getClass(), "out", null);
        setBooleanField(term12283, term12283.getClass(), "closed", false);
        setField(term12283, term12283.getClass(), "closeLock", term12296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.message.MessageType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = term12283;
        callMethod(klass, "saveMessageType", argTypes, term12257, args);
    }

};


