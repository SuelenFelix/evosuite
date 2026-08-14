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

public class LicenceRequest_getPasscode_28927961820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19326;

    public LicenceRequest_getPasscode_28927961820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19326 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term19326, term19326.getClass(), "email", "nHYQYkycCR");
        setField(term19326, term19326.getClass(), "name", "yBiVacDcZX");
        setField(term19326, term19326.getClass(), "address", "QrKfEgQeoy");
        setField(term19326, term19326.getClass(), "phone", "oApgdbwnti");
        setField(term19326, term19326.getClass(), "country", "YcgHACNgyo");
        setField(term19326, term19326.getClass(), "zipPostalCode", "MrUPJzBTEn");
        setField(term19326, term19326.getClass(), "deviceId", "IaSymdfFGa");
        setField(term19326, term19326.getClass(), "plan", "FxSvJCIpul");
        setBooleanField(term19326, term19326.getClass(), "isEvaluation", true);
        setLongField(term19326, term19326.getClass(), "timestamp", 1786470047141L);
        setField(term19326, term19326.getClass(), "passcode", "HCjKwpexJj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPasscode", argTypes, term19326, args);
    }

};


