package com.acme.types;

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
import static com.acme.types.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Award_Builder_id_14891209192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3079;

    public Award_Builder_id_14891209192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3144 = Class.forName((String) "com.acme.types.AwardName");
        Field term3143 = ((Class) term3144).getDeclaredField((String) "ORWELL_PRIZE");
        ((Field) term3143).setAccessible(true);
        Object enum1 = ((Field) term3143).get((Object) null);
        term3079 = newInstance(Class.forName("com.acme.types.Award$Builder"));
        setField(term3079, term3079.getClass(), "id", "AeoFWTVnXE");
        setField(term3079, term3079.getClass(), "awardName", enum1);
        setField(term3079, term3079.getClass(), "category", "KNodpPTOen");
        setIntField(term3079, term3079.getClass(), "year", 890669485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Award$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HLdVSdPKUm";
        callMethod(klass, "id", argTypes, term3079, args);
    }

};


