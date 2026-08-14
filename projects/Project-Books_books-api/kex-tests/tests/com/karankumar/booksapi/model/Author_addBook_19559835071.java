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

public class Author_addBook_19559835071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17478;
     Object term17511;

    public Author_addBook_19559835071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17479 = new Long(-8019730974733786399L);
        HashMap term17494 = new HashMap();
        Set<Object> term17676 =  ((Map) term17494).keySet();
        HashSet term17493 = new HashSet((Collection<? extends Object>) term17676);
        term17478 = newInstance(Class.forName("com.karankumar.booksapi.model.Author"));
        setField(term17478, term17478.getClass(), "id", term17479);
        setField(term17478, term17478.getClass(), "fullName", "ubodzJoMGW");
        setField(term17478, term17478.getClass(), "books", term17493);
        setField(term17478, term17478.getClass(), "about", "weddIktxOA");
        Long term17512 = new Long(394960377236392159L);
        HashMap term17527 = new HashMap();
        Set<Object> term17697 =  ((Map) term17527).keySet();
        HashSet term17526 = new HashSet((Collection<? extends Object>) term17697);
        Long term17533 = new Long(-2955854401507097864L);
        Long term17572 = new Long(329213208496958131L);
        Integer term17586 = new Integer(-469968304);
        HashMap term17601 = new HashMap();
        Set<Object> term17748 =  ((Map) term17601).keySet();
        HashSet term17600 = new HashSet((Collection<? extends Object>) term17748);
        Long term17607 = new Long(8107921244631636572L);
        Long term17622 = new Long(-7904053112604879960L);
        HashMap term17661 = new HashMap();
        Set<Object> term17789 =  ((Map) term17661).keySet();
        HashSet term17660 = new HashSet((Collection<? extends Object>) term17789);
        term17511 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term17532 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term17571 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term17606 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term17621 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term17511, term17511.getClass(), "id", term17512);
        setField(term17511, term17511.getClass(), "title", "uSlMeISsDD");
        setField(term17511, term17511.getClass(), "authors", term17526);
        setField(term17532, term17532.getClass(), "id", term17533);
        setField(term17532, term17532.getClass(), "name", "WdCiTDUKqn");
        setField(term17511, term17511.getClass(), "lang", term17532);
        setField(term17511, term17511.getClass(), "isbn10", "PSizQDoxxe");
        setField(term17511, term17511.getClass(), "isbn13", "mKaHyMybrK");
        setField(term17571, term17571.getClass(), "id", term17572);
        setField(term17571, term17571.getClass(), "name", "AyrEXuGrEj");
        setField(term17511, term17511.getClass(), "genre", term17571);
        setField(term17511, term17511.getClass(), "yearOfPublication", term17586);
        setField(term17511, term17511.getClass(), "blurb", "yevIIoVYHq");
        setField(term17511, term17511.getClass(), "publishers", term17600);
        setField(term17606, term17606.getClass(), "id", term17607);
        setField(term17606, term17606.getClass(), "formatName", "UuYWMTqWTV");
        setField(term17511, term17511.getClass(), "publishingFormat", term17606);
        setField(term17621, term17621.getClass(), "id", term17622);
        setField(term17621, term17621.getClass(), "smallUrl", "DSFGlcaXUb");
        setField(term17621, term17621.getClass(), "mediumUrl", "sHMXNUzNeM");
        setField(term17621, term17621.getClass(), "largeUrl", "gPzGDOEPPw");
        setField(term17511, term17511.getClass(), "cover", term17621);
        setField(term17511, term17511.getClass(), "awards", term17660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.karankumar.booksapi.model.Book");
        Object[] args = new Object[1];
        args[0] = term17511;
        callMethod(klass, "addBook", argTypes, term17478, args);
    }

};


