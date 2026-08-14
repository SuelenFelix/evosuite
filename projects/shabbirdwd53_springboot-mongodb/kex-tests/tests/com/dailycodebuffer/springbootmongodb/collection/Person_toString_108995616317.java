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

public class Person_toString_108995616317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3788;

    public Person_toString_108995616317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3825 = new Integer(-1456670397);
        ArrayList term3827 = new ArrayList();
        ((ArrayList) term3827).add("xClUIcPECX");
        ((ArrayList) term3827).add("avhRaGZaBF");
        Object term3857 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term3857, term3857.getClass(), "address1", "");
        setField(term3857, term3857.getClass(), "address2", "");
        setField(term3857, term3857.getClass(), "city", "");
        Object term3861 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term3861, term3861.getClass(), "address1", "");
        setField(term3861, term3861.getClass(), "address2", "");
        setField(term3861, term3861.getClass(), "city", "");
        Object term3865 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term3865, term3865.getClass(), "address1", "");
        setField(term3865, term3865.getClass(), "address2", "");
        setField(term3865, term3865.getClass(), "city", "");
        Object term3869 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term3869, term3869.getClass(), "address1", "");
        setField(term3869, term3869.getClass(), "address2", "");
        setField(term3869, term3869.getClass(), "city", "");
        Object term3873 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term3873, term3873.getClass(), "address1", "");
        setField(term3873, term3873.getClass(), "address2", "");
        setField(term3873, term3873.getClass(), "city", "");
        ArrayList term3855 = new ArrayList();
        ((ArrayList) term3855).add(term3857);
        ((ArrayList) term3855).add(term3861);
        ((ArrayList) term3855).add(term3865);
        ((ArrayList) term3855).add(term3869);
        ((ArrayList) term3855).add(term3873);
        term3788 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person"));
        setField(term3788, term3788.getClass(), "personId", "RxbhrFBjkO");
        setField(term3788, term3788.getClass(), "firstName", "aanyiAOJCl");
        setField(term3788, term3788.getClass(), "lastName", "VDokbsCuqq");
        setField(term3788, term3788.getClass(), "age", term3825);
        setField(term3788, term3788.getClass(), "hobbies", term3827);
        setField(term3788, term3788.getClass(), "addresses", term3855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3788, args);
    }

};


