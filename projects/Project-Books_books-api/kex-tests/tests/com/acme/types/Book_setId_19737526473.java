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

public class Book_setId_19737526473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8476;

    public Book_setId_19737526473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8550 = new Integer(-506958186);
        ArrayList term8570 = new ArrayList();
        ((ArrayList) term8570).add((Object)null);
        ((ArrayList) term8570).add((Object)null);
        ((ArrayList) term8570).add((Object)null);
        ((ArrayList) term8570).add((Object)null);
        Object term8566 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term8566, term8566.getClass(), "id", "");
        setField(term8566, term8566.getClass(), "fullName", "");
        setField(term8566, term8566.getClass(), "about", "");
        setField(term8566, term8566.getClass(), "books", term8570);
        ArrayList term8577 = new ArrayList();
        ((ArrayList) term8577).add((Object)null);
        ((ArrayList) term8577).add((Object)null);
        ((ArrayList) term8577).add((Object)null);
        ((ArrayList) term8577).add((Object)null);
        ((ArrayList) term8577).add((Object)null);
        ((ArrayList) term8577).add((Object)null);
        ((ArrayList) term8577).add((Object)null);
        Object term8573 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term8573, term8573.getClass(), "id", "");
        setField(term8573, term8573.getClass(), "fullName", "");
        setField(term8573, term8573.getClass(), "about", "");
        setField(term8573, term8573.getClass(), "books", term8577);
        ArrayList term8584 = new ArrayList();
        ((ArrayList) term8584).add((Object)null);
        ((ArrayList) term8584).add((Object)null);
        ((ArrayList) term8584).add((Object)null);
        ((ArrayList) term8584).add((Object)null);
        ((ArrayList) term8584).add((Object)null);
        Object term8580 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term8580, term8580.getClass(), "id", "");
        setField(term8580, term8580.getClass(), "fullName", "");
        setField(term8580, term8580.getClass(), "about", "");
        setField(term8580, term8580.getClass(), "books", term8584);
        ArrayList term8591 = new ArrayList();
        ((ArrayList) term8591).add((Object)null);
        ((ArrayList) term8591).add((Object)null);
        ((ArrayList) term8591).add((Object)null);
        ((ArrayList) term8591).add((Object)null);
        Object term8587 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term8587, term8587.getClass(), "id", "");
        setField(term8587, term8587.getClass(), "fullName", "");
        setField(term8587, term8587.getClass(), "about", "");
        setField(term8587, term8587.getClass(), "books", term8591);
        ArrayList term8564 = new ArrayList();
        ((ArrayList) term8564).add(term8566);
        ((ArrayList) term8564).add(term8573);
        ((ArrayList) term8564).add(term8580);
        ((ArrayList) term8564).add(term8587);
        ArrayList term8601 = new ArrayList();
        ((ArrayList) term8601).add((Object)null);
        ((ArrayList) term8601).add((Object)null);
        ((ArrayList) term8601).add((Object)null);
        Object term8598 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term8598, term8598.getClass(), "id", "");
        setField(term8598, term8598.getClass(), "name", "");
        setField(term8598, term8598.getClass(), "books", term8601);
        ArrayList term8607 = new ArrayList();
        Object term8604 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term8604, term8604.getClass(), "id", "");
        setField(term8604, term8604.getClass(), "name", "");
        setField(term8604, term8604.getClass(), "books", term8607);
        ArrayList term8613 = new ArrayList();
        ((ArrayList) term8613).add((Object)null);
        ((ArrayList) term8613).add((Object)null);
        ((ArrayList) term8613).add((Object)null);
        Object term8610 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term8610, term8610.getClass(), "id", "");
        setField(term8610, term8610.getClass(), "name", "");
        setField(term8610, term8610.getClass(), "books", term8613);
        ArrayList term8596 = new ArrayList();
        ((ArrayList) term8596).add(term8598);
        ((ArrayList) term8596).add(term8604);
        ((ArrayList) term8596).add(term8610);
        ArrayList term8717 = new ArrayList();
        term8476 = newInstance(Class.forName("com.acme.types.Book"));
        Object term8525 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term8618 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term8643 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term8668 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term8476, term8476.getClass(), "id", "heAByNySVP");
        setField(term8476, term8476.getClass(), "title", "gPuVkQobYQ");
        setField(term8476, term8476.getClass(), "isbn13", "sAHDMENVSp");
        setField(term8476, term8476.getClass(), "isbn10", "oLoxfeWIGH");
        setField(term8525, term8525.getClass(), "id", "vdErTHSsJu");
        setField(term8525, term8525.getClass(), "name", "MeFZCtLbdV");
        setField(term8476, term8476.getClass(), "genre", term8525);
        setField(term8476, term8476.getClass(), "yearOfPublication", term8550);
        setField(term8476, term8476.getClass(), "blurb", "oNgxBniAuz");
        setField(term8476, term8476.getClass(), "authors", term8564);
        setField(term8476, term8476.getClass(), "publishers", term8596);
        setField(term8618, term8618.getClass(), "id", "VOBEeWmzSF");
        setField(term8618, term8618.getClass(), "name", "cVeaNxcyvs");
        setField(term8476, term8476.getClass(), "lang", term8618);
        setField(term8643, term8643.getClass(), "id", "fIMpTnCtOM");
        setField(term8643, term8643.getClass(), "formatName", "zsVQmqfyvx");
        setField(term8476, term8476.getClass(), "publishingFormat", term8643);
        setField(term8668, term8668.getClass(), "id", "DKFEMZUVhd");
        setField(term8668, term8668.getClass(), "smallUrl", "xhjqWwsjmc");
        setField(term8668, term8668.getClass(), "mediumUrl", "GmFORCKDuz");
        setField(term8668, term8668.getClass(), "largeUrl", "uiZFXEVOdS");
        setField(term8476, term8476.getClass(), "cover", term8668);
        setField(term8476, term8476.getClass(), "awards", term8717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kLUzmGfJsV";
        callMethod(klass, "setId", argTypes, term8476, args);
    }

};


