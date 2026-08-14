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

public class LicenceRequest_setEmail_11570047487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16559;

    public LicenceRequest_setEmail_11570047487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16559 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term16559, term16559.getClass(), "email", "CURQCMkqbZ");
        setField(term16559, term16559.getClass(), "name", "VZwkkQktrm");
        setField(term16559, term16559.getClass(), "address", "wIuJvIvEMb");
        setField(term16559, term16559.getClass(), "phone", "EyojsbSjWT");
        setField(term16559, term16559.getClass(), "country", "szGicGyWDL");
        setField(term16559, term16559.getClass(), "zipPostalCode", "lkdvUiYwRq");
        setField(term16559, term16559.getClass(), "deviceId", "XuxkPrpfND");
        setField(term16559, term16559.getClass(), "plan", "OxNXeKMDje");
        setBooleanField(term16559, term16559.getClass(), "isEvaluation", false);
        setLongField(term16559, term16559.getClass(), "timestamp", 1786470046619L);
        setField(term16559, term16559.getClass(), "passcode", "hGTqHomrbc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NNMBrIWEBw";
        callMethod(klass, "setEmail", argTypes, term16559, args);
    }

};


