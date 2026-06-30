package com.example.demo;

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
import static com.example.demo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Service_sendSms_11954660211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term815;
     Object term816;

    public Service_sendSms_11954660211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term815 = newInstance(Class.forName("com.example.demo.Service"));
        setField(term815, term815.getClass(), "smsSender", null);
        term816 = newInstance(Class.forName("com.example.demo.SmsRequest"));
        setField(term816, term816.getClass(), "phoneNumber", "xrwlQZdwCp");
        setField(term816, term816.getClass(), "message", "IDCWpPLRkE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.demo.Service");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.demo.SmsRequest");
        Object[] args = new Object[1];
        args[0] = term816;
        callMethod(klass, "sendSms", argTypes, term815, args);
    }

};


