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

public class Book_getId_2742920723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3425;

    public Book_getId_2742920723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3426 = new Long(7009926388951271268L);
        HashMap term3441 = new HashMap();
        Set<Object> term3590 =  ((Map) term3441).keySet();
        HashSet term3440 = new HashSet((Collection<? extends Object>) term3590);
        Long term3447 = new Long(-7672528020740371001L);
        Long term3486 = new Long(-4502405999831680926L);
        Integer term3500 = new Integer(1484323161);
        HashMap term3515 = new HashMap();
        Set<Object> term3641 =  ((Map) term3515).keySet();
        HashSet term3514 = new HashSet((Collection<? extends Object>) term3641);
        Long term3521 = new Long(1967728129628047933L);
        Long term3536 = new Long(2120084523938730454L);
        HashMap term3575 = new HashMap();
        Set<Object> term3682 =  ((Map) term3575).keySet();
        HashSet term3574 = new HashSet((Collection<? extends Object>) term3682);
        term3425 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term3446 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term3485 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term3520 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term3535 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term3425, term3425.getClass(), "id", term3426);
        setField(term3425, term3425.getClass(), "title", "eqJfYWRaEL");
        setField(term3425, term3425.getClass(), "authors", term3440);
        setField(term3446, term3446.getClass(), "id", term3447);
        setField(term3446, term3446.getClass(), "name", "fhkbdRViHi");
        setField(term3425, term3425.getClass(), "lang", term3446);
        setField(term3425, term3425.getClass(), "isbn10", "uWHnvSvaPl");
        setField(term3425, term3425.getClass(), "isbn13", "kBdSllIBVz");
        setField(term3485, term3485.getClass(), "id", term3486);
        setField(term3485, term3485.getClass(), "name", "TJmVBGfTML");
        setField(term3425, term3425.getClass(), "genre", term3485);
        setField(term3425, term3425.getClass(), "yearOfPublication", term3500);
        setField(term3425, term3425.getClass(), "blurb", "tPlsykYBqO");
        setField(term3425, term3425.getClass(), "publishers", term3514);
        setField(term3520, term3520.getClass(), "id", term3521);
        setField(term3520, term3520.getClass(), "formatName", "bLPjGVBhlX");
        setField(term3425, term3425.getClass(), "publishingFormat", term3520);
        setField(term3535, term3535.getClass(), "id", term3536);
        setField(term3535, term3535.getClass(), "smallUrl", "whBvTVIIlC");
        setField(term3535, term3535.getClass(), "mediumUrl", "IgRJUzaCwW");
        setField(term3535, term3535.getClass(), "largeUrl", "JUmudUmaaV");
        setField(term3425, term3425.getClass(), "cover", term3535);
        setField(term3425, term3425.getClass(), "awards", term3574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3425, args);
    }

};


