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

public class CustomerInfo_getPw_4425593499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2132;

    public CustomerInfo_getPw_4425593499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2193 = new ArrayList();
        ((ArrayList) term2193).add((Object)null);
        ((ArrayList) term2193).add((Object)null);
        ((ArrayList) term2193).add((Object)null);
        ((ArrayList) term2193).add((Object)null);
        ((ArrayList) term2193).add((Object)null);
        ((ArrayList) term2193).add((Object)null);
        ((ArrayList) term2193).add((Object)null);
        HashMap term2197 = new HashMap();
        term2132 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo"));
        setField(term2132, term2132.getClass(), "id", "igCAtimmYB");
        setField(term2132, term2132.getClass(), "pw", "DyiXbeYIaN");
        setField(term2132, term2132.getClass(), "name", "VGizxZnyHX");
        setField(term2132, term2132.getClass(), "address", "kVEZMHmRtR");
        setField(term2132, term2132.getClass(), "registeredDay", "ekxGuOYIwi");
        setField(term2132, term2132.getClass(), "eventList", term2193);
        setField(term2132, term2132.getClass(), "methodMap", term2197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPw", argTypes, term2132, args);
    }

};


