package com.leanstacks.ws.security;

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
import static com.leanstacks.ws.security.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;
import java.util.LinkedList;

public class CorsProperties_setAllowedMethods_21332398638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1142;
     Object term1303;

    public CorsProperties_setAllowedMethods_21332398638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1148 = new Boolean(false);
        ArrayList term1189 = new ArrayList();
        ((ArrayList) term1189).add("TEParAifyi");
        ((ArrayList) term1189).add("OWDIEULEFu");
        ((ArrayList) term1189).add("dWRymuLBtr");
        ((ArrayList) term1189).add("AijpHYOFuy");
        ((ArrayList) term1189).add("SbAoxhfrkn");
        ((ArrayList) term1189).add("kuTXqwMtDB");
        ((ArrayList) term1189).add("Ghbwtircqb");
        ((ArrayList) term1189).add("xrwlQZdwCp");
        ((ArrayList) term1189).add("IDCWpPLRkE");
        Long term1301 = new Long(1800L);
        term1142 = newInstance(Class.forName("com.leanstacks.ws.security.CorsProperties"));
        Object term1150 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1151 = (Object[]) newArray("java.lang.String", 2);
        Object term1175 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1176 = (Object[]) newArray("java.lang.String", 1);
        Object term1183 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term1184 = (Object[]) newArray("java.lang.String", 1);
        setField(term1142, term1142.getClass(), "filterRegistrationPath", "/**");
        setField(term1142, term1142.getClass(), "allowCredentials", term1148);
        setElement(term1151, 0, "accept");
        setElement(term1151, 1, "content-type");
        setField(term1150, term1150.getClass(), "a", term1151);
        setIntField(term1150, term1150.getClass(), "modCount", 0);
        setField(term1142, term1142.getClass(), "allowedHeaders", term1150);
        setElement(term1176, 0, "GET");
        setField(term1175, term1175.getClass(), "a", term1176);
        setIntField(term1175, term1175.getClass(), "modCount", 0);
        setField(term1142, term1142.getClass(), "allowedMethods", term1175);
        setElement(term1184, 0, "*");
        setField(term1183, term1183.getClass(), "a", term1184);
        setIntField(term1183, term1183.getClass(), "modCount", 0);
        setField(term1142, term1142.getClass(), "allowedOrigins", term1183);
        setField(term1142, term1142.getClass(), "exposedHeaders", term1189);
        setField(term1142, term1142.getClass(), "maxAgeSeconds", term1301);
        term1303 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.security.CorsProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1303;
        callMethod(klass, "setAllowedMethods", argTypes, term1142, args);
    }

};


