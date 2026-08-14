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

public class LicenceRequest_setZipPostalCode_159808632117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18679;

    public LicenceRequest_setZipPostalCode_159808632117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18679 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term18679, term18679.getClass(), "email", "LHnkeoNwHq");
        setField(term18679, term18679.getClass(), "name", "gVnDVbSyKa");
        setField(term18679, term18679.getClass(), "address", "kdCYNMSuoD");
        setField(term18679, term18679.getClass(), "phone", "eRYlSLwtvV");
        setField(term18679, term18679.getClass(), "country", "duOyJsARTD");
        setField(term18679, term18679.getClass(), "zipPostalCode", "xPnOHsNlyc");
        setField(term18679, term18679.getClass(), "deviceId", "OTSPWPJefj");
        setField(term18679, term18679.getClass(), "plan", "EOTYMqXRmE");
        setBooleanField(term18679, term18679.getClass(), "isEvaluation", true);
        setLongField(term18679, term18679.getClass(), "timestamp", 1786470047004L);
        setField(term18679, term18679.getClass(), "passcode", "iTxNduwSjE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MQUTfIiFnh";
        callMethod(klass, "setZipPostalCode", argTypes, term18679, args);
    }

};


