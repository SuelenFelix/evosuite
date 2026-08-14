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

public class Book_toString_17045477428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30223;

    public Book_toString_17045477428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30297 = new Integer(1390820006);
        ArrayList term30317 = new ArrayList();
        ((ArrayList) term30317).add((Object)null);
        ((ArrayList) term30317).add((Object)null);
        ((ArrayList) term30317).add((Object)null);
        ((ArrayList) term30317).add((Object)null);
        ((ArrayList) term30317).add((Object)null);
        ((ArrayList) term30317).add((Object)null);
        Object term30313 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term30313, term30313.getClass(), "id", "");
        setField(term30313, term30313.getClass(), "fullName", "");
        setField(term30313, term30313.getClass(), "about", "");
        setField(term30313, term30313.getClass(), "books", term30317);
        ArrayList term30324 = new ArrayList();
        ((ArrayList) term30324).add((Object)null);
        ((ArrayList) term30324).add((Object)null);
        ((ArrayList) term30324).add((Object)null);
        ((ArrayList) term30324).add((Object)null);
        ((ArrayList) term30324).add((Object)null);
        Object term30320 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term30320, term30320.getClass(), "id", "");
        setField(term30320, term30320.getClass(), "fullName", "");
        setField(term30320, term30320.getClass(), "about", "");
        setField(term30320, term30320.getClass(), "books", term30324);
        ArrayList term30311 = new ArrayList();
        ((ArrayList) term30311).add(term30313);
        ((ArrayList) term30311).add(term30320);
        ArrayList term30334 = new ArrayList();
        ((ArrayList) term30334).add((Object)null);
        ((ArrayList) term30334).add((Object)null);
        ((ArrayList) term30334).add((Object)null);
        Object term30331 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term30331, term30331.getClass(), "id", "");
        setField(term30331, term30331.getClass(), "name", "");
        setField(term30331, term30331.getClass(), "books", term30334);
        ArrayList term30340 = new ArrayList();
        ((ArrayList) term30340).add((Object)null);
        ((ArrayList) term30340).add((Object)null);
        ((ArrayList) term30340).add((Object)null);
        ((ArrayList) term30340).add((Object)null);
        ((ArrayList) term30340).add((Object)null);
        ((ArrayList) term30340).add((Object)null);
        ((ArrayList) term30340).add((Object)null);
        ((ArrayList) term30340).add((Object)null);
        Object term30337 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term30337, term30337.getClass(), "id", "");
        setField(term30337, term30337.getClass(), "name", "");
        setField(term30337, term30337.getClass(), "books", term30340);
        ArrayList term30329 = new ArrayList();
        ((ArrayList) term30329).add(term30331);
        ((ArrayList) term30329).add(term30337);
        Class<? extends Object> term30627 = Class.forName((String) "com.acme.types.AwardName");
        Field term30626 = ((Class) term30627).getDeclaredField((String) "BOOKER_INTER_PRIZE");
        ((Field) term30626).setAccessible(true);
        Object enum87 = ((Field) term30626).get((Object) null);
        Object term30446 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term30446, term30446.getClass(), "id", "");
        setField(term30446, term30446.getClass(), "awardName", enum87);
        setField(term30446, term30446.getClass(), "category", "");
        setIntField(term30446, term30446.getClass(), "year", 808203320);
        Object term30452 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term30452, term30452.getClass(), "id", "");
        setField(term30452, term30452.getClass(), "awardName", enum87);
        setField(term30452, term30452.getClass(), "category", "");
        setIntField(term30452, term30452.getClass(), "year", 977862393);
        Class<? extends Object> term30808 = Class.forName((String) "com.acme.types.AwardName");
        Field term30807 = ((Class) term30808).getDeclaredField((String) "BOOKER_INTER_PRIZE");
        ((Field) term30807).setAccessible(true);
        Object enum88 = ((Field) term30807).get((Object) null);
        Object term30456 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term30456, term30456.getClass(), "id", "");
        setField(term30456, term30456.getClass(), "awardName", enum88);
        setField(term30456, term30456.getClass(), "category", "");
        setIntField(term30456, term30456.getClass(), "year", -544382127);
        Class<? extends Object> term30989 = Class.forName((String) "com.acme.types.AwardName");
        Field term30988 = ((Class) term30989).getDeclaredField((String) "BOOKER_PRIZE");
        ((Field) term30988).setAccessible(true);
        Object enum89 = ((Field) term30988).get((Object) null);
        Object term30462 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term30462, term30462.getClass(), "id", "");
        setField(term30462, term30462.getClass(), "awardName", enum89);
        setField(term30462, term30462.getClass(), "category", "");
        setIntField(term30462, term30462.getClass(), "year", -439048495);
        Class<? extends Object> term31152 = Class.forName((String) "com.acme.types.AwardName");
        Field term31151 = ((Class) term31152).getDeclaredField((String) "DYLAN_PRIZE");
        ((Field) term31151).setAccessible(true);
        Object enum90 = ((Field) term31151).get((Object) null);
        Object term30468 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term30468, term30468.getClass(), "id", "");
        setField(term30468, term30468.getClass(), "awardName", enum90);
        setField(term30468, term30468.getClass(), "category", "");
        setIntField(term30468, term30468.getClass(), "year", -1849105286);
        ArrayList term30444 = new ArrayList();
        ((ArrayList) term30444).add(term30446);
        ((ArrayList) term30444).add(term30452);
        ((ArrayList) term30444).add(term30456);
        ((ArrayList) term30444).add(term30462);
        ((ArrayList) term30444).add(term30468);
        term30223 = newInstance(Class.forName("com.acme.types.Book"));
        Object term30272 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term30345 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term30370 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term30395 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term30223, term30223.getClass(), "id", "iLylbwIxgL");
        setField(term30223, term30223.getClass(), "title", "GdxqsdOdeY");
        setField(term30223, term30223.getClass(), "isbn13", "ZkgLXzqSzZ");
        setField(term30223, term30223.getClass(), "isbn10", "zoketwSPjK");
        setField(term30272, term30272.getClass(), "id", "JlDlGXpHbW");
        setField(term30272, term30272.getClass(), "name", "EMaqblGdQs");
        setField(term30223, term30223.getClass(), "genre", term30272);
        setField(term30223, term30223.getClass(), "yearOfPublication", term30297);
        setField(term30223, term30223.getClass(), "blurb", "uEToaAPaPt");
        setField(term30223, term30223.getClass(), "authors", term30311);
        setField(term30223, term30223.getClass(), "publishers", term30329);
        setField(term30345, term30345.getClass(), "id", "mtPPnpDISm");
        setField(term30345, term30345.getClass(), "name", "AoSkdtsoBx");
        setField(term30223, term30223.getClass(), "lang", term30345);
        setField(term30370, term30370.getClass(), "id", "jrZmqbTcJl");
        setField(term30370, term30370.getClass(), "formatName", "yNNgRsdIJB");
        setField(term30223, term30223.getClass(), "publishingFormat", term30370);
        setField(term30395, term30395.getClass(), "id", "mTGSRlRqoq");
        setField(term30395, term30395.getClass(), "smallUrl", "JqQcQNfjqu");
        setField(term30395, term30395.getClass(), "mediumUrl", "yteVNaIzuh");
        setField(term30395, term30395.getClass(), "largeUrl", "enQDPVKJyy");
        setField(term30223, term30223.getClass(), "cover", term30395);
        setField(term30223, term30223.getClass(), "awards", term30444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term30223, args);
    }

};


