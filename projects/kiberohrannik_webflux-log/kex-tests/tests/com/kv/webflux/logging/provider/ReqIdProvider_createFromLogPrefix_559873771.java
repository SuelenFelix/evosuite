package com.kv.webflux.logging.provider;

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
import static com.kv.webflux.logging.provider.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReqIdProvider_createFromLogPrefix_559873771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term14;

    public ReqIdProvider_createFromLogPrefix_559873771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.kv.webflux.logging.provider.ReqIdProvider"));
        term14 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties"));
        Object[] term29 = (Object[]) newArray("java.lang.String", 5);
        Object[] term91 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term14, term14.getClass(), "logRequestId", false);
        setField(term14, term14.getClass(), "requestIdPrefix", "sjlJAEtRrb");
        setBooleanField(term14, term14.getClass(), "logHeaders", false);
        setElement(term29, 0, "MuLcgQHgqz");
        setElement(term29, 1, "xxtlPwDYFs");
        setElement(term29, 2, "jJCZpVmanW");
        setElement(term29, 3, "EGtDIRbSSb");
        setElement(term29, 4, "SzjVpOQTyS");
        setField(term14, term14.getClass(), "maskedHeaders", term29);
        setBooleanField(term14, term14.getClass(), "logCookies", false);
        setElement(term91, 0, "MjGYSRKTNF");
        setElement(term91, 1, "hRNSzYYIrc");
        setElement(term91, 2, "RMFIsYGgne");
        setElement(term91, 3, "NRdvgJlhkX");
        setField(term14, term14.getClass(), "maskedCookies", term91);
        setBooleanField(term14, term14.getClass(), "logBody", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.provider.ReqIdProvider");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.kv.webflux.logging.client.LoggingProperties");
        Object[] args = new Object[2];
        args[0] = "PAEBtnZtTD";
        args[1] = term14;
        callMethod(klass, "createFromLogPrefix", argTypes, term1, args);
    }

};


