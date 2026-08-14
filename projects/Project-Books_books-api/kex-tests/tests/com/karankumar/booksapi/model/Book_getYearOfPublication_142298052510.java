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

public class Book_getYearOfPublication_142298052510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5231;

    public Book_getYearOfPublication_142298052510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5232 = new Long(5953383087795962419L);
        HashMap term5247 = new HashMap();
        Set<Object> term5396 =  ((Map) term5247).keySet();
        HashSet term5246 = new HashSet((Collection<? extends Object>) term5396);
        Long term5253 = new Long(7994303628307559416L);
        Long term5292 = new Long(2443640364875054177L);
        Integer term5306 = new Integer(-1339778481);
        HashMap term5321 = new HashMap();
        Set<Object> term5447 =  ((Map) term5321).keySet();
        HashSet term5320 = new HashSet((Collection<? extends Object>) term5447);
        Long term5327 = new Long(-1610676979013636850L);
        Long term5342 = new Long(2062173786000223358L);
        HashMap term5381 = new HashMap();
        Set<Object> term5488 =  ((Map) term5381).keySet();
        HashSet term5380 = new HashSet((Collection<? extends Object>) term5488);
        term5231 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term5252 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term5291 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term5326 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term5341 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term5231, term5231.getClass(), "id", term5232);
        setField(term5231, term5231.getClass(), "title", "EYtfuJaxiM");
        setField(term5231, term5231.getClass(), "authors", term5246);
        setField(term5252, term5252.getClass(), "id", term5253);
        setField(term5252, term5252.getClass(), "name", "gCWtLVKVVe");
        setField(term5231, term5231.getClass(), "lang", term5252);
        setField(term5231, term5231.getClass(), "isbn10", "fWKJoSoCwE");
        setField(term5231, term5231.getClass(), "isbn13", "wfaXBpWAUH");
        setField(term5291, term5291.getClass(), "id", term5292);
        setField(term5291, term5291.getClass(), "name", "VMeAzAHwZj");
        setField(term5231, term5231.getClass(), "genre", term5291);
        setField(term5231, term5231.getClass(), "yearOfPublication", term5306);
        setField(term5231, term5231.getClass(), "blurb", "PznxWXsZME");
        setField(term5231, term5231.getClass(), "publishers", term5320);
        setField(term5326, term5326.getClass(), "id", term5327);
        setField(term5326, term5326.getClass(), "formatName", "ZzIujlwVsw");
        setField(term5231, term5231.getClass(), "publishingFormat", term5326);
        setField(term5341, term5341.getClass(), "id", term5342);
        setField(term5341, term5341.getClass(), "smallUrl", "LWyEaeIyAo");
        setField(term5341, term5341.getClass(), "mediumUrl", "yVMkkQhvmN");
        setField(term5341, term5341.getClass(), "largeUrl", "mvrkADEgpp");
        setField(term5231, term5231.getClass(), "cover", term5341);
        setField(term5231, term5231.getClass(), "awards", term5380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getYearOfPublication", argTypes, term5231, args);
    }

};


