package com.praveen.drools.example.model;

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
import static com.praveen.drools.example.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class CustomerRequest_hashCode_7089352726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170;

    public CustomerRequest_hashCode_7089352726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term172 = new Integer(1134449235);
        Integer term186 = new Integer(-883034806);
        term170 = newInstance(Class.forName("com.praveen.drools.example.model.CustomerRequest"));
        setLongField(term170, term170.getClass(), "id", 4872422362414183754L);
        setField(term170, term170.getClass(), "age", term172);
        setField(term170, term170.getClass(), "gender", "SzjVpOQTyS");
        setField(term170, term170.getClass(), "numberOfOrders", term186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.praveen.drools.example.model.CustomerRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term170, args);
    }

};


