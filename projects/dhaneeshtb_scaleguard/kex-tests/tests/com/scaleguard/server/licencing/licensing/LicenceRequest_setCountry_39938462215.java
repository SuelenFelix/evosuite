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

public class LicenceRequest_setCountry_39938462215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18255;

    public LicenceRequest_setCountry_39938462215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18255 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term18255, term18255.getClass(), "email", "TiEyxWXsra");
        setField(term18255, term18255.getClass(), "name", "TuLgwTZsPP");
        setField(term18255, term18255.getClass(), "address", "KoasxTJGpx");
        setField(term18255, term18255.getClass(), "phone", "ceGeARYMoa");
        setField(term18255, term18255.getClass(), "country", "fFWllaiFvh");
        setField(term18255, term18255.getClass(), "zipPostalCode", "PFTdEDSbvZ");
        setField(term18255, term18255.getClass(), "deviceId", "TbiwoiebNe");
        setField(term18255, term18255.getClass(), "plan", "laTITSWZuc");
        setBooleanField(term18255, term18255.getClass(), "isEvaluation", true);
        setLongField(term18255, term18255.getClass(), "timestamp", 1786470046926L);
        setField(term18255, term18255.getClass(), "passcode", "fkzRpxlAqS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VYvbTGKslj";
        callMethod(klass, "setCountry", argTypes, term18255, args);
    }

};


