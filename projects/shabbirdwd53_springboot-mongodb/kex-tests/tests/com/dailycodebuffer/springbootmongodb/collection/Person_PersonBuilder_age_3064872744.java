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

public class Person_PersonBuilder_age_3064872744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4885;
     Object term5012;

    public Person_PersonBuilder_age_3064872744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4922 = new Integer(-6029667);
        ArrayList term4924 = new ArrayList();
        ((ArrayList) term4924).add("PSizQDoxxe");
        ((ArrayList) term4924).add("mKaHyMybrK");
        ((ArrayList) term4924).add("AyrEXuGrEj");
        ((ArrayList) term4924).add("yevIIoVYHq");
        Object term4978 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4978, term4978.getClass(), "address1", "");
        setField(term4978, term4978.getClass(), "address2", "");
        setField(term4978, term4978.getClass(), "city", "");
        Object term4982 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4982, term4982.getClass(), "address1", "");
        setField(term4982, term4982.getClass(), "address2", "");
        setField(term4982, term4982.getClass(), "city", "");
        Object term4986 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4986, term4986.getClass(), "address1", "");
        setField(term4986, term4986.getClass(), "address2", "");
        setField(term4986, term4986.getClass(), "city", "");
        Object term4990 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4990, term4990.getClass(), "address1", "");
        setField(term4990, term4990.getClass(), "address2", "");
        setField(term4990, term4990.getClass(), "city", "");
        Object term4994 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4994, term4994.getClass(), "address1", "");
        setField(term4994, term4994.getClass(), "address2", "");
        setField(term4994, term4994.getClass(), "city", "");
        Object term4998 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term4998, term4998.getClass(), "address1", "");
        setField(term4998, term4998.getClass(), "address2", "");
        setField(term4998, term4998.getClass(), "city", "");
        Object term5002 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term5002, term5002.getClass(), "address1", "");
        setField(term5002, term5002.getClass(), "address2", "");
        setField(term5002, term5002.getClass(), "city", "");
        Object term5006 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term5006, term5006.getClass(), "address1", "");
        setField(term5006, term5006.getClass(), "address2", "");
        setField(term5006, term5006.getClass(), "city", "");
        ArrayList term4976 = new ArrayList();
        ((ArrayList) term4976).add(term4978);
        ((ArrayList) term4976).add(term4982);
        ((ArrayList) term4976).add(term4986);
        ((ArrayList) term4976).add(term4990);
        ((ArrayList) term4976).add(term4994);
        ((ArrayList) term4976).add(term4998);
        ((ArrayList) term4976).add(term5002);
        ((ArrayList) term4976).add(term5006);
        term4885 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person$PersonBuilder"));
        setField(term4885, term4885.getClass(), "personId", "weddIktxOA");
        setField(term4885, term4885.getClass(), "firstName", "uSlMeISsDD");
        setField(term4885, term4885.getClass(), "lastName", "WdCiTDUKqn");
        setField(term4885, term4885.getClass(), "age", term4922);
        setField(term4885, term4885.getClass(), "hobbies", term4924);
        setField(term4885, term4885.getClass(), "addresses", term4976);
        term5012 = new Integer(-2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person$PersonBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term5012;
        callMethod(klass, "age", argTypes, term4885, args);
    }

};


