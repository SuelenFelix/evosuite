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

public class Publisher_getBooks_20862152186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term860;

    public Publisher_getBooks_20862152186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term893 = new Integer(-93135961);
        ArrayList term896 = new ArrayList();
        ((ArrayList) term896).add((Object)null);
        ((ArrayList) term896).add((Object)null);
        ((ArrayList) term896).add((Object)null);
        ((ArrayList) term896).add((Object)null);
        ArrayList term899 = new ArrayList();
        ((ArrayList) term899).add((Object)null);
        ((ArrayList) term899).add((Object)null);
        ((ArrayList) term899).add((Object)null);
        ((ArrayList) term899).add((Object)null);
        ((ArrayList) term899).add((Object)null);
        ((ArrayList) term899).add((Object)null);
        ((ArrayList) term899).add((Object)null);
        ((ArrayList) term899).add((Object)null);
        ArrayList term905 = new ArrayList();
        ((ArrayList) term905).add((Object)null);
        ((ArrayList) term905).add((Object)null);
        ((ArrayList) term905).add((Object)null);
        ((ArrayList) term905).add((Object)null);
        ((ArrayList) term905).add((Object)null);
        ((ArrayList) term905).add((Object)null);
        ((ArrayList) term905).add((Object)null);
        ((ArrayList) term905).add((Object)null);
        ((ArrayList) term905).add((Object)null);
        Object term887 = newInstance(Class.forName("com.acme.types.Book"));
        Object term892 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term902 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term903 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term904 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term887, term887.getClass(), "id", "");
        setField(term887, term887.getClass(), "title", "");
        setField(term887, term887.getClass(), "isbn13", "");
        setField(term887, term887.getClass(), "isbn10", "");
        setField(term892, term892.getClass(), "id", null);
        setField(term892, term892.getClass(), "name", null);
        setField(term887, term887.getClass(), "genre", term892);
        setField(term887, term887.getClass(), "yearOfPublication", term893);
        setField(term887, term887.getClass(), "blurb", "");
        setField(term887, term887.getClass(), "authors", term896);
        setField(term887, term887.getClass(), "publishers", term899);
        setField(term902, term902.getClass(), "id", null);
        setField(term902, term902.getClass(), "name", null);
        setField(term887, term887.getClass(), "lang", term902);
        setField(term903, term903.getClass(), "id", null);
        setField(term903, term903.getClass(), "formatName", null);
        setField(term887, term887.getClass(), "publishingFormat", term903);
        setField(term904, term904.getClass(), "id", null);
        setField(term904, term904.getClass(), "smallUrl", null);
        setField(term904, term904.getClass(), "mediumUrl", null);
        setField(term904, term904.getClass(), "largeUrl", null);
        setField(term887, term887.getClass(), "cover", term904);
        setField(term887, term887.getClass(), "awards", term905);
        Integer term914 = new Integer(1265463001);
        ArrayList term917 = new ArrayList();
        ((ArrayList) term917).add((Object)null);
        ((ArrayList) term917).add((Object)null);
        ((ArrayList) term917).add((Object)null);
        ((ArrayList) term917).add((Object)null);
        ArrayList term920 = new ArrayList();
        ((ArrayList) term920).add((Object)null);
        ((ArrayList) term920).add((Object)null);
        ((ArrayList) term920).add((Object)null);
        ArrayList term926 = new ArrayList();
        ((ArrayList) term926).add((Object)null);
        ((ArrayList) term926).add((Object)null);
        ((ArrayList) term926).add((Object)null);
        ((ArrayList) term926).add((Object)null);
        ((ArrayList) term926).add((Object)null);
        ((ArrayList) term926).add((Object)null);
        ((ArrayList) term926).add((Object)null);
        Object term908 = newInstance(Class.forName("com.acme.types.Book"));
        Object term913 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term923 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term924 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term925 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term908, term908.getClass(), "id", "");
        setField(term908, term908.getClass(), "title", "");
        setField(term908, term908.getClass(), "isbn13", "");
        setField(term908, term908.getClass(), "isbn10", "");
        setField(term913, term913.getClass(), "id", null);
        setField(term913, term913.getClass(), "name", null);
        setField(term908, term908.getClass(), "genre", term913);
        setField(term908, term908.getClass(), "yearOfPublication", term914);
        setField(term908, term908.getClass(), "blurb", "");
        setField(term908, term908.getClass(), "authors", term917);
        setField(term908, term908.getClass(), "publishers", term920);
        setField(term923, term923.getClass(), "id", null);
        setField(term923, term923.getClass(), "name", null);
        setField(term908, term908.getClass(), "lang", term923);
        setField(term924, term924.getClass(), "id", null);
        setField(term924, term924.getClass(), "formatName", null);
        setField(term908, term908.getClass(), "publishingFormat", term924);
        setField(term925, term925.getClass(), "id", null);
        setField(term925, term925.getClass(), "smallUrl", null);
        setField(term925, term925.getClass(), "mediumUrl", null);
        setField(term925, term925.getClass(), "largeUrl", null);
        setField(term908, term908.getClass(), "cover", term925);
        setField(term908, term908.getClass(), "awards", term926);
        ArrayList term885 = new ArrayList();
        ((ArrayList) term885).add(term887);
        ((ArrayList) term885).add(term908);
        term860 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term860, term860.getClass(), "id", "GAPGgDekVG");
        setField(term860, term860.getClass(), "name", "WmTogHwGLE");
        setField(term860, term860.getClass(), "books", term885);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Publisher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBooks", argTypes, term860, args);
    }

};


