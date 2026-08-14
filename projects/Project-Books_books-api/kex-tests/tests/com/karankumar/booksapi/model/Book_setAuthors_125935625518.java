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

public class Book_setAuthors_125935625518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7319;
     Object term7474;

    public Book_setAuthors_125935625518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7320 = new Long(-1832940336320585644L);
        HashMap term7335 = new HashMap();
        Set<Object> term7497 =  ((Map) term7335).keySet();
        HashSet term7334 = new HashSet((Collection<? extends Object>) term7497);
        Long term7341 = new Long(-8033714905181142681L);
        Long term7380 = new Long(-9040825890007374809L);
        Integer term7394 = new Integer(-1456670397);
        HashMap term7409 = new HashMap();
        Set<Object> term7548 =  ((Map) term7409).keySet();
        HashSet term7408 = new HashSet((Collection<? extends Object>) term7548);
        Long term7415 = new Long(1368340889161782793L);
        Long term7430 = new Long(-5786861555969446503L);
        HashMap term7469 = new HashMap();
        Set<Object> term7589 =  ((Map) term7469).keySet();
        HashSet term7468 = new HashSet((Collection<? extends Object>) term7589);
        term7319 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term7340 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term7379 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term7414 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term7429 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term7319, term7319.getClass(), "id", term7320);
        setField(term7319, term7319.getClass(), "title", "tlQSNgTkQX");
        setField(term7319, term7319.getClass(), "authors", term7334);
        setField(term7340, term7340.getClass(), "id", term7341);
        setField(term7340, term7340.getClass(), "name", "PCipZnmBOF");
        setField(term7319, term7319.getClass(), "lang", term7340);
        setField(term7319, term7319.getClass(), "isbn10", "zcorEihhLK");
        setField(term7319, term7319.getClass(), "isbn13", "GrqozDKFOk");
        setField(term7379, term7379.getClass(), "id", term7380);
        setField(term7379, term7379.getClass(), "name", "CFyoseFGLF");
        setField(term7319, term7319.getClass(), "genre", term7379);
        setField(term7319, term7319.getClass(), "yearOfPublication", term7394);
        setField(term7319, term7319.getClass(), "blurb", "SFqCrhEWLm");
        setField(term7319, term7319.getClass(), "publishers", term7408);
        setField(term7414, term7414.getClass(), "id", term7415);
        setField(term7414, term7414.getClass(), "formatName", "GZdcJyZntS");
        setField(term7319, term7319.getClass(), "publishingFormat", term7414);
        setField(term7429, term7429.getClass(), "id", term7430);
        setField(term7429, term7429.getClass(), "smallUrl", "OIHoJeysUi");
        setField(term7429, term7429.getClass(), "mediumUrl", "WXMWFDGcLB");
        setField(term7429, term7429.getClass(), "largeUrl", "wKWbJssZuG");
        setField(term7319, term7319.getClass(), "cover", term7429);
        setField(term7319, term7319.getClass(), "awards", term7468);
        HashMap term7475 = new HashMap();
        Set<Object> term7590 =  ((Map) term7475).keySet();
        term7474 = new HashSet((Collection<? extends Object>) term7590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term7474;
        callMethod(klass, "setAuthors", argTypes, term7319, args);
    }

};


