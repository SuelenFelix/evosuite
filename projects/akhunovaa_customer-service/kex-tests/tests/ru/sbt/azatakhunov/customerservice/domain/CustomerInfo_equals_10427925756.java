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

public class CustomerInfo_equals_10427925756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1743;
     Object term1822;

    public CustomerInfo_equals_10427925756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1804 = new ArrayList();
        ((ArrayList) term1804).add((Object)null);
        ((ArrayList) term1804).add((Object)null);
        ((ArrayList) term1804).add((Object)null);
        HashMap term1808 = new HashMap();
        term1743 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo"));
        setField(term1743, term1743.getClass(), "id", "mLUZFTfjle");
        setField(term1743, term1743.getClass(), "pw", "xIeFjkHkOe");
        setField(term1743, term1743.getClass(), "name", "SdCKLMIYnX");
        setField(term1743, term1743.getClass(), "address", "OJJtVNPyKZ");
        setField(term1743, term1743.getClass(), "registeredDay", "AKNapTAfmD");
        setField(term1743, term1743.getClass(), "eventList", term1804);
        setField(term1743, term1743.getClass(), "methodMap", term1808);
        term1822 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1822;
        callMethod(klass, "equals", argTypes, term1743, args);
    }

};


