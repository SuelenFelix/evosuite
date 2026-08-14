package com.karankumar.booksapi.model;

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
import static com.karankumar.booksapi.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Book_init_17154166820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2801;
     Object term2828;
     Object term2843;

    public Book_init_17154166820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2802 = new Long(-4325723315152823407L);
        term2801 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        setField(term2801, term2801.getClass(), "id", term2802);
        setField(term2801, term2801.getClass(), "name", "aKnKipADSo");
        Long term2829 = new Long(2535595959091595249L);
        term2828 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        setField(term2828, term2828.getClass(), "id", term2829);
        setField(term2828, term2828.getClass(), "name", "UlajhuVLaP");
        Long term2844 = new Long(-5476826692763582090L);
        term2843 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        setField(term2843, term2843.getClass(), "id", term2844);
        setField(term2843, term2843.getClass(), "formatName", "gGSMzuGICf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.karankumar.booksapi.model.language.Lang");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.karankumar.booksapi.model.genre.Genre");
        argTypes[4] = Class.forName("com.karankumar.booksapi.model.PublishingFormat");
        Object[] args = new Object[5];
        args[0] = "nyiiPDVjAc";
        args[1] = term2801;
        args[2] = "wSQxaModmm";
        args[3] = term2828;
        args[4] = term2843;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


