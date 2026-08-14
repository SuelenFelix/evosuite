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

public class Publisher_setId_13445120183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417;

    public Publisher_setId_13445120183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term450 = new Integer(-469968304);
        ArrayList term453 = new ArrayList();
        ((ArrayList) term453).add((Object)null);
        ((ArrayList) term453).add((Object)null);
        ArrayList term456 = new ArrayList();
        ((ArrayList) term456).add((Object)null);
        ((ArrayList) term456).add((Object)null);
        ((ArrayList) term456).add((Object)null);
        ((ArrayList) term456).add((Object)null);
        ((ArrayList) term456).add((Object)null);
        ((ArrayList) term456).add((Object)null);
        ((ArrayList) term456).add((Object)null);
        ((ArrayList) term456).add((Object)null);
        ((ArrayList) term456).add((Object)null);
        ArrayList term462 = new ArrayList();
        ((ArrayList) term462).add((Object)null);
        ((ArrayList) term462).add((Object)null);
        ((ArrayList) term462).add((Object)null);
        ((ArrayList) term462).add((Object)null);
        Object term444 = newInstance(Class.forName("com.acme.types.Book"));
        Object term449 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term459 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term460 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term461 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term444, term444.getClass(), "id", "");
        setField(term444, term444.getClass(), "title", "");
        setField(term444, term444.getClass(), "isbn13", "");
        setField(term444, term444.getClass(), "isbn10", "");
        setField(term449, term449.getClass(), "id", null);
        setField(term449, term449.getClass(), "name", null);
        setField(term444, term444.getClass(), "genre", term449);
        setField(term444, term444.getClass(), "yearOfPublication", term450);
        setField(term444, term444.getClass(), "blurb", "");
        setField(term444, term444.getClass(), "authors", term453);
        setField(term444, term444.getClass(), "publishers", term456);
        setField(term459, term459.getClass(), "id", null);
        setField(term459, term459.getClass(), "name", null);
        setField(term444, term444.getClass(), "lang", term459);
        setField(term460, term460.getClass(), "id", null);
        setField(term460, term460.getClass(), "formatName", null);
        setField(term444, term444.getClass(), "publishingFormat", term460);
        setField(term461, term461.getClass(), "id", null);
        setField(term461, term461.getClass(), "smallUrl", null);
        setField(term461, term461.getClass(), "mediumUrl", null);
        setField(term461, term461.getClass(), "largeUrl", null);
        setField(term444, term444.getClass(), "cover", term461);
        setField(term444, term444.getClass(), "awards", term462);
        Integer term471 = new Integer(-1145578966);
        ArrayList term474 = new ArrayList();
        ((ArrayList) term474).add((Object)null);
        ((ArrayList) term474).add((Object)null);
        ((ArrayList) term474).add((Object)null);
        ((ArrayList) term474).add((Object)null);
        ArrayList term477 = new ArrayList();
        ArrayList term483 = new ArrayList();
        Object term465 = newInstance(Class.forName("com.acme.types.Book"));
        Object term470 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term480 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term481 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term482 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term465, term465.getClass(), "id", "");
        setField(term465, term465.getClass(), "title", "");
        setField(term465, term465.getClass(), "isbn13", "");
        setField(term465, term465.getClass(), "isbn10", "");
        setField(term470, term470.getClass(), "id", null);
        setField(term470, term470.getClass(), "name", null);
        setField(term465, term465.getClass(), "genre", term470);
        setField(term465, term465.getClass(), "yearOfPublication", term471);
        setField(term465, term465.getClass(), "blurb", "");
        setField(term465, term465.getClass(), "authors", term474);
        setField(term465, term465.getClass(), "publishers", term477);
        setField(term480, term480.getClass(), "id", null);
        setField(term480, term480.getClass(), "name", null);
        setField(term465, term465.getClass(), "lang", term480);
        setField(term481, term481.getClass(), "id", null);
        setField(term481, term481.getClass(), "formatName", null);
        setField(term465, term465.getClass(), "publishingFormat", term481);
        setField(term482, term482.getClass(), "id", null);
        setField(term482, term482.getClass(), "smallUrl", null);
        setField(term482, term482.getClass(), "mediumUrl", null);
        setField(term482, term482.getClass(), "largeUrl", null);
        setField(term465, term465.getClass(), "cover", term482);
        setField(term465, term465.getClass(), "awards", term483);
        Integer term492 = new Integer(1876565163);
        ArrayList term495 = new ArrayList();
        ((ArrayList) term495).add((Object)null);
        ((ArrayList) term495).add((Object)null);
        ((ArrayList) term495).add((Object)null);
        ArrayList term498 = new ArrayList();
        ((ArrayList) term498).add((Object)null);
        ((ArrayList) term498).add((Object)null);
        ((ArrayList) term498).add((Object)null);
        ((ArrayList) term498).add((Object)null);
        ((ArrayList) term498).add((Object)null);
        ArrayList term504 = new ArrayList();
        ((ArrayList) term504).add((Object)null);
        ((ArrayList) term504).add((Object)null);
        Object term486 = newInstance(Class.forName("com.acme.types.Book"));
        Object term491 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term501 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term502 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term503 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term486, term486.getClass(), "id", "");
        setField(term486, term486.getClass(), "title", "");
        setField(term486, term486.getClass(), "isbn13", "");
        setField(term486, term486.getClass(), "isbn10", "");
        setField(term491, term491.getClass(), "id", null);
        setField(term491, term491.getClass(), "name", null);
        setField(term486, term486.getClass(), "genre", term491);
        setField(term486, term486.getClass(), "yearOfPublication", term492);
        setField(term486, term486.getClass(), "blurb", "");
        setField(term486, term486.getClass(), "authors", term495);
        setField(term486, term486.getClass(), "publishers", term498);
        setField(term501, term501.getClass(), "id", null);
        setField(term501, term501.getClass(), "name", null);
        setField(term486, term486.getClass(), "lang", term501);
        setField(term502, term502.getClass(), "id", null);
        setField(term502, term502.getClass(), "formatName", null);
        setField(term486, term486.getClass(), "publishingFormat", term502);
        setField(term503, term503.getClass(), "id", null);
        setField(term503, term503.getClass(), "smallUrl", null);
        setField(term503, term503.getClass(), "mediumUrl", null);
        setField(term503, term503.getClass(), "largeUrl", null);
        setField(term486, term486.getClass(), "cover", term503);
        setField(term486, term486.getClass(), "awards", term504);
        ArrayList term442 = new ArrayList();
        ((ArrayList) term442).add(term444);
        ((ArrayList) term442).add(term465);
        ((ArrayList) term442).add(term486);
        term417 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term417, term417.getClass(), "id", "udRdJkgXmH");
        setField(term417, term417.getClass(), "name", "FBCXbjHVXO");
        setField(term417, term417.getClass(), "books", term442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Publisher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KSZfGbvzPE";
        callMethod(klass, "setId", argTypes, term417, args);
    }

};


