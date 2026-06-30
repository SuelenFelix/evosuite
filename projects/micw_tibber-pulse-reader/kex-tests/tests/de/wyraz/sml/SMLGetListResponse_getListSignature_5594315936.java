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

public class SMLGetListResponse_getListSignature_5594315936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term945;

    public SMLGetListResponse_getListSignature_5594315936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term965 = new ArrayList();
        ((ArrayList) term965).add((Object)null);
        ((ArrayList) term965).add((Object)null);
        ((ArrayList) term965).add((Object)null);
        ((ArrayList) term965).add((Object)null);
        ((ArrayList) term965).add((Object)null);
        ((ArrayList) term965).add((Object)null);
        term945 = newInstance(Class.forName("de.wyraz.sml.SMLGetListResponse"));
        byte[] term946 = (byte[]) newByteArray(7);
        byte[] term954 = (byte[]) newByteArray(0);
        byte[] term955 = (byte[]) newByteArray(9);
        byte[] term969 = (byte[]) newByteArray(8);
        setByteElement(term946, 0, (byte) 55);
        setByteElement(term946, 1, (byte) -5);
        setByteElement(term946, 2, (byte) -4);
        setByteElement(term946, 3, (byte) -61);
        setByteElement(term946, 4, (byte) -34);
        setByteElement(term946, 5, (byte) 73);
        setByteElement(term946, 6, (byte) 10);
        setField(term945, term945.getClass(), "clientId", term946);
        setField(term945, term945.getClass(), "serverId", term954);
        setByteElement(term955, 0, (byte) 36);
        setByteElement(term955, 1, (byte) 103);
        setByteElement(term955, 2, (byte) -64);
        setByteElement(term955, 3, (byte) -107);
        setByteElement(term955, 4, (byte) 119);
        setByteElement(term955, 5, (byte) -109);
        setByteElement(term955, 6, (byte) 87);
        setByteElement(term955, 7, (byte) 97);
        setByteElement(term955, 8, (byte) 51);
        setField(term945, term945.getClass(), "listName", term955);
        setField(term945, term945.getClass(), "actSensorTime", null);
        setField(term945, term945.getClass(), "valList", term965);
        setByteElement(term969, 0, (byte) 24);
        setByteElement(term969, 1, (byte) -14);
        setByteElement(term969, 2, (byte) 74);
        setByteElement(term969, 3, (byte) 56);
        setByteElement(term969, 4, (byte) -76);
        setByteElement(term969, 5, (byte) -29);
        setByteElement(term969, 6, (byte) 121);
        setByteElement(term969, 7, (byte) -17);
        setField(term945, term945.getClass(), "listSignature", term969);
        setField(term945, term945.getClass(), "actGatewayTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLGetListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getListSignature", argTypes, term945, args);
    }

};


