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
import java.util.ArrayList;
import java.lang.Object;

public class Person_hashCode_57919647316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3555;

    public Person_hashCode_57919647316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3592 = new Integer(-1685132342);
        ArrayList term3594 = new ArrayList();
        ((ArrayList) term3594).add("wdoqITnaAP");
        ((ArrayList) term3594).add("rIPMBcrNqB");
        ((ArrayList) term3594).add("UDaboHZHhz");
        ((ArrayList) term3594).add("nRvKihUSPj");
        ((ArrayList) term3594).add("BbNeQJpYPr");
        ((ArrayList) term3594).add("riMtzCoxNj");
        Object term3672 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term3672, term3672.getClass(), "address1", "");
        setField(term3672, term3672.getClass(), "address2", "");
        setField(term3672, term3672.getClass(), "city", "");
        Object term3676 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term3676, term3676.getClass(), "address1", "");
        setField(term3676, term3676.getClass(), "address2", "");
        setField(term3676, term3676.getClass(), "city", "");
        Object term3680 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term3680, term3680.getClass(), "address1", "");
        setField(term3680, term3680.getClass(), "address2", "");
        setField(term3680, term3680.getClass(), "city", "");
        Object term3684 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term3684, term3684.getClass(), "address1", "");
        setField(term3684, term3684.getClass(), "address2", "");
        setField(term3684, term3684.getClass(), "city", "");
        Object term3688 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term3688, term3688.getClass(), "address1", "");
        setField(term3688, term3688.getClass(), "address2", "");
        setField(term3688, term3688.getClass(), "city", "");
        Object term3692 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term3692, term3692.getClass(), "address1", "");
        setField(term3692, term3692.getClass(), "address2", "");
        setField(term3692, term3692.getClass(), "city", "");
        ArrayList term3670 = new ArrayList();
        ((ArrayList) term3670).add(term3672);
        ((ArrayList) term3670).add(term3676);
        ((ArrayList) term3670).add(term3680);
        ((ArrayList) term3670).add(term3684);
        ((ArrayList) term3670).add(term3688);
        ((ArrayList) term3670).add(term3692);
        term3555 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person"));
        setField(term3555, term3555.getClass(), "personId", "aQFUvuaYxd");
        setField(term3555, term3555.getClass(), "firstName", "zNFLXMifnS");
        setField(term3555, term3555.getClass(), "lastName", "HHQcYMSBVc");
        setField(term3555, term3555.getClass(), "age", term3592);
        setField(term3555, term3555.getClass(), "hobbies", term3594);
        setField(term3555, term3555.getClass(), "addresses", term3670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3555, args);
    }

};


