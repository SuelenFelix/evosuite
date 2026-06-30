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

public class SMLGetListResponse_getServerId_12852389052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term797;

    public SMLGetListResponse_getServerId_12852389052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term813 = new ArrayList();
        ((ArrayList) term813).add((Object)null);
        ((ArrayList) term813).add((Object)null);
        ((ArrayList) term813).add((Object)null);
        ((ArrayList) term813).add((Object)null);
        ((ArrayList) term813).add((Object)null);
        term797 = newInstance(Class.forName("de.wyraz.sml.SMLGetListResponse"));
        byte[] term798 = (byte[]) newByteArray(6);
        byte[] term805 = (byte[]) newByteArray(0);
        byte[] term806 = (byte[]) newByteArray(6);
        byte[] term817 = (byte[]) newByteArray(1);
        setByteElement(term798, 0, (byte) 94);
        setByteElement(term798, 1, (byte) -52);
        setByteElement(term798, 2, (byte) -33);
        setByteElement(term798, 3, (byte) 16);
        setByteElement(term798, 4, (byte) 20);
        setByteElement(term798, 5, (byte) -114);
        setField(term797, term797.getClass(), "clientId", term798);
        setField(term797, term797.getClass(), "serverId", term805);
        setByteElement(term806, 0, (byte) 93);
        setByteElement(term806, 1, (byte) -60);
        setByteElement(term806, 2, (byte) -4);
        setByteElement(term806, 3, (byte) 28);
        setByteElement(term806, 4, (byte) 94);
        setField(term797, term797.getClass(), "listName", term806);
        setField(term797, term797.getClass(), "actSensorTime", null);
        setField(term797, term797.getClass(), "valList", term813);
        setByteElement(term817, 0, (byte) -96);
        setField(term797, term797.getClass(), "listSignature", term817);
        setField(term797, term797.getClass(), "actGatewayTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLGetListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getServerId", argTypes, term797, args);
    }

};


