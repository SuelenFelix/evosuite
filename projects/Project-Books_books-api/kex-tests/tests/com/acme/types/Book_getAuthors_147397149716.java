package com.acme.types;

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
import static com.acme.types.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.String;

public class Book_getAuthors_147397149716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18824;

    public Book_getAuthors_147397149716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term18898 = new Integer(1008080511);
        ArrayList term18918 = new ArrayList();
        ((ArrayList) term18918).add((Object)null);
        ((ArrayList) term18918).add((Object)null);
        ((ArrayList) term18918).add((Object)null);
        ((ArrayList) term18918).add((Object)null);
        ((ArrayList) term18918).add((Object)null);
        ((ArrayList) term18918).add((Object)null);
        ((ArrayList) term18918).add((Object)null);
        ((ArrayList) term18918).add((Object)null);
        ((ArrayList) term18918).add((Object)null);
        Object term18914 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term18914, term18914.getClass(), "id", "");
        setField(term18914, term18914.getClass(), "fullName", "");
        setField(term18914, term18914.getClass(), "about", "");
        setField(term18914, term18914.getClass(), "books", term18918);
        ArrayList term18925 = new ArrayList();
        ((ArrayList) term18925).add((Object)null);
        ((ArrayList) term18925).add((Object)null);
        ((ArrayList) term18925).add((Object)null);
        ((ArrayList) term18925).add((Object)null);
        ((ArrayList) term18925).add((Object)null);
        ((ArrayList) term18925).add((Object)null);
        ((ArrayList) term18925).add((Object)null);
        ((ArrayList) term18925).add((Object)null);
        ((ArrayList) term18925).add((Object)null);
        Object term18921 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term18921, term18921.getClass(), "id", "");
        setField(term18921, term18921.getClass(), "fullName", "");
        setField(term18921, term18921.getClass(), "about", "");
        setField(term18921, term18921.getClass(), "books", term18925);
        ArrayList term18932 = new ArrayList();
        ((ArrayList) term18932).add((Object)null);
        ((ArrayList) term18932).add((Object)null);
        ((ArrayList) term18932).add((Object)null);
        ((ArrayList) term18932).add((Object)null);
        ((ArrayList) term18932).add((Object)null);
        Object term18928 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term18928, term18928.getClass(), "id", "");
        setField(term18928, term18928.getClass(), "fullName", "");
        setField(term18928, term18928.getClass(), "about", "");
        setField(term18928, term18928.getClass(), "books", term18932);
        ArrayList term18912 = new ArrayList();
        ((ArrayList) term18912).add(term18914);
        ((ArrayList) term18912).add(term18921);
        ((ArrayList) term18912).add(term18928);
        ArrayList term18942 = new ArrayList();
        ((ArrayList) term18942).add((Object)null);
        ((ArrayList) term18942).add((Object)null);
        ((ArrayList) term18942).add((Object)null);
        ((ArrayList) term18942).add((Object)null);
        ((ArrayList) term18942).add((Object)null);
        ((ArrayList) term18942).add((Object)null);
        ((ArrayList) term18942).add((Object)null);
        ((ArrayList) term18942).add((Object)null);
        ((ArrayList) term18942).add((Object)null);
        Object term18939 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term18939, term18939.getClass(), "id", "");
        setField(term18939, term18939.getClass(), "name", "");
        setField(term18939, term18939.getClass(), "books", term18942);
        ArrayList term18948 = new ArrayList();
        Object term18945 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term18945, term18945.getClass(), "id", "");
        setField(term18945, term18945.getClass(), "name", "");
        setField(term18945, term18945.getClass(), "books", term18948);
        ArrayList term18937 = new ArrayList();
        ((ArrayList) term18937).add(term18939);
        ((ArrayList) term18937).add(term18945);
        ((ArrayList) term18937).add(term18939);
        Class<? extends Object> term19229 = Class.forName((String) "com.acme.types.AwardName");
        Field term19228 = ((Class) term19229).getDeclaredField((String) "BOOKER_INTER_PRIZE");
        ((Field) term19228).setAccessible(true);
        Object enum51 = ((Field) term19228).get((Object) null);
        Object term19054 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term19054, term19054.getClass(), "id", "");
        setField(term19054, term19054.getClass(), "awardName", enum51);
        setField(term19054, term19054.getClass(), "category", "");
        setIntField(term19054, term19054.getClass(), "year", -249614216);
        Class<? extends Object> term19410 = Class.forName((String) "com.acme.types.AwardName");
        Field term19409 = ((Class) term19410).getDeclaredField((String) "WOMENS_PRIZE");
        ((Field) term19409).setAccessible(true);
        Object enum52 = ((Field) term19409).get((Object) null);
        Object term19060 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term19060, term19060.getClass(), "id", "");
        setField(term19060, term19060.getClass(), "awardName", enum52);
        setField(term19060, term19060.getClass(), "category", "");
        setIntField(term19060, term19060.getClass(), "year", 1236004505);
        Class<? extends Object> term19573 = Class.forName((String) "com.acme.types.AwardName");
        Field term19572 = ((Class) term19573).getDeclaredField((String) "BOOKER_INTER_PRIZE");
        ((Field) term19572).setAccessible(true);
        Object enum53 = ((Field) term19572).get((Object) null);
        Object term19066 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term19066, term19066.getClass(), "id", "");
        setField(term19066, term19066.getClass(), "awardName", enum53);
        setField(term19066, term19066.getClass(), "category", "");
        setIntField(term19066, term19066.getClass(), "year", 474518942);
        Object term19072 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term19072, term19072.getClass(), "id", "");
        setField(term19072, term19072.getClass(), "awardName", enum53);
        setField(term19072, term19072.getClass(), "category", "");
        setIntField(term19072, term19072.getClass(), "year", 306847454);
        ArrayList term19052 = new ArrayList();
        ((ArrayList) term19052).add(term19054);
        ((ArrayList) term19052).add(term19060);
        ((ArrayList) term19052).add(term19066);
        ((ArrayList) term19052).add(term19072);
        term18824 = newInstance(Class.forName("com.acme.types.Book"));
        Object term18873 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term18953 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term18978 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term19003 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term18824, term18824.getClass(), "id", "KqPWpTvDAg");
        setField(term18824, term18824.getClass(), "title", "zhxNzTDkbQ");
        setField(term18824, term18824.getClass(), "isbn13", "JwcYvvKRwe");
        setField(term18824, term18824.getClass(), "isbn10", "okLcKGoawO");
        setField(term18873, term18873.getClass(), "id", "wuJRunvJUq");
        setField(term18873, term18873.getClass(), "name", "lkSPvxhaVR");
        setField(term18824, term18824.getClass(), "genre", term18873);
        setField(term18824, term18824.getClass(), "yearOfPublication", term18898);
        setField(term18824, term18824.getClass(), "blurb", "hVlTtmyLIH");
        setField(term18824, term18824.getClass(), "authors", term18912);
        setField(term18824, term18824.getClass(), "publishers", term18937);
        setField(term18953, term18953.getClass(), "id", "iiXiwzHGtZ");
        setField(term18953, term18953.getClass(), "name", "vMUryzcVEt");
        setField(term18824, term18824.getClass(), "lang", term18953);
        setField(term18978, term18978.getClass(), "id", "bekkhEJXox");
        setField(term18978, term18978.getClass(), "formatName", "pTiGxmDpUW");
        setField(term18824, term18824.getClass(), "publishingFormat", term18978);
        setField(term19003, term19003.getClass(), "id", "OoCofiAnPP");
        setField(term19003, term19003.getClass(), "smallUrl", "vjPbHKOEPZ");
        setField(term19003, term19003.getClass(), "mediumUrl", "rvTeECGvmV");
        setField(term19003, term19003.getClass(), "largeUrl", "lDBTAFbBEZ");
        setField(term18824, term18824.getClass(), "cover", term19003);
        setField(term18824, term18824.getClass(), "awards", term19052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAuthors", argTypes, term18824, args);
    }

};


