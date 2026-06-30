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

public class CustomerInfo_getId_4423325532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1375;

    public CustomerInfo_getId_4423325532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1436 = new ArrayList();
        ((ArrayList) term1436).add((Object)null);
        ((ArrayList) term1436).add((Object)null);
        ((ArrayList) term1436).add((Object)null);
        ((ArrayList) term1436).add((Object)null);
        ((ArrayList) term1436).add((Object)null);
        ((ArrayList) term1436).add((Object)null);
        HashMap term1440 = new HashMap();
        term1375 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo"));
        setField(term1375, term1375.getClass(), "id", "PHvxnGHptP");
        setField(term1375, term1375.getClass(), "pw", "TimdotUuNC");
        setField(term1375, term1375.getClass(), "name", "PkWMRdJcBb");
        setField(term1375, term1375.getClass(), "address", "jSpAteRute");
        setField(term1375, term1375.getClass(), "registeredDay", "swZVeJAxjt");
        setField(term1375, term1375.getClass(), "eventList", term1436);
        setField(term1375, term1375.getClass(), "methodMap", term1440);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1375, args);
    }

};


