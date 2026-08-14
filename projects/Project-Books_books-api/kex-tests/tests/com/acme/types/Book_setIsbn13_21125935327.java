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

public class Book_setIsbn13_21125935327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11097;

    public Book_setIsbn13_21125935327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11171 = new Integer(-1870495012);
        ArrayList term11191 = new ArrayList();
        Object term11187 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term11187, term11187.getClass(), "id", "");
        setField(term11187, term11187.getClass(), "fullName", "");
        setField(term11187, term11187.getClass(), "about", "");
        setField(term11187, term11187.getClass(), "books", term11191);
        ArrayList term11198 = new ArrayList();
        ((ArrayList) term11198).add((Object)null);
        ((ArrayList) term11198).add((Object)null);
        ((ArrayList) term11198).add((Object)null);
        Object term11194 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term11194, term11194.getClass(), "id", "");
        setField(term11194, term11194.getClass(), "fullName", "");
        setField(term11194, term11194.getClass(), "about", "");
        setField(term11194, term11194.getClass(), "books", term11198);
        ArrayList term11185 = new ArrayList();
        ((ArrayList) term11185).add(term11187);
        ((ArrayList) term11185).add(term11194);
        ArrayList term11208 = new ArrayList();
        Object term11205 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term11205, term11205.getClass(), "id", "");
        setField(term11205, term11205.getClass(), "name", "");
        setField(term11205, term11205.getClass(), "books", term11208);
        ArrayList term11214 = new ArrayList();
        Object term11211 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term11211, term11211.getClass(), "id", "");
        setField(term11211, term11211.getClass(), "name", "");
        setField(term11211, term11211.getClass(), "books", term11214);
        ArrayList term11220 = new ArrayList();
        ((ArrayList) term11220).add((Object)null);
        ((ArrayList) term11220).add((Object)null);
        ((ArrayList) term11220).add((Object)null);
        ((ArrayList) term11220).add((Object)null);
        ((ArrayList) term11220).add((Object)null);
        ((ArrayList) term11220).add((Object)null);
        ((ArrayList) term11220).add((Object)null);
        ((ArrayList) term11220).add((Object)null);
        ((ArrayList) term11220).add((Object)null);
        Object term11217 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term11217, term11217.getClass(), "id", "");
        setField(term11217, term11217.getClass(), "name", "");
        setField(term11217, term11217.getClass(), "books", term11220);
        ArrayList term11226 = new ArrayList();
        Object term11223 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term11223, term11223.getClass(), "id", "");
        setField(term11223, term11223.getClass(), "name", "");
        setField(term11223, term11223.getClass(), "books", term11226);
        ArrayList term11232 = new ArrayList();
        ((ArrayList) term11232).add((Object)null);
        ((ArrayList) term11232).add((Object)null);
        ((ArrayList) term11232).add((Object)null);
        ((ArrayList) term11232).add((Object)null);
        ((ArrayList) term11232).add((Object)null);
        ((ArrayList) term11232).add((Object)null);
        ((ArrayList) term11232).add((Object)null);
        ((ArrayList) term11232).add((Object)null);
        Object term11229 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term11229, term11229.getClass(), "id", "");
        setField(term11229, term11229.getClass(), "name", "");
        setField(term11229, term11229.getClass(), "books", term11232);
        ArrayList term11203 = new ArrayList();
        ((ArrayList) term11203).add(term11205);
        ((ArrayList) term11203).add(term11211);
        ((ArrayList) term11203).add(term11217);
        ((ArrayList) term11203).add(term11223);
        ((ArrayList) term11203).add(term11229);
        ArrayList term11336 = new ArrayList();
        term11097 = newInstance(Class.forName("com.acme.types.Book"));
        Object term11146 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term11237 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term11262 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term11287 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term11097, term11097.getClass(), "id", "mBAKehIGeW");
        setField(term11097, term11097.getClass(), "title", "tmiPUgRXrn");
        setField(term11097, term11097.getClass(), "isbn13", "VuZmwqnade");
        setField(term11097, term11097.getClass(), "isbn10", "ohZrjboUnX");
        setField(term11146, term11146.getClass(), "id", "rwlrpQuNrG");
        setField(term11146, term11146.getClass(), "name", "fctYGLXetS");
        setField(term11097, term11097.getClass(), "genre", term11146);
        setField(term11097, term11097.getClass(), "yearOfPublication", term11171);
        setField(term11097, term11097.getClass(), "blurb", "UPbgrEUWQD");
        setField(term11097, term11097.getClass(), "authors", term11185);
        setField(term11097, term11097.getClass(), "publishers", term11203);
        setField(term11237, term11237.getClass(), "id", "nSnrziJcBE");
        setField(term11237, term11237.getClass(), "name", "xbhJrXUuCP");
        setField(term11097, term11097.getClass(), "lang", term11237);
        setField(term11262, term11262.getClass(), "id", "bvjVBhkXQU");
        setField(term11262, term11262.getClass(), "formatName", "IrOvUMupuD");
        setField(term11097, term11097.getClass(), "publishingFormat", term11262);
        setField(term11287, term11287.getClass(), "id", "UgFQTaylqs");
        setField(term11287, term11287.getClass(), "smallUrl", "CZksebZXsC");
        setField(term11287, term11287.getClass(), "mediumUrl", "NDTlULiAEp");
        setField(term11287, term11287.getClass(), "largeUrl", "KakVHGlMtc");
        setField(term11097, term11097.getClass(), "cover", term11287);
        setField(term11097, term11097.getClass(), "awards", term11336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XQkRBflDak";
        callMethod(klass, "setIsbn13", argTypes, term11097, args);
    }

};


