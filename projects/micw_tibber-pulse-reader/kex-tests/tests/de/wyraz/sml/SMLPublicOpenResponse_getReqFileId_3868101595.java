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

public class SMLPublicOpenResponse_getReqFileId_3868101595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316;

    public SMLPublicOpenResponse_getReqFileId_3868101595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term342 = new Integer(-73683645);
        term316 = newInstance(Class.forName("de.wyraz.sml.SMLPublicOpenResponse"));
        byte[] term317 = (byte[]) newByteArray(6);
        byte[] term324 = (byte[]) newByteArray(5);
        byte[] term330 = (byte[]) newByteArray(3);
        byte[] term334 = (byte[]) newByteArray(7);
        setByteElement(term317, 0, (byte) 33);
        setByteElement(term317, 1, (byte) -74);
        setByteElement(term317, 2, (byte) -84);
        setByteElement(term317, 3, (byte) -53);
        setByteElement(term317, 4, (byte) -93);
        setByteElement(term317, 5, (byte) 82);
        setField(term316, term316.getClass(), "codepage", term317);
        setByteElement(term324, 0, (byte) -89);
        setByteElement(term324, 1, (byte) 24);
        setByteElement(term324, 2, (byte) 123);
        setByteElement(term324, 3, (byte) -101);
        setByteElement(term324, 4, (byte) -102);
        setField(term316, term316.getClass(), "clientId", term324);
        setByteElement(term330, 0, (byte) -95);
        setByteElement(term330, 1, (byte) -2);
        setByteElement(term330, 2, (byte) 28);
        setField(term316, term316.getClass(), "reqFileId", term330);
        setByteElement(term334, 0, (byte) 84);
        setByteElement(term334, 1, (byte) 85);
        setByteElement(term334, 2, (byte) -17);
        setByteElement(term334, 3, (byte) -83);
        setByteElement(term334, 4, (byte) 48);
        setByteElement(term334, 5, (byte) -128);
        setByteElement(term334, 6, (byte) 70);
        setField(term316, term316.getClass(), "serverId", term334);
        setField(term316, term316.getClass(), "refTime", null);
        setField(term316, term316.getClass(), "smlVersion", term342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLPublicOpenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReqFileId", argTypes, term316, args);
    }

};


