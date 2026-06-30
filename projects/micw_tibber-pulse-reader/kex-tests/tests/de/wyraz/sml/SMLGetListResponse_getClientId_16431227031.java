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
import java.util.ArrayList;
import java.lang.Object;

public class SMLGetListResponse_getClientId_16431227031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term732;

    public SMLGetListResponse_getClientId_16431227031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term758 = new ArrayList();
        ((ArrayList) term758).add((Object)null);
        ((ArrayList) term758).add((Object)null);
        ((ArrayList) term758).add((Object)null);
        ((ArrayList) term758).add((Object)null);
        ((ArrayList) term758).add((Object)null);
        ((ArrayList) term758).add((Object)null);
        ((ArrayList) term758).add((Object)null);
        term732 = newInstance(Class.forName("de.wyraz.sml.SMLGetListResponse"));
        byte[] term733 = (byte[]) newByteArray(6);
        byte[] term740 = (byte[]) newByteArray(7);
        byte[] term748 = (byte[]) newByteArray(9);
        byte[] term762 = (byte[]) newByteArray(6);
        setByteElement(term733, 0, (byte) 17);
        setByteElement(term733, 1, (byte) -126);
        setByteElement(term733, 2, (byte) 35);
        setByteElement(term733, 3, (byte) -46);
        setByteElement(term733, 4, (byte) -14);
        setByteElement(term733, 5, (byte) 124);
        setField(term732, term732.getClass(), "clientId", term733);
        setByteElement(term740, 0, (byte) -124);
        setByteElement(term740, 1, (byte) -72);
        setByteElement(term740, 2, (byte) 90);
        setByteElement(term740, 3, (byte) -34);
        setByteElement(term740, 4, (byte) -2);
        setByteElement(term740, 5, (byte) 96);
        setByteElement(term740, 6, (byte) 55);
        setField(term732, term732.getClass(), "serverId", term740);
        setByteElement(term748, 0, (byte) -103);
        setByteElement(term748, 1, (byte) -103);
        setByteElement(term748, 2, (byte) -98);
        setByteElement(term748, 3, (byte) -119);
        setByteElement(term748, 4, (byte) 120);
        setByteElement(term748, 5, (byte) -15);
        setByteElement(term748, 6, (byte) 115);
        setByteElement(term748, 7, (byte) 52);
        setByteElement(term748, 8, (byte) 96);
        setField(term732, term732.getClass(), "listName", term748);
        setField(term732, term732.getClass(), "actSensorTime", null);
        setField(term732, term732.getClass(), "valList", term758);
        setByteElement(term762, 0, (byte) 40);
        setByteElement(term762, 1, (byte) -5);
        setByteElement(term762, 2, (byte) 24);
        setByteElement(term762, 3, (byte) -39);
        setByteElement(term762, 4, (byte) 30);
        setByteElement(term762, 5, (byte) -119);
        setField(term732, term732.getClass(), "listSignature", term762);
        setField(term732, term732.getClass(), "actGatewayTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLGetListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClientId", argTypes, term732, args);
    }

};


