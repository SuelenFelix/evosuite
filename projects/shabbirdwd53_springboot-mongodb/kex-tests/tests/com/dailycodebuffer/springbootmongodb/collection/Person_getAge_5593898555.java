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

public class Person_getAge_5593898555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1634;

    public Person_getAge_5593898555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1671 = new Integer(-1922583790);
        ArrayList term1673 = new ArrayList();
        ((ArrayList) term1673).add("xBsXSDjXYK");
        ((ArrayList) term1673).add("sEnIVFtZuQ");
        ((ArrayList) term1673).add("ZVecLZMLHF");
        ((ArrayList) term1673).add("fztQhjqwdP");
        ((ArrayList) term1673).add("eVpkWxjuki");
        ((ArrayList) term1673).add("SJiQaLvSKv");
        Object term1751 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term1751, term1751.getClass(), "address1", "");
        setField(term1751, term1751.getClass(), "address2", "");
        setField(term1751, term1751.getClass(), "city", "");
        Object term1755 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term1755, term1755.getClass(), "address1", "");
        setField(term1755, term1755.getClass(), "address2", "");
        setField(term1755, term1755.getClass(), "city", "");
        Object term1759 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term1759, term1759.getClass(), "address1", "");
        setField(term1759, term1759.getClass(), "address2", "");
        setField(term1759, term1759.getClass(), "city", "");
        Object term1763 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term1763, term1763.getClass(), "address1", "");
        setField(term1763, term1763.getClass(), "address2", "");
        setField(term1763, term1763.getClass(), "city", "");
        Object term1767 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term1767, term1767.getClass(), "address1", "");
        setField(term1767, term1767.getClass(), "address2", "");
        setField(term1767, term1767.getClass(), "city", "");
        Object term1771 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term1771, term1771.getClass(), "address1", "");
        setField(term1771, term1771.getClass(), "address2", "");
        setField(term1771, term1771.getClass(), "city", "");
        Object term1775 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Address"));
        setField(term1775, term1775.getClass(), "address1", "");
        setField(term1775, term1775.getClass(), "address2", "");
        setField(term1775, term1775.getClass(), "city", "");
        ArrayList term1749 = new ArrayList();
        ((ArrayList) term1749).add(term1751);
        ((ArrayList) term1749).add(term1755);
        ((ArrayList) term1749).add(term1759);
        ((ArrayList) term1749).add(term1763);
        ((ArrayList) term1749).add(term1767);
        ((ArrayList) term1749).add(term1771);
        ((ArrayList) term1749).add(term1775);
        term1634 = newInstance(Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person"));
        setField(term1634, term1634.getClass(), "personId", "vjxIhXHxGR");
        setField(term1634, term1634.getClass(), "firstName", "QXzGXbEXMu");
        setField(term1634, term1634.getClass(), "lastName", "qxSDVejjiY");
        setField(term1634, term1634.getClass(), "age", term1671);
        setField(term1634, term1634.getClass(), "hobbies", term1673);
        setField(term1634, term1634.getClass(), "addresses", term1749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dailycodebuffer.springbootmongodb.collection.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAge", argTypes, term1634, args);
    }

};


