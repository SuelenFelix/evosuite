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

public class SMLGetListResponse_getValList_12354828305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896;

    public SMLGetListResponse_getValList_12354828305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term914 = new ArrayList();
        ((ArrayList) term914).add((Object)null);
        ((ArrayList) term914).add((Object)null);
        ((ArrayList) term914).add((Object)null);
        ((ArrayList) term914).add((Object)null);
        term896 = newInstance(Class.forName("de.wyraz.sml.SMLGetListResponse"));
        byte[] term897 = (byte[]) newByteArray(7);
        byte[] term905 = (byte[]) newByteArray(1);
        byte[] term907 = (byte[]) newByteArray(6);
        byte[] term918 = (byte[]) newByteArray(6);
        setByteElement(term897, 0, (byte) -99);
        setByteElement(term897, 1, (byte) 61);
        setByteElement(term897, 2, (byte) 100);
        setByteElement(term897, 3, (byte) 55);
        setByteElement(term897, 4, (byte) -111);
        setByteElement(term897, 5, (byte) -127);
        setByteElement(term897, 6, (byte) 19);
        setField(term896, term896.getClass(), "clientId", term897);
        setByteElement(term905, 0, (byte) 83);
        setField(term896, term896.getClass(), "serverId", term905);
        setByteElement(term907, 0, (byte) -57);
        setByteElement(term907, 1, (byte) 103);
        setByteElement(term907, 2, (byte) 40);
        setByteElement(term907, 3, (byte) -106);
        setByteElement(term907, 4, (byte) -95);
        setByteElement(term907, 5, (byte) 69);
        setField(term896, term896.getClass(), "listName", term907);
        setField(term896, term896.getClass(), "actSensorTime", null);
        setField(term896, term896.getClass(), "valList", term914);
        setByteElement(term918, 0, (byte) 63);
        setByteElement(term918, 1, (byte) -41);
        setByteElement(term918, 2, (byte) -44);
        setByteElement(term918, 3, (byte) -120);
        setByteElement(term918, 4, (byte) -55);
        setByteElement(term918, 5, (byte) 91);
        setField(term896, term896.getClass(), "listSignature", term918);
        setField(term896, term896.getClass(), "actGatewayTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLGetListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValList", argTypes, term896, args);
    }

};


