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

public class SMLGetListResponse_getActGatewayTime_4444199547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1002;

    public SMLGetListResponse_getActGatewayTime_4444199547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1015 = new ArrayList();
        ((ArrayList) term1015).add((Object)null);
        ((ArrayList) term1015).add((Object)null);
        ((ArrayList) term1015).add((Object)null);
        ((ArrayList) term1015).add((Object)null);
        ((ArrayList) term1015).add((Object)null);
        term1002 = newInstance(Class.forName("de.wyraz.sml.SMLGetListResponse"));
        byte[] term1003 = (byte[]) newByteArray(6);
        byte[] term1010 = (byte[]) newByteArray(2);
        byte[] term1013 = (byte[]) newByteArray(1);
        byte[] term1019 = (byte[]) newByteArray(3);
        setByteElement(term1003, 0, (byte) -123);
        setByteElement(term1003, 1, (byte) -76);
        setByteElement(term1003, 2, (byte) -46);
        setByteElement(term1003, 3, (byte) -82);
        setByteElement(term1003, 4, (byte) -105);
        setByteElement(term1003, 5, (byte) 35);
        setField(term1002, term1002.getClass(), "clientId", term1003);
        setByteElement(term1010, 0, (byte) -80);
        setByteElement(term1010, 1, (byte) 96);
        setField(term1002, term1002.getClass(), "serverId", term1010);
        setByteElement(term1013, 0, (byte) -66);
        setField(term1002, term1002.getClass(), "listName", term1013);
        setField(term1002, term1002.getClass(), "actSensorTime", null);
        setField(term1002, term1002.getClass(), "valList", term1015);
        setByteElement(term1019, 0, (byte) 109);
        setByteElement(term1019, 1, (byte) -44);
        setByteElement(term1019, 2, (byte) 100);
        setField(term1002, term1002.getClass(), "listSignature", term1019);
        setField(term1002, term1002.getClass(), "actGatewayTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLGetListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActGatewayTime", argTypes, term1002, args);
    }

};


