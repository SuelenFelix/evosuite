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

public class Book_getLang_7379704016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4199;

    public Book_getLang_7379704016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4200 = new Long(4178434741742309755L);
        HashMap term4215 = new HashMap();
        Set<Object> term4364 =  ((Map) term4215).keySet();
        HashSet term4214 = new HashSet((Collection<? extends Object>) term4364);
        Long term4221 = new Long(-2068172595987555756L);
        Long term4260 = new Long(-6292278961887936280L);
        Integer term4274 = new Integer(-616727354);
        HashMap term4289 = new HashMap();
        Set<Object> term4415 =  ((Map) term4289).keySet();
        HashSet term4288 = new HashSet((Collection<? extends Object>) term4415);
        Long term4295 = new Long(-6645965768855543712L);
        Long term4310 = new Long(4784595517102746672L);
        HashMap term4349 = new HashMap();
        Set<Object> term4456 =  ((Map) term4349).keySet();
        HashSet term4348 = new HashSet((Collection<? extends Object>) term4456);
        term4199 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term4220 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term4259 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term4294 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term4309 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term4199, term4199.getClass(), "id", term4200);
        setField(term4199, term4199.getClass(), "title", "JqXGgAhZPl");
        setField(term4199, term4199.getClass(), "authors", term4214);
        setField(term4220, term4220.getClass(), "id", term4221);
        setField(term4220, term4220.getClass(), "name", "jiKYgYHqIS");
        setField(term4199, term4199.getClass(), "lang", term4220);
        setField(term4199, term4199.getClass(), "isbn10", "DfISiziTgG");
        setField(term4199, term4199.getClass(), "isbn13", "XqgfKFvPSD");
        setField(term4259, term4259.getClass(), "id", term4260);
        setField(term4259, term4259.getClass(), "name", "JiVRgTZvKc");
        setField(term4199, term4199.getClass(), "genre", term4259);
        setField(term4199, term4199.getClass(), "yearOfPublication", term4274);
        setField(term4199, term4199.getClass(), "blurb", "XPKmummaqg");
        setField(term4199, term4199.getClass(), "publishers", term4288);
        setField(term4294, term4294.getClass(), "id", term4295);
        setField(term4294, term4294.getClass(), "formatName", "BKLfkLiZTH");
        setField(term4199, term4199.getClass(), "publishingFormat", term4294);
        setField(term4309, term4309.getClass(), "id", term4310);
        setField(term4309, term4309.getClass(), "smallUrl", "SPpkrGcPRr");
        setField(term4309, term4309.getClass(), "mediumUrl", "sEccwbJKYE");
        setField(term4309, term4309.getClass(), "largeUrl", "AWRooQKkdW");
        setField(term4199, term4199.getClass(), "cover", term4309);
        setField(term4199, term4199.getClass(), "awards", term4348);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLang", argTypes, term4199, args);
    }

};


