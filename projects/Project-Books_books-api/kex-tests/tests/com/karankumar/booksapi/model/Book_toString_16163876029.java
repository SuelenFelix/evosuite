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

public class Book_toString_16163876029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10397;

    public Book_toString_16163876029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10398 = new Long(-2783999800714825789L);
        HashMap term10413 = new HashMap();
        Set<Object> term10562 =  ((Map) term10413).keySet();
        HashSet term10412 = new HashSet((Collection<? extends Object>) term10562);
        Long term10419 = new Long(4266570509071948633L);
        Long term10458 = new Long(-7291742736502427077L);
        Integer term10472 = new Integer(-244121226);
        HashMap term10487 = new HashMap();
        Set<Object> term10613 =  ((Map) term10487).keySet();
        HashSet term10486 = new HashSet((Collection<? extends Object>) term10613);
        Long term10493 = new Long(-8121849829073967555L);
        Long term10508 = new Long(5219030281405653303L);
        HashMap term10547 = new HashMap();
        Set<Object> term10654 =  ((Map) term10547).keySet();
        HashSet term10546 = new HashSet((Collection<? extends Object>) term10654);
        term10397 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term10418 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term10457 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term10492 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term10507 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term10397, term10397.getClass(), "id", term10398);
        setField(term10397, term10397.getClass(), "title", "GPSEWEDSTo");
        setField(term10397, term10397.getClass(), "authors", term10412);
        setField(term10418, term10418.getClass(), "id", term10419);
        setField(term10418, term10418.getClass(), "name", "RCOqfVsRHt");
        setField(term10397, term10397.getClass(), "lang", term10418);
        setField(term10397, term10397.getClass(), "isbn10", "TSyCeEZPaT");
        setField(term10397, term10397.getClass(), "isbn13", "JeZFtaqkzW");
        setField(term10457, term10457.getClass(), "id", term10458);
        setField(term10457, term10457.getClass(), "name", "vOVuNSCCLe");
        setField(term10397, term10397.getClass(), "genre", term10457);
        setField(term10397, term10397.getClass(), "yearOfPublication", term10472);
        setField(term10397, term10397.getClass(), "blurb", "fzeqPnzpnt");
        setField(term10397, term10397.getClass(), "publishers", term10486);
        setField(term10492, term10492.getClass(), "id", term10493);
        setField(term10492, term10492.getClass(), "formatName", "RxbhrFBjkO");
        setField(term10397, term10397.getClass(), "publishingFormat", term10492);
        setField(term10507, term10507.getClass(), "id", term10508);
        setField(term10507, term10507.getClass(), "smallUrl", "aanyiAOJCl");
        setField(term10507, term10507.getClass(), "mediumUrl", "VDokbsCuqq");
        setField(term10507, term10507.getClass(), "largeUrl", "xClUIcPECX");
        setField(term10397, term10397.getClass(), "cover", term10507);
        setField(term10397, term10397.getClass(), "awards", term10546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term10397, args);
    }

};


