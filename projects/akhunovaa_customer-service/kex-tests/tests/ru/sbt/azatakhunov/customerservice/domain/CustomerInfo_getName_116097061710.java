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
import java.util.HashMap;

public class CustomerInfo_getName_116097061710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2261;

    public CustomerInfo_getName_116097061710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2322 = new ArrayList();
        HashMap term2326 = new HashMap();
        term2261 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo"));
        setField(term2261, term2261.getClass(), "id", "kGMQdqJYyB");
        setField(term2261, term2261.getClass(), "pw", "XJJNClzHRf");
        setField(term2261, term2261.getClass(), "name", "HDaezxQfQR");
        setField(term2261, term2261.getClass(), "address", "iikZEapDlu");
        setField(term2261, term2261.getClass(), "registeredDay", "nhoHrZfnIN");
        setField(term2261, term2261.getClass(), "eventList", term2322);
        setField(term2261, term2261.getClass(), "methodMap", term2326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term2261, args);
    }

};


