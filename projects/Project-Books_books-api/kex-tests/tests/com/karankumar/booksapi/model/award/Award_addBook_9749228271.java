package com.karankumar.booksapi.model.award;

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
import static com.karankumar.booksapi.model.award.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class Award_addBook_9749228271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term705;
     Object term763;

    public Award_addBook_9749228271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term706 = new Long(7009926388951271268L);
        Class<? extends Object> term919 = Class.forName((String) "com.karankumar.booksapi.model.award.AwardName");
        Field term918 = ((Class) term919).getDeclaredField((String) "PORTICO_PRIZE");
        ((Field) term918).setAccessible(true);
        Object enum1 = ((Field) term918).get((Object) null);
        HashMap term758 = new HashMap();
        Set<Object> term1199 =  ((Map) term758).keySet();
        HashSet term757 = new HashSet((Collection<? extends Object>) term1199);
        term705 = newInstance(Class.forName("com.karankumar.booksapi.model.award.Award"));
        setField(term705, term705.getClass(), "id", term706);
        setField(term705, term705.getClass(), "awardName", enum1);
        setField(term705, term705.getClass(), "category", "UiUYnPrcCi");
        setIntField(term705, term705.getClass(), "year", 1162663216);
        setField(term705, term705.getClass(), "books", term757);
        Long term764 = new Long(-7672528020740371001L);
        HashMap term779 = new HashMap();
        Set<Object> term1210 =  ((Map) term779).keySet();
        HashSet term778 = new HashSet((Collection<? extends Object>) term1210);
        Long term785 = new Long(-4502405999831680926L);
        Long term824 = new Long(1967728129628047933L);
        Integer term838 = new Integer(-616727354);
        HashMap term853 = new HashMap();
        Set<Object> term1261 =  ((Map) term853).keySet();
        HashSet term852 = new HashSet((Collection<? extends Object>) term1261);
        Long term859 = new Long(2120084523938730454L);
        Long term874 = new Long(6855071767938501807L);
        HashMap term913 = new HashMap();
        Set<Object> term1302 =  ((Map) term913).keySet();
        HashSet term912 = new HashSet((Collection<? extends Object>) term1302);
        term763 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term784 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term823 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term858 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term873 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term763, term763.getClass(), "id", term764);
        setField(term763, term763.getClass(), "title", "UoYtihxVaS");
        setField(term763, term763.getClass(), "authors", term778);
        setField(term784, term784.getClass(), "id", term785);
        setField(term784, term784.getClass(), "name", "JDswTTCZHV");
        setField(term763, term763.getClass(), "lang", term784);
        setField(term763, term763.getClass(), "isbn10", "onpbIeEKoi");
        setField(term763, term763.getClass(), "isbn13", "YRHGsAkhxb");
        setField(term823, term823.getClass(), "id", term824);
        setField(term823, term823.getClass(), "name", "ffYhPOzlUs");
        setField(term763, term763.getClass(), "genre", term823);
        setField(term763, term763.getClass(), "yearOfPublication", term838);
        setField(term763, term763.getClass(), "blurb", "MLqYREekMl");
        setField(term763, term763.getClass(), "publishers", term852);
        setField(term858, term858.getClass(), "id", term859);
        setField(term858, term858.getClass(), "formatName", "ytSBIKXogI");
        setField(term763, term763.getClass(), "publishingFormat", term858);
        setField(term873, term873.getClass(), "id", term874);
        setField(term873, term873.getClass(), "smallUrl", "nHXjMycHlU");
        setField(term873, term873.getClass(), "mediumUrl", "ieCtQFdkii");
        setField(term873, term873.getClass(), "largeUrl", "dEnhdmILtU");
        setField(term763, term763.getClass(), "cover", term873);
        setField(term763, term763.getClass(), "awards", term912);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.award.Award");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.karankumar.booksapi.model.Book");
        Object[] args = new Object[1];
        args[0] = term763;
        callMethod(klass, "addBook", argTypes, term705, args);
    }

};


