package ru.sbt.azatakhunov.customerservice.domain;

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
import static ru.sbt.azatakhunov.customerservice.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class CustomerInfo_toString_200223894018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3403;

    public CustomerInfo_toString_200223894018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3464 = new ArrayList();
        ((ArrayList) term3464).add((Object)null);
        ((ArrayList) term3464).add((Object)null);
        ((ArrayList) term3464).add((Object)null);
        ((ArrayList) term3464).add((Object)null);
        ((ArrayList) term3464).add((Object)null);
        ((ArrayList) term3464).add((Object)null);
        ((ArrayList) term3464).add((Object)null);
        HashMap term3468 = new HashMap();
        term3403 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo"));
        setField(term3403, term3403.getClass(), "id", "VDokbsCuqq");
        setField(term3403, term3403.getClass(), "pw", "xClUIcPECX");
        setField(term3403, term3403.getClass(), "name", "avhRaGZaBF");
        setField(term3403, term3403.getClass(), "address", "JkgoRtImdE");
        setField(term3403, term3403.getClass(), "registeredDay", "qFGKIJjlmV");
        setField(term3403, term3403.getClass(), "eventList", term3464);
        setField(term3403, term3403.getClass(), "methodMap", term3468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3403, args);
    }

};


