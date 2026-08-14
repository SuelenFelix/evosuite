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

public class Book_getCover_200560654414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6263;

    public Book_getCover_200560654414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6264 = new Long(5510783420697225605L);
        HashMap term6279 = new HashMap();
        Set<Object> term6428 =  ((Map) term6279).keySet();
        HashSet term6278 = new HashSet((Collection<? extends Object>) term6428);
        Long term6285 = new Long(6005241913654469005L);
        Long term6324 = new Long(-1983291584002806658L);
        Integer term6338 = new Integer(-883034806);
        HashMap term6353 = new HashMap();
        Set<Object> term6479 =  ((Map) term6353).keySet();
        HashSet term6352 = new HashSet((Collection<? extends Object>) term6479);
        Long term6359 = new Long(5946780097489996391L);
        Long term6374 = new Long(-8652538484981166496L);
        HashMap term6413 = new HashMap();
        Set<Object> term6520 =  ((Map) term6413).keySet();
        HashSet term6412 = new HashSet((Collection<? extends Object>) term6520);
        term6263 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term6284 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term6323 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term6358 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term6373 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term6263, term6263.getClass(), "id", term6264);
        setField(term6263, term6263.getClass(), "title", "vwbEQQNQrx");
        setField(term6263, term6263.getClass(), "authors", term6278);
        setField(term6284, term6284.getClass(), "id", term6285);
        setField(term6284, term6284.getClass(), "name", "xtftXXMbem");
        setField(term6263, term6263.getClass(), "lang", term6284);
        setField(term6263, term6263.getClass(), "isbn10", "cudZvLMQon");
        setField(term6263, term6263.getClass(), "isbn13", "lihXWlGDxk");
        setField(term6323, term6323.getClass(), "id", term6324);
        setField(term6323, term6323.getClass(), "name", "JmcmxoGhIK");
        setField(term6263, term6263.getClass(), "genre", term6323);
        setField(term6263, term6263.getClass(), "yearOfPublication", term6338);
        setField(term6263, term6263.getClass(), "blurb", "jXzmYyrnnT");
        setField(term6263, term6263.getClass(), "publishers", term6352);
        setField(term6358, term6358.getClass(), "id", term6359);
        setField(term6358, term6358.getClass(), "formatName", "igCAtimmYB");
        setField(term6263, term6263.getClass(), "publishingFormat", term6358);
        setField(term6373, term6373.getClass(), "id", term6374);
        setField(term6373, term6373.getClass(), "smallUrl", "DyiXbeYIaN");
        setField(term6373, term6373.getClass(), "mediumUrl", "VGizxZnyHX");
        setField(term6373, term6373.getClass(), "largeUrl", "kVEZMHmRtR");
        setField(term6263, term6263.getClass(), "cover", term6373);
        setField(term6263, term6263.getClass(), "awards", term6412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCover", argTypes, term6263, args);
    }

};


