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

public class Book_getPublishingFormat_137898553613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6005;

    public Book_getPublishingFormat_137898553613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6006 = new Long(-7291743527973326814L);
        HashMap term6021 = new HashMap();
        Set<Object> term6170 =  ((Map) term6021).keySet();
        HashSet term6020 = new HashSet((Collection<? extends Object>) term6170);
        Long term6027 = new Long(-5963439350418910964L);
        Long term6066 = new Long(9013624480170062917L);
        Integer term6080 = new Integer(1134449235);
        HashMap term6095 = new HashMap();
        Set<Object> term6221 =  ((Map) term6095).keySet();
        HashSet term6094 = new HashSet((Collection<? extends Object>) term6221);
        Long term6101 = new Long(7862575738391801707L);
        Long term6116 = new Long(50358265865610362L);
        HashMap term6155 = new HashMap();
        Set<Object> term6262 =  ((Map) term6155).keySet();
        HashSet term6154 = new HashSet((Collection<? extends Object>) term6262);
        term6005 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term6026 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term6065 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term6100 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term6115 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term6005, term6005.getClass(), "id", term6006);
        setField(term6005, term6005.getClass(), "title", "DbiCVtPPCT");
        setField(term6005, term6005.getClass(), "authors", term6020);
        setField(term6026, term6026.getClass(), "id", term6027);
        setField(term6026, term6026.getClass(), "name", "WzFopsaDuG");
        setField(term6005, term6005.getClass(), "lang", term6026);
        setField(term6005, term6005.getClass(), "isbn10", "PapWxkhEWe");
        setField(term6005, term6005.getClass(), "isbn13", "smnHEqRFRx");
        setField(term6065, term6065.getClass(), "id", term6066);
        setField(term6065, term6065.getClass(), "name", "XYtryyobou");
        setField(term6005, term6005.getClass(), "genre", term6065);
        setField(term6005, term6005.getClass(), "yearOfPublication", term6080);
        setField(term6005, term6005.getClass(), "blurb", "OYbzXylRWW");
        setField(term6005, term6005.getClass(), "publishers", term6094);
        setField(term6100, term6100.getClass(), "id", term6101);
        setField(term6100, term6100.getClass(), "formatName", "DSNsTGYXDF");
        setField(term6005, term6005.getClass(), "publishingFormat", term6100);
        setField(term6115, term6115.getClass(), "id", term6116);
        setField(term6115, term6115.getClass(), "smallUrl", "sQvGcVjdEx");
        setField(term6115, term6115.getClass(), "mediumUrl", "rLHAoqXgPh");
        setField(term6115, term6115.getClass(), "largeUrl", "zUlRdimJtU");
        setField(term6005, term6005.getClass(), "cover", term6115);
        setField(term6005, term6005.getClass(), "awards", term6154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPublishingFormat", argTypes, term6005, args);
    }

};


