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

public class Book_setName_4082853738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term957;

    public Book_setName_4082853738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term958 = new Long(-2170847986967241072L);
        ArrayList term972 = new ArrayList();
        Long term977 = new Long(4044358158040652353L);
        ArrayList term991 = new ArrayList();
        term957 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term976 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term957, term957.getClass(), "id", term958);
        setField(term957, term957.getClass(), "name", "LvtrsXUliU");
        setField(term957, term957.getClass(), "authors", term972);
        setField(term976, term976.getClass(), "id", term977);
        setField(term976, term976.getClass(), "name", "xLbjWUgOIL");
        setField(term976, term976.getClass(), "books", term991);
        setField(term957, term957.getClass(), "category", term976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jDtqGUpnZN";
        callMethod(klass, "setName", argTypes, term957, args);
    }

};


