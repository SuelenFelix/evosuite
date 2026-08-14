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

public class Author_Builder_fullName_15251231903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32891;

    public Author_Builder_fullName_15251231903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32936 = new Integer(320711637);
        ArrayList term32939 = new ArrayList();
        ((ArrayList) term32939).add((Object)null);
        ((ArrayList) term32939).add((Object)null);
        ArrayList term32942 = new ArrayList();
        ((ArrayList) term32942).add((Object)null);
        ((ArrayList) term32942).add((Object)null);
        ArrayList term32948 = new ArrayList();
        ((ArrayList) term32948).add((Object)null);
        ((ArrayList) term32948).add((Object)null);
        ((ArrayList) term32948).add((Object)null);
        Object term32930 = newInstance(Class.forName("com.acme.types.Book"));
        Object term32935 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term32945 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term32946 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term32947 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term32930, term32930.getClass(), "id", "");
        setField(term32930, term32930.getClass(), "title", "");
        setField(term32930, term32930.getClass(), "isbn13", "");
        setField(term32930, term32930.getClass(), "isbn10", "");
        setField(term32935, term32935.getClass(), "id", null);
        setField(term32935, term32935.getClass(), "name", null);
        setField(term32930, term32930.getClass(), "genre", term32935);
        setField(term32930, term32930.getClass(), "yearOfPublication", term32936);
        setField(term32930, term32930.getClass(), "blurb", "");
        setField(term32930, term32930.getClass(), "authors", term32939);
        setField(term32930, term32930.getClass(), "publishers", term32942);
        setField(term32945, term32945.getClass(), "id", null);
        setField(term32945, term32945.getClass(), "name", null);
        setField(term32930, term32930.getClass(), "lang", term32945);
        setField(term32946, term32946.getClass(), "id", null);
        setField(term32946, term32946.getClass(), "formatName", null);
        setField(term32930, term32930.getClass(), "publishingFormat", term32946);
        setField(term32947, term32947.getClass(), "id", null);
        setField(term32947, term32947.getClass(), "smallUrl", null);
        setField(term32947, term32947.getClass(), "mediumUrl", null);
        setField(term32947, term32947.getClass(), "largeUrl", null);
        setField(term32930, term32930.getClass(), "cover", term32947);
        setField(term32930, term32930.getClass(), "awards", term32948);
        Integer term32957 = new Integer(-920797484);
        ArrayList term32960 = new ArrayList();
        ((ArrayList) term32960).add((Object)null);
        ArrayList term32963 = new ArrayList();
        ((ArrayList) term32963).add((Object)null);
        ((ArrayList) term32963).add((Object)null);
        ((ArrayList) term32963).add((Object)null);
        ((ArrayList) term32963).add((Object)null);
        ((ArrayList) term32963).add((Object)null);
        ((ArrayList) term32963).add((Object)null);
        ((ArrayList) term32963).add((Object)null);
        ((ArrayList) term32963).add((Object)null);
        ((ArrayList) term32963).add((Object)null);
        ArrayList term32969 = new ArrayList();
        ((ArrayList) term32969).add((Object)null);
        ((ArrayList) term32969).add((Object)null);
        Object term32951 = newInstance(Class.forName("com.acme.types.Book"));
        Object term32956 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term32966 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term32967 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term32968 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term32951, term32951.getClass(), "id", "");
        setField(term32951, term32951.getClass(), "title", "");
        setField(term32951, term32951.getClass(), "isbn13", "");
        setField(term32951, term32951.getClass(), "isbn10", "");
        setField(term32956, term32956.getClass(), "id", null);
        setField(term32956, term32956.getClass(), "name", null);
        setField(term32951, term32951.getClass(), "genre", term32956);
        setField(term32951, term32951.getClass(), "yearOfPublication", term32957);
        setField(term32951, term32951.getClass(), "blurb", "");
        setField(term32951, term32951.getClass(), "authors", term32960);
        setField(term32951, term32951.getClass(), "publishers", term32963);
        setField(term32966, term32966.getClass(), "id", null);
        setField(term32966, term32966.getClass(), "name", null);
        setField(term32951, term32951.getClass(), "lang", term32966);
        setField(term32967, term32967.getClass(), "id", null);
        setField(term32967, term32967.getClass(), "formatName", null);
        setField(term32951, term32951.getClass(), "publishingFormat", term32967);
        setField(term32968, term32968.getClass(), "id", null);
        setField(term32968, term32968.getClass(), "smallUrl", null);
        setField(term32968, term32968.getClass(), "mediumUrl", null);
        setField(term32968, term32968.getClass(), "largeUrl", null);
        setField(term32951, term32951.getClass(), "cover", term32968);
        setField(term32951, term32951.getClass(), "awards", term32969);
        Integer term32978 = new Integer(765731371);
        ArrayList term32981 = new ArrayList();
        ((ArrayList) term32981).add((Object)null);
        ((ArrayList) term32981).add((Object)null);
        ((ArrayList) term32981).add((Object)null);
        ((ArrayList) term32981).add((Object)null);
        ((ArrayList) term32981).add((Object)null);
        ((ArrayList) term32981).add((Object)null);
        ((ArrayList) term32981).add((Object)null);
        ((ArrayList) term32981).add((Object)null);
        ((ArrayList) term32981).add((Object)null);
        ArrayList term32984 = new ArrayList();
        ((ArrayList) term32984).add((Object)null);
        ((ArrayList) term32984).add((Object)null);
        ((ArrayList) term32984).add((Object)null);
        ((ArrayList) term32984).add((Object)null);
        ArrayList term32990 = new ArrayList();
        ((ArrayList) term32990).add((Object)null);
        ((ArrayList) term32990).add((Object)null);
        ((ArrayList) term32990).add((Object)null);
        ((ArrayList) term32990).add((Object)null);
        ((ArrayList) term32990).add((Object)null);
        Object term32972 = newInstance(Class.forName("com.acme.types.Book"));
        Object term32977 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term32987 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term32988 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term32989 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term32972, term32972.getClass(), "id", "");
        setField(term32972, term32972.getClass(), "title", "");
        setField(term32972, term32972.getClass(), "isbn13", "");
        setField(term32972, term32972.getClass(), "isbn10", "");
        setField(term32977, term32977.getClass(), "id", null);
        setField(term32977, term32977.getClass(), "name", null);
        setField(term32972, term32972.getClass(), "genre", term32977);
        setField(term32972, term32972.getClass(), "yearOfPublication", term32978);
        setField(term32972, term32972.getClass(), "blurb", "");
        setField(term32972, term32972.getClass(), "authors", term32981);
        setField(term32972, term32972.getClass(), "publishers", term32984);
        setField(term32987, term32987.getClass(), "id", null);
        setField(term32987, term32987.getClass(), "name", null);
        setField(term32972, term32972.getClass(), "lang", term32987);
        setField(term32988, term32988.getClass(), "id", null);
        setField(term32988, term32988.getClass(), "formatName", null);
        setField(term32972, term32972.getClass(), "publishingFormat", term32988);
        setField(term32989, term32989.getClass(), "id", null);
        setField(term32989, term32989.getClass(), "smallUrl", null);
        setField(term32989, term32989.getClass(), "mediumUrl", null);
        setField(term32989, term32989.getClass(), "largeUrl", null);
        setField(term32972, term32972.getClass(), "cover", term32989);
        setField(term32972, term32972.getClass(), "awards", term32990);
        ArrayList term32928 = new ArrayList();
        ((ArrayList) term32928).add(term32930);
        ((ArrayList) term32928).add(term32951);
        ((ArrayList) term32928).add(term32972);
        term32891 = newInstance(Class.forName("com.acme.types.Author$Builder"));
        setField(term32891, term32891.getClass(), "id", "SHPiFSZxaM");
        setField(term32891, term32891.getClass(), "fullName", "MGNQzfluos");
        setField(term32891, term32891.getClass(), "about", "bEqBGVftHS");
        setField(term32891, term32891.getClass(), "books", term32928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Author$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uRSkQPTqHT";
        callMethod(klass, "fullName", argTypes, term32891, args);
    }

};


