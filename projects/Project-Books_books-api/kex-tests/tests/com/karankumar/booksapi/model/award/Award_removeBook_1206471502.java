package com.karankumar.booksapi.model.award;

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
import static com.karankumar.booksapi.model.award.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class Award_removeBook_1206471502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1303;
     Object term1361;

    public Award_removeBook_1206471502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1304 = new Long(-5892135042702373494L);
        Class<? extends Object> term1517 = Class.forName((String) "com.karankumar.booksapi.model.award.AwardName");
        Field term1516 = ((Class) term1517).getDeclaredField((String) "PORTICO_PRIZE");
        ((Field) term1516).setAccessible(true);
        Object enum2 = ((Field) term1516).get((Object) null);
        HashMap term1356 = new HashMap();
        Set<Object> term1797 =  ((Map) term1356).keySet();
        HashSet term1355 = new HashSet((Collection<? extends Object>) term1797);
        term1303 = newInstance(Class.forName("com.karankumar.booksapi.model.award.Award"));
        setField(term1303, term1303.getClass(), "id", term1304);
        setField(term1303, term1303.getClass(), "awardName", enum2);
        setField(term1303, term1303.getClass(), "category", "hoicvmsovO");
        setIntField(term1303, term1303.getClass(), "year", 1484323161);
        setField(term1303, term1303.getClass(), "books", term1355);
        Long term1362 = new Long(5262507301787091109L);
        HashMap term1377 = new HashMap();
        Set<Object> term1808 =  ((Map) term1377).keySet();
        HashSet term1376 = new HashSet((Collection<? extends Object>) term1808);
        Long term1383 = new Long(-6823727938421990489L);
        Long term1422 = new Long(-484994522244390100L);
        Integer term1436 = new Integer(-1955890973);
        HashMap term1451 = new HashMap();
        Set<Object> term1859 =  ((Map) term1451).keySet();
        HashSet term1450 = new HashSet((Collection<? extends Object>) term1859);
        Long term1457 = new Long(1233889271256172047L);
        Long term1472 = new Long(6617340557564669657L);
        HashMap term1511 = new HashMap();
        Set<Object> term1900 =  ((Map) term1511).keySet();
        HashSet term1510 = new HashSet((Collection<? extends Object>) term1900);
        term1361 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term1382 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term1421 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term1456 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term1471 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term1361, term1361.getClass(), "id", term1362);
        setField(term1361, term1361.getClass(), "title", "eqJfYWRaEL");
        setField(term1361, term1361.getClass(), "authors", term1376);
        setField(term1382, term1382.getClass(), "id", term1383);
        setField(term1382, term1382.getClass(), "name", "fhkbdRViHi");
        setField(term1361, term1361.getClass(), "lang", term1382);
        setField(term1361, term1361.getClass(), "isbn10", "uWHnvSvaPl");
        setField(term1361, term1361.getClass(), "isbn13", "kBdSllIBVz");
        setField(term1421, term1421.getClass(), "id", term1422);
        setField(term1421, term1421.getClass(), "name", "TJmVBGfTML");
        setField(term1361, term1361.getClass(), "genre", term1421);
        setField(term1361, term1361.getClass(), "yearOfPublication", term1436);
        setField(term1361, term1361.getClass(), "blurb", "tPlsykYBqO");
        setField(term1361, term1361.getClass(), "publishers", term1450);
        setField(term1456, term1456.getClass(), "id", term1457);
        setField(term1456, term1456.getClass(), "formatName", "bLPjGVBhlX");
        setField(term1361, term1361.getClass(), "publishingFormat", term1456);
        setField(term1471, term1471.getClass(), "id", term1472);
        setField(term1471, term1471.getClass(), "smallUrl", "whBvTVIIlC");
        setField(term1471, term1471.getClass(), "mediumUrl", "IgRJUzaCwW");
        setField(term1471, term1471.getClass(), "largeUrl", "JUmudUmaaV");
        setField(term1361, term1361.getClass(), "cover", term1471);
        setField(term1361, term1361.getClass(), "awards", term1510);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.award.Award");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.karankumar.booksapi.model.Book");
        Object[] args = new Object[1];
        args[0] = term1361;
        callMethod(klass, "removeBook", argTypes, term1303, args);
    }

};


