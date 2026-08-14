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

public class Book_getIsbn10_3452730797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4457;

    public Book_getIsbn10_3452730797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4458 = new Long(-7612550318181586304L);
        HashMap term4473 = new HashMap();
        Set<Object> term4622 =  ((Map) term4473).keySet();
        HashSet term4472 = new HashSet((Collection<? extends Object>) term4622);
        Long term4479 = new Long(-2170847986967241072L);
        Long term4518 = new Long(4044358158040652353L);
        Integer term4532 = new Integer(-1955890973);
        HashMap term4547 = new HashMap();
        Set<Object> term4673 =  ((Map) term4547).keySet();
        HashSet term4546 = new HashSet((Collection<? extends Object>) term4673);
        Long term4553 = new Long(-4443169559037975007L);
        Long term4568 = new Long(-3842548265506930260L);
        HashMap term4607 = new HashMap();
        Set<Object> term4714 =  ((Map) term4607).keySet();
        HashSet term4606 = new HashSet((Collection<? extends Object>) term4714);
        term4457 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term4478 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term4517 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term4552 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term4567 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term4457, term4457.getClass(), "id", term4458);
        setField(term4457, term4457.getClass(), "title", "vjxIhXHxGR");
        setField(term4457, term4457.getClass(), "authors", term4472);
        setField(term4478, term4478.getClass(), "id", term4479);
        setField(term4478, term4478.getClass(), "name", "QXzGXbEXMu");
        setField(term4457, term4457.getClass(), "lang", term4478);
        setField(term4457, term4457.getClass(), "isbn10", "qxSDVejjiY");
        setField(term4457, term4457.getClass(), "isbn13", "xBsXSDjXYK");
        setField(term4517, term4517.getClass(), "id", term4518);
        setField(term4517, term4517.getClass(), "name", "sEnIVFtZuQ");
        setField(term4457, term4457.getClass(), "genre", term4517);
        setField(term4457, term4457.getClass(), "yearOfPublication", term4532);
        setField(term4457, term4457.getClass(), "blurb", "ZVecLZMLHF");
        setField(term4457, term4457.getClass(), "publishers", term4546);
        setField(term4552, term4552.getClass(), "id", term4553);
        setField(term4552, term4552.getClass(), "formatName", "fztQhjqwdP");
        setField(term4457, term4457.getClass(), "publishingFormat", term4552);
        setField(term4567, term4567.getClass(), "id", term4568);
        setField(term4567, term4567.getClass(), "smallUrl", "eVpkWxjuki");
        setField(term4567, term4567.getClass(), "mediumUrl", "SJiQaLvSKv");
        setField(term4567, term4567.getClass(), "largeUrl", "OEXDRUKcFl");
        setField(term4457, term4457.getClass(), "cover", term4567);
        setField(term4457, term4457.getClass(), "awards", term4606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsbn10", argTypes, term4457, args);
    }

};


