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

public class Book_getAuthors_15782119095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3941;

    public Book_getAuthors_15782119095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3942 = new Long(1233889271256172047L);
        HashMap term3957 = new HashMap();
        Set<Object> term4106 =  ((Map) term3957).keySet();
        HashSet term3956 = new HashSet((Collection<? extends Object>) term4106);
        Long term3963 = new Long(6617340557564669657L);
        Long term4002 = new Long(1439298019805881866L);
        Integer term4016 = new Integer(-1922583790);
        HashMap term4031 = new HashMap();
        Set<Object> term4157 =  ((Map) term4031).keySet();
        HashSet term4030 = new HashSet((Collection<? extends Object>) term4157);
        Long term4037 = new Long(-8708192233349544946L);
        Long term4052 = new Long(5907001541142728739L);
        HashMap term4091 = new HashMap();
        Set<Object> term4198 =  ((Map) term4091).keySet();
        HashSet term4090 = new HashSet((Collection<? extends Object>) term4198);
        term3941 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term3962 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term4001 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term4036 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term4051 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term3941, term3941.getClass(), "id", term3942);
        setField(term3941, term3941.getClass(), "title", "bWWfajKbEX");
        setField(term3941, term3941.getClass(), "authors", term3956);
        setField(term3962, term3962.getClass(), "id", term3963);
        setField(term3962, term3962.getClass(), "name", "cAPeiZHKGJ");
        setField(term3941, term3941.getClass(), "lang", term3962);
        setField(term3941, term3941.getClass(), "isbn10", "LvJFtLBaxj");
        setField(term3941, term3941.getClass(), "isbn13", "PHvxnGHptP");
        setField(term4001, term4001.getClass(), "id", term4002);
        setField(term4001, term4001.getClass(), "name", "TimdotUuNC");
        setField(term3941, term3941.getClass(), "genre", term4001);
        setField(term3941, term3941.getClass(), "yearOfPublication", term4016);
        setField(term3941, term3941.getClass(), "blurb", "PkWMRdJcBb");
        setField(term3941, term3941.getClass(), "publishers", term4030);
        setField(term4036, term4036.getClass(), "id", term4037);
        setField(term4036, term4036.getClass(), "formatName", "jSpAteRute");
        setField(term3941, term3941.getClass(), "publishingFormat", term4036);
        setField(term4051, term4051.getClass(), "id", term4052);
        setField(term4051, term4051.getClass(), "smallUrl", "swZVeJAxjt");
        setField(term4051, term4051.getClass(), "mediumUrl", "xOcJIiQQDu");
        setField(term4051, term4051.getClass(), "largeUrl", "GVizqqzXpy");
        setField(term3941, term3941.getClass(), "cover", term4051);
        setField(term3941, term3941.getClass(), "awards", term4090);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAuthors", argTypes, term3941, args);
    }

};


