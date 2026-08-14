package org.example.toylanguage.statement;

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
import static org.example.toylanguage.statement.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class HandleExceptionStatement_getErrorVariable_20755356155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1908;

    public HandleExceptionStatement_getErrorVariable_20755356155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1910 = new ArrayList();
        ((ArrayList) term1910).add((Object)null);
        ((ArrayList) term1910).add((Object)null);
        ((ArrayList) term1910).add((Object)null);
        Integer term1914 = new Integer(1328271830);
        ArrayList term1929 = new ArrayList();
        ((ArrayList) term1929).add((Object)null);
        ((ArrayList) term1929).add((Object)null);
        ((ArrayList) term1929).add((Object)null);
        ((ArrayList) term1929).add((Object)null);
        ((ArrayList) term1929).add((Object)null);
        ((ArrayList) term1929).add((Object)null);
        ((ArrayList) term1929).add((Object)null);
        Integer term1933 = new Integer(1596070772);
        ArrayList term1948 = new ArrayList();
        ((ArrayList) term1948).add((Object)null);
        ((ArrayList) term1948).add((Object)null);
        Integer term1952 = new Integer(97029295);
        Integer term1978 = new Integer(-1371869594);
        term1908 = newInstance(Class.forName("org.example.toylanguage.statement.HandleExceptionStatement"));
        Object term1909 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        Object term1928 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        Object term1947 = newInstance(Class.forName("org.example.toylanguage.statement.CompositeStatement"));
        setField(term1909, term1909.getClass(), "statements2Execute", term1910);
        setField(term1909, term1909.getClass(), "rowNumber", term1914);
        setField(term1909, term1909.getClass(), "blockName", "KoyGrUJeJW");
        setField(term1908, term1908.getClass(), "beginStatement", term1909);
        setField(term1928, term1928.getClass(), "statements2Execute", term1929);
        setField(term1928, term1928.getClass(), "rowNumber", term1933);
        setField(term1928, term1928.getClass(), "blockName", "HqBOwkVqjD");
        setField(term1908, term1908.getClass(), "rescueStatement", term1928);
        setField(term1947, term1947.getClass(), "statements2Execute", term1948);
        setField(term1947, term1947.getClass(), "rowNumber", term1952);
        setField(term1947, term1947.getClass(), "blockName", "MAcUBcBckh");
        setField(term1908, term1908.getClass(), "ensureStatement", term1947);
        setField(term1908, term1908.getClass(), "errorVariable", "oVgzLbrsFr");
        setField(term1908, term1908.getClass(), "rowNumber", term1978);
        setField(term1908, term1908.getClass(), "blockName", "vQVyKLdtaz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.HandleExceptionStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getErrorVariable", argTypes, term1908, args);
    }

};


