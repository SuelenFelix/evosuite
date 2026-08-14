package com.getindata.connectors.http.internal.sink.httpclient;

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
import static com.getindata.connectors.http.internal.sink.httpclient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class JavaNetHttpResponseWrapper_toString_11958530515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1778;

    public JavaNetHttpResponseWrapper_toString_11958530515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        byte[] term1782 = (byte[]) newByteArray(3);
        setByteElement(term1782, 0, (byte) 93);
        setByteElement(term1782, 1, (byte) -60);
        setByteElement(term1782, 2, (byte) -4);
        byte[] term1786 = (byte[]) newByteArray(4);
        setByteElement(term1786, 0, (byte) 28);
        setByteElement(term1786, 1, (byte) 94);
        setByteElement(term1786, 3, (byte) -96);
        byte[] term1791 = (byte[]) newByteArray(8);
        setByteElement(term1791, 0, (byte) -88);
        setByteElement(term1791, 1, (byte) -73);
        setByteElement(term1791, 2, (byte) 105);
        setByteElement(term1791, 3, (byte) -86);
        setByteElement(term1791, 4, (byte) 84);
        setByteElement(term1791, 5, (byte) -70);
        setByteElement(term1791, 6, (byte) 84);
        setByteElement(term1791, 7, (byte) 114);
        byte[] term1800 = (byte[]) newByteArray(0);
        byte[] term1801 = (byte[]) newByteArray(4);
        setByteElement(term1801, 0, (byte) 60);
        setByteElement(term1801, 1, (byte) -20);
        setByteElement(term1801, 2, (byte) 100);
        setByteElement(term1801, 3, (byte) -41);
        ArrayList term1780 = new ArrayList();
        ((ArrayList) term1780).add(term1782);
        ((ArrayList) term1780).add(term1786);
        ((ArrayList) term1780).add(term1791);
        ((ArrayList) term1780).add(term1800);
        ((ArrayList) term1780).add(term1801);
        term1778 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetHttpResponseWrapper"));
        Object term1779 = newInstance(Class.forName("com.getindata.connectors.http.internal.sink.httpclient.HttpRequest"));
        setField(term1779, term1779.getClass(), "httpRequest", null);
        setField(term1779, term1779.getClass(), "elements", term1780);
        setField(term1779, term1779.getClass(), "method", "ieCtQFdkii");
        setField(term1778, term1778.getClass(), "httpRequest", term1779);
        setField(term1778, term1778.getClass(), "response", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.sink.httpclient.JavaNetHttpResponseWrapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1778, args);
    }

};


