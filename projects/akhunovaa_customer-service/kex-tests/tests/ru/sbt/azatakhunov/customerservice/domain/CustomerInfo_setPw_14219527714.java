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

public class CustomerInfo_setPw_14219527714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2799;

    public CustomerInfo_setPw_14219527714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2860 = new ArrayList();
        ((ArrayList) term2860).add((Object)null);
        ((ArrayList) term2860).add((Object)null);
        ((ArrayList) term2860).add((Object)null);
        ((ArrayList) term2860).add((Object)null);
        ((ArrayList) term2860).add((Object)null);
        ((ArrayList) term2860).add((Object)null);
        ((ArrayList) term2860).add((Object)null);
        HashMap term2864 = new HashMap();
        term2799 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo"));
        setField(term2799, term2799.getClass(), "id", "BwtdjiefJn");
        setField(term2799, term2799.getClass(), "pw", "jDmhBrIoDa");
        setField(term2799, term2799.getClass(), "name", "SPtPatHeOm");
        setField(term2799, term2799.getClass(), "address", "ywmcuThdfL");
        setField(term2799, term2799.getClass(), "registeredDay", "GBOEuByOfr");
        setField(term2799, term2799.getClass(), "eventList", term2860);
        setField(term2799, term2799.getClass(), "methodMap", term2864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TtGbVmKcnX";
        callMethod(klass, "setPw", argTypes, term2799, args);
    }

};


