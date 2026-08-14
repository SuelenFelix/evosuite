package com.karankumar.booksapi.model;

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
import static com.karankumar.booksapi.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class Book_setAwards_38799214728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10132;
     Object term10287;

    public Book_setAwards_38799214728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10133 = new Long(-8649738738252714180L);
        HashMap term10148 = new HashMap();
        Set<Object> term10303 =  ((Map) term10148).keySet();
        HashSet term10147 = new HashSet((Collection<? extends Object>) term10303);
        Long term10154 = new Long(-7278883608542636188L);
        Long term10193 = new Long(-1539859611880912454L);
        Integer term10207 = new Integer(-1275173084);
        HashMap term10222 = new HashMap();
        Set<Object> term10354 =  ((Map) term10222).keySet();
        HashSet term10221 = new HashSet((Collection<? extends Object>) term10354);
        Long term10228 = new Long(4100236067313034103L);
        Long term10243 = new Long(1195529027276497124L);
        HashMap term10282 = new HashMap();
        Set<Object> term10395 =  ((Map) term10282).keySet();
        HashSet term10281 = new HashSet((Collection<? extends Object>) term10395);
        term10132 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term10153 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term10192 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term10227 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term10242 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term10132, term10132.getClass(), "id", term10133);
        setField(term10132, term10132.getClass(), "title", "HwLHeGLyhe");
        setField(term10132, term10132.getClass(), "authors", term10147);
        setField(term10153, term10153.getClass(), "id", term10154);
        setField(term10153, term10153.getClass(), "name", "RDnkgWkcbz");
        setField(term10132, term10132.getClass(), "lang", term10153);
        setField(term10132, term10132.getClass(), "isbn10", "IBpaxltauX");
        setField(term10132, term10132.getClass(), "isbn13", "hePqROaplw");
        setField(term10192, term10192.getClass(), "id", term10193);
        setField(term10192, term10192.getClass(), "name", "PJcSNDruWd");
        setField(term10132, term10132.getClass(), "genre", term10192);
        setField(term10132, term10132.getClass(), "yearOfPublication", term10207);
        setField(term10132, term10132.getClass(), "blurb", "VVNNlAePXF");
        setField(term10132, term10132.getClass(), "publishers", term10221);
        setField(term10227, term10227.getClass(), "id", term10228);
        setField(term10227, term10227.getClass(), "formatName", "jnwVnmKAFv");
        setField(term10132, term10132.getClass(), "publishingFormat", term10227);
        setField(term10242, term10242.getClass(), "id", term10243);
        setField(term10242, term10242.getClass(), "smallUrl", "TXyHhqeCjR");
        setField(term10242, term10242.getClass(), "mediumUrl", "lZIgPZPgTu");
        setField(term10242, term10242.getClass(), "largeUrl", "iuCxnHGMoW");
        setField(term10132, term10132.getClass(), "cover", term10242);
        setField(term10132, term10132.getClass(), "awards", term10281);
        HashMap term10288 = new HashMap();
        Set<Object> term10396 =  ((Map) term10288).keySet();
        term10287 = new HashSet((Collection<? extends Object>) term10396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term10287;
        callMethod(klass, "setAwards", argTypes, term10132, args);
    }

};


