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

public class Book_setTitle_16555148805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9621;

    public Book_setTitle_16555148805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9695 = new Integer(-1882480155);
        ArrayList term9715 = new ArrayList();
        ((ArrayList) term9715).add((Object)null);
        ((ArrayList) term9715).add((Object)null);
        ((ArrayList) term9715).add((Object)null);
        ((ArrayList) term9715).add((Object)null);
        ((ArrayList) term9715).add((Object)null);
        ((ArrayList) term9715).add((Object)null);
        ((ArrayList) term9715).add((Object)null);
        ((ArrayList) term9715).add((Object)null);
        ((ArrayList) term9715).add((Object)null);
        Object term9711 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term9711, term9711.getClass(), "id", "");
        setField(term9711, term9711.getClass(), "fullName", "");
        setField(term9711, term9711.getClass(), "about", "");
        setField(term9711, term9711.getClass(), "books", term9715);
        ArrayList term9709 = new ArrayList();
        ((ArrayList) term9709).add(term9711);
        ArrayList term9720 = new ArrayList();
        ArrayList term9823 = new ArrayList();
        term9621 = newInstance(Class.forName("com.acme.types.Book"));
        Object term9670 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term9724 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term9749 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term9774 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term9621, term9621.getClass(), "id", "CEVnfPOBDk");
        setField(term9621, term9621.getClass(), "title", "JUpDTRXGtv");
        setField(term9621, term9621.getClass(), "isbn13", "cKBnwzMCia");
        setField(term9621, term9621.getClass(), "isbn10", "QWmZpWASOK");
        setField(term9670, term9670.getClass(), "id", "ZNLWGsxniS");
        setField(term9670, term9670.getClass(), "name", "JARLxkvqNB");
        setField(term9621, term9621.getClass(), "genre", term9670);
        setField(term9621, term9621.getClass(), "yearOfPublication", term9695);
        setField(term9621, term9621.getClass(), "blurb", "tNcVErsFVe");
        setField(term9621, term9621.getClass(), "authors", term9709);
        setField(term9621, term9621.getClass(), "publishers", term9720);
        setField(term9724, term9724.getClass(), "id", "GohPpeqrRh");
        setField(term9724, term9724.getClass(), "name", "pfGxZUUbIW");
        setField(term9621, term9621.getClass(), "lang", term9724);
        setField(term9749, term9749.getClass(), "id", "GhZQSLeLeq");
        setField(term9749, term9749.getClass(), "formatName", "vCJwFnMbeg");
        setField(term9621, term9621.getClass(), "publishingFormat", term9749);
        setField(term9774, term9774.getClass(), "id", "HiMyMWtfDT");
        setField(term9774, term9774.getClass(), "smallUrl", "bTxfZATYLW");
        setField(term9774, term9774.getClass(), "mediumUrl", "lFWdVTokyG");
        setField(term9774, term9774.getClass(), "largeUrl", "PwXoorKXoP");
        setField(term9621, term9621.getClass(), "cover", term9774);
        setField(term9621, term9621.getClass(), "awards", term9823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FTbhYKJKQL";
        callMethod(klass, "setTitle", argTypes, term9621, args);
    }

};


