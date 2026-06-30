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

public class SMLGetListResponse_getActSensorTime_10701058524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term871;

    public SMLGetListResponse_getActSensorTime_10701058524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term883 = new ArrayList();
        ((ArrayList) term883).add((Object)null);
        ((ArrayList) term883).add((Object)null);
        ((ArrayList) term883).add((Object)null);
        ((ArrayList) term883).add((Object)null);
        ((ArrayList) term883).add((Object)null);
        ((ArrayList) term883).add((Object)null);
        ((ArrayList) term883).add((Object)null);
        term871 = newInstance(Class.forName("de.wyraz.sml.SMLGetListResponse"));
        byte[] term872 = (byte[]) newByteArray(1);
        byte[] term874 = (byte[]) newByteArray(1);
        byte[] term876 = (byte[]) newByteArray(6);
        byte[] term887 = (byte[]) newByteArray(0);
        setByteElement(term872, 0, (byte) 81);
        setField(term871, term871.getClass(), "clientId", term872);
        setByteElement(term874, 0, (byte) -28);
        setField(term871, term871.getClass(), "serverId", term874);
        setByteElement(term876, 0, (byte) -18);
        setByteElement(term876, 1, (byte) -61);
        setByteElement(term876, 2, (byte) 70);
        setByteElement(term876, 3, (byte) 89);
        setByteElement(term876, 4, (byte) -99);
        setByteElement(term876, 5, (byte) 59);
        setField(term871, term871.getClass(), "listName", term876);
        setField(term871, term871.getClass(), "actSensorTime", null);
        setField(term871, term871.getClass(), "valList", term883);
        setField(term871, term871.getClass(), "listSignature", term887);
        setField(term871, term871.getClass(), "actGatewayTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLGetListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActSensorTime", argTypes, term871, args);
    }

};


