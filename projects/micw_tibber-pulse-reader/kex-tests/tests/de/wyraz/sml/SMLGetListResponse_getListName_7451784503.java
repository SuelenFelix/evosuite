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

public class SMLGetListResponse_getListName_7451784503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term832;

    public SMLGetListResponse_getListName_7451784503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term847 = new ArrayList();
        ((ArrayList) term847).add((Object)null);
        term832 = newInstance(Class.forName("de.wyraz.sml.SMLGetListResponse"));
        byte[] term833 = (byte[]) newByteArray(0);
        byte[] term834 = (byte[]) newByteArray(6);
        byte[] term841 = (byte[]) newByteArray(5);
        byte[] term851 = (byte[]) newByteArray(4);
        setField(term832, term832.getClass(), "clientId", term833);
        setByteElement(term834, 0, (byte) -88);
        setByteElement(term834, 1, (byte) -73);
        setByteElement(term834, 2, (byte) 105);
        setByteElement(term834, 3, (byte) -86);
        setByteElement(term834, 4, (byte) 84);
        setByteElement(term834, 5, (byte) -70);
        setField(term832, term832.getClass(), "serverId", term834);
        setByteElement(term841, 0, (byte) 84);
        setByteElement(term841, 1, (byte) 114);
        setByteElement(term841, 2, (byte) 60);
        setByteElement(term841, 3, (byte) -20);
        setByteElement(term841, 4, (byte) 100);
        setField(term832, term832.getClass(), "listName", term841);
        setField(term832, term832.getClass(), "actSensorTime", null);
        setField(term832, term832.getClass(), "valList", term847);
        setByteElement(term851, 0, (byte) -41);
        setByteElement(term851, 1, (byte) -70);
        setByteElement(term851, 2, (byte) -5);
        setByteElement(term851, 3, (byte) 119);
        setField(term832, term832.getClass(), "listSignature", term851);
        setField(term832, term832.getClass(), "actGatewayTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLGetListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getListName", argTypes, term832, args);
    }

};


