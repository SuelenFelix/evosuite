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

public class Book_getAwards_46392505926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28686;

    public Book_getAwards_46392505926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28760 = new Integer(1559605714);
        ArrayList term28774 = new ArrayList();
        ArrayList term28783 = new ArrayList();
        ((ArrayList) term28783).add((Object)null);
        ((ArrayList) term28783).add((Object)null);
        ((ArrayList) term28783).add((Object)null);
        ((ArrayList) term28783).add((Object)null);
        ((ArrayList) term28783).add((Object)null);
        Object term28780 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term28780, term28780.getClass(), "id", "");
        setField(term28780, term28780.getClass(), "name", "");
        setField(term28780, term28780.getClass(), "books", term28783);
        ArrayList term28789 = new ArrayList();
        ((ArrayList) term28789).add((Object)null);
        ((ArrayList) term28789).add((Object)null);
        ((ArrayList) term28789).add((Object)null);
        ((ArrayList) term28789).add((Object)null);
        ((ArrayList) term28789).add((Object)null);
        ((ArrayList) term28789).add((Object)null);
        ((ArrayList) term28789).add((Object)null);
        Object term28786 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term28786, term28786.getClass(), "id", "");
        setField(term28786, term28786.getClass(), "name", "");
        setField(term28786, term28786.getClass(), "books", term28789);
        ArrayList term28795 = new ArrayList();
        ((ArrayList) term28795).add((Object)null);
        ((ArrayList) term28795).add((Object)null);
        ((ArrayList) term28795).add((Object)null);
        ((ArrayList) term28795).add((Object)null);
        ((ArrayList) term28795).add((Object)null);
        ((ArrayList) term28795).add((Object)null);
        ((ArrayList) term28795).add((Object)null);
        Object term28792 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term28792, term28792.getClass(), "id", "");
        setField(term28792, term28792.getClass(), "name", "");
        setField(term28792, term28792.getClass(), "books", term28795);
        ArrayList term28801 = new ArrayList();
        ((ArrayList) term28801).add((Object)null);
        ((ArrayList) term28801).add((Object)null);
        ((ArrayList) term28801).add((Object)null);
        Object term28798 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term28798, term28798.getClass(), "id", "");
        setField(term28798, term28798.getClass(), "name", "");
        setField(term28798, term28798.getClass(), "books", term28801);
        ArrayList term28778 = new ArrayList();
        ((ArrayList) term28778).add(term28780);
        ((ArrayList) term28778).add(term28786);
        ((ArrayList) term28778).add(term28792);
        ((ArrayList) term28778).add(term28798);
        ((ArrayList) term28778).add(term28786);
        Class<? extends Object> term29066 = Class.forName((String) "com.acme.types.AwardName");
        Field term29065 = ((Class) term29066).getDeclaredField((String) "BAILLIE_PRIZE");
        ((Field) term29065).setAccessible(true);
        Object enum83 = ((Field) term29065).get((Object) null);
        Object term28907 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term28907, term28907.getClass(), "id", "");
        setField(term28907, term28907.getClass(), "awardName", enum83);
        setField(term28907, term28907.getClass(), "category", "");
        setIntField(term28907, term28907.getClass(), "year", 1146601902);
        ArrayList term28905 = new ArrayList();
        ((ArrayList) term28905).add(term28907);
        term28686 = newInstance(Class.forName("com.acme.types.Book"));
        Object term28735 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term28806 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term28831 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term28856 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term28686, term28686.getClass(), "id", "pIVDmquiiy");
        setField(term28686, term28686.getClass(), "title", "QKZBoZqVRg");
        setField(term28686, term28686.getClass(), "isbn13", "NEEIZQiGuu");
        setField(term28686, term28686.getClass(), "isbn10", "CEvOMXwQxg");
        setField(term28735, term28735.getClass(), "id", "mxdsPNszOh");
        setField(term28735, term28735.getClass(), "name", "IVVzjnfNdK");
        setField(term28686, term28686.getClass(), "genre", term28735);
        setField(term28686, term28686.getClass(), "yearOfPublication", term28760);
        setField(term28686, term28686.getClass(), "blurb", "ATmDitYnqV");
        setField(term28686, term28686.getClass(), "authors", term28774);
        setField(term28686, term28686.getClass(), "publishers", term28778);
        setField(term28806, term28806.getClass(), "id", "WDntvRKobM");
        setField(term28806, term28806.getClass(), "name", "mJSuTQTfHn");
        setField(term28686, term28686.getClass(), "lang", term28806);
        setField(term28831, term28831.getClass(), "id", "acFAOZPfAn");
        setField(term28831, term28831.getClass(), "formatName", "FbHxdSJvHz");
        setField(term28686, term28686.getClass(), "publishingFormat", term28831);
        setField(term28856, term28856.getClass(), "id", "qoyToBugkf");
        setField(term28856, term28856.getClass(), "smallUrl", "PqYWLUTFTg");
        setField(term28856, term28856.getClass(), "mediumUrl", "RZqzwBIYkl");
        setField(term28856, term28856.getClass(), "largeUrl", "bhSzAfOsQD");
        setField(term28686, term28686.getClass(), "cover", term28856);
        setField(term28686, term28686.getClass(), "awards", term28905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAwards", argTypes, term28686, args);
    }

};


