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

public class CustomerInfo_setRegisteredDay_82437402017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3252;

    public CustomerInfo_setRegisteredDay_82437402017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3313 = new ArrayList();
        ((ArrayList) term3313).add((Object)null);
        ((ArrayList) term3313).add((Object)null);
        ((ArrayList) term3313).add((Object)null);
        HashMap term3317 = new HashMap();
        term3252 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo"));
        setField(term3252, term3252.getClass(), "id", "pumvwBWvpy");
        setField(term3252, term3252.getClass(), "pw", "HwLHeGLyhe");
        setField(term3252, term3252.getClass(), "name", "RDnkgWkcbz");
        setField(term3252, term3252.getClass(), "address", "IBpaxltauX");
        setField(term3252, term3252.getClass(), "registeredDay", "hePqROaplw");
        setField(term3252, term3252.getClass(), "eventList", term3313);
        setField(term3252, term3252.getClass(), "methodMap", term3317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aanyiAOJCl";
        callMethod(klass, "setRegisteredDay", argTypes, term3252, args);
    }

};


