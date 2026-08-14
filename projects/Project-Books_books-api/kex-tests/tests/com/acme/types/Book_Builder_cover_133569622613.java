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

public class Book_Builder_cover_133569622613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48461;
     Object term48707;

    public Book_Builder_cover_133569622613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term48535 = new Integer(1302807565);
        ArrayList term48555 = new ArrayList();
        ((ArrayList) term48555).add((Object)null);
        ((ArrayList) term48555).add((Object)null);
        Object term48551 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term48551, term48551.getClass(), "id", "");
        setField(term48551, term48551.getClass(), "fullName", "");
        setField(term48551, term48551.getClass(), "about", "");
        setField(term48551, term48551.getClass(), "books", term48555);
        ArrayList term48562 = new ArrayList();
        Object term48558 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term48558, term48558.getClass(), "id", "");
        setField(term48558, term48558.getClass(), "fullName", "");
        setField(term48558, term48558.getClass(), "about", "");
        setField(term48558, term48558.getClass(), "books", term48562);
        ArrayList term48569 = new ArrayList();
        ((ArrayList) term48569).add((Object)null);
        ((ArrayList) term48569).add((Object)null);
        ((ArrayList) term48569).add((Object)null);
        Object term48565 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term48565, term48565.getClass(), "id", "");
        setField(term48565, term48565.getClass(), "fullName", "");
        setField(term48565, term48565.getClass(), "about", "");
        setField(term48565, term48565.getClass(), "books", term48569);
        ArrayList term48576 = new ArrayList();
        ((ArrayList) term48576).add((Object)null);
        ((ArrayList) term48576).add((Object)null);
        ((ArrayList) term48576).add((Object)null);
        ((ArrayList) term48576).add((Object)null);
        Object term48572 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term48572, term48572.getClass(), "id", "");
        setField(term48572, term48572.getClass(), "fullName", "");
        setField(term48572, term48572.getClass(), "about", "");
        setField(term48572, term48572.getClass(), "books", term48576);
        ArrayList term48583 = new ArrayList();
        ((ArrayList) term48583).add((Object)null);
        ((ArrayList) term48583).add((Object)null);
        ((ArrayList) term48583).add((Object)null);
        ((ArrayList) term48583).add((Object)null);
        ((ArrayList) term48583).add((Object)null);
        ((ArrayList) term48583).add((Object)null);
        ((ArrayList) term48583).add((Object)null);
        Object term48579 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term48579, term48579.getClass(), "id", "");
        setField(term48579, term48579.getClass(), "fullName", "");
        setField(term48579, term48579.getClass(), "about", "");
        setField(term48579, term48579.getClass(), "books", term48583);
        ArrayList term48549 = new ArrayList();
        ((ArrayList) term48549).add(term48551);
        ((ArrayList) term48549).add(term48558);
        ((ArrayList) term48549).add(term48565);
        ((ArrayList) term48549).add(term48572);
        ((ArrayList) term48549).add(term48565);
        ((ArrayList) term48549).add(term48579);
        ArrayList term48593 = new ArrayList();
        ((ArrayList) term48593).add((Object)null);
        ((ArrayList) term48593).add((Object)null);
        ((ArrayList) term48593).add((Object)null);
        Object term48590 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term48590, term48590.getClass(), "id", "");
        setField(term48590, term48590.getClass(), "name", "");
        setField(term48590, term48590.getClass(), "books", term48593);
        ArrayList term48588 = new ArrayList();
        ((ArrayList) term48588).add(term48590);
        Class<? extends Object> term48907 = Class.forName((String) "com.acme.types.AwardName");
        Field term48906 = ((Class) term48907).getDeclaredField((String) "NOBEL_PRIZE");
        ((Field) term48906).setAccessible(true);
        Object enum126 = ((Field) term48906).get((Object) null);
        Object term48699 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term48699, term48699.getClass(), "id", "");
        setField(term48699, term48699.getClass(), "awardName", enum126);
        setField(term48699, term48699.getClass(), "category", "");
        setIntField(term48699, term48699.getClass(), "year", -1698809299);
        ArrayList term48697 = new ArrayList();
        ((ArrayList) term48697).add(term48699);
        term48461 = newInstance(Class.forName("com.acme.types.Book$Builder"));
        Object term48510 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term48598 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term48623 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term48648 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term48461, term48461.getClass(), "id", "ghawYgLBcb");
        setField(term48461, term48461.getClass(), "title", "IIMgJcElEH");
        setField(term48461, term48461.getClass(), "isbn13", "rlDnHhsZPZ");
        setField(term48461, term48461.getClass(), "isbn10", "yodewYgpYp");
        setField(term48510, term48510.getClass(), "id", "HGyKxaWqKz");
        setField(term48510, term48510.getClass(), "name", "FBzBkypSYW");
        setField(term48461, term48461.getClass(), "genre", term48510);
        setField(term48461, term48461.getClass(), "yearOfPublication", term48535);
        setField(term48461, term48461.getClass(), "blurb", "CImdJnlRdG");
        setField(term48461, term48461.getClass(), "authors", term48549);
        setField(term48461, term48461.getClass(), "publishers", term48588);
        setField(term48598, term48598.getClass(), "id", "zLtQRzzQsx");
        setField(term48598, term48598.getClass(), "name", "xrbYHaIJkz");
        setField(term48461, term48461.getClass(), "lang", term48598);
        setField(term48623, term48623.getClass(), "id", "uRsFFdRrYm");
        setField(term48623, term48623.getClass(), "formatName", "ngbxoIziCf");
        setField(term48461, term48461.getClass(), "publishingFormat", term48623);
        setField(term48648, term48648.getClass(), "id", "YhncGiHTLa");
        setField(term48648, term48648.getClass(), "smallUrl", "OQoTXYHpkl");
        setField(term48648, term48648.getClass(), "mediumUrl", "GYkJyiOMDG");
        setField(term48648, term48648.getClass(), "largeUrl", "ATEOAhPVCd");
        setField(term48461, term48461.getClass(), "cover", term48648);
        setField(term48461, term48461.getClass(), "awards", term48697);
        term48707 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term48707, term48707.getClass(), "id", "gJpniBhcDl");
        setField(term48707, term48707.getClass(), "smallUrl", "euImildoTH");
        setField(term48707, term48707.getClass(), "mediumUrl", "lSzyYtPXva");
        setField(term48707, term48707.getClass(), "largeUrl", "pctbRTsNHf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.acme.types.Cover");
        Object[] args = new Object[1];
        args[0] = term48707;
        callMethod(klass, "cover", argTypes, term48461, args);
    }

};


