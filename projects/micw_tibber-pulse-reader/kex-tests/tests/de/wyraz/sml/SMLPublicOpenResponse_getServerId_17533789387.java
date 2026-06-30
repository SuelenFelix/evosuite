package de.wyraz.sml;

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
import static de.wyraz.sml.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class SMLPublicOpenResponse_getServerId_17533789387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term415;

    public SMLPublicOpenResponse_getServerId_17533789387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term434 = new Integer(1193880199);
        term415 = newInstance(Class.forName("de.wyraz.sml.SMLPublicOpenResponse"));
        byte[] term416 = (byte[]) newByteArray(3);
        byte[] term420 = (byte[]) newByteArray(5);
        byte[] term426 = (byte[]) newByteArray(5);
        byte[] term432 = (byte[]) newByteArray(1);
        setByteElement(term416, 0, (byte) 123);
        setByteElement(term416, 1, (byte) 16);
        setByteElement(term416, 2, (byte) 2);
        setField(term415, term415.getClass(), "codepage", term416);
        setByteElement(term420, 0, (byte) -120);
        setByteElement(term420, 1, (byte) 96);
        setByteElement(term420, 2, (byte) -41);
        setByteElement(term420, 3, (byte) -88);
        setByteElement(term420, 4, (byte) 39);
        setField(term415, term415.getClass(), "clientId", term420);
        setByteElement(term426, 0, (byte) -1);
        setByteElement(term426, 1, (byte) 117);
        setByteElement(term426, 2, (byte) 43);
        setByteElement(term426, 3, (byte) -27);
        setByteElement(term426, 4, (byte) 34);
        setField(term415, term415.getClass(), "reqFileId", term426);
        setByteElement(term432, 0, (byte) -126);
        setField(term415, term415.getClass(), "serverId", term432);
        setField(term415, term415.getClass(), "refTime", null);
        setField(term415, term415.getClass(), "smlVersion", term434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLPublicOpenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getServerId", argTypes, term415, args);
    }

};


