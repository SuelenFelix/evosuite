package com.pgssoft.httpclient;

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
import static com.pgssoft.httpclient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class HttpClientMock_onDelete_184720345916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17673;

    public HttpClientMock_onDelete_184720345916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17675 = new ArrayList();
        ArrayList term17679 = new ArrayList();
        ArrayList term17685 = new ArrayList();
        term17673 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientMock"));
        Object term17674 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
        setField(term17673, term17673.getClass(), "debugger", term17674);
        setField(term17673, term17673.getClass(), "rules", term17675);
        setField(term17673, term17673.getClass(), "rulesUnderConstruction", term17679);
        setField(term17673, term17673.getClass(), "host", "");
        setField(term17673, term17673.getClass(), "requests", term17685);
        setBooleanField(term17673, term17673.getClass(), "debuggingOn", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientMock");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VgZnGoIFwQ";
        callMethod(klass, "onDelete", argTypes, term17673, args);
    }

};


