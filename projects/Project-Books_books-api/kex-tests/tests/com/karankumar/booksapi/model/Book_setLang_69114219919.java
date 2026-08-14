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

public class Book_setLang_69114219919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7591;
     Object term7746;

    public Book_setLang_69114219919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7592 = new Long(7276637106827860087L);
        HashMap term7607 = new HashMap();
        Set<Object> term7771 =  ((Map) term7607).keySet();
        HashSet term7606 = new HashSet((Collection<? extends Object>) term7771);
        Long term7613 = new Long(-3936701866695933852L);
        Long term7652 = new Long(1215116475929634177L);
        Integer term7666 = new Integer(1622346318);
        HashMap term7681 = new HashMap();
        Set<Object> term7822 =  ((Map) term7681).keySet();
        HashSet term7680 = new HashSet((Collection<? extends Object>) term7822);
        Long term7687 = new Long(1597484336218508869L);
        Long term7702 = new Long(-685023850445639859L);
        HashMap term7741 = new HashMap();
        Set<Object> term7863 =  ((Map) term7741).keySet();
        HashSet term7740 = new HashSet((Collection<? extends Object>) term7863);
        term7591 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term7612 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term7651 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term7686 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term7701 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term7591, term7591.getClass(), "id", term7592);
        setField(term7591, term7591.getClass(), "title", "AHbZyFOmlo");
        setField(term7591, term7591.getClass(), "authors", term7606);
        setField(term7612, term7612.getClass(), "id", term7613);
        setField(term7612, term7612.getClass(), "name", "TwfWVQGiIj");
        setField(term7591, term7591.getClass(), "lang", term7612);
        setField(term7591, term7591.getClass(), "isbn10", "gUvcueTURF");
        setField(term7591, term7591.getClass(), "isbn13", "EwQBhZjCIT");
        setField(term7651, term7651.getClass(), "id", term7652);
        setField(term7651, term7651.getClass(), "name", "aSkmSwTnEw");
        setField(term7591, term7591.getClass(), "genre", term7651);
        setField(term7591, term7591.getClass(), "yearOfPublication", term7666);
        setField(term7591, term7591.getClass(), "blurb", "xvkbvaEGYd");
        setField(term7591, term7591.getClass(), "publishers", term7680);
        setField(term7686, term7686.getClass(), "id", term7687);
        setField(term7686, term7686.getClass(), "formatName", "HBGNxdNURv");
        setField(term7591, term7591.getClass(), "publishingFormat", term7686);
        setField(term7701, term7701.getClass(), "id", term7702);
        setField(term7701, term7701.getClass(), "smallUrl", "mfCpTPPQQm");
        setField(term7701, term7701.getClass(), "mediumUrl", "OcJCIDNIXA");
        setField(term7701, term7701.getClass(), "largeUrl", "XfRABIFVEp");
        setField(term7591, term7591.getClass(), "cover", term7701);
        setField(term7591, term7591.getClass(), "awards", term7740);
        Long term7747 = new Long(-6950146046121430355L);
        term7746 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        setField(term7746, term7746.getClass(), "id", term7747);
        setField(term7746, term7746.getClass(), "name", "MHGKyEnwKc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.karankumar.booksapi.model.language.Lang");
        Object[] args = new Object[1];
        args[0] = term7746;
        callMethod(klass, "setLang", argTypes, term7591, args);
    }

};


