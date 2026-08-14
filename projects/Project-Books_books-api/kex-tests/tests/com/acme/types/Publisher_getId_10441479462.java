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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class Publisher_getId_10441479462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305;

    public Publisher_getId_10441479462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term338 = new Integer(865208305);
        ArrayList term341 = new ArrayList();
        ((ArrayList) term341).add((Object)null);
        ((ArrayList) term341).add((Object)null);
        ((ArrayList) term341).add((Object)null);
        ((ArrayList) term341).add((Object)null);
        ArrayList term344 = new ArrayList();
        ((ArrayList) term344).add((Object)null);
        ((ArrayList) term344).add((Object)null);
        ((ArrayList) term344).add((Object)null);
        ((ArrayList) term344).add((Object)null);
        ((ArrayList) term344).add((Object)null);
        ((ArrayList) term344).add((Object)null);
        ((ArrayList) term344).add((Object)null);
        ArrayList term350 = new ArrayList();
        ((ArrayList) term350).add((Object)null);
        ((ArrayList) term350).add((Object)null);
        ((ArrayList) term350).add((Object)null);
        ((ArrayList) term350).add((Object)null);
        ((ArrayList) term350).add((Object)null);
        ((ArrayList) term350).add((Object)null);
        ((ArrayList) term350).add((Object)null);
        ((ArrayList) term350).add((Object)null);
        Object term332 = newInstance(Class.forName("com.acme.types.Book"));
        Object term337 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term347 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term348 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term349 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term332, term332.getClass(), "id", "");
        setField(term332, term332.getClass(), "title", "");
        setField(term332, term332.getClass(), "isbn13", "");
        setField(term332, term332.getClass(), "isbn10", "");
        setField(term337, term337.getClass(), "id", null);
        setField(term337, term337.getClass(), "name", null);
        setField(term332, term332.getClass(), "genre", term337);
        setField(term332, term332.getClass(), "yearOfPublication", term338);
        setField(term332, term332.getClass(), "blurb", "");
        setField(term332, term332.getClass(), "authors", term341);
        setField(term332, term332.getClass(), "publishers", term344);
        setField(term347, term347.getClass(), "id", null);
        setField(term347, term347.getClass(), "name", null);
        setField(term332, term332.getClass(), "lang", term347);
        setField(term348, term348.getClass(), "id", null);
        setField(term348, term348.getClass(), "formatName", null);
        setField(term332, term332.getClass(), "publishingFormat", term348);
        setField(term349, term349.getClass(), "id", null);
        setField(term349, term349.getClass(), "smallUrl", null);
        setField(term349, term349.getClass(), "mediumUrl", null);
        setField(term349, term349.getClass(), "largeUrl", null);
        setField(term332, term332.getClass(), "cover", term349);
        setField(term332, term332.getClass(), "awards", term350);
        Integer term359 = new Integer(-1087774327);
        ArrayList term362 = new ArrayList();
        ((ArrayList) term362).add((Object)null);
        ((ArrayList) term362).add((Object)null);
        ArrayList term365 = new ArrayList();
        ((ArrayList) term365).add((Object)null);
        ((ArrayList) term365).add((Object)null);
        ((ArrayList) term365).add((Object)null);
        ((ArrayList) term365).add((Object)null);
        ArrayList term371 = new ArrayList();
        ((ArrayList) term371).add((Object)null);
        ((ArrayList) term371).add((Object)null);
        ((ArrayList) term371).add((Object)null);
        ((ArrayList) term371).add((Object)null);
        ((ArrayList) term371).add((Object)null);
        Object term353 = newInstance(Class.forName("com.acme.types.Book"));
        Object term358 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term368 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term369 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term370 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term353, term353.getClass(), "id", "");
        setField(term353, term353.getClass(), "title", "");
        setField(term353, term353.getClass(), "isbn13", "");
        setField(term353, term353.getClass(), "isbn10", "");
        setField(term358, term358.getClass(), "id", null);
        setField(term358, term358.getClass(), "name", null);
        setField(term353, term353.getClass(), "genre", term358);
        setField(term353, term353.getClass(), "yearOfPublication", term359);
        setField(term353, term353.getClass(), "blurb", "");
        setField(term353, term353.getClass(), "authors", term362);
        setField(term353, term353.getClass(), "publishers", term365);
        setField(term368, term368.getClass(), "id", null);
        setField(term368, term368.getClass(), "name", null);
        setField(term353, term353.getClass(), "lang", term368);
        setField(term369, term369.getClass(), "id", null);
        setField(term369, term369.getClass(), "formatName", null);
        setField(term353, term353.getClass(), "publishingFormat", term369);
        setField(term370, term370.getClass(), "id", null);
        setField(term370, term370.getClass(), "smallUrl", null);
        setField(term370, term370.getClass(), "mediumUrl", null);
        setField(term370, term370.getClass(), "largeUrl", null);
        setField(term353, term353.getClass(), "cover", term370);
        setField(term353, term353.getClass(), "awards", term371);
        Integer term380 = new Integer(-244121226);
        ArrayList term383 = new ArrayList();
        ((ArrayList) term383).add((Object)null);
        ((ArrayList) term383).add((Object)null);
        ((ArrayList) term383).add((Object)null);
        ((ArrayList) term383).add((Object)null);
        ((ArrayList) term383).add((Object)null);
        ((ArrayList) term383).add((Object)null);
        ((ArrayList) term383).add((Object)null);
        ArrayList term386 = new ArrayList();
        ((ArrayList) term386).add((Object)null);
        ((ArrayList) term386).add((Object)null);
        ((ArrayList) term386).add((Object)null);
        ((ArrayList) term386).add((Object)null);
        ((ArrayList) term386).add((Object)null);
        ((ArrayList) term386).add((Object)null);
        ((ArrayList) term386).add((Object)null);
        ArrayList term392 = new ArrayList();
        ((ArrayList) term392).add((Object)null);
        ((ArrayList) term392).add((Object)null);
        ((ArrayList) term392).add((Object)null);
        ((ArrayList) term392).add((Object)null);
        ((ArrayList) term392).add((Object)null);
        ((ArrayList) term392).add((Object)null);
        ((ArrayList) term392).add((Object)null);
        Object term374 = newInstance(Class.forName("com.acme.types.Book"));
        Object term379 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term389 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term390 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term391 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term374, term374.getClass(), "id", "");
        setField(term374, term374.getClass(), "title", "");
        setField(term374, term374.getClass(), "isbn13", "");
        setField(term374, term374.getClass(), "isbn10", "");
        setField(term379, term379.getClass(), "id", null);
        setField(term379, term379.getClass(), "name", null);
        setField(term374, term374.getClass(), "genre", term379);
        setField(term374, term374.getClass(), "yearOfPublication", term380);
        setField(term374, term374.getClass(), "blurb", "");
        setField(term374, term374.getClass(), "authors", term383);
        setField(term374, term374.getClass(), "publishers", term386);
        setField(term389, term389.getClass(), "id", null);
        setField(term389, term389.getClass(), "name", null);
        setField(term374, term374.getClass(), "lang", term389);
        setField(term390, term390.getClass(), "id", null);
        setField(term390, term390.getClass(), "formatName", null);
        setField(term374, term374.getClass(), "publishingFormat", term390);
        setField(term391, term391.getClass(), "id", null);
        setField(term391, term391.getClass(), "smallUrl", null);
        setField(term391, term391.getClass(), "mediumUrl", null);
        setField(term391, term391.getClass(), "largeUrl", null);
        setField(term374, term374.getClass(), "cover", term391);
        setField(term374, term374.getClass(), "awards", term392);
        ArrayList term330 = new ArrayList();
        ((ArrayList) term330).add(term332);
        ((ArrayList) term330).add(term353);
        ((ArrayList) term330).add(term374);
        term305 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term305, term305.getClass(), "id", "QjvDwgKJGz");
        setField(term305, term305.getClass(), "name", "ngYxiXTZrk");
        setField(term305, term305.getClass(), "books", term330);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Publisher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term305, args);
    }

};


