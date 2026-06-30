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

public class CustomerInfo_getRegisteredDay_61606598012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2519;

    public CustomerInfo_getRegisteredDay_61606598012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2580 = new ArrayList();
        ((ArrayList) term2580).add((Object)null);
        ((ArrayList) term2580).add((Object)null);
        HashMap term2584 = new HashMap();
        term2519 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo"));
        setField(term2519, term2519.getClass(), "id", "HBGNxdNURv");
        setField(term2519, term2519.getClass(), "pw", "mfCpTPPQQm");
        setField(term2519, term2519.getClass(), "name", "OcJCIDNIXA");
        setField(term2519, term2519.getClass(), "address", "XfRABIFVEp");
        setField(term2519, term2519.getClass(), "registeredDay", "MHGKyEnwKc");
        setField(term2519, term2519.getClass(), "eventList", term2580);
        setField(term2519, term2519.getClass(), "methodMap", term2584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegisteredDay", argTypes, term2519, args);
    }

};


