package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Department_getAddr_16742937023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445;

    public Department_getAddr_16742937023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term446 = new Integer(-112921587);
        Integer term484 = new Integer(933028652);
        Integer term489 = new Integer(287287233);
        Integer term494 = new Integer(962840079);
        ArrayList term496 = new ArrayList();
        ((ArrayList) term496).add((Object)null);
        ArrayList term499 = new ArrayList();
        ((ArrayList) term499).add((Object)null);
        ((ArrayList) term499).add((Object)null);
        Object term488 = newInstance(Class.forName("com.org.model.Department"));
        setField(term488, term488.getClass(), "id", term489);
        setField(term488, term488.getClass(), "partname", "");
        setField(term488, term488.getClass(), "addr", "");
        setField(term488, term488.getClass(), "introduce", "");
        setField(term488, term488.getClass(), "parentid", term494);
        setField(term488, term488.getClass(), "departments", term496);
        setField(term488, term488.getClass(), "users", term499);
        Integer term503 = new Integer(9726679);
        Integer term508 = new Integer(-25637976);
        ArrayList term510 = new ArrayList();
        ((ArrayList) term510).add((Object)null);
        ((ArrayList) term510).add((Object)null);
        ((ArrayList) term510).add((Object)null);
        ((ArrayList) term510).add((Object)null);
        ((ArrayList) term510).add((Object)null);
        ((ArrayList) term510).add((Object)null);
        ((ArrayList) term510).add((Object)null);
        ArrayList term513 = new ArrayList();
        ((ArrayList) term513).add((Object)null);
        ((ArrayList) term513).add((Object)null);
        ((ArrayList) term513).add((Object)null);
        ((ArrayList) term513).add((Object)null);
        ((ArrayList) term513).add((Object)null);
        ((ArrayList) term513).add((Object)null);
        ((ArrayList) term513).add((Object)null);
        ((ArrayList) term513).add((Object)null);
        Object term502 = newInstance(Class.forName("com.org.model.Department"));
        setField(term502, term502.getClass(), "id", term503);
        setField(term502, term502.getClass(), "partname", "");
        setField(term502, term502.getClass(), "addr", "");
        setField(term502, term502.getClass(), "introduce", "");
        setField(term502, term502.getClass(), "parentid", term508);
        setField(term502, term502.getClass(), "departments", term510);
        setField(term502, term502.getClass(), "users", term513);
        Integer term517 = new Integer(1540719661);
        Integer term522 = new Integer(1265463001);
        ArrayList term524 = new ArrayList();
        ArrayList term527 = new ArrayList();
        ((ArrayList) term527).add((Object)null);
        ((ArrayList) term527).add((Object)null);
        ((ArrayList) term527).add((Object)null);
        ((ArrayList) term527).add((Object)null);
        ((ArrayList) term527).add((Object)null);
        ((ArrayList) term527).add((Object)null);
        Object term516 = newInstance(Class.forName("com.org.model.Department"));
        setField(term516, term516.getClass(), "id", term517);
        setField(term516, term516.getClass(), "partname", "");
        setField(term516, term516.getClass(), "addr", "");
        setField(term516, term516.getClass(), "introduce", "");
        setField(term516, term516.getClass(), "parentid", term522);
        setField(term516, term516.getClass(), "departments", term524);
        setField(term516, term516.getClass(), "users", term527);
        Integer term531 = new Integer(1830648570);
        Integer term536 = new Integer(-227365013);
        ArrayList term538 = new ArrayList();
        ArrayList term541 = new ArrayList();
        ((ArrayList) term541).add((Object)null);
        ((ArrayList) term541).add((Object)null);
        ((ArrayList) term541).add((Object)null);
        ((ArrayList) term541).add((Object)null);
        Object term530 = newInstance(Class.forName("com.org.model.Department"));
        setField(term530, term530.getClass(), "id", term531);
        setField(term530, term530.getClass(), "partname", "");
        setField(term530, term530.getClass(), "addr", "");
        setField(term530, term530.getClass(), "introduce", "");
        setField(term530, term530.getClass(), "parentid", term536);
        setField(term530, term530.getClass(), "departments", term538);
        setField(term530, term530.getClass(), "users", term541);
        ArrayList term486 = new ArrayList();
        ((ArrayList) term486).add(term488);
        ((ArrayList) term486).add(term502);
        ((ArrayList) term486).add(term516);
        ((ArrayList) term486).add(term530);
        ((ArrayList) term486).add(term445);
        ArrayList term546 = new ArrayList();
        term445 = newInstance(Class.forName("com.org.model.Department"));
        setField(term445, term445.getClass(), "id", term446);
        setField(term445, term445.getClass(), "partname", "tlQSNgTkQX");
        setField(term445, term445.getClass(), "addr", "PCipZnmBOF");
        setField(term445, term445.getClass(), "introduce", "zcorEihhLK");
        setField(term445, term445.getClass(), "parentid", term484);
        setField(term445, term445.getClass(), "departments", term486);
        setField(term445, term445.getClass(), "users", term546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddr", argTypes, term445, args);
    }

};


