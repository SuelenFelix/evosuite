package com.dailycodebuffer.springbootmongodb.collection;

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
import static com.dailycodebuffer.springbootmongodb.collection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.LinkedList;
import java.lang.Object;

public class Person_init_2820074690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term852;
     Object term854;
     Object term899;

    public Person_init_2820074690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term852 = new Integer(568599855);
        term854 = new LinkedList();
        ((LinkedList) term854).add("aKnKipADSo");
        ((LinkedList) term854).add("wSQxaModmm");
        ((LinkedList) term854).add("");
        ((LinkedList) term854).add((Object)null);
        ((LinkedList) term854).add((Object)null);
        Object term902 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term902, term902.getClass(), "address1", "BndsHwAFMv");
        setField(term902, term902.getClass(), "address2", "GzFkzHGYFt");
        setField(term902, term902.getClass(), "city", "tShwQLRGNe");
        Object term940 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term940, term940.getClass(), "address1", "");
        setField(term940, term940.getClass(), "address2", "");
        setField(term940, term940.getClass(), "city", "");
        Object term945 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term945, term945.getClass(), "address1", null);
        setField(term945, term945.getClass(), "address2", null);
        setField(term945, term945.getClass(), "city", null);
        term899 = new LinkedList();
        ((LinkedList) term899).add(term902);
        ((LinkedList) term899).add(term940);
        ((LinkedList) term899).add(term945);
        ((LinkedList) term899).add((Object)null);
        ((LinkedList) term899).add((Object)null);
        ((LinkedList) term899).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.Integer");
        argTypes[4] = Class.forName("java.util.List");
        argTypes[5] = Class.forName("java.util.List");
        Object[] args = new Object[6];
        args[0] = "xrwlQZdwCp";
        args[1] = "IDCWpPLRkE";
        args[2] = "nyiiPDVjAc";
        args[3] = term852;
        args[4] = term854;
        args[5] = term899;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


