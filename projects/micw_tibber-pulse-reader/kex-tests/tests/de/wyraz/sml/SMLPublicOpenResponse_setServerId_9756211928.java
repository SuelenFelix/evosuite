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

public class SMLPublicOpenResponse_setServerId_9756211928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450;
     Object term478;

    public SMLPublicOpenResponse_setServerId_9756211928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term476 = new Integer(-1087774327);
        term450 = newInstance(Class.forName("de.wyraz.sml.SMLPublicOpenResponse"));
        byte[] term451 = (byte[]) newByteArray(0);
        byte[] term452 = (byte[]) newByteArray(9);
        byte[] term462 = (byte[]) newByteArray(4);
        byte[] term467 = (byte[]) newByteArray(8);
        setField(term450, term450.getClass(), "codepage", term451);
        setByteElement(term452, 0, (byte) 12);
        setByteElement(term452, 1, (byte) -75);
        setByteElement(term452, 2, (byte) 69);
        setByteElement(term452, 3, (byte) -6);
        setByteElement(term452, 4, (byte) 107);
        setByteElement(term452, 5, (byte) -109);
        setByteElement(term452, 6, (byte) 122);
        setByteElement(term452, 7, (byte) 83);
        setByteElement(term452, 8, (byte) -123);
        setField(term450, term450.getClass(), "clientId", term452);
        setByteElement(term462, 0, (byte) -76);
        setByteElement(term462, 1, (byte) -115);
        setByteElement(term462, 2, (byte) -48);
        setByteElement(term462, 3, (byte) 126);
        setField(term450, term450.getClass(), "reqFileId", term462);
        setByteElement(term467, 0, (byte) -2);
        setByteElement(term467, 1, (byte) 103);
        setByteElement(term467, 2, (byte) 23);
        setByteElement(term467, 3, (byte) 96);
        setByteElement(term467, 4, (byte) -70);
        setByteElement(term467, 5, (byte) -73);
        setByteElement(term467, 6, (byte) 1);
        setByteElement(term467, 7, (byte) 99);
        setField(term450, term450.getClass(), "serverId", term467);
        setField(term450, term450.getClass(), "refTime", null);
        setField(term450, term450.getClass(), "smlVersion", term476);
        term478 = (byte[]) newByteArray(6);
        setByteElement(term478, 0, (byte) -121);
        setByteElement(term478, 1, (byte) -50);
        setByteElement(term478, 2, (byte) -79);
        setByteElement(term478, 3, (byte) 110);
        setByteElement(term478, 4, (byte) -111);
        setByteElement(term478, 5, (byte) -54);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLPublicOpenResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term478;
        callMethod(klass, "setServerId", argTypes, term450, args);
    }

};


