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

public class LicenceRequest_getCountry_121086564614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18054;

    public LicenceRequest_getCountry_121086564614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18054 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term18054, term18054.getClass(), "email", "pbqJjeooBM");
        setField(term18054, term18054.getClass(), "name", "ccnotFfPXt");
        setField(term18054, term18054.getClass(), "address", "plWlgdgIhn");
        setField(term18054, term18054.getClass(), "phone", "RZaKVKWtND");
        setField(term18054, term18054.getClass(), "country", "vXiaNiquft");
        setField(term18054, term18054.getClass(), "zipPostalCode", "lucCeiVnYe");
        setField(term18054, term18054.getClass(), "deviceId", "iYwkCLMsbJ");
        setField(term18054, term18054.getClass(), "plan", "MXLsVQWrwc");
        setBooleanField(term18054, term18054.getClass(), "isEvaluation", false);
        setLongField(term18054, term18054.getClass(), "timestamp", 1786470046888L);
        setField(term18054, term18054.getClass(), "passcode", "lRaSlqzqNY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountry", argTypes, term18054, args);
    }

};


