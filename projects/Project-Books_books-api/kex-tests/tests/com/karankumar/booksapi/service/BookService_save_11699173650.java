package com.karankumar.booksapi.service;

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
import static com.karankumar.booksapi.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class BookService_save_11699173650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1158;

    public BookService_save_11699173650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1159 = new Long(4872422362414183754L);
        HashMap term1174 = new HashMap();
        Set<Object> term1323 =  ((Map) term1174).keySet();
        HashSet term1173 = new HashSet((Collection<? extends Object>) term1323);
        Long term1180 = new Long(6811161968424632369L);
        Long term1219 = new Long(-7237588299778557629L);
        Integer term1233 = new Integer(568599855);
        HashMap term1248 = new HashMap();
        Set<Object> term1374 =  ((Map) term1248).keySet();
        HashSet term1247 = new HashSet((Collection<? extends Object>) term1374);
        Long term1254 = new Long(6967924379644551255L);
        Long term1269 = new Long(-2813493605142626659L);
        HashMap term1308 = new HashMap();
        Set<Object> term1415 =  ((Map) term1308).keySet();
        HashSet term1307 = new HashSet((Collection<? extends Object>) term1415);
        term1158 = newInstance(Class.forName("com.karankumar.booksapi.model.Book"));
        Object term1179 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        Object term1218 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        Object term1253 = newInstance(Class.forName("com.karankumar.booksapi.model.PublishingFormat"));
        Object term1268 = newInstance(Class.forName("com.karankumar.booksapi.model.Cover"));
        setField(term1158, term1158.getClass(), "id", term1159);
        setField(term1158, term1158.getClass(), "title", "SzjVpOQTyS");
        setField(term1158, term1158.getClass(), "authors", term1173);
        setField(term1179, term1179.getClass(), "id", term1180);
        setField(term1179, term1179.getClass(), "name", "MjGYSRKTNF");
        setField(term1158, term1158.getClass(), "lang", term1179);
        setField(term1158, term1158.getClass(), "isbn10", "hRNSzYYIrc");
        setField(term1158, term1158.getClass(), "isbn13", "RMFIsYGgne");
        setField(term1218, term1218.getClass(), "id", term1219);
        setField(term1218, term1218.getClass(), "name", "NRdvgJlhkX");
        setField(term1158, term1158.getClass(), "genre", term1218);
        setField(term1158, term1158.getClass(), "yearOfPublication", term1233);
        setField(term1158, term1158.getClass(), "blurb", "uuaPigETmJ");
        setField(term1158, term1158.getClass(), "publishers", term1247);
        setField(term1253, term1253.getClass(), "id", term1254);
        setField(term1253, term1253.getClass(), "formatName", "MxlszYVzRf");
        setField(term1158, term1158.getClass(), "publishingFormat", term1253);
        setField(term1268, term1268.getClass(), "id", term1269);
        setField(term1268, term1268.getClass(), "smallUrl", "LQFpaHEwXR");
        setField(term1268, term1268.getClass(), "mediumUrl", "oVcInYnLWB");
        setField(term1268, term1268.getClass(), "largeUrl", "aJlieCFVtF");
        setField(term1158, term1158.getClass(), "cover", term1268);
        setField(term1158, term1158.getClass(), "awards", term1307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.service.BookService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.karankumar.booksapi.model.Book");
        Object[] args = new Object[1];
        args[0] = term1158;
        callMethod(klass, "save", argTypes, null, args);
    }

};


