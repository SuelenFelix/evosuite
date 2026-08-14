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

public class Book_getPublishers_101911061412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5747;

    public Book_getPublishers_101911061412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5748 = new Long(-5248475803419977214L);
        HashMap term5763 = new HashMap();
        Set<Object> term5912 =  ((Map) term5763).keySet();
        HashSet term5762 = new HashSet((Collection<? extends Object>) term5912);
        Long term5769 = new Long(-6723783499250797216L);
        Long term5808 = new Long(41775768178052008L);
        Integer term5822 = new Integer(-522618178);
        HashMap term5837 = new HashMap();
        Set<Object> term5963 =  ((Map) term5837).keySet();
        HashSet term5836 = new HashSet((Collection<? extends Object>) term5963);
        Long term5843 = new Long(6682528376118987775L);
        Long term5858 = new Long(682356318767179819L);
        HashMap term5897 = new HashMap();
        Set<Object> term6004 =  ((Map) term5897).keySet();
        HashSet term5896 = new HashSet((Collection<? extends Object>) term6004);
        term5747 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term5768 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term5807 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term5842 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term5857 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term5747, term5747.getClass(), "id", term5748);
        setField(term5747, term5747.getClass(), "title", "VYkqXKVlAJ");
        setField(term5747, term5747.getClass(), "authors", term5762);
        setField(term5768, term5768.getClass(), "id", term5769);
        setField(term5768, term5768.getClass(), "name", "XkIoWJRNwN");
        setField(term5747, term5747.getClass(), "lang", term5768);
        setField(term5747, term5747.getClass(), "isbn10", "aNWLJdrZMq");
        setField(term5747, term5747.getClass(), "isbn13", "HHmNoYxIGj");
        setField(term5807, term5807.getClass(), "id", term5808);
        setField(term5807, term5807.getClass(), "name", "PtirvZmsGt");
        setField(term5747, term5747.getClass(), "genre", term5807);
        setField(term5747, term5747.getClass(), "yearOfPublication", term5822);
        setField(term5747, term5747.getClass(), "blurb", "HWkpTmtlrc");
        setField(term5747, term5747.getClass(), "publishers", term5836);
        setField(term5842, term5842.getClass(), "id", term5843);
        setField(term5842, term5842.getClass(), "formatName", "hMmaoREuCK");
        setField(term5747, term5747.getClass(), "publishingFormat", term5842);
        setField(term5857, term5857.getClass(), "id", term5858);
        setField(term5857, term5857.getClass(), "smallUrl", "VeDtgDzGAN");
        setField(term5857, term5857.getClass(), "mediumUrl", "aWYOWZFyaX");
        setField(term5857, term5857.getClass(), "largeUrl", "BRIVNtfUWU");
        setField(term5747, term5747.getClass(), "cover", term5857);
        setField(term5747, term5747.getClass(), "awards", term5896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPublishers", argTypes, term5747, args);
    }

};


