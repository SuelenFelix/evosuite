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

public class LicenceRequest_setPasscode_129706282221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19527;

    public LicenceRequest_setPasscode_129706282221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19527 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term19527, term19527.getClass(), "email", "sCpIHVPdfl");
        setField(term19527, term19527.getClass(), "name", "lMUBBGRjfY");
        setField(term19527, term19527.getClass(), "address", "olYpqbolWL");
        setField(term19527, term19527.getClass(), "phone", "MCMCjxXzjw");
        setField(term19527, term19527.getClass(), "country", "pZbbwCURge");
        setField(term19527, term19527.getClass(), "zipPostalCode", "RsOfgdMCMv");
        setField(term19527, term19527.getClass(), "deviceId", "nsofCJqJOR");
        setField(term19527, term19527.getClass(), "plan", "CitJiZwsjF");
        setBooleanField(term19527, term19527.getClass(), "isEvaluation", false);
        setLongField(term19527, term19527.getClass(), "timestamp", 1786470047183L);
        setField(term19527, term19527.getClass(), "passcode", "ZiyMvLArWJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MaeokjEfWD";
        callMethod(klass, "setPasscode", argTypes, term19527, args);
    }

};


