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

public class Book_getGenre_20547132769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4973;

    public Book_getGenre_20547132769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4974 = new Long(-1468719814009985452L);
        HashMap term4989 = new HashMap();
        Set<Object> term5138 =  ((Map) term4989).keySet();
        HashSet term4988 = new HashSet((Collection<? extends Object>) term5138);
        Long term4995 = new Long(-7738503207562305297L);
        Long term5034 = new Long(3825396310311739952L);
        Integer term5048 = new Integer(1227103734);
        HashMap term5063 = new HashMap();
        Set<Object> term5189 =  ((Map) term5063).keySet();
        HashSet term5062 = new HashSet((Collection<? extends Object>) term5189);
        Long term5069 = new Long(-3838084482494604218L);
        Long term5084 = new Long(3892018155439224435L);
        HashMap term5123 = new HashMap();
        Set<Object> term5230 =  ((Map) term5123).keySet();
        HashSet term5122 = new HashSet((Collection<? extends Object>) term5230);
        term4973 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term4994 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term5033 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term5068 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term5083 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term4973, term4973.getClass(), "id", term4974);
        setField(term4973, term4973.getClass(), "title", "XOiDvlDhdc");
        setField(term4973, term4973.getClass(), "authors", term4988);
        setField(term4994, term4994.getClass(), "id", term4995);
        setField(term4994, term4994.getClass(), "name", "AdxvLJhNLe");
        setField(term4973, term4973.getClass(), "lang", term4994);
        setField(term4973, term4973.getClass(), "isbn10", "lHfTrWKMPk");
        setField(term4973, term4973.getClass(), "isbn13", "JDaAnsVTGV");
        setField(term5033, term5033.getClass(), "id", term5034);
        setField(term5033, term5033.getClass(), "name", "mLUZFTfjle");
        setField(term4973, term4973.getClass(), "genre", term5033);
        setField(term4973, term4973.getClass(), "yearOfPublication", term5048);
        setField(term4973, term4973.getClass(), "blurb", "xIeFjkHkOe");
        setField(term4973, term4973.getClass(), "publishers", term5062);
        setField(term5068, term5068.getClass(), "id", term5069);
        setField(term5068, term5068.getClass(), "formatName", "SdCKLMIYnX");
        setField(term4973, term4973.getClass(), "publishingFormat", term5068);
        setField(term5083, term5083.getClass(), "id", term5084);
        setField(term5083, term5083.getClass(), "smallUrl", "OJJtVNPyKZ");
        setField(term5083, term5083.getClass(), "mediumUrl", "AKNapTAfmD");
        setField(term5083, term5083.getClass(), "largeUrl", "xJgPlLxpgC");
        setField(term4973, term4973.getClass(), "cover", term5083);
        setField(term4973, term4973.getClass(), "awards", term5122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenre", argTypes, term4973, args);
    }

};


