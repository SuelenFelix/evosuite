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

public class Book_setPublishingFormat_15986235623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25998;
     Object term26239;

    public Book_setPublishingFormat_15986235623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26072 = new Integer(844222656);
        ArrayList term26086 = new ArrayList();
        ArrayList term26095 = new ArrayList();
        ((ArrayList) term26095).add((Object)null);
        ((ArrayList) term26095).add((Object)null);
        ((ArrayList) term26095).add((Object)null);
        ((ArrayList) term26095).add((Object)null);
        ((ArrayList) term26095).add((Object)null);
        ((ArrayList) term26095).add((Object)null);
        Object term26092 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term26092, term26092.getClass(), "id", "");
        setField(term26092, term26092.getClass(), "name", "");
        setField(term26092, term26092.getClass(), "books", term26095);
        ArrayList term26101 = new ArrayList();
        ((ArrayList) term26101).add((Object)null);
        ((ArrayList) term26101).add((Object)null);
        ((ArrayList) term26101).add((Object)null);
        Object term26098 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term26098, term26098.getClass(), "id", "");
        setField(term26098, term26098.getClass(), "name", "");
        setField(term26098, term26098.getClass(), "books", term26101);
        ArrayList term26107 = new ArrayList();
        Object term26104 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term26104, term26104.getClass(), "id", "");
        setField(term26104, term26104.getClass(), "name", "");
        setField(term26104, term26104.getClass(), "books", term26107);
        ArrayList term26113 = new ArrayList();
        ((ArrayList) term26113).add((Object)null);
        ((ArrayList) term26113).add((Object)null);
        ((ArrayList) term26113).add((Object)null);
        ((ArrayList) term26113).add((Object)null);
        ((ArrayList) term26113).add((Object)null);
        ((ArrayList) term26113).add((Object)null);
        Object term26110 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term26110, term26110.getClass(), "id", "");
        setField(term26110, term26110.getClass(), "name", "");
        setField(term26110, term26110.getClass(), "books", term26113);
        ArrayList term26119 = new ArrayList();
        ((ArrayList) term26119).add((Object)null);
        ((ArrayList) term26119).add((Object)null);
        Object term26116 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term26116, term26116.getClass(), "id", "");
        setField(term26116, term26116.getClass(), "name", "");
        setField(term26116, term26116.getClass(), "books", term26119);
        ArrayList term26125 = new ArrayList();
        ((ArrayList) term26125).add((Object)null);
        ((ArrayList) term26125).add((Object)null);
        ((ArrayList) term26125).add((Object)null);
        ((ArrayList) term26125).add((Object)null);
        ((ArrayList) term26125).add((Object)null);
        ((ArrayList) term26125).add((Object)null);
        ((ArrayList) term26125).add((Object)null);
        Object term26122 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term26122, term26122.getClass(), "id", "");
        setField(term26122, term26122.getClass(), "name", "");
        setField(term26122, term26122.getClass(), "books", term26125);
        ArrayList term26131 = new ArrayList();
        ((ArrayList) term26131).add((Object)null);
        ((ArrayList) term26131).add((Object)null);
        ((ArrayList) term26131).add((Object)null);
        ((ArrayList) term26131).add((Object)null);
        ((ArrayList) term26131).add((Object)null);
        Object term26128 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term26128, term26128.getClass(), "id", "");
        setField(term26128, term26128.getClass(), "name", "");
        setField(term26128, term26128.getClass(), "books", term26131);
        ArrayList term26090 = new ArrayList();
        ((ArrayList) term26090).add(term26092);
        ((ArrayList) term26090).add(term26092);
        ((ArrayList) term26090).add(term26098);
        ((ArrayList) term26090).add(term26104);
        ((ArrayList) term26090).add(term26110);
        ((ArrayList) term26090).add(term26116);
        ((ArrayList) term26090).add(term26122);
        ((ArrayList) term26090).add(term26128);
        ((ArrayList) term26090).add(term26116);
        ArrayList term26235 = new ArrayList();
        term25998 = newInstance(Class.forName("com.acme.types.Book"));
        Object term26047 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term26136 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term26161 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term26186 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term25998, term25998.getClass(), "id", "qDOWRMZGoQ");
        setField(term25998, term25998.getClass(), "title", "LsOyXKZzBQ");
        setField(term25998, term25998.getClass(), "isbn13", "URFrizTrec");
        setField(term25998, term25998.getClass(), "isbn10", "OSsMvEletA");
        setField(term26047, term26047.getClass(), "id", "DNfJBqzjmu");
        setField(term26047, term26047.getClass(), "name", "GYBeZGePbX");
        setField(term25998, term25998.getClass(), "genre", term26047);
        setField(term25998, term25998.getClass(), "yearOfPublication", term26072);
        setField(term25998, term25998.getClass(), "blurb", "jJUEqbPIrM");
        setField(term25998, term25998.getClass(), "authors", term26086);
        setField(term25998, term25998.getClass(), "publishers", term26090);
        setField(term26136, term26136.getClass(), "id", "ELjGrPDZKe");
        setField(term26136, term26136.getClass(), "name", "MRdGOIOvoM");
        setField(term25998, term25998.getClass(), "lang", term26136);
        setField(term26161, term26161.getClass(), "id", "CrDChgXZIs");
        setField(term26161, term26161.getClass(), "formatName", "spKctYEaCy");
        setField(term25998, term25998.getClass(), "publishingFormat", term26161);
        setField(term26186, term26186.getClass(), "id", "XldxICpJKb");
        setField(term26186, term26186.getClass(), "smallUrl", "auwdUwJreL");
        setField(term26186, term26186.getClass(), "mediumUrl", "ubCTLBFDbT");
        setField(term26186, term26186.getClass(), "largeUrl", "lmjJUxaoYd");
        setField(term25998, term25998.getClass(), "cover", term26186);
        setField(term25998, term25998.getClass(), "awards", term26235);
        term26239 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        setField(term26239, term26239.getClass(), "id", "yvsgNBCrWW");
        setField(term26239, term26239.getClass(), "formatName", "dKBKbXYYRZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.acme.types.PublishingFormat");
        Object[] args = new Object[1];
        args[0] = term26239;
        callMethod(klass, "setPublishingFormat", argTypes, term25998, args);
    }

};


