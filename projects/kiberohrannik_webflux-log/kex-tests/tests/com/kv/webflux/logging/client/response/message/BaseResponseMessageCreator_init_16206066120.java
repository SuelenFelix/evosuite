package com.kv.webflux.logging.client.response.message;

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
import static com.kv.webflux.logging.client.response.message.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;

public class BaseResponseMessageCreator_init_16206066120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term128;

    public BaseResponseMessageCreator_init_16206066120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties"));
        Object[] term16 = (Object[]) newArray("java.lang.String", 5);
        Object[] term78 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term1, term1.getClass(), "logRequestId", false);
        setField(term1, term1.getClass(), "requestIdPrefix", "PAEBtnZtTD");
        setBooleanField(term1, term1.getClass(), "logHeaders", false);
        setElement(term16, 0, "sjlJAEtRrb");
        setElement(term16, 1, "MuLcgQHgqz");
        setElement(term16, 2, "xxtlPwDYFs");
        setElement(term16, 3, "jJCZpVmanW");
        setElement(term16, 4, "EGtDIRbSSb");
        setField(term1, term1.getClass(), "maskedHeaders", term16);
        setBooleanField(term1, term1.getClass(), "logCookies", false);
        setElement(term78, 0, "SzjVpOQTyS");
        setElement(term78, 1, "MjGYSRKTNF");
        setElement(term78, 2, "hRNSzYYIrc");
        setElement(term78, 3, "RMFIsYGgne");
        setField(term1, term1.getClass(), "maskedCookies", term78);
        setBooleanField(term1, term1.getClass(), "logBody", false);
        term128 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.response.message.BaseResponseMessageCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.kv.webflux.logging.client.LoggingProperties");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term128;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


