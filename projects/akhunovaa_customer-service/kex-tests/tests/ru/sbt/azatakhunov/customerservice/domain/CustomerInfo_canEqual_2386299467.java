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

public class CustomerInfo_canEqual_2386299467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1873;
     Object term1952;

    public CustomerInfo_canEqual_2386299467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1934 = new ArrayList();
        ((ArrayList) term1934).add((Object)null);
        ((ArrayList) term1934).add((Object)null);
        HashMap term1938 = new HashMap();
        term1873 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo"));
        setField(term1873, term1873.getClass(), "id", "GgZWSjxjyE");
        setField(term1873, term1873.getClass(), "pw", "EeBVbzjcCI");
        setField(term1873, term1873.getClass(), "name", "UfQtPRyWRC");
        setField(term1873, term1873.getClass(), "address", "FPvxVzzSvD");
        setField(term1873, term1873.getClass(), "registeredDay", "WHcwFgsGFC");
        setField(term1873, term1873.getClass(), "eventList", term1934);
        setField(term1873, term1873.getClass(), "methodMap", term1938);
        term1952 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1952;
        callMethod(klass, "canEqual", argTypes, term1873, args);
    }

};


