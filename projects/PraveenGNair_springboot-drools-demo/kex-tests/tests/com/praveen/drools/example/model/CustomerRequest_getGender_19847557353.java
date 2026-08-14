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

public class CustomerRequest_getGender_19847557353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85;

    public CustomerRequest_getGender_19847557353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term87 = new Integer(-1955890973);
        Integer term101 = new Integer(-2038273078);
        term85 = newInstance(Class.forName("com.praveen.drools.example.model.CustomerRequest"));
        setLongField(term85, term85.getClass(), "id", -8400487765614892086L);
        setField(term85, term85.getClass(), "age", term87);
        setField(term85, term85.getClass(), "gender", "xxtlPwDYFs");
        setField(term85, term85.getClass(), "numberOfOrders", term101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.praveen.drools.example.model.CustomerRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGender", argTypes, term85, args);
    }

};


