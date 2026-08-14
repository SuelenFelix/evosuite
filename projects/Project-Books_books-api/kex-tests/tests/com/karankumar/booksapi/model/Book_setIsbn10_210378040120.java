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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class Book_setIsbn10_210378040120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7874;

    public Book_setIsbn10_210378040120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7875 = new Long(1667122142089513324L);
        HashMap term7890 = new HashMap();
        Set<Object> term8051 =  ((Map) term7890).keySet();
        HashSet term7889 = new HashSet((Collection<? extends Object>) term8051);
        Long term7896 = new Long(-6342139649364011743L);
        Long term7935 = new Long(-4924950707540628022L);
        Integer term7949 = new Integer(1048535127);
        HashMap term7964 = new HashMap();
        Set<Object> term8102 =  ((Map) term7964).keySet();
        HashSet term7963 = new HashSet((Collection<? extends Object>) term8102);
        Long term7970 = new Long(-4393710401270724527L);
        Long term7985 = new Long(-4822736661741380518L);
        HashMap term8024 = new HashMap();
        Set<Object> term8143 =  ((Map) term8024).keySet();
        HashSet term8023 = new HashSet((Collection<? extends Object>) term8143);
        term7874 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term7895 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term7934 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term7969 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term7984 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term7874, term7874.getClass(), "id", term7875);
        setField(term7874, term7874.getClass(), "title", "ShIELyuULw");
        setField(term7874, term7874.getClass(), "authors", term7889);
        setField(term7895, term7895.getClass(), "id", term7896);
        setField(term7895, term7895.getClass(), "name", "IpQuOGMgmj");
        setField(term7874, term7874.getClass(), "lang", term7895);
        setField(term7874, term7874.getClass(), "isbn10", "pJbnHTYrxn");
        setField(term7874, term7874.getClass(), "isbn13", "iIRsCSYqXH");
        setField(term7934, term7934.getClass(), "id", term7935);
        setField(term7934, term7934.getClass(), "name", "nghfqDXyCG");
        setField(term7874, term7874.getClass(), "genre", term7934);
        setField(term7874, term7874.getClass(), "yearOfPublication", term7949);
        setField(term7874, term7874.getClass(), "blurb", "WBAOTqErtm");
        setField(term7874, term7874.getClass(), "publishers", term7963);
        setField(term7969, term7969.getClass(), "id", term7970);
        setField(term7969, term7969.getClass(), "formatName", "PqtVXXZMqK");
        setField(term7874, term7874.getClass(), "publishingFormat", term7969);
        setField(term7984, term7984.getClass(), "id", term7985);
        setField(term7984, term7984.getClass(), "smallUrl", "rYbtIDVdnd");
        setField(term7984, term7984.getClass(), "mediumUrl", "UKAReurpHG");
        setField(term7984, term7984.getClass(), "largeUrl", "WVRMUmrljA");
        setField(term7874, term7874.getClass(), "cover", term7984);
        setField(term7874, term7874.getClass(), "awards", term8023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NTlKJDDWlk";
        callMethod(klass, "setIsbn10", argTypes, term7874, args);
    }

};


