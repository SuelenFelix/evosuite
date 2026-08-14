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

public class Publisher_toString_8062478578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1254;

    public Publisher_toString_8062478578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1287 = new Integer(-615654495);
        ArrayList term1290 = new ArrayList();
        ((ArrayList) term1290).add((Object)null);
        ((ArrayList) term1290).add((Object)null);
        ((ArrayList) term1290).add((Object)null);
        ((ArrayList) term1290).add((Object)null);
        ((ArrayList) term1290).add((Object)null);
        ((ArrayList) term1290).add((Object)null);
        ((ArrayList) term1290).add((Object)null);
        ArrayList term1293 = new ArrayList();
        ((ArrayList) term1293).add((Object)null);
        ((ArrayList) term1293).add((Object)null);
        ((ArrayList) term1293).add((Object)null);
        ((ArrayList) term1293).add((Object)null);
        ((ArrayList) term1293).add((Object)null);
        ((ArrayList) term1293).add((Object)null);
        ((ArrayList) term1293).add((Object)null);
        ArrayList term1299 = new ArrayList();
        ((ArrayList) term1299).add((Object)null);
        ((ArrayList) term1299).add((Object)null);
        Object term1281 = newInstance(Class.forName("com.acme.types.Book"));
        Object term1286 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term1296 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term1297 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term1298 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term1281, term1281.getClass(), "id", "");
        setField(term1281, term1281.getClass(), "title", "");
        setField(term1281, term1281.getClass(), "isbn13", "");
        setField(term1281, term1281.getClass(), "isbn10", "");
        setField(term1286, term1286.getClass(), "id", null);
        setField(term1286, term1286.getClass(), "name", null);
        setField(term1281, term1281.getClass(), "genre", term1286);
        setField(term1281, term1281.getClass(), "yearOfPublication", term1287);
        setField(term1281, term1281.getClass(), "blurb", "");
        setField(term1281, term1281.getClass(), "authors", term1290);
        setField(term1281, term1281.getClass(), "publishers", term1293);
        setField(term1296, term1296.getClass(), "id", null);
        setField(term1296, term1296.getClass(), "name", null);
        setField(term1281, term1281.getClass(), "lang", term1296);
        setField(term1297, term1297.getClass(), "id", null);
        setField(term1297, term1297.getClass(), "formatName", null);
        setField(term1281, term1281.getClass(), "publishingFormat", term1297);
        setField(term1298, term1298.getClass(), "id", null);
        setField(term1298, term1298.getClass(), "smallUrl", null);
        setField(term1298, term1298.getClass(), "mediumUrl", null);
        setField(term1298, term1298.getClass(), "largeUrl", null);
        setField(term1281, term1281.getClass(), "cover", term1298);
        setField(term1281, term1281.getClass(), "awards", term1299);
        ArrayList term1279 = new ArrayList();
        ((ArrayList) term1279).add(term1281);
        term1254 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term1254, term1254.getClass(), "id", "npPxKNoqdS");
        setField(term1254, term1254.getClass(), "name", "tGgCtmAQPu");
        setField(term1254, term1254.getClass(), "books", term1279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Publisher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1254, args);
    }

};


