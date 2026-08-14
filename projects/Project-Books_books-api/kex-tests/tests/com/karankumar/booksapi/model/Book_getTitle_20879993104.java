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

public class Book_getTitle_20879993104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3683;

    public Book_getTitle_20879993104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3684 = new Long(6855071767938501807L);
        HashMap term3699 = new HashMap();
        Set<Object> term3848 =  ((Map) term3699).keySet();
        HashSet term3698 = new HashSet((Collection<? extends Object>) term3848);
        Long term3705 = new Long(-5892135042702373494L);
        Long term3744 = new Long(5262507301787091109L);
        Integer term3758 = new Integer(391863371);
        HashMap term3773 = new HashMap();
        Set<Object> term3899 =  ((Map) term3773).keySet();
        HashSet term3772 = new HashSet((Collection<? extends Object>) term3899);
        Long term3779 = new Long(-6823727938421990489L);
        Long term3794 = new Long(-484994522244390100L);
        HashMap term3833 = new HashMap();
        Set<Object> term3940 =  ((Map) term3833).keySet();
        HashSet term3832 = new HashSet((Collection<? extends Object>) term3940);
        term3683 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term3704 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term3743 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term3778 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term3793 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term3683, term3683.getClass(), "id", term3684);
        setField(term3683, term3683.getClass(), "title", "KoyGrUJeJW");
        setField(term3683, term3683.getClass(), "authors", term3698);
        setField(term3704, term3704.getClass(), "id", term3705);
        setField(term3704, term3704.getClass(), "name", "HqBOwkVqjD");
        setField(term3683, term3683.getClass(), "lang", term3704);
        setField(term3683, term3683.getClass(), "isbn10", "MAcUBcBckh");
        setField(term3683, term3683.getClass(), "isbn13", "oVgzLbrsFr");
        setField(term3743, term3743.getClass(), "id", term3744);
        setField(term3743, term3743.getClass(), "name", "vQVyKLdtaz");
        setField(term3683, term3683.getClass(), "genre", term3743);
        setField(term3683, term3683.getClass(), "yearOfPublication", term3758);
        setField(term3683, term3683.getClass(), "blurb", "OWKQODBLzb");
        setField(term3683, term3683.getClass(), "publishers", term3772);
        setField(term3778, term3778.getClass(), "id", term3779);
        setField(term3778, term3778.getClass(), "formatName", "wGmYcqUkgE");
        setField(term3683, term3683.getClass(), "publishingFormat", term3778);
        setField(term3793, term3793.getClass(), "id", term3794);
        setField(term3793, term3793.getClass(), "smallUrl", "idgaQsnJpQ");
        setField(term3793, term3793.getClass(), "mediumUrl", "VgZnGoIFwQ");
        setField(term3793, term3793.getClass(), "largeUrl", "jUbSRrkrYZ");
        setField(term3683, term3683.getClass(), "cover", term3793);
        setField(term3683, term3683.getClass(), "awards", term3832);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term3683, args);
    }

};


