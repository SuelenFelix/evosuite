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

public class Book_hashCode_3491209302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3167;

    public Book_hashCode_3491209302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3168 = new Long(8428634514691209827L);
        HashMap term3183 = new HashMap();
        Set<Object> term3332 =  ((Map) term3183).keySet();
        HashSet term3182 = new HashSet((Collection<? extends Object>) term3332);
        Long term3189 = new Long(-2585684163342970173L);
        Long term3228 = new Long(8059786003080744426L);
        Integer term3242 = new Integer(1162663216);
        HashMap term3257 = new HashMap();
        Set<Object> term3383 =  ((Map) term3257).keySet();
        HashSet term3256 = new HashSet((Collection<? extends Object>) term3383);
        Long term3263 = new Long(-4365849114644724155L);
        Long term3278 = new Long(2486810210675247493L);
        HashMap term3317 = new HashMap();
        Set<Object> term3424 =  ((Map) term3317).keySet();
        HashSet term3316 = new HashSet((Collection<? extends Object>) term3424);
        term3167 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term3188 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term3227 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term3262 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term3277 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term3167, term3167.getClass(), "id", term3168);
        setField(term3167, term3167.getClass(), "title", "JDswTTCZHV");
        setField(term3167, term3167.getClass(), "authors", term3182);
        setField(term3188, term3188.getClass(), "id", term3189);
        setField(term3188, term3188.getClass(), "name", "onpbIeEKoi");
        setField(term3167, term3167.getClass(), "lang", term3188);
        setField(term3167, term3167.getClass(), "isbn10", "YRHGsAkhxb");
        setField(term3167, term3167.getClass(), "isbn13", "ffYhPOzlUs");
        setField(term3227, term3227.getClass(), "id", term3228);
        setField(term3227, term3227.getClass(), "name", "MLqYREekMl");
        setField(term3167, term3167.getClass(), "genre", term3227);
        setField(term3167, term3167.getClass(), "yearOfPublication", term3242);
        setField(term3167, term3167.getClass(), "blurb", "ytSBIKXogI");
        setField(term3167, term3167.getClass(), "publishers", term3256);
        setField(term3262, term3262.getClass(), "id", term3263);
        setField(term3262, term3262.getClass(), "formatName", "nHXjMycHlU");
        setField(term3167, term3167.getClass(), "publishingFormat", term3262);
        setField(term3277, term3277.getClass(), "id", term3278);
        setField(term3277, term3277.getClass(), "smallUrl", "ieCtQFdkii");
        setField(term3277, term3277.getClass(), "mediumUrl", "dEnhdmILtU");
        setField(term3277, term3277.getClass(), "largeUrl", "hoicvmsovO");
        setField(term3167, term3167.getClass(), "cover", term3277);
        setField(term3167, term3167.getClass(), "awards", term3316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3167, args);
    }

};


