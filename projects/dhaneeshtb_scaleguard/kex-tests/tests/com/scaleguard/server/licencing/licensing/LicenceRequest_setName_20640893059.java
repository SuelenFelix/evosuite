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

public class LicenceRequest_setName_20640893059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16983;

    public LicenceRequest_setName_20640893059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16983 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term16983, term16983.getClass(), "email", "wRVaaJxKYI");
        setField(term16983, term16983.getClass(), "name", "yOQuJXRvOo");
        setField(term16983, term16983.getClass(), "address", "XmLHcnVsch");
        setField(term16983, term16983.getClass(), "phone", "Yrvtdcltri");
        setField(term16983, term16983.getClass(), "country", "RxrsjXRVcT");
        setField(term16983, term16983.getClass(), "zipPostalCode", "cfRimmJxqA");
        setField(term16983, term16983.getClass(), "deviceId", "oOnRVGqFmy");
        setField(term16983, term16983.getClass(), "plan", "LaXzFIlWMk");
        setBooleanField(term16983, term16983.getClass(), "isEvaluation", true);
        setLongField(term16983, term16983.getClass(), "timestamp", 1786470046696L);
        setField(term16983, term16983.getClass(), "passcode", "GuVQjhBxma");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WAVMPPbIfL";
        callMethod(klass, "setName", argTypes, term16983, args);
    }

};


