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

public class Book_getId_5604733703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term665;

    public Book_getId_5604733703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term666 = new Long(1233889271256172047L);
        ArrayList term680 = new ArrayList();
        Long term685 = new Long(6617340557564669657L);
        ArrayList term699 = new ArrayList();
        term665 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term684 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term665, term665.getClass(), "id", term666);
        setField(term665, term665.getClass(), "name", "IDCWpPLRkE");
        setField(term665, term665.getClass(), "authors", term680);
        setField(term684, term684.getClass(), "id", term685);
        setField(term684, term684.getClass(), "name", "nyiiPDVjAc");
        setField(term684, term684.getClass(), "books", term699);
        setField(term665, term665.getClass(), "category", term684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term665, args);
    }

};


