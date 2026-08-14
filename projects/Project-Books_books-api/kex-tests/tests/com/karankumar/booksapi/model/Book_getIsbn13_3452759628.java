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

public class Book_getIsbn13_3452759628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4715;

    public Book_getIsbn13_3452759628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4716 = new Long(-5788180182343976541L);
        HashMap term4731 = new HashMap();
        Set<Object> term4880 =  ((Map) term4731).keySet();
        HashSet term4730 = new HashSet((Collection<? extends Object>) term4880);
        Long term4737 = new Long(2936323121573284007L);
        Long term4776 = new Long(-1154553077993834885L);
        Integer term4790 = new Integer(-2038273078);
        HashMap term4805 = new HashMap();
        Set<Object> term4931 =  ((Map) term4805).keySet();
        HashSet term4804 = new HashSet((Collection<? extends Object>) term4931);
        Long term4811 = new Long(-2850532706972744550L);
        Long term4826 = new Long(-2644215923136513282L);
        HashMap term4865 = new HashMap();
        Set<Object> term4972 =  ((Map) term4865).keySet();
        HashSet term4864 = new HashSet((Collection<? extends Object>) term4972);
        term4715 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term4736 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term4775 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term4810 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term4825 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term4715, term4715.getClass(), "id", term4716);
        setField(term4715, term4715.getClass(), "title", "RYdKCNNMBR");
        setField(term4715, term4715.getClass(), "authors", term4730);
        setField(term4736, term4736.getClass(), "id", term4737);
        setField(term4736, term4736.getClass(), "name", "yGtHPyvYiQ");
        setField(term4715, term4715.getClass(), "lang", term4736);
        setField(term4715, term4715.getClass(), "isbn10", "MvRIxilFMJ");
        setField(term4715, term4715.getClass(), "isbn13", "iNwOJRBEjp");
        setField(term4775, term4775.getClass(), "id", term4776);
        setField(term4775, term4775.getClass(), "name", "XylxrMBraH");
        setField(term4715, term4715.getClass(), "genre", term4775);
        setField(term4715, term4715.getClass(), "yearOfPublication", term4790);
        setField(term4715, term4715.getClass(), "blurb", "pORebkoRdD");
        setField(term4715, term4715.getClass(), "publishers", term4804);
        setField(term4810, term4810.getClass(), "id", term4811);
        setField(term4810, term4810.getClass(), "formatName", "mXGCWJDOqA");
        setField(term4715, term4715.getClass(), "publishingFormat", term4810);
        setField(term4825, term4825.getClass(), "id", term4826);
        setField(term4825, term4825.getClass(), "smallUrl", "dpNsDgfPso");
        setField(term4825, term4825.getClass(), "mediumUrl", "hCWPJQKpdc");
        setField(term4825, term4825.getClass(), "largeUrl", "WzMEhMXkKx");
        setField(term4715, term4715.getClass(), "cover", term4825);
        setField(term4715, term4715.getClass(), "awards", term4864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsbn13", argTypes, term4715, args);
    }

};


