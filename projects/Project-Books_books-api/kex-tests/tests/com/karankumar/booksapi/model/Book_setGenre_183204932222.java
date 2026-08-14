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

public class Book_setGenre_183204932222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8434;
     Object term8589;

    public Book_setGenre_183204932222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8435 = new Long(1084801489398441516L);
        HashMap term8450 = new HashMap();
        Set<Object> term8614 =  ((Map) term8450).keySet();
        HashSet term8449 = new HashSet((Collection<? extends Object>) term8614);
        Long term8456 = new Long(6273754186658578034L);
        Long term8495 = new Long(3620247240684476031L);
        Integer term8509 = new Integer(-6029667);
        HashMap term8524 = new HashMap();
        Set<Object> term8665 =  ((Map) term8524).keySet();
        HashSet term8523 = new HashSet((Collection<? extends Object>) term8665);
        Long term8530 = new Long(8313800941204938919L);
        Long term8545 = new Long(-1214968196781083707L);
        HashMap term8584 = new HashMap();
        Set<Object> term8706 =  ((Map) term8584).keySet();
        HashSet term8583 = new HashSet((Collection<? extends Object>) term8706);
        term8434 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term8455 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term8494 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term8529 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term8544 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term8434, term8434.getClass(), "id", term8435);
        setField(term8434, term8434.getClass(), "title", "sNQFlATEeQ");
        setField(term8434, term8434.getClass(), "authors", term8449);
        setField(term8455, term8455.getClass(), "id", term8456);
        setField(term8455, term8455.getClass(), "name", "ZKMLioamsY");
        setField(term8434, term8434.getClass(), "lang", term8455);
        setField(term8434, term8434.getClass(), "isbn10", "WVbxuoDBcn");
        setField(term8434, term8434.getClass(), "isbn13", "pvDEABOxLt");
        setField(term8494, term8494.getClass(), "id", term8495);
        setField(term8494, term8494.getClass(), "name", "beAMpkroCQ");
        setField(term8434, term8434.getClass(), "genre", term8494);
        setField(term8434, term8434.getClass(), "yearOfPublication", term8509);
        setField(term8434, term8434.getClass(), "blurb", "uSUvKAyuvd");
        setField(term8434, term8434.getClass(), "publishers", term8523);
        setField(term8529, term8529.getClass(), "id", term8530);
        setField(term8529, term8529.getClass(), "formatName", "onQLVONGuf");
        setField(term8434, term8434.getClass(), "publishingFormat", term8529);
        setField(term8544, term8544.getClass(), "id", term8545);
        setField(term8544, term8544.getClass(), "smallUrl", "SOrEHbcbmn");
        setField(term8544, term8544.getClass(), "mediumUrl", "bnsyeQXFdu");
        setField(term8544, term8544.getClass(), "largeUrl", "BwtdjiefJn");
        setField(term8434, term8434.getClass(), "cover", term8544);
        setField(term8434, term8434.getClass(), "awards", term8583);
        Long term8590 = new Long(-1804015692891701666L);
        term8589 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        setField(term8589, term8589.getClass(), "id", term8590);
        setField(term8589, term8589.getClass(), "name", "jDmhBrIoDa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.karankumar.booksapi.model.genre.Genre");
        Object[] args = new Object[1];
        args[0] = term8589;
        callMethod(klass, "setGenre", argTypes, term8434, args);
    }

};


