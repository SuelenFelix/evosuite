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

public class Book_setPublishers_69972616425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9257;
     Object term9412;

    public Book_setPublishers_69972616425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9258 = new Long(4513004407927379358L);
        HashMap term9273 = new HashMap();
        Set<Object> term9428 =  ((Map) term9273).keySet();
        HashSet term9272 = new HashSet((Collection<? extends Object>) term9428);
        Long term9279 = new Long(-7115418542247301000L);
        Long term9318 = new Long(8034714140377562739L);
        Integer term9332 = new Integer(1135664017);
        HashMap term9347 = new HashMap();
        Set<Object> term9479 =  ((Map) term9347).keySet();
        HashSet term9346 = new HashSet((Collection<? extends Object>) term9479);
        Long term9353 = new Long(-2924531382671518368L);
        Long term9368 = new Long(-3948863953565024517L);
        HashMap term9407 = new HashMap();
        Set<Object> term9520 =  ((Map) term9407).keySet();
        HashSet term9406 = new HashSet((Collection<? extends Object>) term9520);
        term9257 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term9278 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term9317 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term9352 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term9367 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term9257, term9257.getClass(), "id", term9258);
        setField(term9257, term9257.getClass(), "title", "urCiQnUFBM");
        setField(term9257, term9257.getClass(), "authors", term9272);
        setField(term9278, term9278.getClass(), "id", term9279);
        setField(term9278, term9278.getClass(), "name", "EKjQdtKxAM");
        setField(term9257, term9257.getClass(), "lang", term9278);
        setField(term9257, term9257.getClass(), "isbn10", "TXZAIPQJHt");
        setField(term9257, term9257.getClass(), "isbn13", "DIbeDHICho");
        setField(term9317, term9317.getClass(), "id", term9318);
        setField(term9317, term9317.getClass(), "name", "dJGPlmSRnz");
        setField(term9257, term9257.getClass(), "genre", term9317);
        setField(term9257, term9257.getClass(), "yearOfPublication", term9332);
        setField(term9257, term9257.getClass(), "blurb", "DPskuFUobI");
        setField(term9257, term9257.getClass(), "publishers", term9346);
        setField(term9352, term9352.getClass(), "id", term9353);
        setField(term9352, term9352.getClass(), "formatName", "wBGfLpNNiZ");
        setField(term9257, term9257.getClass(), "publishingFormat", term9352);
        setField(term9367, term9367.getClass(), "id", term9368);
        setField(term9367, term9367.getClass(), "smallUrl", "yUGCjlqgJE");
        setField(term9367, term9367.getClass(), "mediumUrl", "PXdVZyoJyC");
        setField(term9367, term9367.getClass(), "largeUrl", "vLerpqavFM");
        setField(term9257, term9257.getClass(), "cover", term9367);
        setField(term9257, term9257.getClass(), "awards", term9406);
        HashMap term9413 = new HashMap();
        Set<Object> term9521 =  ((Map) term9413).keySet();
        term9412 = new HashSet((Collection<? extends Object>) term9521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term9412;
        callMethod(klass, "setPublishers", argTypes, term9257, args);
    }

};


