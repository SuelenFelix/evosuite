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

public class Book_getAwards_170670894915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6521;

    public Book_getAwards_170670894915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6522 = new Long(2701184207686293431L);
        HashMap term6537 = new HashMap();
        Set<Object> term6686 =  ((Map) term6537).keySet();
        HashSet term6536 = new HashSet((Collection<? extends Object>) term6686);
        Long term6543 = new Long(4474998035090263139L);
        Long term6582 = new Long(2848819812340321742L);
        Integer term6596 = new Integer(1585847225);
        HashMap term6611 = new HashMap();
        Set<Object> term6737 =  ((Map) term6611).keySet();
        HashSet term6610 = new HashSet((Collection<? extends Object>) term6737);
        Long term6617 = new Long(-8876856890348836498L);
        Long term6632 = new Long(846579494941632714L);
        HashMap term6671 = new HashMap();
        Set<Object> term6778 =  ((Map) term6671).keySet();
        HashSet term6670 = new HashSet((Collection<? extends Object>) term6778);
        term6521 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term6542 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term6581 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term6616 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term6631 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term6521, term6521.getClass(), "id", term6522);
        setField(term6521, term6521.getClass(), "title", "ekxGuOYIwi");
        setField(term6521, term6521.getClass(), "authors", term6536);
        setField(term6542, term6542.getClass(), "id", term6543);
        setField(term6542, term6542.getClass(), "name", "RbVQXSpxXy");
        setField(term6521, term6521.getClass(), "lang", term6542);
        setField(term6521, term6521.getClass(), "isbn10", "YpJbIgJWWv");
        setField(term6521, term6521.getClass(), "isbn13", "JppkknKVOw");
        setField(term6581, term6581.getClass(), "id", term6582);
        setField(term6581, term6581.getClass(), "name", "iljANwuEjk");
        setField(term6521, term6521.getClass(), "genre", term6581);
        setField(term6521, term6521.getClass(), "yearOfPublication", term6596);
        setField(term6521, term6521.getClass(), "blurb", "kNqaJKIATy");
        setField(term6521, term6521.getClass(), "publishers", term6610);
        setField(term6616, term6616.getClass(), "id", term6617);
        setField(term6616, term6616.getClass(), "formatName", "vKQukfbJUd");
        setField(term6521, term6521.getClass(), "publishingFormat", term6616);
        setField(term6631, term6631.getClass(), "id", term6632);
        setField(term6631, term6631.getClass(), "smallUrl", "lFRJFUMVbx");
        setField(term6631, term6631.getClass(), "mediumUrl", "sZdUNdggUW");
        setField(term6631, term6631.getClass(), "largeUrl", "OqbwYQfvAe");
        setField(term6521, term6521.getClass(), "cover", term6631);
        setField(term6521, term6521.getClass(), "awards", term6670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAwards", argTypes, term6521, args);
    }

};


