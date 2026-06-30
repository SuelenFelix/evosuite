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

public class SMLPublicOpenResponse_setRefTime_62511828810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term557;

    public SMLPublicOpenResponse_setRefTime_62511828810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term589 = new Integer(-469968304);
        term557 = newInstance(Class.forName("de.wyraz.sml.SMLPublicOpenResponse"));
        byte[] term558 = (byte[]) newByteArray(8);
        byte[] term567 = (byte[]) newByteArray(9);
        byte[] term577 = (byte[]) newByteArray(7);
        byte[] term585 = (byte[]) newByteArray(3);
        setByteElement(term558, 0, (byte) -95);
        setByteElement(term558, 1, (byte) -6);
        setByteElement(term558, 2, (byte) 51);
        setByteElement(term558, 3, (byte) 122);
        setByteElement(term558, 4, (byte) 84);
        setByteElement(term558, 5, (byte) -36);
        setByteElement(term558, 6, (byte) 103);
        setByteElement(term558, 7, (byte) -63);
        setField(term557, term557.getClass(), "codepage", term558);
        setByteElement(term567, 0, (byte) 39);
        setByteElement(term567, 1, (byte) -54);
        setByteElement(term567, 2, (byte) 9);
        setByteElement(term567, 3, (byte) 19);
        setByteElement(term567, 4, (byte) -103);
        setByteElement(term567, 5, (byte) 61);
        setByteElement(term567, 6, (byte) -90);
        setByteElement(term567, 7, (byte) -27);
        setByteElement(term567, 8, (byte) 119);
        setField(term557, term557.getClass(), "clientId", term567);
        setByteElement(term577, 0, (byte) -125);
        setByteElement(term577, 1, (byte) 100);
        setByteElement(term577, 2, (byte) -1);
        setByteElement(term577, 3, (byte) -127);
        setByteElement(term577, 4, (byte) -118);
        setByteElement(term577, 5, (byte) 69);
        setByteElement(term577, 6, (byte) 112);
        setField(term557, term557.getClass(), "reqFileId", term577);
        setByteElement(term585, 0, (byte) 77);
        setByteElement(term585, 1, (byte) -1);
        setByteElement(term585, 2, (byte) -83);
        setField(term557, term557.getClass(), "serverId", term585);
        setField(term557, term557.getClass(), "refTime", null);
        setField(term557, term557.getClass(), "smlVersion", term589);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLPublicOpenResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.wyraz.sml.SMLTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRefTime", argTypes, term557, args);
    }

};


