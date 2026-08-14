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
import java.lang.String;

public class Book_getTitle_20791832964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8893;

    public Book_getTitle_20791832964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8967 = new Integer(114754804);
        ArrayList term8987 = new ArrayList();
        ((ArrayList) term8987).add((Object)null);
        ((ArrayList) term8987).add((Object)null);
        ((ArrayList) term8987).add((Object)null);
        ((ArrayList) term8987).add((Object)null);
        ((ArrayList) term8987).add((Object)null);
        Object term8983 = newInstance(Class.forName("com.acme.types.Author"));
        setField(term8983, term8983.getClass(), "id", "");
        setField(term8983, term8983.getClass(), "fullName", "");
        setField(term8983, term8983.getClass(), "about", "");
        setField(term8983, term8983.getClass(), "books", term8987);
        ArrayList term8981 = new ArrayList();
        ((ArrayList) term8981).add(term8983);
        ArrayList term8997 = new ArrayList();
        Object term8994 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term8994, term8994.getClass(), "id", "");
        setField(term8994, term8994.getClass(), "name", "");
        setField(term8994, term8994.getClass(), "books", term8997);
        ArrayList term9003 = new ArrayList();
        ((ArrayList) term9003).add((Object)null);
        ((ArrayList) term9003).add((Object)null);
        ((ArrayList) term9003).add((Object)null);
        ((ArrayList) term9003).add((Object)null);
        ((ArrayList) term9003).add((Object)null);
        ((ArrayList) term9003).add((Object)null);
        ((ArrayList) term9003).add((Object)null);
        ((ArrayList) term9003).add((Object)null);
        Object term9000 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term9000, term9000.getClass(), "id", "");
        setField(term9000, term9000.getClass(), "name", "");
        setField(term9000, term9000.getClass(), "books", term9003);
        ArrayList term9009 = new ArrayList();
        ((ArrayList) term9009).add((Object)null);
        ((ArrayList) term9009).add((Object)null);
        ((ArrayList) term9009).add((Object)null);
        ((ArrayList) term9009).add((Object)null);
        ((ArrayList) term9009).add((Object)null);
        ((ArrayList) term9009).add((Object)null);
        ((ArrayList) term9009).add((Object)null);
        ((ArrayList) term9009).add((Object)null);
        Object term9006 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term9006, term9006.getClass(), "id", "");
        setField(term9006, term9006.getClass(), "name", "");
        setField(term9006, term9006.getClass(), "books", term9009);
        ArrayList term9015 = new ArrayList();
        ((ArrayList) term9015).add((Object)null);
        ((ArrayList) term9015).add((Object)null);
        ((ArrayList) term9015).add((Object)null);
        ((ArrayList) term9015).add((Object)null);
        ((ArrayList) term9015).add((Object)null);
        ((ArrayList) term9015).add((Object)null);
        ((ArrayList) term9015).add((Object)null);
        ((ArrayList) term9015).add((Object)null);
        ((ArrayList) term9015).add((Object)null);
        Object term9012 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term9012, term9012.getClass(), "id", "");
        setField(term9012, term9012.getClass(), "name", "");
        setField(term9012, term9012.getClass(), "books", term9015);
        ArrayList term9021 = new ArrayList();
        ((ArrayList) term9021).add((Object)null);
        ((ArrayList) term9021).add((Object)null);
        Object term9018 = newInstance(Class.forName("com.acme.types.Publisher"));
        setField(term9018, term9018.getClass(), "id", "");
        setField(term9018, term9018.getClass(), "name", "");
        setField(term9018, term9018.getClass(), "books", term9021);
        ArrayList term8992 = new ArrayList();
        ((ArrayList) term8992).add(term8994);
        ((ArrayList) term8992).add(term9000);
        ((ArrayList) term8992).add(term9000);
        ((ArrayList) term8992).add(term9006);
        ((ArrayList) term8992).add(term9012);
        ((ArrayList) term8992).add(term9018);
        Class<? extends Object> term9296 = Class.forName((String) "com.acme.types.AwardName");
        Field term9295 = ((Class) term9296).getDeclaredField((String) "BOOKER_PRIZE");
        ((Field) term9295).setAccessible(true);
        Object enum22 = ((Field) term9295).get((Object) null);
        Object term9127 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term9127, term9127.getClass(), "id", "");
        setField(term9127, term9127.getClass(), "awardName", enum22);
        setField(term9127, term9127.getClass(), "category", "");
        setIntField(term9127, term9127.getClass(), "year", 2098647989);
        Class<? extends Object> term9459 = Class.forName((String) "com.acme.types.AwardName");
        Field term9458 = ((Class) term9459).getDeclaredField((String) "BOOKER_PRIZE");
        ((Field) term9458).setAccessible(true);
        Object enum23 = ((Field) term9458).get((Object) null);
        Object term9133 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term9133, term9133.getClass(), "id", "");
        setField(term9133, term9133.getClass(), "awardName", enum23);
        setField(term9133, term9133.getClass(), "category", "");
        setIntField(term9133, term9133.getClass(), "year", 1598895173);
        Object term9139 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term9139, term9139.getClass(), "id", "");
        setField(term9139, term9139.getClass(), "awardName", enum22);
        setField(term9139, term9139.getClass(), "category", "");
        setIntField(term9139, term9139.getClass(), "year", 1953277050);
        ArrayList term9125 = new ArrayList();
        ((ArrayList) term9125).add(term9127);
        ((ArrayList) term9125).add(term9133);
        ((ArrayList) term9125).add(term9139);
        ((ArrayList) term9125).add(term9127);
        term8893 = newInstance(Class.forName("com.acme.types.Book"));
        Object term8942 = newInstance(Class.forName("com.acme.types.Genre"));
        Object term9026 = newInstance(Class.forName("com.acme.types.Lang"));
        Object term9051 = newInstance(Class.forName("com.acme.types.PublishingFormat"));
        Object term9076 = newInstance(Class.forName("com.acme.types.Cover"));
        setField(term8893, term8893.getClass(), "id", "NtSnrngAmM");
        setField(term8893, term8893.getClass(), "title", "OYnrHBNcZV");
        setField(term8893, term8893.getClass(), "isbn13", "pwkepWBxgL");
        setField(term8893, term8893.getClass(), "isbn10", "RDXQLsyKOu");
        setField(term8942, term8942.getClass(), "id", "ZnIRhQxVXw");
        setField(term8942, term8942.getClass(), "name", "AVAyxUcLrK");
        setField(term8893, term8893.getClass(), "genre", term8942);
        setField(term8893, term8893.getClass(), "yearOfPublication", term8967);
        setField(term8893, term8893.getClass(), "blurb", "xLwgTuAlud");
        setField(term8893, term8893.getClass(), "authors", term8981);
        setField(term8893, term8893.getClass(), "publishers", term8992);
        setField(term9026, term9026.getClass(), "id", "IIOFAGjcXe");
        setField(term9026, term9026.getClass(), "name", "XsAUdWVfqM");
        setField(term8893, term8893.getClass(), "lang", term9026);
        setField(term9051, term9051.getClass(), "id", "WRKAHqtTqT");
        setField(term9051, term9051.getClass(), "formatName", "EkgwvUqGYF");
        setField(term8893, term8893.getClass(), "publishingFormat", term9051);
        setField(term9076, term9076.getClass(), "id", "sbtPNrurvf");
        setField(term9076, term9076.getClass(), "smallUrl", "zomtOAIouP");
        setField(term9076, term9076.getClass(), "mediumUrl", "pwHkUmkBGN");
        setField(term9076, term9076.getClass(), "largeUrl", "TZJzEpeSDz");
        setField(term8893, term8893.getClass(), "cover", term9076);
        setField(term8893, term8893.getClass(), "awards", term9125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term8893, args);
    }

};


