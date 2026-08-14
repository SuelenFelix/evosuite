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

public class Person_PersonBuilder_build_3622210137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5521;

    public Person_PersonBuilder_build_3622210137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5558 = new Integer(1135664017);
        ArrayList term5560 = new ArrayList();
        ((ArrayList) term5560).add("OirVUQhauU");
        ((ArrayList) term5560).add("GLbyDfbNZI");
        ((ArrayList) term5560).add("oNLcCYDAsO");
        ((ArrayList) term5560).add("CNqMxLvtcJ");
        ((ArrayList) term5560).add("ktbqerIaKW");
        ((ArrayList) term5560).add("VoghngXfsK");
        ((ArrayList) term5560).add("GbahCBMvct");
        ((ArrayList) term5560).add("iiHBhsNFgk");
        Object term5662 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term5662, term5662.getClass(), "address1", "");
        setField(term5662, term5662.getClass(), "address2", "");
        setField(term5662, term5662.getClass(), "city", "");
        Object term5666 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term5666, term5666.getClass(), "address1", "");
        setField(term5666, term5666.getClass(), "address2", "");
        setField(term5666, term5666.getClass(), "city", "");
        Object term5670 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term5670, term5670.getClass(), "address1", "");
        setField(term5670, term5670.getClass(), "address2", "");
        setField(term5670, term5670.getClass(), "city", "");
        Object term5674 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term5674, term5674.getClass(), "address1", "");
        setField(term5674, term5674.getClass(), "address2", "");
        setField(term5674, term5674.getClass(), "city", "");
        Object term5678 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term5678, term5678.getClass(), "address1", "");
        setField(term5678, term5678.getClass(), "address2", "");
        setField(term5678, term5678.getClass(), "city", "");
        Object term5682 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term5682, term5682.getClass(), "address1", "");
        setField(term5682, term5682.getClass(), "address2", "");
        setField(term5682, term5682.getClass(), "city", "");
        Object term5686 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term5686, term5686.getClass(), "address1", "");
        setField(term5686, term5686.getClass(), "address2", "");
        setField(term5686, term5686.getClass(), "city", "");
        Object term5690 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term5690, term5690.getClass(), "address1", "");
        setField(term5690, term5690.getClass(), "address2", "");
        setField(term5690, term5690.getClass(), "city", "");
        Object term5694 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term5694, term5694.getClass(), "address1", "");
        setField(term5694, term5694.getClass(), "address2", "");
        setField(term5694, term5694.getClass(), "city", "");
        ArrayList term5660 = new ArrayList();
        ((ArrayList) term5660).add(term5662);
        ((ArrayList) term5660).add(term5666);
        ((ArrayList) term5660).add(term5670);
        ((ArrayList) term5660).add(term5674);
        ((ArrayList) term5660).add(term5678);
        ((ArrayList) term5660).add(term5682);
        ((ArrayList) term5660).add(term5686);
        ((ArrayList) term5660).add(term5690);
        ((ArrayList) term5660).add(term5694);
        term5521 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person$PersonBuilder"));
        setField(term5521, term5521.getClass(), "personId", "UxgSdhxPCH");
        setField(term5521, term5521.getClass(), "firstName", "DAujxZPHJC");
        setField(term5521, term5521.getClass(), "lastName", "IlBhdrCvHq");
        setField(term5521, term5521.getClass(), "age", term5558);
        setField(term5521, term5521.getClass(), "hobbies", term5560);
        setField(term5521, term5521.getClass(), "addresses", term5660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person$PersonBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term5521, args);
    }

};


