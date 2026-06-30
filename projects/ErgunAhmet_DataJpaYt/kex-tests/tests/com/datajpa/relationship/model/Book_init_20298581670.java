package com.datajpa.relationship.model;

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
import static com.datajpa.relationship.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;

public class Book_init_20298581670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269;
     Object term342;

    public Book_init_20298581670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term273 = new Long(6967924379644551255L);
        Long term288 = new Long(-2813493605142626659L);
        Long term292 = new Long(-8885298608300233488L);
        ArrayList term294 = new ArrayList();
        Object term272 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term287 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term291 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term272, term272.getClass(), "id", term273);
        setField(term272, term272.getClass(), "name", "uuaPigETmJ");
        setField(term287, term287.getClass(), "id", term288);
        setField(term287, term287.getClass(), "name", "");
        setField(term291, term291.getClass(), "id", term292);
        setField(term291, term291.getClass(), "name", null);
        setField(term287, term287.getClass(), "city", term291);
        setField(term272, term272.getClass(), "zipcode", term287);
        setField(term272, term272.getClass(), "books", term294);
        Long term300 = new Long(-4325723315152823407L);
        Long term304 = new Long(2535595959091595249L);
        ArrayList term306 = new ArrayList();
        Object term299 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term303 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        setField(term299, term299.getClass(), "id", term300);
        setField(term299, term299.getClass(), "name", "");
        setField(term303, term303.getClass(), "id", term304);
        setField(term303, term303.getClass(), "name", null);
        setField(term303, term303.getClass(), "city", null);
        setField(term299, term299.getClass(), "zipcode", term303);
        setField(term299, term299.getClass(), "books", term306);
        Long term311 = new Long(-872011222785455006L);
        Object term310 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        setField(term310, term310.getClass(), "id", term311);
        setField(term310, term310.getClass(), "name", null);
        setField(term310, term310.getClass(), "zipcode", null);
        setField(term310, term310.getClass(), "books", null);
        term269 = new LinkedList();
        ((LinkedList) term269).add(term272);
        ((LinkedList) term269).add(term299);
        ((LinkedList) term269).add(term310);
        ((LinkedList) term269).add((Object)null);
        ((LinkedList) term269).add((Object)null);
        Long term343 = new Long(2486810210675247493L);
        ArrayList term357 = new ArrayList();
        term342 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term342, term342.getClass(), "id", term343);
        setField(term342, term342.getClass(), "name", "flxyYxBRtu");
        setField(term342, term342.getClass(), "books", term357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Book");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("com.datajpa.relationship.model.Category");
        Object[] args = new Object[3];
        args[0] = "NRdvgJlhkX";
        args[1] = term269;
        args[2] = term342;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


