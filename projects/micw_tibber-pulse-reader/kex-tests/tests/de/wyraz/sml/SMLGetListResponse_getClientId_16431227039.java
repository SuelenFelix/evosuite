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

public class SMLGetListResponse_getClientId_16431227039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1035;

    public SMLGetListResponse_getClientId_16431227039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1035 = newInstance(Class.forName("de.wyraz.sml.SMLGetListResponse"));
        setField(term1035, term1035.getClass(), "clientId", null);
        setField(term1035, term1035.getClass(), "serverId", null);
        setField(term1035, term1035.getClass(), "listName", null);
        setField(term1035, term1035.getClass(), "actSensorTime", null);
        setField(term1035, term1035.getClass(), "valList", null);
        setField(term1035, term1035.getClass(), "listSignature", null);
        setField(term1035, term1035.getClass(), "actGatewayTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLGetListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClientId", argTypes, term1035, args);
    }

};


