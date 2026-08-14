package com.getindata.connectors.http.internal.table.sink;

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
import static com.getindata.connectors.http.internal.table.sink.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Slf4jHttpPostRequestCallback_call_5987328081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term54;

    public Slf4jHttpPostRequestCallback_call_5987328081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.getindata.connectors.http.internal.table.sink.Slf4jHttpPostRequestCallback"));
        byte[] term5 = (byte[]) newByteArray(4);
        setByteElement(term5, 0, (byte) 47);
        setByteElement(term5, 1, (byte) 48);
        setByteElement(term5, 2, (byte) 89);
        setByteElement(term5, 3, (byte) 75);
        byte[] term10 = (byte[]) newByteArray(3);
        setByteElement(term10, 0, (byte) 18);
        setByteElement(term10, 1, (byte) -58);
        setByteElement(term10, 2, (byte) -29);
        byte[] term14 = (byte[]) newByteArray(4);
        setByteElement(term14, 0, (byte) -54);
        setByteElement(term14, 1, (byte) -10);
        setByteElement(term14, 2, (byte) 79);
        setByteElement(term14, 3, (byte) -119);
        byte[] term19 = (byte[]) newByteArray(1);
        setByteElement(term19, 0, (byte) -66);
        byte[] term21 = (byte[]) newByteArray(6);
        setByteElement(term21, 0, (byte) 83);
        setByteElement(term21, 1, (byte) 74);
        setByteElement(term21, 2, (byte) -71);
        setByteElement(term21, 3, (byte) 49);
        setByteElement(term21, 4, (byte) -54);
        setByteElement(term21, 5, (byte) 67);
        ArrayList term3 = new ArrayList();
        ((ArrayList) term3).add(term5);
        ((ArrayList) term3).add(term10);
        ((ArrayList) term3).add(term14);
        ((ArrayList) term3).add(term19);
        ((ArrayList) term3).add(term21);
        term2 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term2, term2.getClass(), "httpRequest", null);
        setField(term2, term2.getClass(), "elements", term3);
        setField(term2, term2.getClass(), "method", "PAEBtnZtTD");
        term54 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.table.sink.Slf4jHttpPostRequestCallback");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.net.http.HttpResponse");
        argTypes[1] = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.util.Map");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term2;
        args[2] = "sjlJAEtRrb";
        args[3] = term54;
        callMethod(klass, "call", argTypes, term1, args);
    }

};


