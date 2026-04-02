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

public class CustomerInfo_toBuilder_8222110185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1614;

    public CustomerInfo_toBuilder_8222110185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1675 = new ArrayList();
        ((ArrayList) term1675).add((Object)null);
        ((ArrayList) term1675).add((Object)null);
        ((ArrayList) term1675).add((Object)null);
        ((ArrayList) term1675).add((Object)null);
        ((ArrayList) term1675).add((Object)null);
        ((ArrayList) term1675).add((Object)null);
        HashMap term1679 = new HashMap();
        term1614 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo"));
        setField(term1614, term1614.getClass(), "id", "fztQhjqwdP");
        setField(term1614, term1614.getClass(), "pw", "eVpkWxjuki");
        setField(term1614, term1614.getClass(), "name", "SJiQaLvSKv");
        setField(term1614, term1614.getClass(), "address", "OEXDRUKcFl");
        setField(term1614, term1614.getClass(), "registeredDay", "RYdKCNNMBR");
        setField(term1614, term1614.getClass(), "eventList", term1675);
        setField(term1614, term1614.getClass(), "methodMap", term1679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBuilder", argTypes, term1614, args);
    }

};


