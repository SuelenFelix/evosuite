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
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedList;

public class Author_setBooks_164715548510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3712;
     Object term3761;

    public Author_setBooks_164715548510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3713 = new Long(4100236067313034103L);
        Long term3728 = new Long(1195529027276497124L);
        Long term3743 = new Long(-2783999800714825789L);
        ArrayList term3757 = new ArrayList();
        term3712 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term3727 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term3742 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term3712, term3712.getClass(), "id", term3713);
        setField(term3712, term3712.getClass(), "name", "WzFopsaDuG");
        setField(term3727, term3727.getClass(), "id", term3728);
        setField(term3727, term3727.getClass(), "name", "PapWxkhEWe");
        setField(term3742, term3742.getClass(), "id", term3743);
        setField(term3742, term3742.getClass(), "name", "smnHEqRFRx");
        setField(term3727, term3727.getClass(), "city", term3742);
        setField(term3712, term3712.getClass(), "zipcode", term3727);
        setField(term3712, term3712.getClass(), "books", term3757);
        term3761 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3761;
        callMethod(klass, "setBooks", argTypes, term3712, args);
    }

};


