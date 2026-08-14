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

public class Book_equals_78899159129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31311;
     Object term31568;

    public Book_equals_78899159129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31385 = new Integer(1084849225);
        ArrayList term31399 = new ArrayList();
        ArrayList term31408 = new ArrayList();
        ((ArrayList) term31408).add((Object)null);
        ((ArrayList) term31408).add((Object)null);
        ((ArrayList) term31408).add((Object)null);
        ((ArrayList) term31408).add((Object)null);
        Object term31405 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term31405, term31405.getClass(), "id", "");
        setField(term31405, term31405.getClass(), "name", "");
        setField(term31405, term31405.getClass(), "books", term31408);
        ArrayList term31414 = new ArrayList();
        ((ArrayList) term31414).add((Object)null);
        ((ArrayList) term31414).add((Object)null);
        ((ArrayList) term31414).add((Object)null);
        Object term31411 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term31411, term31411.getClass(), "id", "");
        setField(term31411, term31411.getClass(), "name", "");
        setField(term31411, term31411.getClass(), "books", term31414);
        ArrayList term31420 = new ArrayList();
        ((ArrayList) term31420).add((Object)null);
        ((ArrayList) term31420).add((Object)null);
        ((ArrayList) term31420).add((Object)null);
        Object term31417 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term31417, term31417.getClass(), "id", "");
        setField(term31417, term31417.getClass(), "name", "");
        setField(term31417, term31417.getClass(), "books", term31420);
        ArrayList term31426 = new ArrayList();
        ((ArrayList) term31426).add((Object)null);
        ((ArrayList) term31426).add((Object)null);
        ((ArrayList) term31426).add((Object)null);
        ((ArrayList) term31426).add((Object)null);
        ((ArrayList) term31426).add((Object)null);
        ((ArrayList) term31426).add((Object)null);
        Object term31423 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term31423, term31423.getClass(), "id", "");
        setField(term31423, term31423.getClass(), "name", "");
        setField(term31423, term31423.getClass(), "books", term31426);
        ArrayList term31432 = new ArrayList();
        ((ArrayList) term31432).add((Object)null);
        ((ArrayList) term31432).add((Object)null);
        ((ArrayList) term31432).add((Object)null);
        Object term31429 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term31429, term31429.getClass(), "id", "");
        setField(term31429, term31429.getClass(), "name", "");
        setField(term31429, term31429.getClass(), "books", term31432);
        ArrayList term31438 = new ArrayList();
        ((ArrayList) term31438).add((Object)null);
        ((ArrayList) term31438).add((Object)null);
        ((ArrayList) term31438).add((Object)null);
        ((ArrayList) term31438).add((Object)null);
        ((ArrayList) term31438).add((Object)null);
        Object term31435 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term31435, term31435.getClass(), "id", "");
        setField(term31435, term31435.getClass(), "name", "");
        setField(term31435, term31435.getClass(), "books", term31438);
        ArrayList term31403 = new ArrayList();
        ((ArrayList) term31403).add(term31405);
        ((ArrayList) term31403).add(term31411);
        ((ArrayList) term31403).add(term31417);
        ((ArrayList) term31403).add(term31423);
        ((ArrayList) term31403).add(term31411);
        ((ArrayList) term31403).add(term31429);
        ((ArrayList) term31403).add(term31435);
        Class<? extends Object> term31720 = Class.forName((String) "com.acme.types.AwardName");
        Field term31719 = ((Class) term31720).getDeclaredField((String) "BAILLIE_PRIZE");
        ((Field) term31719).setAccessible(true);
        Object enum91 = ((Field) term31719).get((Object) null);
        Object term31544 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term31544, term31544.getClass(), "id", "");
        setField(term31544, term31544.getClass(), "awardName", enum91);
        setField(term31544, term31544.getClass(), "category", "");
        setIntField(term31544, term31544.getClass(), "year", -920797484);
        Class<? extends Object> term31886 = Class.forName((String) "com.acme.types.AwardName");
        Field term31885 = ((Class) term31886).getDeclaredField((String) "DYLAN_PRIZE");
        ((Field) term31885).setAccessible(true);
        Object enum92 = ((Field) term31885).get((Object) null);
        Object term31550 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term31550, term31550.getClass(), "id", "");
        setField(term31550, term31550.getClass(), "awardName", enum92);
        setField(term31550, term31550.getClass(), "category", "");
        setIntField(term31550, term31550.getClass(), "year", -1631697577);
        Object term31556 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term31556, term31556.getClass(), "id", "");
        setField(term31556, term31556.getClass(), "awardName", enum92);
        setField(term31556, term31556.getClass(), "category", "");
        setIntField(term31556, term31556.getClass(), "year", -2063843486);
        Class<? extends Object> term32046 = Class.forName((String) "com.acme.types.AwardName");
        Field term32045 = ((Class) term32046).getDeclaredField((String) "ORWELL_PRIZE");
        ((Field) term32045).setAccessible(true);
        Object enum93 = ((Field) term32045).get((Object) null);
        Object term31560 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term31560, term31560.getClass(), "id", "");
        setField(term31560, term31560.getClass(), "awardName", enum93);
        setField(term31560, term31560.getClass(), "category", "");
        setIntField(term31560, term31560.getClass(), "year", 917513193);
        ArrayList term31542 = new ArrayList();
        ((ArrayList) term31542).add(term31544);
        ((ArrayList) term31542).add(term31550);
        ((ArrayList) term31542).add(term31556);
        ((ArrayList) term31542).add(term31560);
        term31311 = newInstance(Class.forName("com.acme.types.Book"));
        Object term31360 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term31443 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term31468 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term31493 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term31311, term31311.getClass(), "id", "YUhHOeBPAY");
        setField(term31311, term31311.getClass(), "title", "uQajEqWBxv");
        setField(term31311, term31311.getClass(), "isbn13", "nUQbsnKbql");
        setField(term31311, term31311.getClass(), "isbn10", "AdLJITWMJR");
        setField(term31360, term31360.getClass(), "id", "lvhWpqyoYG");
        setField(term31360, term31360.getClass(), "name", "HMnGeMHNnH");
        setField(term31311, term31311.getClass(), "genre", term31360);
        setField(term31311, term31311.getClass(), "yearOfPublication", term31385);
        setField(term31311, term31311.getClass(), "blurb", "UUmHKDSCMT");
        setField(term31311, term31311.getClass(), "authors", term31399);
        setField(term31311, term31311.getClass(), "publishers", term31403);
        setField(term31443, term31443.getClass(), "id", "bjNoIGSbRa");
        setField(term31443, term31443.getClass(), "name", "eIxxueawmN");
        setField(term31311, term31311.getClass(), "lang", term31443);
        setField(term31468, term31468.getClass(), "id", "volmBRjfjo");
        setField(term31468, term31468.getClass(), "formatName", "lTWvOENdcy");
        setField(term31311, term31311.getClass(), "publishingFormat", term31468);
        setField(term31493, term31493.getClass(), "id", "ScNRCxypAO");
        setField(term31493, term31493.getClass(), "smallUrl", "jauAZKXWsp");
        setField(term31493, term31493.getClass(), "mediumUrl", "ZSwsDVYLra");
        setField(term31493, term31493.getClass(), "largeUrl", "GefAefFWCB");
        setField(term31311, term31311.getClass(), "cover", term31493);
        setField(term31311, term31311.getClass(), "awards", term31542);
        term31568 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term31568;
        callMethod(klass, "equals", argTypes, term31311, args);
    }

};


