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

public class SMLPublicOpenResponse_getRefTime_19530385629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term512;

    public SMLPublicOpenResponse_getRefTime_19530385629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term536 = new Integer(-1530420153);
        term512 = newInstance(Class.forName("de.wyraz.sml.SMLPublicOpenResponse"));
        byte[] term513 = (byte[]) newByteArray(2);
        byte[] term516 = (byte[]) newByteArray(8);
        byte[] term525 = (byte[]) newByteArray(3);
        byte[] term529 = (byte[]) newByteArray(6);
        setByteElement(term513, 0, (byte) -25);
        setByteElement(term513, 1, (byte) -35);
        setField(term512, term512.getClass(), "codepage", term513);
        setByteElement(term516, 0, (byte) 3);
        setByteElement(term516, 1, (byte) -10);
        setByteElement(term516, 2, (byte) -106);
        setByteElement(term516, 3, (byte) -124);
        setByteElement(term516, 4, (byte) -71);
        setByteElement(term516, 5, (byte) 113);
        setByteElement(term516, 6, (byte) -77);
        setByteElement(term516, 7, (byte) -12);
        setField(term512, term512.getClass(), "clientId", term516);
        setByteElement(term525, 0, (byte) 58);
        setByteElement(term525, 1, (byte) 12);
        setByteElement(term525, 2, (byte) 79);
        setField(term512, term512.getClass(), "reqFileId", term525);
        setByteElement(term529, 0, (byte) -4);
        setByteElement(term529, 1, (byte) -27);
        setByteElement(term529, 2, (byte) 120);
        setByteElement(term529, 3, (byte) -25);
        setByteElement(term529, 4, (byte) 114);
        setByteElement(term529, 5, (byte) 105);
        setField(term512, term512.getClass(), "serverId", term529);
        setField(term512, term512.getClass(), "refTime", null);
        setField(term512, term512.getClass(), "smlVersion", term536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLPublicOpenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRefTime", argTypes, term512, args);
    }

};


