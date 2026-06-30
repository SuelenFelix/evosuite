package com.kv.webflux.logging.client;

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
import static com.kv.webflux.logging.client.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LoggingProperties_LoggingPropertiesBuilder_maskedHeaders_19649198172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term672;
     Object term847;

    public LoggingProperties_LoggingPropertiesBuilder_maskedHeaders_19649198172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term672 = newInstance(Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder"));
        Object[] term687 = (Object[]) newArray("java.lang.String", 6);
        Object[] term761 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term672, term672.getClass(), "logRequestId", true);
        setField(term672, term672.getClass(), "requestIdPrefix", "TEParAifyi");
        setBooleanField(term672, term672.getClass(), "logHeaders", false);
        setElement(term687, 0, "OWDIEULEFu");
        setElement(term687, 1, "dWRymuLBtr");
        setElement(term687, 2, "AijpHYOFuy");
        setElement(term687, 3, "SbAoxhfrkn");
        setElement(term687, 4, "kuTXqwMtDB");
        setElement(term687, 5, "Ghbwtircqb");
        setField(term672, term672.getClass(), "maskedHeaders", term687);
        setBooleanField(term672, term672.getClass(), "logCookies", false);
        setElement(term761, 0, "xrwlQZdwCp");
        setElement(term761, 1, "IDCWpPLRkE");
        setElement(term761, 2, "nyiiPDVjAc");
        setElement(term761, 3, "aKnKipADSo");
        setElement(term761, 4, "wSQxaModmm");
        setElement(term761, 5, "UlajhuVLaP");
        setElement(term761, 6, "gGSMzuGICf");
        setField(term672, term672.getClass(), "maskedCookies", term761);
        setBooleanField(term672, term672.getClass(), "logBody", true);
        term847 = (Object[]) newArray("java.lang.String", 1);
        setElement(term847, 0, "hxCBltsObl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties$LoggingPropertiesBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term847;
        callMethod(klass, "maskedHeaders", argTypes, term672, args);
    }

};


