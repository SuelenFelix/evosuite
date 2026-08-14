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

public class Book_setCover_6410241027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9805;
     Object term9960;

    public Book_setCover_6410241027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9806 = new Long(-1333707622307134180L);
        HashMap term9821 = new HashMap();
        Set<Object> term10009 =  ((Map) term9821).keySet();
        HashSet term9820 = new HashSet((Collection<? extends Object>) term10009);
        Long term9827 = new Long(-4360569253593381888L);
        Long term9866 = new Long(1457594663983990440L);
        Integer term9880 = new Integer(865208305);
        HashMap term9895 = new HashMap();
        Set<Object> term10060 =  ((Map) term9895).keySet();
        HashSet term9894 = new HashSet((Collection<? extends Object>) term10060);
        Long term9901 = new Long(3452833434644634217L);
        Long term9916 = new Long(-8603648071751666348L);
        HashMap term9955 = new HashMap();
        Set<Object> term10101 =  ((Map) term9955).keySet();
        HashSet term9954 = new HashSet((Collection<? extends Object>) term10101);
        term9805 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term9826 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term9865 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term9900 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term9915 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term9805, term9805.getClass(), "id", term9806);
        setField(term9805, term9805.getClass(), "title", "IlvgFINwIa");
        setField(term9805, term9805.getClass(), "authors", term9820);
        setField(term9826, term9826.getClass(), "id", term9827);
        setField(term9826, term9826.getClass(), "name", "GEJABPlHSI");
        setField(term9805, term9805.getClass(), "lang", term9826);
        setField(term9805, term9805.getClass(), "isbn10", "aQFUvuaYxd");
        setField(term9805, term9805.getClass(), "isbn13", "zNFLXMifnS");
        setField(term9865, term9865.getClass(), "id", term9866);
        setField(term9865, term9865.getClass(), "name", "HHQcYMSBVc");
        setField(term9805, term9805.getClass(), "genre", term9865);
        setField(term9805, term9805.getClass(), "yearOfPublication", term9880);
        setField(term9805, term9805.getClass(), "blurb", "wdoqITnaAP");
        setField(term9805, term9805.getClass(), "publishers", term9894);
        setField(term9900, term9900.getClass(), "id", term9901);
        setField(term9900, term9900.getClass(), "formatName", "rIPMBcrNqB");
        setField(term9805, term9805.getClass(), "publishingFormat", term9900);
        setField(term9915, term9915.getClass(), "id", term9916);
        setField(term9915, term9915.getClass(), "smallUrl", "UDaboHZHhz");
        setField(term9915, term9915.getClass(), "mediumUrl", "nRvKihUSPj");
        setField(term9915, term9915.getClass(), "largeUrl", "BbNeQJpYPr");
        setField(term9805, term9805.getClass(), "cover", term9915);
        setField(term9805, term9805.getClass(), "awards", term9954);
        Long term9961 = new Long(-7884871963229073324L);
        term9960 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term9960, term9960.getClass(), "id", term9961);
        setField(term9960, term9960.getClass(), "smallUrl", "riMtzCoxNj");
        setField(term9960, term9960.getClass(), "mediumUrl", "YAXkVjQZcV");
        setField(term9960, term9960.getClass(), "largeUrl", "pumvwBWvpy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.karankumar.booksapi.model.Cover");
        Object[] args = new Object[1];
        args[0] = term9960;
        callMethod(klass, "setCover", argTypes, term9805, args);
    }

};


