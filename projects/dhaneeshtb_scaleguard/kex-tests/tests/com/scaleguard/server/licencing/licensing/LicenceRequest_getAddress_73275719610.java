package com.scaleguard.server.licencing.licensing;

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
import static com.scaleguard.server.licencing.licensing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LicenceRequest_getAddress_73275719610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17206;

    public LicenceRequest_getAddress_73275719610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17206 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term17206, term17206.getClass(), "email", "GISHLsgALf");
        setField(term17206, term17206.getClass(), "name", "PVykkUSgBq");
        setField(term17206, term17206.getClass(), "address", "tnKbZaCsuj");
        setField(term17206, term17206.getClass(), "phone", "ZFpcYBgLNC");
        setField(term17206, term17206.getClass(), "country", "VAGkRppBem");
        setField(term17206, term17206.getClass(), "zipPostalCode", "eKcEJRxNSu");
        setField(term17206, term17206.getClass(), "deviceId", "NTXQPWFYSA");
        setField(term17206, term17206.getClass(), "plan", "fOuOhBpldm");
        setBooleanField(term17206, term17206.getClass(), "isEvaluation", true);
        setLongField(term17206, term17206.getClass(), "timestamp", 1786470046732L);
        setField(term17206, term17206.getClass(), "passcode", "qQQRKGPyIM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddress", argTypes, term17206, args);
    }

};


