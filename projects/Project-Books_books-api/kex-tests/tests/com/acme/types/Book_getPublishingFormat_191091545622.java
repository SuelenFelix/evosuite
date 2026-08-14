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

public class Book_getPublishingFormat_191091545622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25630;

    public Book_getPublishingFormat_191091545622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term25704 = new Integer(-1420269858);
        ArrayList term25724 = new ArrayList();
        ((ArrayList) term25724).add((Object)null);
        ((ArrayList) term25724).add((Object)null);
        ((ArrayList) term25724).add((Object)null);
        ((ArrayList) term25724).add((Object)null);
        ((ArrayList) term25724).add((Object)null);
        Object term25720 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term25720, term25720.getClass(), "id", "");
        setField(term25720, term25720.getClass(), "fullName", "");
        setField(term25720, term25720.getClass(), "about", "");
        setField(term25720, term25720.getClass(), "books", term25724);
        ArrayList term25718 = new ArrayList();
        ((ArrayList) term25718).add(term25720);
        ((ArrayList) term25718).add(term25720);
        ArrayList term25734 = new ArrayList();
        ((ArrayList) term25734).add((Object)null);
        ((ArrayList) term25734).add((Object)null);
        ((ArrayList) term25734).add((Object)null);
        ((ArrayList) term25734).add((Object)null);
        ((ArrayList) term25734).add((Object)null);
        ((ArrayList) term25734).add((Object)null);
        ((ArrayList) term25734).add((Object)null);
        Object term25731 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term25731, term25731.getClass(), "id", "");
        setField(term25731, term25731.getClass(), "name", "");
        setField(term25731, term25731.getClass(), "books", term25734);
        ArrayList term25740 = new ArrayList();
        ((ArrayList) term25740).add((Object)null);
        ((ArrayList) term25740).add((Object)null);
        ((ArrayList) term25740).add((Object)null);
        ((ArrayList) term25740).add((Object)null);
        ((ArrayList) term25740).add((Object)null);
        ((ArrayList) term25740).add((Object)null);
        ((ArrayList) term25740).add((Object)null);
        ((ArrayList) term25740).add((Object)null);
        ((ArrayList) term25740).add((Object)null);
        Object term25737 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term25737, term25737.getClass(), "id", "");
        setField(term25737, term25737.getClass(), "name", "");
        setField(term25737, term25737.getClass(), "books", term25740);
        ArrayList term25729 = new ArrayList();
        ((ArrayList) term25729).add(term25731);
        ((ArrayList) term25729).add(term25737);
        ((ArrayList) term25729).add(term25731);
        ArrayList term25844 = new ArrayList();
        term25630 = newInstance(Class.forName("com.acme.types.Book"));
        Object term25679 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term25745 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term25770 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term25795 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term25630, term25630.getClass(), "id", "SsxScQXyGY");
        setField(term25630, term25630.getClass(), "title", "WKImQJKciy");
        setField(term25630, term25630.getClass(), "isbn13", "zFxenstHzS");
        setField(term25630, term25630.getClass(), "isbn10", "bgMqDcjsLV");
        setField(term25679, term25679.getClass(), "id", "zLEZEALrtb");
        setField(term25679, term25679.getClass(), "name", "fYrFVWJxMv");
        setField(term25630, term25630.getClass(), "genre", term25679);
        setField(term25630, term25630.getClass(), "yearOfPublication", term25704);
        setField(term25630, term25630.getClass(), "blurb", "nctbaYsHdQ");
        setField(term25630, term25630.getClass(), "authors", term25718);
        setField(term25630, term25630.getClass(), "publishers", term25729);
        setField(term25745, term25745.getClass(), "id", "xYDVnaWhJX");
        setField(term25745, term25745.getClass(), "name", "DgLnmWcSNo");
        setField(term25630, term25630.getClass(), "lang", term25745);
        setField(term25770, term25770.getClass(), "id", "HYVRFlRSiU");
        setField(term25770, term25770.getClass(), "formatName", "nEmiPinRJb");
        setField(term25630, term25630.getClass(), "publishingFormat", term25770);
        setField(term25795, term25795.getClass(), "id", "lLDlCidILl");
        setField(term25795, term25795.getClass(), "smallUrl", "GmDgAbnzLh");
        setField(term25795, term25795.getClass(), "mediumUrl", "HlzihENfEE");
        setField(term25795, term25795.getClass(), "largeUrl", "BVksxjZKJm");
        setField(term25630, term25630.getClass(), "cover", term25795);
        setField(term25630, term25630.getClass(), "awards", term25844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPublishingFormat", argTypes, term25630, args);
    }

};


