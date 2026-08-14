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

public class Book_getLang_51851640820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23114;

    public Book_getLang_51851640820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term23188 = new Integer(533197381);
        ArrayList term23208 = new ArrayList();
        ((ArrayList) term23208).add((Object)null);
        ((ArrayList) term23208).add((Object)null);
        Object term23204 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term23204, term23204.getClass(), "id", "");
        setField(term23204, term23204.getClass(), "fullName", "");
        setField(term23204, term23204.getClass(), "about", "");
        setField(term23204, term23204.getClass(), "books", term23208);
        ArrayList term23215 = new ArrayList();
        ((ArrayList) term23215).add((Object)null);
        ((ArrayList) term23215).add((Object)null);
        ((ArrayList) term23215).add((Object)null);
        ((ArrayList) term23215).add((Object)null);
        Object term23211 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term23211, term23211.getClass(), "id", "");
        setField(term23211, term23211.getClass(), "fullName", "");
        setField(term23211, term23211.getClass(), "about", "");
        setField(term23211, term23211.getClass(), "books", term23215);
        ArrayList term23222 = new ArrayList();
        Object term23218 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term23218, term23218.getClass(), "id", "");
        setField(term23218, term23218.getClass(), "fullName", "");
        setField(term23218, term23218.getClass(), "about", "");
        setField(term23218, term23218.getClass(), "books", term23222);
        ArrayList term23202 = new ArrayList();
        ((ArrayList) term23202).add(term23204);
        ((ArrayList) term23202).add(term23211);
        ((ArrayList) term23202).add(term23218);
        ArrayList term23232 = new ArrayList();
        ((ArrayList) term23232).add((Object)null);
        ((ArrayList) term23232).add((Object)null);
        ((ArrayList) term23232).add((Object)null);
        ((ArrayList) term23232).add((Object)null);
        Object term23229 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term23229, term23229.getClass(), "id", "");
        setField(term23229, term23229.getClass(), "name", "");
        setField(term23229, term23229.getClass(), "books", term23232);
        ArrayList term23227 = new ArrayList();
        ((ArrayList) term23227).add(term23229);
        Class<? extends Object> term23533 = Class.forName((String) "com.acme.types.AwardName");
        Field term23532 = ((Class) term23533).getDeclaredField((String) "NOBEL_PRIZE");
        ((Field) term23532).setAccessible(true);
        Object enum65 = ((Field) term23532).get((Object) null);
        Object term23338 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term23338, term23338.getClass(), "id", "");
        setField(term23338, term23338.getClass(), "awardName", enum65);
        setField(term23338, term23338.getClass(), "category", "");
        setIntField(term23338, term23338.getClass(), "year", 1843268026);
        Class<? extends Object> term23693 = Class.forName((String) "com.acme.types.AwardName");
        Field term23692 = ((Class) term23693).getDeclaredField((String) "DYLAN_PRIZE");
        ((Field) term23692).setAccessible(true);
        Object enum66 = ((Field) term23692).get((Object) null);
        Object term23344 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term23344, term23344.getClass(), "id", "");
        setField(term23344, term23344.getClass(), "awardName", enum66);
        setField(term23344, term23344.getClass(), "category", "");
        setIntField(term23344, term23344.getClass(), "year", 278355793);
        Class<? extends Object> term23853 = Class.forName((String) "com.acme.types.AwardName");
        Field term23852 = ((Class) term23853).getDeclaredField((String) "NOBEL_PRIZE");
        ((Field) term23852).setAccessible(true);
        Object enum67 = ((Field) term23852).get((Object) null);
        Object term23350 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term23350, term23350.getClass(), "id", "");
        setField(term23350, term23350.getClass(), "awardName", enum67);
        setField(term23350, term23350.getClass(), "category", "");
        setIntField(term23350, term23350.getClass(), "year", -310648604);
        Class<? extends Object> term24013 = Class.forName((String) "com.acme.types.AwardName");
        Field term24012 = ((Class) term24013).getDeclaredField((String) "ORWELL_PRIZE");
        ((Field) term24012).setAccessible(true);
        Object enum68 = ((Field) term24012).get((Object) null);
        Object term23356 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term23356, term23356.getClass(), "id", "");
        setField(term23356, term23356.getClass(), "awardName", enum68);
        setField(term23356, term23356.getClass(), "category", "");
        setIntField(term23356, term23356.getClass(), "year", 1466373988);
        Class<? extends Object> term24176 = Class.forName((String) "com.acme.types.AwardName");
        Field term24175 = ((Class) term24176).getDeclaredField((String) "NOBEL_PRIZE");
        ((Field) term24175).setAccessible(true);
        Object enum69 = ((Field) term24175).get((Object) null);
        Object term23362 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term23362, term23362.getClass(), "id", "");
        setField(term23362, term23362.getClass(), "awardName", enum69);
        setField(term23362, term23362.getClass(), "category", "");
        setIntField(term23362, term23362.getClass(), "year", 579006268);
        Class<? extends Object> term24336 = Class.forName((String) "com.acme.types.AwardName");
        Field term24335 = ((Class) term24336).getDeclaredField((String) "BOOKER_PRIZE");
        ((Field) term24335).setAccessible(true);
        Object enum70 = ((Field) term24335).get((Object) null);
        Object term23368 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term23368, term23368.getClass(), "id", "");
        setField(term23368, term23368.getClass(), "awardName", enum70);
        setField(term23368, term23368.getClass(), "category", "");
        setIntField(term23368, term23368.getClass(), "year", -1351605385);
        Class<? extends Object> term24499 = Class.forName((String) "com.acme.types.AwardName");
        Field term24498 = ((Class) term24499).getDeclaredField((String) "NOBEL_PRIZE");
        ((Field) term24498).setAccessible(true);
        Object enum71 = ((Field) term24498).get((Object) null);
        Object term23374 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term23374, term23374.getClass(), "id", "");
        setField(term23374, term23374.getClass(), "awardName", enum71);
        setField(term23374, term23374.getClass(), "category", "");
        setIntField(term23374, term23374.getClass(), "year", -2013924238);
        ArrayList term23336 = new ArrayList();
        ((ArrayList) term23336).add(term23338);
        ((ArrayList) term23336).add(term23344);
        ((ArrayList) term23336).add(term23350);
        ((ArrayList) term23336).add(term23356);
        ((ArrayList) term23336).add(term23362);
        ((ArrayList) term23336).add(term23368);
        ((ArrayList) term23336).add(term23374);
        term23114 = newInstance(Class.forName("com.acme.types.Book"));
        Object term23163 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term23237 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term23262 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term23287 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term23114, term23114.getClass(), "id", "MSIEshhzHU");
        setField(term23114, term23114.getClass(), "title", "ZccndtPqcy");
        setField(term23114, term23114.getClass(), "isbn13", "cRznRdugDW");
        setField(term23114, term23114.getClass(), "isbn10", "vTMJdYrXUJ");
        setField(term23163, term23163.getClass(), "id", "vVbSRADXpc");
        setField(term23163, term23163.getClass(), "name", "WpmNATXFgJ");
        setField(term23114, term23114.getClass(), "genre", term23163);
        setField(term23114, term23114.getClass(), "yearOfPublication", term23188);
        setField(term23114, term23114.getClass(), "blurb", "iVyIjcuuMq");
        setField(term23114, term23114.getClass(), "authors", term23202);
        setField(term23114, term23114.getClass(), "publishers", term23227);
        setField(term23237, term23237.getClass(), "id", "ZmIbrizkha");
        setField(term23237, term23237.getClass(), "name", "YMqvSYdDqY");
        setField(term23114, term23114.getClass(), "lang", term23237);
        setField(term23262, term23262.getClass(), "id", "PlPbUzhDYB");
        setField(term23262, term23262.getClass(), "formatName", "ctWXrepEGs");
        setField(term23114, term23114.getClass(), "publishingFormat", term23262);
        setField(term23287, term23287.getClass(), "id", "fbKUErcwbU");
        setField(term23287, term23287.getClass(), "smallUrl", "CPweBQmYOE");
        setField(term23287, term23287.getClass(), "mediumUrl", "EGsujTXNCu");
        setField(term23287, term23287.getClass(), "largeUrl", "pfrtjBCFrk");
        setField(term23114, term23114.getClass(), "cover", term23287);
        setField(term23114, term23114.getClass(), "awards", term23336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLang", argTypes, term23114, args);
    }

};


