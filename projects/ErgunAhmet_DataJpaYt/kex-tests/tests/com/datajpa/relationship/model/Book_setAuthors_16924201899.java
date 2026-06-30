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
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class Book_setAuthors_16924201899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1037;
     Object term1075;

    public Book_setAuthors_16924201899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1038 = new Long(-4443169559037975007L);
        ArrayList term1052 = new ArrayList();
        Long term1057 = new Long(-3842548265506930260L);
        ArrayList term1071 = new ArrayList();
        term1037 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term1056 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term1037, term1037.getClass(), "id", term1038);
        setField(term1037, term1037.getClass(), "name", "nGKItKLYNC");
        setField(term1037, term1037.getClass(), "authors", term1052);
        setField(term1056, term1056.getClass(), "id", term1057);
        setField(term1056, term1056.getClass(), "name", "UiUYnPrcCi");
        setField(term1056, term1056.getClass(), "books", term1071);
        setField(term1037, term1037.getClass(), "category", term1056);
        Long term1079 = new Long(-5788180182343976541L);
        Long term1094 = new Long(2936323121573284007L);
        Long term1098 = new Long(-1154553077993834885L);
        ArrayList term1100 = new ArrayList();
        Object term1078 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term1093 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term1097 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term1078, term1078.getClass(), "id", term1079);
        setField(term1078, term1078.getClass(), "name", "UoYtihxVaS");
        setField(term1093, term1093.getClass(), "id", term1094);
        setField(term1093, term1093.getClass(), "name", "");
        setField(term1097, term1097.getClass(), "id", term1098);
        setField(term1097, term1097.getClass(), "name", null);
        setField(term1093, term1093.getClass(), "city", term1097);
        setField(term1078, term1078.getClass(), "zipcode", term1093);
        setField(term1078, term1078.getClass(), "books", term1100);
        Long term1106 = new Long(-2850532706972744550L);
        Long term1110 = new Long(-2644215923136513282L);
        ArrayList term1112 = new ArrayList();
        Object term1105 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term1109 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        setField(term1105, term1105.getClass(), "id", term1106);
        setField(term1105, term1105.getClass(), "name", "");
        setField(term1109, term1109.getClass(), "id", term1110);
        setField(term1109, term1109.getClass(), "name", null);
        setField(term1109, term1109.getClass(), "city", null);
        setField(term1105, term1105.getClass(), "zipcode", term1109);
        setField(term1105, term1105.getClass(), "books", term1112);
        Long term1117 = new Long(-7738503207562305297L);
        Object term1116 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        setField(term1116, term1116.getClass(), "id", term1117);
        setField(term1116, term1116.getClass(), "name", null);
        setField(term1116, term1116.getClass(), "zipcode", null);
        setField(term1116, term1116.getClass(), "books", null);
        term1075 = new LinkedList();
        ((LinkedList) term1075).add(term1078);
        ((LinkedList) term1075).add(term1105);
        ((LinkedList) term1075).add(term1116);
        ((LinkedList) term1075).add((Object)null);
        ((LinkedList) term1075).add((Object)null);
        ((LinkedList) term1075).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1075;
        callMethod(klass, "setAuthors", argTypes, term1037, args);
    }

};


