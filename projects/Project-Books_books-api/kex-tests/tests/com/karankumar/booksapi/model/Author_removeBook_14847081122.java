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

public class Author_removeBook_14847081122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17790;
     Object term17823;

    public Author_removeBook_14847081122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17791 = new Long(-6602460430714339690L);
        HashMap term17806 = new HashMap();
        Set<Object> term17988 =  ((Map) term17806).keySet();
        HashSet term17805 = new HashSet((Collection<? extends Object>) term17988);
        term17790 = newInstance(Class.forName("com.karankumar.booksapi.model.Author"));
        setField(term17790, term17790.getClass(), "id", term17791);
        setField(term17790, term17790.getClass(), "fullName", "rwKoAngzCu");
        setField(term17790, term17790.getClass(), "books", term17805);
        setField(term17790, term17790.getClass(), "about", "VUkRVwROTl");
        Long term17824 = new Long(21047099434645581L);
        HashMap term17839 = new HashMap();
        Set<Object> term18009 =  ((Map) term17839).keySet();
        HashSet term17838 = new HashSet((Collection<? extends Object>) term18009);
        Long term17845 = new Long(-8862087040734407227L);
        Long term17884 = new Long(-6394943900800506753L);
        Integer term17898 = new Integer(-1145578966);
        HashMap term17913 = new HashMap();
        Set<Object> term18060 =  ((Map) term17913).keySet();
        HashSet term17912 = new HashSet((Collection<? extends Object>) term18060);
        Long term17919 = new Long(-4867941246533901410L);
        Long term17934 = new Long(1044883697493326351L);
        HashMap term17973 = new HashMap();
        Set<Object> term18101 =  ((Map) term17973).keySet();
        HashSet term17972 = new HashSet((Collection<? extends Object>) term18101);
        term17823 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term17844 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term17883 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term17918 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term17933 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term17823, term17823.getClass(), "id", term17824);
        setField(term17823, term17823.getClass(), "title", "UDlkdccCRn");
        setField(term17823, term17823.getClass(), "authors", term17838);
        setField(term17844, term17844.getClass(), "id", term17845);
        setField(term17844, term17844.getClass(), "name", "McpzErOcYb");
        setField(term17823, term17823.getClass(), "lang", term17844);
        setField(term17823, term17823.getClass(), "isbn10", "jqrVEUvYEz");
        setField(term17823, term17823.getClass(), "isbn13", "QITgiBrmfj");
        setField(term17883, term17883.getClass(), "id", term17884);
        setField(term17883, term17883.getClass(), "name", "pXxkiXgQnq");
        setField(term17823, term17823.getClass(), "genre", term17883);
        setField(term17823, term17823.getClass(), "yearOfPublication", term17898);
        setField(term17823, term17823.getClass(), "blurb", "tKmrUDURku");
        setField(term17823, term17823.getClass(), "publishers", term17912);
        setField(term17918, term17918.getClass(), "id", term17919);
        setField(term17918, term17918.getClass(), "formatName", "JeZbrwZmsP");
        setField(term17823, term17823.getClass(), "publishingFormat", term17918);
        setField(term17933, term17933.getClass(), "id", term17934);
        setField(term17933, term17933.getClass(), "smallUrl", "bxyfeicqrK");
        setField(term17933, term17933.getClass(), "mediumUrl", "vBnWPlsZMk");
        setField(term17933, term17933.getClass(), "largeUrl", "fIZsWucfXz");
        setField(term17823, term17823.getClass(), "cover", term17933);
        setField(term17823, term17823.getClass(), "awards", term17972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.karankumar.booksapi.model.Book");
        Object[] args = new Object[1];
        args[0] = term17823;
        callMethod(klass, "removeBook", argTypes, term17790, args);
    }

};


