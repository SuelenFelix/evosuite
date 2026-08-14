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

public class Book_setTitle_166433089417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7039;

    public Book_setTitle_166433089417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7040 = new Long(2135754395358000892L);
        HashMap term7055 = new HashMap();
        Set<Object> term7216 =  ((Map) term7055).keySet();
        HashSet term7054 = new HashSet((Collection<? extends Object>) term7216);
        Long term7061 = new Long(-8085190702504231560L);
        Long term7100 = new Long(1672578078364590450L);
        Integer term7114 = new Integer(-1685132342);
        HashMap term7129 = new HashMap();
        Set<Object> term7267 =  ((Map) term7129).keySet();
        HashSet term7128 = new HashSet((Collection<? extends Object>) term7267);
        Long term7135 = new Long(4949335493504695457L);
        Long term7150 = new Long(-5216789073301458893L);
        HashMap term7189 = new HashMap();
        Set<Object> term7308 =  ((Map) term7189).keySet();
        HashSet term7188 = new HashSet((Collection<? extends Object>) term7308);
        term7039 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term7060 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term7099 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term7134 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term7149 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term7039, term7039.getClass(), "id", term7040);
        setField(term7039, term7039.getClass(), "title", "tXfQjSqDzN");
        setField(term7039, term7039.getClass(), "authors", term7054);
        setField(term7060, term7060.getClass(), "id", term7061);
        setField(term7060, term7060.getClass(), "name", "BjugTaMcxJ");
        setField(term7039, term7039.getClass(), "lang", term7060);
        setField(term7039, term7039.getClass(), "isbn10", "vGiuZVPJNH");
        setField(term7039, term7039.getClass(), "isbn13", "tlzpzIjMib");
        setField(term7099, term7099.getClass(), "id", term7100);
        setField(term7099, term7099.getClass(), "name", "AZdLeSugwv");
        setField(term7039, term7039.getClass(), "genre", term7099);
        setField(term7039, term7039.getClass(), "yearOfPublication", term7114);
        setField(term7039, term7039.getClass(), "blurb", "RMsXuyzKJV");
        setField(term7039, term7039.getClass(), "publishers", term7128);
        setField(term7134, term7134.getClass(), "id", term7135);
        setField(term7134, term7134.getClass(), "formatName", "FwPbDZcHmB");
        setField(term7039, term7039.getClass(), "publishingFormat", term7134);
        setField(term7149, term7149.getClass(), "id", term7150);
        setField(term7149, term7149.getClass(), "smallUrl", "hOncybyCAH");
        setField(term7149, term7149.getClass(), "mediumUrl", "QduALnDSVo");
        setField(term7149, term7149.getClass(), "largeUrl", "izPpKDErnQ");
        setField(term7039, term7039.getClass(), "cover", term7149);
        setField(term7039, term7039.getClass(), "awards", term7188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NnpwZBUTvx";
        callMethod(klass, "setTitle", argTypes, term7039, args);
    }

};


