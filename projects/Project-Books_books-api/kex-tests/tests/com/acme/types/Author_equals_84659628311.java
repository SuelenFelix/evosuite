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

public class Author_equals_84659628311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35212;
     Object term35274;

    public Author_equals_84659628311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term35257 = new Integer(-995822131);
        ArrayList term35260 = new ArrayList();
        ArrayList term35263 = new ArrayList();
        ((ArrayList) term35263).add((Object)null);
        ((ArrayList) term35263).add((Object)null);
        ((ArrayList) term35263).add((Object)null);
        ((ArrayList) term35263).add((Object)null);
        ((ArrayList) term35263).add((Object)null);
        ((ArrayList) term35263).add((Object)null);
        ArrayList term35269 = new ArrayList();
        ((ArrayList) term35269).add((Object)null);
        ((ArrayList) term35269).add((Object)null);
        ((ArrayList) term35269).add((Object)null);
        ((ArrayList) term35269).add((Object)null);
        ((ArrayList) term35269).add((Object)null);
        ((ArrayList) term35269).add((Object)null);
        Object term35251 = newInstance(Class.forName("com.acme.types.Book"));
        Object term35256 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term35266 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term35267 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term35268 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term35251, term35251.getClass(), "id", "");
        setField(term35251, term35251.getClass(), "title", "");
        setField(term35251, term35251.getClass(), "isbn13", "");
        setField(term35251, term35251.getClass(), "isbn10", "");
        setField(term35256, term35256.getClass(), "id", null);
        setField(term35256, term35256.getClass(), "name", null);
        setField(term35251, term35251.getClass(), "genre", term35256);
        setField(term35251, term35251.getClass(), "yearOfPublication", term35257);
        setField(term35251, term35251.getClass(), "blurb", "");
        setField(term35251, term35251.getClass(), "authors", term35260);
        setField(term35251, term35251.getClass(), "publishers", term35263);
        setField(term35266, term35266.getClass(), "id", null);
        setField(term35266, term35266.getClass(), "name", null);
        setField(term35251, term35251.getClass(), "lang", term35266);
        setField(term35267, term35267.getClass(), "id", null);
        setField(term35267, term35267.getClass(), "formatName", null);
        setField(term35251, term35251.getClass(), "publishingFormat", term35267);
        setField(term35268, term35268.getClass(), "id", null);
        setField(term35268, term35268.getClass(), "smallUrl", null);
        setField(term35268, term35268.getClass(), "mediumUrl", null);
        setField(term35268, term35268.getClass(), "largeUrl", null);
        setField(term35251, term35251.getClass(), "cover", term35268);
        setField(term35251, term35251.getClass(), "awards", term35269);
        ArrayList term35249 = new ArrayList();
        ((ArrayList) term35249).add(term35251);
        term35212 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term35212, term35212.getClass(), "id", "MPlJZtSIPY");
        setField(term35212, term35212.getClass(), "fullName", "lXAoNyaPgl");
        setField(term35212, term35212.getClass(), "about", "nltplwQYWi");
        setField(term35212, term35212.getClass(), "books", term35249);
        term35274 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term35274;
        callMethod(klass, "equals", argTypes, term35212, args);
    }

};


